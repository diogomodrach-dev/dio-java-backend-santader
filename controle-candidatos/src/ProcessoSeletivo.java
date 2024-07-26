import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
   
    public static void main(String[] args) {

        System.out.println("Processo Seletivo");

        selecaoCandidatos();
        
        
    }      
       
        public static void selecaoCandidatos () {

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
    
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length ){
            String candidato = candidatos[candidatosAtual];
            double salarioPrentendido = valorPretendido();

            System.out.println("O candidato" + candidato + " solicitou este valor de salario" + salarioPrentendido);
            
            if (salarioBase >= salarioPrentendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
        
            }
            candidatosAtual++;
        }
    
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPrentendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPrentendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase == salarioPrentendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        
        else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
