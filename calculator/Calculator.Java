public class Calculator {
    double baseVal;
    public Calculator(double intialVal) {
        this.baseVal = initialVal;
    }
    public double add(double num1, double num2) {
        System.out.println("Adding the two integers..");
        return num1 + num2;
    }
    public double getBaseVal() {
        return baseVal
    }
}
public class ScientificCalculator extends Calculator {
    public ScientificCalculator(double initialVal) {
        super(initialValue);
    } 
    public double basePower(double exponent) {
        System.out.println("Using your base integer to a power..");
        return Math.pow(this.baseVal, exponent);
    }
}
