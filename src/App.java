import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		contar(parametroUm, parametroDois);
		
	}

	static void contar(int parametroUm, int parametroDois ) {
		if ( parametroUm > parametroDois ) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } else{
            int contagem = parametroDois - parametroUm;
            
            for ( int i = 0; i < contagem; i++ ) {
                System.out.println("Imprimindo o numero " + ( i+1 ));
            }
        }
    }
}
