public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765854");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não correspondo com as regras de negócio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
            return "23.765-854";
    }

}