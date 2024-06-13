import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Agencia: ");
        String agencia = scanner.next();

        System.out.println("Número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por cria uma conta em nosso banco, sua agência é " + agencia + ", conta" + numero + " e seu saldo " + saldo + " já está disponível para saque.");



        scanner.close();
    }
}
