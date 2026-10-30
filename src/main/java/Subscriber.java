public abstract class Subscriber implements MobileAccount,FinancialOperable{
    protected String phoneNumber;
    protected String ownerName;
    protected double balance;
    protected double trafficLeftGb;
    protected String currentTariff;
    protected String currentOperator;
    protected AccountStatus status;
    protected String contractNumber;

    public Subscriber(String ownerName,String initialOperator){
        this.ownerName = ownerName;
        this.currentOperator = initialOperator;
        this.balance = 0.0;
        this.trafficLeftGb = 0.0;
        this.status = AccountStatus.CLOSED;
        this.currentTariff = "Basic";
    }
    @Override
    public void signContract(String contractNumber){
        this.contractNumber = contractNumber;
        System.out.println("["+ownerName+"] Contract №" + contractNumber+" has been signed");
    }
    @Override
    public void openAccountAndNumber(){
        if(contractNumber==null){
            System.out.println("Error: Firstly sign contract!");
            return;
        }
        this.phoneNumber = "+37529"+(int)(Math.random()*9000000+1000000);
        this.status = AccountStatus.ACTIVE;
        System.out.println("["+ownerName+"] Account and number are opened:"+phoneNumber);
    }
    
    @Override
    public void editAccountDetails(String newDetails){
        System.out.println("["+ownerName+"] Data is updated:"+newDetails);
    }
    @Override
    public void topUpBalance(double amount){
        if(amount>0&&status==AccountStatus.ACTIVE){
            this.balance+=amount;
            System.out.println("["+ownerName+"] Added on "+amount+"$. Balance: "+balance);
        }else{
            System.out.println("Error: Account is not active or sum is wrong");
        }
    }
    @Override
    public void checkBalanceAndTraffic(){
        if(status!=AccountStatus.ACTIVE){
            System.out.println("[" + ownerName + "] Error: Account is " + status);
            return;
        }
        System.out.println("[" + ownerName + "] Balance: " + balance + " RUB | Traffic left: " + trafficLeftGb + " GB.");
    }
    @Override
    public void viewDetailization(){
        System.out.println("[" + ownerName + "] Call detail records for number " + phoneNumber + " requested.");
    }
    @Override
    public void viewPaymentsInfo(){
        System.out.println("[" + ownerName + "] Payment history requested.");
    }
    @Override
    public void changeTariffPlan(String newTariff) {
        this.currentTariff = newTariff;
        System.out.println("[" + ownerName + "] Tariff plan changed to: " + newTariff);
    }

    @Override
    public void changeOperator(String newOperator) {
        this.currentOperator = newOperator;
        System.out.println("[" + ownerName + "] Operator changed to: " + newOperator);
    }

    @Override
    public void closeAccountAndNumber() {
        this.status = AccountStatus.CLOSED;
        System.out.println("[" + ownerName + "] Account and number " + phoneNumber + " are closed.");
    }

    @Override
    public String getActualInfo() {
        return AccountInfo.format(this);
    }

    public abstract void specificInternetFeature();
    public abstract void specificCorporateFeature();

    public String getOwnerName() { return ownerName; }
    public String getPhoneNumber() { return phoneNumber; }
    public double getBalance() { return balance; }
    public double getTrafficLeftGb() { return trafficLeftGb; }
    public String getCurrentTariff() { return currentTariff; }
    public String getCurrentOperator() { return currentOperator; }
    public AccountStatus getStatus() { return status; }
}
