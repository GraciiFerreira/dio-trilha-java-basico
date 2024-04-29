import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Qual o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Qual a sua agência: ");
        String agencia = scanner.next();

        System.out.println("Qual o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nome +
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ", conta "+ conta +
        " e seu saldo "+ saldo +" já está disponível para saque");
    }
}
