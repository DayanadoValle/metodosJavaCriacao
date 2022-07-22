package santandercodegirls.dio.bootcamp;

public class Calculadora {


    //Método soma
    public static void soma(int numero1, int numero2) {
        //Visib/Modif/Retorno/Nome(Parametro1, Parametro2) Obs.: O retorno Void não tem retorno é um retorno vazio
        // O Modificador static que possibilita chamar um método a partir de uma classe
        int resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " é = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " - " + numero2 + " é = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " é = " + resultado);
    }

    public static void  divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " / " + numero2 + " é = " + resultado);
    }

}

