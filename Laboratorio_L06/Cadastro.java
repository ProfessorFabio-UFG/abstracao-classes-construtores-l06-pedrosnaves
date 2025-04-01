import java.util.Scanner;

public class Cadastro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String new_name;
        int qnt;
        String new_tipo;
        double new_preco;

        System.out.println("Cadastro do produto 01: ");
        System.out.println("Digite o código do produto: ");
        int codigo1 = sc.nextInt();
        sc.nextLine();
        Produto produto1 = new Produto(codigo1);


        System.out.println("Cadastro do produto 02: ");
        System.out.println("Digite o código do produto02: ");
        int codigo2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do produto: ");
        String nome2 = sc.nextLine();
        Produto produto2 = new Produto(codigo2, nome2);


        System.out.println("\nCadastro do produto 03: ");
        System.out.println("Digite o código do produto: ");
        int codigo3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do produto: ");
        String nome3 = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade3 = sc.nextInt();
        sc.nextLine();
        Produto produto3 = new Produto(codigo3, nome3, quantidade3);


        System.out.println("\nCadastro do produto 04: ");
        System.out.println("Digite o código do produto: ");
        int codigo4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do produto: ");
        String nome4 = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");
        int quantidade4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o tipo do produto: ");
        String tipo4 = sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        double preco4 = sc.nextDouble();
        sc.nextLine();
        Produto produto4 = new Produto(codigo4, nome4, quantidade4, tipo4, preco4);


        System.out.println("===== PRODUTOS CADASTRADOS =====");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

        produto1.inserir("Quebra-cabeças", 25, "Jogo", 59.90);

        produto1.vender(5);
        produto2.vender(6);
        produto3.vender(7);
        produto4.vender(8);

        produto1.comprar(10);
        produto2.comprar(20);
        produto3.comprar(30);
        produto4.comprar(40);

        produto1.comprar(10, 159.9);
        produto2.comprar(20, 259.99);
        produto3.comprar(30, 109.99);
        produto4.comprar(40, 199.99);

        System.out.println("===== PRODUTOS ATUALIZADOS =====");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);

    }
}
