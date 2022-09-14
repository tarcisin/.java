public class App {
    public static void main(String[] args) throws Exception {
        String nome = new String("Maria de Souza");
        String produto1 = new String("Computador");
        String produto2 = new String("Relogio");
        int idade = 28;
        int codigo = 1234;
        char sexo = 'F';
        double preco1 = 5900.18;
        double preco2 = 415.25;
        System.out.println("*** Dados do(a) Comprador ***");
        System.out.println("    Nome: " + nome);
        System.out.println("    Idade: " + idade);
        System.out.println("    Código:" + codigo);
        System.out.println("    Sexo:" + sexo);

        System.out.println();
        System.out.println("*** Lista de Produtos ***");
        System.out.println("    Produto 1: " + produto1 + " | Preço: 5900.18");
        System.out.println("    Produto 2: " + produto2 + " | Preço: 415.25");

        System.out.println();
        System.out.println("*** Valor Total das Compras ***");
        System.out.println("R$" + (preco1 + preco2));

    }
}
