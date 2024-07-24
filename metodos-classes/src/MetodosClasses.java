public class MetodosClasses {
    
    public static void main(String[] args) {

        String primeiroNome = "Diogo";
        String segundoNome = "Modrach";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto(primeiroNome, segundoNome));

 }        
     
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);    
    
}
}
