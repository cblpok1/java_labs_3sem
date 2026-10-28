package org.example;

import io.FileReaderService;
import model.TaxPayer;
import service.TaxService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReaderService reader = new FileReaderService();
        List<TaxPayer> payers = reader.readTaxPayers("src/main/resources/data.txt");

        TaxService service = new TaxService();

        service.sortTaxes(payers);

        System.out.println("Sorted taxes");
        payers.forEach(System.out::println);

        System.out.println("Общая сумма налогов: " + service.calculateTotalTax(payers));
    }
}