import java.util.Scanner;
public class Main{
    
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int[] classificacoes = new int[10];
    System.out.println("*** Informe o nível de satisfação de 10 clientes ***");
    System.out.println("*** Opcoes ***");
    System.out.println("1 - Muito Insatisfeito");
    System.out.println("2 - Insatisfeito");
    System.out.println("3 - Neutro");
    System.out.println("4 - Satisfeito");
    System.out.println("5 - Muito Satisfeito");
    
     System.out.println("\n");
    
    for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nível de satisfação do cliente " + (i + 1) + " : ");
            int classificacao = teclado.nextInt();
            // Validar entrada
            if (classificacao < 1 || classificacao > 5) {
                System.out.println("Por favor, insira uma classificação válida (de 1 a 5).");
                i--; // Repetir a iteração
            } else {
                classificacoes[i] = classificacao;
            }
        }

        // Calcular resumo dos resultados
        int muitoInsatisfeito = 0;
        int insatisfeito = 0;
        int neutro = 0;
        int satisfeito = 0;
        int muitoSatisfeito = 0;

        for (int i = 0; i < 10; i++) {
            switch (classificacoes[i]) {
                case 1:
                    muitoInsatisfeito++;
                    break;
                case 2:
                    insatisfeito++;
                    break;
                case 3:
                    neutro++;
                    break;
                case 4:
                    satisfeito++;
                    break;
                case 5:
                    muitoSatisfeito++;
                    break;
            }
        }

        // Exibir resumo
        System.out.println("*** Resultado da Pesquisa ***");
        System.out.println("Muito Insatisfeito = " + muitoInsatisfeito);
        System.out.println("Insatisfeito = " + insatisfeito);
        System.out.println("Neutro = " + neutro);
        System.out.println("Satisfeito = " + satisfeito);
        System.out.println("Muito Satisfeito = " + muitoSatisfeito);
    }
}
