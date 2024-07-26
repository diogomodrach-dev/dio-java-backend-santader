public class RepeticaoForContinue {

    public static void main(String[] args) {
        
        int numeros = 1;

        for (numeros = 1; numeros <= 10; numeros ++){

            if (numeros == 4)
                continue;

            System.out.println(numeros);
        }
    }
    
}
