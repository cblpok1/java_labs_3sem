package io;

import exception.InvalidTagException;
import factory.TaxPayerFactory;
import model.TaxPayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    private static final Logger logger = LogManager.getLogger(FileReaderService.class);
    public List<TaxPayer> readTaxPayers(String filePath){
        List<TaxPayer> taxPayers = new ArrayList<>();
        String line;

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            while ((line=br.readLine())!=null){
                if(line.trim().isEmpty()) continue;
                String[] parts = line.split(";");
                if(parts.length<11){
                    logger.warn("Uncorrect row (not enough money): {}",line);
                    continue;
                }
                try{
                    String type = parts[0];
                    String name = parts[1];
                    double income = Double.parseDouble(parts[2]);
                    double addIncome = Double.parseDouble(parts[3]);
                    double author = Double.parseDouble(parts[4]);
                    double sale = Double.parseDouble(parts[5]);
                    double gifts = Double.parseDouble(parts[6]);
                    double transfers = Double.parseDouble(parts[7]);
                    double childBen = Double.parseDouble(parts[8]);
                    double matAid = Double.parseDouble(parts[9]);
                    double param = Double.parseDouble(parts[10]);

                    TaxPayer payer = TaxPayerFactory.createTaxPayer(type, name, income, addIncome, author, sale, gifts, transfers, childBen, matAid, param);
                    taxPayers.add(payer);
                    logger.info("Successfull adding: {}",payer.getName());
                }catch (NumberFormatException e){
                    logger.error("Error of format int in string:{}",line);
                }catch (InvalidTagException e){
                    logger.error("Data error:{} in row {}",e.getMessage(),line);
                }
            }
        }catch (IOException e){
            logger.fatal("Couldn't read file: {}",filePath,e);
        }
        return taxPayers;
    }
}
