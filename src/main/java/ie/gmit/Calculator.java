package ie.gmit;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator() {
        this.num1 = 1;
        this.num2 = 1;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add(int f_num1, int f_num2) {
        this.num1 = f_num1;
        this.num2 = f_num2;

        return this.num1 + this.num2;
    }
}
