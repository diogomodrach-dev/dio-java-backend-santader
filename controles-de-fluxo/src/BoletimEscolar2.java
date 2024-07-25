public class BoletimEscolar2 {
    // Condição ternária
    public static void main(String[] args) {
        
        int nota = 6;

		String resultado = nota >=7 ? "Aprovado" : "Reprovado";

		System.out.println(resultado);

        int nota2 = 6;
		String resultado2 = nota >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
	}
    
}
