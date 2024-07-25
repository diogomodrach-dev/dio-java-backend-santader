public class SistemaMedida2 {
    //Utilização de SWITCH-CASE e o uso do break a cada case.
    public static void main(String[] args) {
        
        String sigla = "G";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
    }
}
