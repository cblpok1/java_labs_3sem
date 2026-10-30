public class Main {
    public static void main(String[] args){
        System.out.println("Individual subscriber");
        IndividualSubscriber user = new IndividualSubscriber("Valik","MTS");
        user.signContract("1");
        user.openAccountAndNumber();
        user.topUpBalance(500);
        user.checkBalanceAndTraffic();
        user.changeTariffPlan("All");
        user.specificInternetFeature();
        System.out.println(user.getActualInfo());
        user.closeAccountAndNumber();

        System.out.println("Corporate subscriber");
        CorporateSubscriber corp = new CorporateSubscriber("Innowise","A1");
        corp.signContract("2");
        corp.openAccountAndNumber();
        corp.topUpBalance(10000);
        corp.specificCorporateFeature();
        System.out.println(corp.getActualInfo());
    }
}
