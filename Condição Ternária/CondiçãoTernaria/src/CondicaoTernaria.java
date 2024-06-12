public class CondicaoTernaria {
    public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";//Sintaxe abreviada
        
        /*Exemplo de uma sintaxe menos abreviada 
        String resultado = "";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        */

        System.out.println(resultado);
    }
}
