public class ResultadoEscolar {
    //Condicionais encadeadas. IF -> ELSE IF -> ELSE
    public static void main(String[] args) {
        int nota = 4;

	if (nota >= 7)
		System.out.println("Sua nota é: " + nota + ". Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Sua nota é: " + nota + ". Recuperação");
	else
		System.out.println("Sua nota é: " + nota + ". Reprovado");
    }
}
