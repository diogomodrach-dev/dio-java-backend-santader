import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        try( 
            
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Por favor, digite o número da sua Agência.");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da sua conta.");
            int numero = scanner.nextInt();

            System.out.println("Por favor digite o seu saldo.");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua Agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        }

        
    }
}
