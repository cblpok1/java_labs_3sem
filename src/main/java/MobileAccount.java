public interface MobileAccount {
    void signContract(String contractNumber);
    void openAccountAndNumber();
    void editAccountDetails(String newDetails);
    String getActualInfo();
    void changeTariffPlan(String newTariff);
    void changeOperator(String newOperator);
    void closeAccountAndNumber();
}
