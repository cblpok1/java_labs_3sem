public class CorporateSubscriber extends Subscriber {
    private String companyName;

    public CorporateSubscriber(String companyName, String operator) {
        super("Corporate Client", operator);
        this.companyName = companyName;
    }

    @Override
    public void specificCorporateFeature() {
        System.out.println("[" + companyName + "] Feature: Corporate group and employee limit management.");
    }

    @Override
    public void specificInternetFeature() {
        System.out.println("Feature is not available for corporate tariffs.");
    }

    public String getCompanyName() { return companyName; }
}