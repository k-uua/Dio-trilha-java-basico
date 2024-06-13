public class Usuário {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            smartTv.diminuirVolume();

            System.out.println("Canal: " + smartTv.canal);

            smartTv.mudarCanal(4);

            System.out.println("Canal: " + smartTv.canal);

            System.out.println("A TV está ligada? " + smartTv.ligada);
            
            smartTv.ligar ();
            System.out.println("Novo status - TV ligada? " + smartTv.ligada);

            smartTv.desligar();
            System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

            
    }
}
