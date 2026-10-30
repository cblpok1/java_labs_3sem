public class AccountInfo {
    public static String format(Subscriber sub) {
        String extra = (sub instanceof CorporateSubscriber)
                ? " | Company: " + ((CorporateSubscriber) sub).getCompanyName()
                : "";

        return String.format("Subscriber: %s | Number: %s | Operator: %s | Tariff: %s | Balance: %.2f | Traffic: %.1f GB | Status: %s%s",
                sub.getOwnerName(), sub.getPhoneNumber(), sub.getCurrentOperator(),
                sub.getCurrentTariff(), sub.getBalance(), sub.getTrafficLeftGb(),
                sub.getStatus(), extra);
    }
}