import java.util.Scanner;

public class Contador2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parametro:");
        int parametroDois = scanner.nextInt();

        try{
            contar (parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException2 e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        finally{
            scanner.close();
        }
    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException2{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException2();
        }
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero" + i);
        }
    }
    
}
