import java.util.Scanner;
//OBS: 
// Pela convenção todo File de Java deve começar com letra maiúscula e ter um .java
//sout = System.out.println() -> O println significa mostrar em tela
// = Serve para comits

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //--------------------------------------------  ALG (primeira fase) --------------------------------------------//


        //--------------------------------------------  AULA 1 --------------------------------------------//
        /*
        
        // operadores lógicos: &&, || e !
        // operadores relacionais: >, <, >=, <=, ==, !=, -=
        // operador de atribuição =, ++, +=, --, -=
        // Operadores aritméticos: +, -, /, *, %(mod)

        // como fazer o / e o div para mostrar um resultado arredondado e outro exato

        int a = 1;
        int b = 2;
        
        double resultado = a / (double) b; // correção de tipos, typecast
        
        System.out.println(resultado);
        
        // System.out.printf("%.2f\n", resultado); //o 5f são a quantidade de casas depois da vírgula

        // Formas de acrescentar e decrementar 1:
        int a = 1;
         
        a = a + 1;
     
        a += 1;
        
        a++;
        
        a--;
        
        //expressões lógicas:

        - e, &, ʌ, &&

        - ou, |, v

        - não, !, ¬

        - ou exclusivo, ^, +
        
        int a = 1;
        int b = 2;
        
        // Declaração de variável para guardar inteiros (int = integer que significa uma variável de números inteiros)
        // int n; 
        // n = 10; //Atribuição de valor à variável
        // System.out.println(n); // Impressão do valor da variável


        // int a; // números inteiros
        // double b; // números reais (com mais casas depois da vírgula, mais precisão do que float)
        // float c; // números reais (com menos casas depois da vírgula, menos precisão do que double)
        // a = 10;
        // b = 9.54;
        // c = 9.5f;


        // char d; // caracteres (letras, números, símbolos)
        // String e; // cadeia de caracteres (texto)
        // d = 'A';
        // e = "Hello, World!";


        // boolean g; //valores lógicos (true ou false)
        // g = true;
        // g = false;


        //Criando frase
        // String frase;
        // frase = "Olá mundo";
        // System.out.println(frase + " " + a);

        // Utilizando o Scanner:
        // Scanner teclado = new Scanner(System.in); // objeto para ler informações do teclado
        // System.out.print("entre com seu nome: ");
        // String nome = teclado.nextLine(); // lê uma linha de texto do teclado
        // System.in = teclado //System.out = terminal


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

        */

        //--------------------------------------------  AULA 2 --------------------------------------------//
        /*
        double ladoA;
        double ladoB;
        double area;


        // Calculo de retângula
        System.out.println("Vamos calcular a área de um retângulo");
        System.out.print("Entre com a altura do retângulo: ");
        ladoA = leitor.nextDouble();
        System.out.print("Entre com a largura do retângulo: ");
        ladoB = leitor.nextDouble();
        area = ladoA*ladoB;
        System.out.println("A área do retângulo é " + area);


        System.out.print("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Bem vindo, " + nome + "!");
        System.out.println("Escreva um número inteiro: ");
        int numero = leitor.nextInt();
        boolean par = false;
        if(numero % 2 == 0){
            par = true;
        }


        if(par){
            System.out.println("O número"  + numero +  "é par!");
        }else {
            System.out.println("O número "  + numero +  " é impar!");
        }
        */

        //--------------------------------------------  AULA 6 --------------------------------------------//

        /*

        // Criar um switch case para selecionar uma das operações desejadas e realizar a operação desejada.
        Math.sqrt (9); (raiz quadrado de 9)
        math.pow (numero, elevado); ( 3 elevado a 2)

        int opcoes;
        Double ladoA;
        Double ladoB;
        Double area;
        Double hipotenusa;
        Double raio;
        Double numero1;
        Double numero2;
        Double numero3;
      
       System.out.print("Bem vindo!\n Digite um dos números abaixos para calcular as operações \n 1 - Para calcular a area de um retângulo; \n 2 - Para calcular a area de um Triangulo; \n 3 - Calcule a Hipotenusa de um triângulo retângulo; \n 4 - Para calcular a area de um círculo; \n 5 - Para calcular o perímetro de um círculo; \n 6 - Para calcular a média de 3 números de ponto flutuante. \n digite a opção: ");
       opcoes = teclado.nextInt();


       if (opcoes <= 6 && opcoes > 0 ) {
           switch (opcoes) {
               case 1: if (opcoes == 1) {
                   // (1) Calcule a area de um retângulo
                   System.out.println("Vamos calcular a área de um retângulo");
                   System.out.print("Entre com a altura do retângulo: ");
                   ladoA = teclado.nextDouble();
                   System.out.print("Entre com a largura do retângulo: ");
                   ladoB = teclado.nextDouble();
                   area = ladoA * ladoB;
                   if (area < 0) {
                       System.out.println("Insira números positivos! Não é possível calcular a área de um retângulo com números negativos!");
                   }else {
                   System.out.println("A área do retângulo é " + area);
                   }
                   };
               break;
              
               case 2: if (opcoes == 2) {}
                   // (2) Calcule a area de um Triângulo
                   System.out.println("Vamos calcular a área de um triângulo");
                   System.out.print("Entre com a altura do triângulo: ");
                   ladoA = teclado.nextDouble();
                   System.out.print("Entre com a largura do triângulo: ");
                   ladoB = teclado.nextDouble();
                   area = (ladoA * ladoB) / 2;
                   if (area < 0) {
                   System.out.println("Insira números positivos! Não é possível calcular a área de um triângulo com números negativos!");
                   }else {
                   System.out.println("A área do retângulo é " + area);
                   }
               break;


               case 3: if (opcoes == 3) {}
                   //(3) Calcule a Hipotenusa de um triângulo retângulo
                   System.out.println("Vamos calcular a hipotenusa de um triângulo retângulo");
                   System.out.print("Entre com a altura do triângulo: ");
                   ladoA = teclado.nextDouble();
                   System.out.print("Entre com a largura do triângulo: ");
                   ladoB = teclado.nextDouble();
                   hipotenusa = Math.sqrt((ladoA*ladoA) + (ladoB*ladoB));
                   if (hipotenusa < 0) {
                       System.out.println("Insira números positivos! Não é possível calcular a hipotenusa de um retângulo com números negativos!");
                   }else {
                   System.out.println("A Hipotenusa do triângulo é " + hipotenusa);
                   }
               break;


               case 4: if (opcoes == 4) {}
                   // (4) Calcule a area de um círculo
                   System.out.println("Vamos calcular a área de um círculo");
                   System.out.print("Entre com o raio: ");
                   raio = teclado.nextDouble();
                   area = ( Math.PI * raio * raio) ;
                   if (area < 0) {
                       System.out.println("Insira números positivos! Não é possível calcular a área de um círculo com números negativos!");
                   }else {
                   System.out.println("A área do círculo é " + area);
                   }
               break;


               case 5: if (opcoes == 5) {
                   // (5) Calcule o perímetro de um círculo
                   System.out.println("Vamos calcular o perímetro de um círculo");
                   System.out.print("Entre com o raio: ");
                   raio = teclado.nextDouble();
                   area = ( 2 * Math.PI * raio) ;
                   if (area < 0) {
                       System.out.println("Insira números positivos! Não é possível calcular o perímetro de um círculo com números negativos!");
                   }else {
                   System.out.println("O perímetro de um círculo é " + area);
                   }
                   }
               break;


               case 6: if (opcoes == 6) {
                   // (6) Calcule a média de 3 números de ponto flutuante
                   System.out.println("Vamos calcular a média de 3 números de ponto flutuante");
                   System.out.print("Entre com o numero 1: ");
                   numero1 = teclado.nextDouble();
                   System.out.print("Entre com o numero 2: ");
                   numero2 = teclado.nextDouble();
                   System.out.print("Entre com o numero 3: ");
                   numero3 = teclado.nextDouble();
                   area = ((numero1+numero2+numero3)/3);
                   System.out.println("A média dos 3 números de ponto flutuantes é " + area);
                   }
               break;
           }    
       } else {
           System.out.println("Opção inválida!");
       }
       */

       //--------------------------------------------  AULA 7 --------------------------------------------//
        /*
       //Diferenças do DoWhile para o While

       // DoWhile
       
       int i = 7;
       do {
           i++;
       } while (i<7);
       System.out.println("i = " + i);


        // while
       int a = 7;
       while(a<7) {
           a++;
       }
       System.out.println("a = " + a);


       atividade aula 7
      
        double par1;
        double par2;
        double resultado;
        int opcao;

      do {
          System.out.print("Bem vindo!\nopções de operações:\n 1.Operação de soma;\n 2.Operação de subtração;\n 3.Operação de multiplicação;\n 4.Operação de divisão(verifica se a divisão é possivel);\n 5.Sair do menu.\nDigite o número da operação que você deseja realizar: ");
           opcao = teclado.nextInt();
           switch (opcao) {
               case 1:
                   System.out.println("Você selecionou a opção 1. operação de soma");
                   System.out.print("Digite o seu primeiro parâmetro: ");
                   par1 = teclado.nextDouble();
                   System.out.print("Digite o seu segundo parâmetro: ");
                   par2 = teclado.nextDouble();
                   resultado = par1 + par2;
                   System.out.println("A soma de " + par1 + " + " + par2 + " = " + resultado);
               break;
            
               case 2:
                   System.out.println("Você selecionou a opção 2. operação de subtração");
                   System.out.print("Digite o seu primeiro parâmetro: ");
                   par1 = teclado.nextDouble();
                   System.out.print("Digite o seu segundo parâmetro: ");
                   par2 = teclado.nextDouble();
                   resultado = par1 - par2;
                   System.out.println("A subtração de " + par1 + " - " + par2 + " = " + resultado);
               break;
                  
               case 3:
                   System.out.println("Você selecionou a opção 3. operação de multiplicação");
                   System.out.print("Digite o seu primeiro parâmetro: ");
                   par1 = teclado.nextDouble();
                   System.out.print("Digite o seu segundo parâmetro: ");
                   par2 = teclado.nextDouble();
                   resultado = par1 + par2;
                   System.out.println("A multiplicação de " + par1 + " x " + par2 + " = " + resultado);
               break;
                     
               case 4:
                   System.out.println("Você selecionou a opção 4. operação de divisão");
                   System.out.print("Digite o seu primeiro parâmetro: ");
                   par1 = teclado.nextDouble();
                   System.out.print("Digite o seu segundo parâmetro: ");
                   par2 = teclado.nextDouble();
                   if (par2 == 0){
                   System.out.println("A divisão não é possível");
                   }else {
                       System.out.println("A divisão é possivel");
                   }
               break;


               case 5:
                   System.out.println("Você selecionou a opção 5. sair");
               break;


               default:
                   System.out.println("opção inválida! escreva um número entre 1 e 5");
               break;
           }
       } while (opcao != 5);
       */

       //--------------------------------------------  AULA 9 --------------------------------------------//
       /* 
       // Aula sobre Arrays e exercícios de Array, while e for

        // Arrays
        
        // Primeira forma de declarar um array
        int[] a = new int[2];
        
        // Segunda forma de declarar um array
        int[] b;
        b = new int[10];
        
        // Declarando varios arrays
        int[] c = new int[6], d = new int[8], e = new int[4];
        
        // inicializando valores aos arrays
        int[] iValores = { 2, 4, 6, 8, 10 };
        
        // Declarando um array de inteiros
        int[] aInteiros = new int[5];
        aInteiros[0] = 2;
        aInteiros[1] = 4;
        aInteiros[2] = 6;
        aInteiros[3] = 8;
        aInteiros[4] = 10;
        
        // Saidas dos valores dos arrays
        System.out.println(aInteiros[3]);

        // Descobrindo o tamanho do array
        int[] arrayUm = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arrayDois = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        // todo array, mesmo que não tenha seu tamanho definido, sabe seu tamanho pelo numero de elementos que foram inicializados nele. O comando para descobrir o tamanho do array é .length
        
        System.out.println("O tamanho do array Um vale: " + arrayUm.length);
        System.out.println("O tamanho do array Dois vale: " + arrayDois.length);
        
        if (arrayUm.length > arrayDois.length) {
            System.out.println("O array Um é maior que o array Dois.");
        } else if (arrayUm.length == arrayDois.length) {
            System.out.println("Os arrays são iguais.");
        } else {
            System.out.println("O array Dois é maior que o array Um.");
        }
        
        // Percorrendo Arrays
        
        // Quando definimos o tamanho do array mas não definimos os elementos dele e percorremos ele, o java inicializa os valores padrões (0) para cada tipo de dado.
        int[] arrayTres = new int[5];
        for (int i = 0; i < arrayTres.length; i++) {
            System.out.println("Posição " + i + " : " + arrayTres[i]);
        }
        
        // Percorrendo um Array e mostrando seus elementos
        int[] arrayQuatro = { 5, 10, 15, 20, 25, 30, 2, 35, 40, 45, 50 };
        for (int i = 0; i < arrayQuatro.length; i++) {
            System.out.println("Posição " + i + " : " + arrayQuatro[i]);
        }
        
        // Percorrendo um Array e descobrindo o maior valor
        int maior = arrayQuatro[0];
        for (int i = 1; i < arrayQuatro.length; i++) {
            if (arrayQuatro[i] > maior) {
                maior = arrayQuatro[i];
            }
        }
        System.out.println("O maior valor do array é: " + maior);
        
        // Percorrendo um Array e descobrindo o menor valor
        int menor = arrayQuatro[0];
        for (int i = 1; i < arrayQuatro.length; i++) {
        if (arrayQuatro[i] < menor) {
                menor = arrayQuatro[i];
            }
        }
        System.out.println("O menor valor do array é: " + menor);

        // Utilizando o For aprimorado para percorrer Arrays (for (parametro : array) { instrução })
        int[] arrayNum = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };
        int total = 0;
        for (int i : arrayNum) {
            total += i; // total += i é a mesma coisa que total = total + i
        }
        System.out.println("A soma de todos os valores do array é: " + total);

        // Exercício: Criar um programa que leia 5 números inteiros, armazene em um array e mostre o maior e o menor valor digitado.
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("números digitados: " + java.util.Arrays.toString(numeros));

        // Exercícios de Array:

        //a) totalPares: a função recebe como parâmetro um array de inteiros e retorna um  número inteiro indicando o total de números pares existentes no array.
        /*
        System.out.print("Escreva um número inteiro para definir o intervalo: ");
        int n = teclado.nextInt();
        int acumulador = 0;
        int[] array = new int[n];
        System.out.println("Digite " + n + " números para preencher o array");
        for (int i = 0; i < n; i++) {
            array[i] = teclado.nextInt();
        }
        for (int j = 0; j < n; j++) {
            if (array[j] % 2 == 0) {
                acumulador++;
            }
        }
        System.out.println("No seu array existem " + acumulador + " números pares!");
        */

        //b) maiorValor: a função recebe como parâmetro um array de inteiros e retorna o  maior número existente no array.
        /*
        System.out.print("Escreva a quantidade de números que você deseja armazenar em um array: ");
        int num = teclado.nextInt();
        int[] array = new int[num];
        int acumulador = array[0];
        System.out.print("Escreva " + num + " números para preencher o seu array: ");
        for (int i = 0; i < num; i++){
            array[i] = teclado.nextInt();
            if (array[i] > acumulador) {
                acumulador = array[i];
            }
        }
        System.out.println("O maior número presente em seu array é " + acumulador);
        */

        //c) totalIguais: a função recebe como parâmetro dois arrays de inteiros e retorna o total de números iguais existentes em ambos os arrays.
        /*
        int numIguais = 0;
        System.out.print("Escreva dois número inteiros para definir o tamanho do primeiro e do segundo array: ");
        int tamA1 = teclado.nextInt();
        int tamA2 = teclado.nextInt();
        System.out.println("Seu primeiro array possui o tamanho de " + tamA1 + ", seu segundo array possui o tamanho de " + tamA2);
        int[] array1 = new int [tamA1];
        int[] array2 = new int[tamA2];
        System.out.print("Escreva " + tamA1 + " números para preencher seu primeiro array: ");
        for (int i = 0; i < tamA1; i++) {
            array1[i] = teclado.nextInt();
        }
        System.out.print("Agora escreva " + tamA2 + " números para preencher seu segundo array: ");
        for (int j = 0; j < tamA2; j++) {
            array2[j] = teclado.nextInt();
        }
        for (int k = 0; k < tamA1; k++) {
            for (int l = 0; l < tamA2; l++) {
                if (array1[k] == array2[l]) {
                    numIguais++;
                }
            }
        }
        System.out.println("Os seus arrays possuem " + numIguais + " números iguais!");
        */

        //Exercícios de while, for e array:

        //4) Somar números até que o usuário digite 0 (while). 
        // O usuário vai digitando números, e você soma todos até que digite 0. Use while.
        
        /*
        System.out.print("Entre com um valor: ");
        int num = teclado.nextInt();
        int acumulador = 0;
        while (num != 0) {
            acumulador += num;
            num = teclado.nextInt();
        }
        System.out.println(acumulador);
        */

        //5) tabuada de um número (for)
        //Peça um número e imprima a tabuada dele de 1 a 10 usando for
        
        /*
        System.out.print("Escreva de qual número você deseja saber a tabuada: ");
        int num = teclado.nextInt();
        System.out.println("Tabuada do " + num);
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
        */

        //6) Preencher um array de 5 posições e imprimir o conteúdo (for)
        // Leia 5 números e armazene em um array. Depois imprima todos usando for
        
        /*
        System.out.print("Escreva 5 números para preencher um array:");
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = teclado.nextInt();
            System.out.println(num[i]);  
        }
        */

        //7) Encontrar o maior valor de um array (for)
        // Leia 10 números, coloque em um array e encontre o maior valor usando for.
        /*
        int[] num = new int[10];
        int maior = 0;
        System.out.print("Escreva 10 números: ");
        for (int i = 0; i < 10; i++) {
            num[i] = teclado.nextInt();
            if (num[i] > maior) {
                maior = num[i];
            }
        }
        System.out.println("O maior número do seu Array é " + maior);
        */
        /*
        //8) Contar quantos números pares há no array (for)
        // Leia 10 valores e conte quantos são pares.

        int[] valor = new int[10];
        int pares = 0;
        for (int i = 0; i < 10; i++) {
            valor = teclado.nextInt();
        }
        */

        //--------------------------------------------  AULA 10 --------------------------------------------//
        // Introdução ao conceito de função
        /*
        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            int num = 0;
            System.out.println("Vamos verificar se é par ou impar.");
            System.out.print("Entre com um número: ");
            num = scanner.nextInt();

            boolean verificacao = verificaPar(num);

            if(verificacao) {
                System.out.println("O número " + num + " é par");
            }

            if(verificacao) {
                System.out.println("O número " + num + " é impar");
            }

            scanner.close();
        }

        public static boolean verificaPar (int numero) {
            boolean resposta = false;

            if(numero%2 == 0) {
                resposta = true;
            }

            return resposta;

        }

        public static boolean verificaImpar (int numero) {
            return !verificaPar(numero);
        }

        */

        //--------------------------------------------  AULA 10 --------------------------------------------//

        //Lista de exercícios com 16 casos em um switch case para praticar os ensinamentos do semestre:
        /*
        int opcao = -1;

        boolean teste = true;

        while (teste) {
            System.out.println("\nEscolha uma das opções: ");
            System.out.println("1: imprime100");
            System.out.println("2: imprimeN");
            System.out.println("3: nomes5");
            System.out.println("4: adicao");
            System.out.println("5: pessoas");
            System.out.println("6: imparesN");
            System.out.println("7: tabuada");
            System.out.println("8: elevado");
            System.out.println("9: soma1N");
            System.out.println("10: fibonacciFor");
            System.out.println("11: fibonacciWhile");
            System.out.println("12: criarArray");
            System.out.println("13: unirArrays");
            System.out.println("14: palindromo");
            System.out.println("15: primo");
            System.out.println("16: perfeito");
            System.out.print("Opção escolhida: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    imprime100();
                    break;

                case 2:
                    imprimeN();
                    break;

                case 3:
                    nomes5();
                    break;

                case 4:
                    adicao();
                    break;

                case 5:
                    pessoas();
                    break;

                case 6:
                    imparesN();
                    break;

                case 7:
                    tabuada();
                    break;

                case 8:
                    elevado();
                    break;

                case 9:
                    soma1N();
                    break;

                case 10:
                    fibonacciFor();
                    break;

                case 11:
                    fibonacciWhile();
                    break;
                  
                case 12:
                    criarArray();
                    break;
                
                case 13:
                    unirArrays();
                    break;
                
                case 14:
                    palindromo();
                    break;

                case 15:
                    primo();
                    break;
                
                case 16:
                    perfeito();
                    break;
                
                default:
                    teste = false;
                    break;
            }
        }

        // Case 1 - Imprime100
        public static void imprime100() {
            int n = 0;
            while (n <= 100) {
                System.out.print(n + " ");
                n++;
            }
        }

       // Case 2 - imprimeN
        public static void imprimeN() {
            int i = 0;
            System.out.println("Insira quantos números deseja imprimir: ");
            int n = scanner.nextInt();
            while (i <= n) {
                System.out.print(i + " ");
                i++;
            }
        }

        // Case 3 - nomes5
        public static void nomes5() {
            System.out.println("Escreva o nome de 5 pessoas: ");
            String[] nome = new String[5];
            scanner.nextLine();
            int a = 0;
            while (a < 5) {
                nome[a] = scanner.nextLine();
                a++;
            }
            System.out.print("Os nomes escritos são: ");
            for (int i = 0; i < nome.length; i++) {
                System.out.print(nome[i] + " ");
            }
            // System.out.println("Os nomes escritos são: " + nome[0] + ", " + nome[1] + ",
            // " + nome[2] + ", " + nome[3] + ", " + nome[4]);
        }

        // case 4 - adicao
        public static void adicao() {
            int i = 0;
            while (i < 1) {
                System.out.print("Digite os dois números que você deseja somar: ");
                double n1 = scanner.nextDouble();
                double n2 = scanner.nextDouble();
                scanner.nextLine(); // limpar o buffer do scanner
                double resultado;
                resultado = n1 + n2;
                System.out.println("Conta: " + n1 + " + " + n2 + " = " + resultado);
                System.out.println("Você deseja continuar? Digite sim ou não");
                String continuar = scanner.nextLine();
                if (!continuar.equalsIgnoreCase("sim")) {
                    i++;
                }
            }
        }

        // case 5 - pessoas
        public static void pessoas() {
            int numNomes;
            int i = 0;
            System.out.print("Quantos nomes você deseja adicionar a lista: ");
            numNomes = scanner.nextInt();
            scanner.nextLine();// comando para limpar o buffer que armazenou o enter do scanner.nextInt
            String[] lista = new String[numNomes];
            System.out.print("Sua lista possui " + numNomes + " vagas. Escreva os nomes que você deseja adicionar a lista: ");
            while (i < numNomes) {
                lista[i] = scanner.nextLine();
                i++;
            }
            System.out.println("lista de nomes: ");
            i = 0;
            while (i < numNomes) {
                System.out.println("Nome " + (i + 1) + ": " + lista[i]);
                i++;
            }
        }

        // case 6 - imparesN
        public static void imparesN() {
            System.out.print("Escreva o periodo que você deseja para descobrir os números impares: ");
            int n = scanner.nextInt();
            System.out.print("Os primeiros números impares desse periodo são: ");
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        // case 7 - tabuada
        public static void tabuada() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("\nTabuada de " + i);
                for (int j = 0; j <= 10; j++) {
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        }

        // case 8 - elevado
        public static void elevado() {

            System.out.println("Vamos calcular um número elevado a outro.\nEscreva o número da base: ");
            int x = scanner.nextInt();
            System.out.println("Escreva o número da potencia: ");
            int y = scanner.nextInt();
            int resultado = 1;
            for (int i = 0; i < y; i++) {
                resultado *= x;
            }
            System.out.println("O resultado é " + resultado);
        }

        // case 9 - soma1N
        public static void soma1N() {
            System.out.print("Digite um número: ");
            int n;
            int resultado = 0;
            n = scanner.nextInt();
            for (int i = 0; i <= n; i++) {
                resultado += i;
            }
            System.out.println("A soma de 1 até " + n + " é: " + resultado);
        }

        // case 10 - fibonacciFor
        public static void fibonacciFor() {
            System.out.print("Digite quantos números da sequência de fibonnaci você deseja saber: ");
            int n = scanner.nextInt();
            System.out.println("Os " + n + " primeiros números da sequência de fibonnaci são: ");
            int[] fibo = new int[n];
            if (n > 0) {
                fibo[0] = 0;
                System.out.println(fibo[0]);
            } else {
                System.out.println("Digite um número maior que 0");
            }
            if (n > 1) {
                fibo[1] = 1;
                System.out.print(fibo[1] + " ");
            }
            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
                System.out.print(fibo[i] + " ");
            }
        }
    
        //case 11 - fibonacciWhile
        public static void fibonacciWhile() {
            System.out.println(
            "Listagem da sequência de fibonacci, segue abaixo as instruções:\n- Para imprimir um novo número da sequência, pressione a tecla ENTER;\n- Para sair da sequência basta digitar \"q\" e pressionar a tecla ENTER.\nSequência de fibonacci: ");
            int anterior = 0;
            int atual = 1;
            System.out.println(anterior);
            System.out.println(atual);
            boolean q = false;
            while (q == false) {
                String continuar = scanner.nextLine();
                if (continuar.equalsIgnoreCase("q")) {
                    q = true;
                } else {
                    int fibo = anterior + atual;
                    System.out.print(fibo + " ");
                    anterior = atual;
                    atual = fibo;
                }
            }
        }
    
        // case 12 - criarArray
        public static void criarArray() {
            System.out.print("Digite o tamanho do Array que você deseja: ");
            int tam = scanner.nextInt();
            int[] array = new int[tam];
            System.out.print("Seu Array tem o tamanho " + tam + ", escreva, em ordem, os valores que você deseja adicionar à ele para preencher o tamanho definido: ");
            for (int i = 0; i < tam; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("O seu array possui os números: ");
            for (int n = 0; n < tam; n++) {
                System.out.println(n + 1 + "º valor (array[" + n + "]): " + array[n]);
            }
        }
    
        // case 13 - unirArrays
        public static void unirArrays() {
            int[] array7 = new int[7];
            int[] array11 = new int[11];
            System.out.print("Digite todos os 7 números para preencher o primeiro Array: ");
            for (int a7 = 0; a7 < 7; a7++) {
                array7[a7] = scanner.nextInt();
            }
            System.out.print("Digite todos os 11 números para preencher o segundo Array: ");
            for (int a11 = 0; a11 < 11; a11++) {
                array11[a11] = scanner.nextInt();
            }
            int[] array18 = new int[array7.length + array11.length];
            System.out.print("O resultado da união dos dois Arrays são: ");
            for (int t = 0; t < 18; t++) {
                if (t < 7){
                    array18[t] = array7[t];
                } else {
                    array18[t] = array11[t-7];
                }
                System.out.print(array18[t] + " ");
            }
        }

        // case 14 - palindromo
        public static void palindromo() {
            System.out.print("Digite a palavra que você deseja verificar se é um palíndromo: ");
            String palavra = scanner.next(); //Escreva um palindromo sem os espaços e acentos para evitar falso negativo
            String reverso = "";
            for (int i = palavra.length() - 1; i >= 0; i--) { //O menos 1 é para não pegar o caractere vazio no final da string
                reverso += palavra.charAt(i); // O comando charAt pega o caractere na posição i da string
            }
            if (palavra.equalsIgnoreCase(reverso)) {
                System.out.println("A palavra " + palavra + " é um palíndromo.");
            } else {
                System.out.println("A palavra " + palavra + " não é um palíndromo.");
            }
        }

        //case 15 - primo
        public static void primo() {
            System.out.print("Digite o número que você deseja descobrir se é primo ou não: ");
            int primo = scanner.nextInt();
            boolean ehPrimo = true;
        
            if (primo > 1) {
                for (int i = 2; i <= Math.sqrt(primo); i++) {
                    if (primo % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                } 
            } else {
                System.out.println("O número deve ser maior que 1 para ser considerado primo");
            }
        
         if (ehPrimo) {
                System.out.println("O número " + primo + " é primo");
            } else {
                System.out.println("O número " + primo + " não é primo");
            }
        }
    
        //case 16 - perfeito
        public static void perfeito() {
            System.out.print("Escreva um número para verificar se ele é perfeito: ");
            int num = scanner.nextInt();
            int perfeito = 0;
            if (num > 0){
                for (int i = 1; i < num; i++) {
                    if (num % i == 0) {
                        perfeito += i;
                    }
                }
                if (perfeito == num) {
                    System.out.println("O número " + num + " é perfeito!");
                } else {
                    System.out.println("O número " + num + " não é perfeito!");
                }
            } else {
                System.out.println("Para um número ser perfeito ele precisa ser inteiro e positivo");
            }
        }
    */
   }
}
