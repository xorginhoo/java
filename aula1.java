//colocar nome e calculo simples
public class Main {
    public static void main(String[] args) {
        System.out.println("seja bem vindo!");

        String nome = "Jorginhoo";
        System.out.println(nome);
        // para calculo decimal
        // float n1=10;
        // double n2=20.53;
        // double total=n1+n2;
        float n1 = 10;
        float n2 = 20;
        float total = n1 + n2;
        System.out.println(n1 + n2);
        System.out.printf("o resultado é %.0f ", total);

    }
}

public class Main {
    public static void main(String[] args) {

        float n1 = 30;
        double n2 = 2;

        double total1 = n1 + n2;
        double total2 = n1 * n2;
        double total3 = n1 / n2;

        System.out.printf("Resultado soma:\n %.0f ", total1);
        System.out.printf("Resultado multiplicação:\n %.0f ", total2);
        System.out.printf("Resultado divisão:\n %.0f", total3);
    }
}

public class Main {
    public static void main(String[] args) {

        double x = -2;

        double total1 = 4 + (3 * x) + (5 * x) - 10 - x;
        double total2 = 5 * x - 4 * x + 10 * x - (10 * x);
        double total3 = 10 * x - 20 * x + 10 / x + 5 * x - 3 * x;

        System.out.printf("a) Resultado:%.0f \n ", total1);
        System.out.printf("b) Resultado: %.0f \n ", total2);
        System.out.printf("c) Resultado: %.0f \n  ", total3);

    }
}

public class Main {
    public static void main(String[] args) {

        String[] produto = { "manga", "morango", "uva" };

        System.out.println(produto[1]);

    }
}

public class Main {
    public static void main(String[] args) {

        float n1 = 10;
        float n2 = 5;
        float n3 = 8;

        float total1 = (n1 + n2 + n3) / 3;

        System.out.printf("média:\n %.1f ", total1);

    }
}