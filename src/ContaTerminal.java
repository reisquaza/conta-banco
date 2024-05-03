import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta!");
        int accountNumber = scanner.nextInt();

        System.out.println("Número da agência");
        String agency = scanner.next();

        System.out.println("Informe o seu nome");
        String name = scanner.next();

        System.out.println("Informe o seu saldo");
        double balance = scanner.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque");

    }
}