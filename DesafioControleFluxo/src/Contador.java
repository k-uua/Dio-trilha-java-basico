import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int primeiroPatametro = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();

        try {
			contar(primeiroPatametro, segundoParametro);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro dever ser maior que o primeiro");
		}
		terminal.close();
	}

	static void contar(int primeiroPatametro, int segundoParametro ) throws ParametrosInvalidosException {
		if(primeiroPatametro >= segundoParametro){
			throw new ParametrosInvalidosException();
		}
		
		int contagem = segundoParametro - primeiroPatametro;
		//realizar o for para imprimir os números com base na variável contagem

		for(int i = 1; i <= contagem; i++){
			System.out.println("Imprimindo o numero: " + i );
		}
		
	}
	
    
}

