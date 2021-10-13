import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in);
        Scanner dados1 = new Scanner(System.in);
        Scanner dados2 = new Scanner(System.in);
        Scanner dados3 = new Scanner(System.in);
        ProdutoController produtoController = new ProdutoController();
        Produtos c1 = new Produtos();

        Integer id = 0;
        String nomeProduto = "";
        Double valor = 0.0;

        System.out.println("Opçoes\n 1-Cadastrar produto\n 2-Remover produto\n 3-Verificar produto\n 4-Dinheiro\n");
        int numopc = 0;

        System.out.print("nº: ");

        numopc = dados.nextInt();

        while (numopc == 1) {

            switch (numopc) {

                case 1:
                    System.out.println("Nome do produto: ");
                    id = dados1.nextInt();
                    c1.setId(id);

                    System.out.println("Modelo do produto: ");
                    nomeProduto = dados2.nextLine();
                    c1.setNomeProduto(nomeProduto);

                    System.out.println("Tamanho do produto: ");
                    valor = dados3.nextDouble();
                    c1.setValor(valor);

                    System.out.println("\n Cadastrar mais produtos?\n  1-Sim\n  0-Não\n");
                    numopc = dados.nextInt();

                    produtoController.adicionar(c1);
                    c1 = new Produtos();
                    break;

                case 2:
                    break;
            }

        }

        produtoController.listaProdutos();
    }
}
