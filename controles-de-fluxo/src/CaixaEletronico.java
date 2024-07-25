public class CaixaEletronico {
    // Condicional simples.
        public static void main(String[] args) {

            double saldo = 25.0;
            double valorSolicitado = 50.0;
     
            if(valorSolicitado < saldo){
             saldo = saldo - valorSolicitado;     
             System.out.println(saldo);
            }              
            
            System.out.println(saldo);
         }
}
