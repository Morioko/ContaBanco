import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("---------------CONTA BANCÁRIA---------------");
        System.out.println();
        System.out.println("Por favor, digite o número da Conta: ");
        numero = sc.nextInt();

        System.out.println("Digite o número da Agência: ");
        agencia = sc.next();

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println();


        System.out.println(nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque");

        sc.close();
        }

    }
