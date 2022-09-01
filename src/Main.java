import java.util.Scanner;

public class Main {

    // remove boilerplate for break
    // use nested if statement
    // use local variable for numbers inside each if statement
    // use local variable when ask number to the user by numbers
    // remove unnecessary spaces

    public static void main(String[] args) {
        Calculadora cassio = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;


        do {
            System.out.println("presiona 1 para sumar");

            System.out.println("presiona 2 restar");

            System.out.println("presiona 3 dividir");

            System.out.println("presiona 4 multiplicar");

            System.out.println("presiona 5 para salir");

            opcion = sc.nextInt();

            int numero1 =123;
            int numero2 =123;

            if (opcion == 1) {
                System.out.println("ingresa el numero");
                numero1 = sc.nextInt();

                System.out.println("ingresa el segundo numero");
                numero2 = sc.nextInt();

                int resultado = cassio.sumar(numero1, numero2);
                System.out.println("El resultado es" + resultado);

            } else if (opcion == 2) {
                System.out.println("ingresa el primer numero");
                numero1 = sc.nextInt();

                System.out.println("ingresa el segundo numero");
                numero2 = sc.nextInt();

                int resultado = cassio.restar(numero1, numero2);
                System.out.println("el resultado es" + " " + resultado);
            }

            } while (opcion <5);

    }
}

