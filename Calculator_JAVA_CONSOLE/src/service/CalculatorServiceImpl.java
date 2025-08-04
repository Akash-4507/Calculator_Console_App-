package service;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double getAdd(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double getSubtract(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double getMultiply(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double getDivide(double num1, double num2) {
        return num1/num2;
    }
}
