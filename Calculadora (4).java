import java.util.Scanner;

public class Calculadora {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println(ANSI_PURPLE + "_________________________________" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "|    Calculadora Científica     |" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "|-------------------------------|" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|1. " + ANSI_RESET + ANSI_GREEN + "Suma" + ANSI_RESET + ANSI_YELLOW + "                        |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|2. " + ANSI_RESET + ANSI_GREEN + "Resta" + ANSI_RESET + ANSI_YELLOW + "                       |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|3. " + ANSI_RESET + ANSI_GREEN + "Multiplicación" + ANSI_RESET + ANSI_YELLOW + "              |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|4. " + ANSI_RESET + ANSI_GREEN + "División" + ANSI_RESET + ANSI_YELLOW + "                    |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|5. " + ANSI_RESET + ANSI_GREEN + "Operación boolean" + ANSI_RESET + ANSI_YELLOW + "           |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|6. " + ANSI_RESET + ANSI_GREEN + "Seno" + ANSI_RESET + ANSI_YELLOW + "                        |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|7. " + ANSI_RESET + ANSI_GREEN + "Coseno" + ANSI_RESET + ANSI_YELLOW + "                      |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|8. " + ANSI_RESET + ANSI_GREEN + "Logaritmo" + ANSI_RESET + ANSI_YELLOW + "                   |" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "|9. " + ANSI_RESET + ANSI_GREEN + "Salir" + ANSI_RESET + ANSI_YELLOW + "                       |" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "|_______________________________|" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "=================================" + ANSI_RESET);
            int opcion = scanner.nextInt();
            System.out.println(ANSI_PURPLE + "=================================" + ANSI_RESET);
            switch (opcion) {
                case 1:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el primer número:" + ANSI_RESET);
                    short num1Suma = scanner.nextShort();
                    System.out.println(ANSI_BLUE + "Ingrese el segundo número:" + ANSI_RESET);
                    int num2Suma = scanner.nextInt();
                    int resultadoSuma = num1Suma + num2Suma;
                    System.out.println(ANSI_YELLOW + "El resultado de " + ANSI_RESET + ANSI_RED + num1Suma + ANSI_RESET + ANSI_YELLOW + " + " + ANSI_RESET + ANSI_RED + num2Suma + ANSI_RESET + ANSI_YELLOW + " es: " + ANSI_RESET + ANSI_RED + resultadoSuma + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 2:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el primer número:" + ANSI_RESET);
                    int num1Resta = scanner.nextInt();
                    System.out.println(ANSI_BLUE + "Ingrese el segundo número:" + ANSI_RESET);
                    int num2Resta = scanner.nextInt();
                    int resultadoResta = num1Resta - num2Resta;
                    System.out.println(ANSI_YELLOW + "El resultado de " + ANSI_RESET + ANSI_RED + num1Resta + ANSI_RESET + ANSI_YELLOW + " - " + ANSI_RESET + ANSI_RED + num2Resta + ANSI_RESET + ANSI_YELLOW + " es: " + ANSI_RESET + ANSI_RED + resultadoResta + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 3:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el primer número:" + ANSI_RESET);
                    int num1Multiplicacion = scanner.nextInt();
                    System.out.println(ANSI_BLUE + "Ingrese el segundo número:" + ANSI_RESET);
                    int num2Multiplicacion = scanner.nextInt();
                    int resultadoMultiplicacion = num1Multiplicacion * num2Multiplicacion;
                    System.out.println(ANSI_YELLOW + "El resultado de " + ANSI_RESET + ANSI_RED + num1Multiplicacion + ANSI_RESET + ANSI_YELLOW + " * " + ANSI_RESET + ANSI_RED + num2Multiplicacion + ANSI_RESET + ANSI_YELLOW + " es: " + ANSI_RESET + ANSI_RED + resultadoMultiplicacion + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 4:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el primer número:" + ANSI_RESET);
                    double num1 = scanner.nextDouble();

                    System.out.println(ANSI_BLUE + "Ingrese el segundo número:" + ANSI_RESET);
                    double num2 = scanner.nextDouble();

                    double resultado = 0;

                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println(ANSI_YELLOW + "El resultado de " + ANSI_RESET + ANSI_RED + num1 + ANSI_RESET + ANSI_YELLOW + " / " + ANSI_RESET + ANSI_RED + num2 + ANSI_RESET + ANSI_YELLOW + " es: " + ANSI_RESET + ANSI_RED + resultado + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_YELLOW + "No se puede dividir por cero." + ANSI_RESET);
                    }
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 5:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el primer booleano (true/false):" + ANSI_RESET);
                    boolean bool1 = scanner.nextBoolean();
                                       scanner.nextLine();
                    System.out.println(ANSI_BLUE + "Ingrese el segundo booleano (true/false):" + ANSI_RESET);
                    boolean bool2 = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.println(ANSI_BLUE + "Ingrese el operador (AND/OR/XOR):" + ANSI_RESET);
                    String operador = scanner.next();

                    boolean resultadoBooleano = false;

                    switch (operador.toUpperCase()) {
                        case "AND":
                            resultadoBooleano = bool1 && bool2;
                            break;
                        case "OR":
                            resultadoBooleano = bool1 || bool2;
                            break;
                        case "XOR":
                            resultadoBooleano = bool1 ^ bool2;
                            break;
                        default:
                            System.out.println(ANSI_YELLOW + "Operador booleano no válido." + ANSI_RESET);
                            continue;
                    }

                    System.out.println(ANSI_YELLOW + "El resultado de " + ANSI_RESET + ANSI_RED + bool1 + ANSI_RESET + " " + operador + " " + ANSI_RED + bool2 + ANSI_RESET + ANSI_YELLOW + " es: " + ANSI_RESET + ANSI_RED + resultadoBooleano + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 6:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el ángulo en grados:" + ANSI_RESET);
                    double anguloSeno = scanner.nextDouble();
                    double resultadoSeno = Math.sin(Math.toRadians(anguloSeno));
                    System.out.println(ANSI_YELLOW + "El seno de " + ANSI_RESET + ANSI_RED + anguloSeno + ANSI_RESET + ANSI_YELLOW + " grados es: " + ANSI_RESET + ANSI_RED + resultadoSeno + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 7:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el ángulo en grados:" + ANSI_RESET);
                    double anguloCoseno = scanner.nextDouble();
                    double resultadoCoseno = Math.cos(Math.toRadians(anguloCoseno));
                    System.out.println(ANSI_YELLOW + "El coseno de " + ANSI_RESET + ANSI_RED + anguloCoseno + ANSI_RESET + ANSI_YELLOW + " grados es: " + ANSI_RESET + ANSI_RED + resultadoCoseno + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 8:
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    System.out.println(ANSI_BLUE + "Ingrese el número:" + ANSI_RESET);
                    double numeroLogaritmo = scanner.nextLong();
                    if (numeroLogaritmo > 0) {
                        double resultadoLogaritmo = Math.log(numeroLogaritmo);
                        System.out.println(ANSI_YELLOW + "El logaritmo natural de " + ANSI_RESET + ANSI_RED + numeroLogaritmo + ANSI_RESET + ANSI_YELLOW + " es: " + ANSI_RESET + ANSI_RED + resultadoLogaritmo + ANSI_RESET);
                    } else {
                        System.out.println(ANSI_YELLOW + "El logaritmo no está definido para números menores o iguales a cero." + ANSI_RESET);
                    }
                    System.out.println(ANSI_CYAN + "=================================" + ANSI_RESET);
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println(ANSI_YELLOW + "Opción no válida." + ANSI_RESET);
            }
        }

        scanner.close();
    }
}