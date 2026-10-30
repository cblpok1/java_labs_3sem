public class IndividualSubscriber extends Subscriber {

    public IndividualSubscriber(String ownerName, String operator) {
        super(ownerName, operator);
    }

    @Override
    public void specificInternetFeature() {
        System.out.println("[" + getOwnerName() + "] Feature: Unlimited internet for social media.");
    }

    @Override
    public void specificCorporateFeature() {
        System.out.println("Feature is not available for individuals.");
    }
}