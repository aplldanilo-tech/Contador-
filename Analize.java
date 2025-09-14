
import java.util.Scanner;

public class Analize {

    public static void main(String[] args) {
        Inicio1();

      ForContar();




    }


    public static void Inicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite Seu nome");
        String nome = sc.nextLine();
        int vez = 6;
        for (int i = 0; i < vez; i++) {

            if (nome.length() >= 6) {
                System.out.println(" Nome: " + nome + "\n" + " Qunatidade de Letras no Nome :" + nome.length());
            }
            else if (nome.length() <= 6) {

                System.out.println("Nome; " + nome + "\n" + " Qunatidade de Letras no Nome :" + nome.length());

            }   continue;

        }
    }



    public static void ForContar() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite 1/2 Para Inicializar");

        int decisaoDoUsuario = 1;
        decisaoDoUsuario = sc1.nextInt();

        do {
            System.out.println("Digite um numero para o Contador Cresente" + "\n Ou 0 Para Sair ");

            if (decisaoDoUsuario == 1) {
                Decrescente();
                ForCrescente();

            } else if (decisaoDoUsuario != 2) {
                continue;
            }

        } while (decisaoDoUsuario == 0);
        sc1.close();
    }

    public static void ForCrescente() {

        System.out.println("Digite um numero  para ser Inicializado");
        Scanner sc = new Scanner(System.in);
        int numeroMaximo = sc.nextInt();

        if (numeroMaximo > 0) {
            System.out.println("ForCrescente:\n");
            for (int n1 = 0; n1 < numeroMaximo; n1++) {
                System.out.println("O contador Estar em :" + n1);
            }
        } else {
            System.out.println("Voce Digitou um Numero Menor do Que Um");
        }
        sc.close();
    }

    public static void Decrescente() {
        System.out.println("Digite um numero Maximo Para ser Inicializado");
        Scanner sc = new Scanner(System.in);
        int numeroInicial = sc.nextInt();

        if (numeroInicial > 0) {
            System.out.println("DeCrescente:\n");

            for (int n1 = numeroInicial; n1 > 0; n1--) {
                System.out.println("O contador estar em: " + n1);
            }
        } else {
            System.out.println("Voce Digitou um Numero Menor do Que um Nao pode");
            sc.close();
        }
    }

    void main() {
    }
}



