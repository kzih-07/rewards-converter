public class RewardValue {
    private double cash;
    RewardValue(double cash) {
        this.cash = cash;
    }
    RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }
    private static double convertToCash(int miles) {
        return miles / 0.0035;
    }
    private static int convertToMiles(double cash) {
        return (int) (cash * 0.0035);
    }
    public double getCashValue() {
        return this.cash;
    }
    public double getMilesValue() {
        return convertToMiles(this.cash);
    }
}
