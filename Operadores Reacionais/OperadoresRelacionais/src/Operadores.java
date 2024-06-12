public class Operadores {
    public static void main(String[] args) {
        String nomeUm = "Kauã";
        String nomeDois = new String ("Kauã");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A condição é verdadeira");
        }

        System.out.println("Numero1 é igual ao Número2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente de Número2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que Número2? " + simNao);
    }
}
