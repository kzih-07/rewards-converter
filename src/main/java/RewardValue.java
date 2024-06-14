public class RewardValue {
    private double cash;
    private double miles;
    RewardValue(double cash) {
        this.cash = cash;
    }
    public double getCashValue() {
        return this.miles / 0.0035;
    }
    public double getMilesValue() {
        return this.cash * 0.0035;
    }
}
