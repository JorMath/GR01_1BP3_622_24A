package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addition = c.addition(4,7);
        System.out.println("c.addition(4,7) = " + addition);

        int subtraction = c.subtraction(7,1);
        System.out.println("c.subtraction(7,1) = " + subtraction);

        System.out.println("== It is a change !! ==");
        System.out.println("== It is a new change !! ==");
        System.out.println("Grupo 01 Metodologías Ágiles");
        int power = c.power(2,3);
        System.out.println("c.power(2,3) = " + power);
        System.out.println("Ultimo cambio");
    }

}
