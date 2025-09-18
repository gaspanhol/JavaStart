import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // operadores lógicos: &&, || e !
        // operadores relacionais: >, <, >=, <=, ==, !=, -=
        // operador de atribuição =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, %(mod)

        // como fazer o / e o div para mostrar um resultado arredondado e outro exato

        /*
         * int a = 1;
         * int b = 2;
         * 
         * double resultado = a / (double) b; // correção de tipos, typecast
         * 
         * System.out.println(resultado);
         * 
         * // System.out.printf("%.2f\n", resultado); //o 5f são a quantidade de casas
         * // depois da vírgula
         */

        // Formas de acrescentar e decrementar 1
        
        /*
         * int a = 1;
         * 
         * a = a + 1;
         * 
         * a += 1;
         * 
         * a++;
         * 
         * a--;
         * 
         * System.out.println(a);
         */

        /*
        int a = 1;
        int b = 2;
        
        // alinhamento de if
        
        // - alinhado
        if (a == 1) {
            System.out.println("a = 1");
            if (b == 2) {
                System.out.println("b = 2");
            }
        }
        
        // - Não alinhado
        if (a == 1) {
            System.out.println("Entrou no if");
        } else {
            System.out.println("Entrou no else");
        }
        */

        // aninhamento

        System.out.print("Entre com um número: ");
        int num = teclado.nextInt();

        if (num == 1) {
            System.out.println("Um");
        } else if (num == 2) {
            System.out.println("dois");
        } else if (num == 3) {
            System.out.println("três");
        } else if (num == 4) {
            System.out.println("quatro");
        } else {
            System.out.println("número desconhecido");
        }

        // ou

        switch (num) { // ponto de interrupção ou breakpoint
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            case 4:
                System.out.println("quatro");
                break;
            default:
                System.out.println("número desconhecido");
        }

        // ou

        switch (num) {
            case 1 -> System.out.println("um");
            case 2 -> System.out.println("dois");
            case 3 -> System.out.println("três");
            case 4 -> System.out.println("quatro");
            default -> System.out.println("número desconhecido");
        }
        
        // ou

        String resultado = switch(num){
            case 1 -> "um";
            case 2 -> "dois";
            case 3 -> "três";
            case 4 -> "quatro";
            default -> "número desconhecido";
        }; // O ponto e vírgula aparece nesse linha por que faz parte da atribuição, como se fosse String resultado = switch(num);

    }
}
