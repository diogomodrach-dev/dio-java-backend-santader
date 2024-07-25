public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Nova TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Nova TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo volume da TV: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Volume da TV: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Canal da TV: " + smartTv.canal);

        smartTv.mudarCanal(45);
        System.out.println("Novo Canal da TV: " + smartTv.canal);

    }
    
}
