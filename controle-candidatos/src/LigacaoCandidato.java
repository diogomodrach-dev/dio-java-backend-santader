import java.util.Random;

public class LigacaoCandidato {
    
    public static void main(String[] args) {
        
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        for (String candidato: candidatos){
            entrandoEmContato (candidato);
        }
    }

    static void entrandoEmContato (String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender ();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas);
        else
            System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo tentativas " + tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
}
