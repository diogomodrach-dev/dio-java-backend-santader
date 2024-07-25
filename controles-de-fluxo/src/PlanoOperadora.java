public class PlanoOperadora {
    // uso adequado do SWITCH-CASE. Foi usado uma ordem decrescente no switch. Do plano mais completo para o mais básico.
    public static void main(String[] args) {
        
        String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
				
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
				
			}
			case "B": {
				System.out.println("100 minutos de ligação");
				
			}
		}
    }
}
