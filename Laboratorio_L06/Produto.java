

public class Produto {


    int codigo;
    String nome;
    int quantidade;
    String tipo;
    double preco;

    public Produto(int codigo){
        this.codigo = codigo;
        this.nome = "Batalha naval";
        this.quantidade = 10;
        this.tipo = "Jogo";
        this.preco = 99.90;
    }

    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = 10;
        this.tipo = "Jogo";
        this.preco = 99.90;
    }

    public Produto(int codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = "Jogo";
        this.preco = 99.90;
    }

    public Produto(int codigo, String nome, int quantidade, String tipo, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.preco = preco;
    }

    public double vender(int qnt){
        if (qnt > quantidade){
            System.out.println("Em falta no estoque!!");
        } else {
            quantidade -= qnt;
        }
        return preco * qnt;
    }

    public void comprar(int qnt, double new_preco){
        quantidade += qnt;
        preco = new_preco;
    }

    public void comprar(int qnt){
        quantidade += qnt;
    }

    public void inserir(String new_name, int qnt, String new_tipo, double new_preco){

        this.nome = new_name;
        this.quantidade = qnt;
        this.tipo = new_tipo;
        this.preco = new_preco;
    }

    public String igual(Produto produto){
        if (this.nome.equals(produto.nome) && this.tipo.equals(produto.tipo)){
            return "true";
        } else {
            return "false";
        }
    }

    public String toString(){
        return "\nCódigo: " + codigo +
                "\nProduto: " + nome +
                "\nQuantidade em estoque: " + quantidade +
                "\nTipo do produto: " + tipo +
                "\nPreço: " + preco +
                "\n---------------------------";
    }

}
