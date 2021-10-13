import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

  List<Produtos> produtos = new ArrayList<>();

  public void adicionar(Produtos cp) {
    produtos.add(cp);
  }

  public void imprimeProdutos() {
    produtos.forEach((p) -> {
      System.out.println("Id: " + p.getId());
      System.out.println("Nome: " + p.getNomeProduto());
      System.out.println("Tipo: " + p.getTipoProduto());
      System.out.println("Valor: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }

  public void imprimeProdutos(Integer id) {
    produtos.forEach((p) -> {
      System.out.println("Id: " + p.getId());
      System.out.println("Nome: " + p.getNomeProduto());
      System.out.println("Tipo: " + p.getTipoProduto());
      System.out.println("Valor: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }

  public void imprimeProdutos(String nome) {
    produtos.forEach((p) -> {
      System.out.println("Id: " + p.getId());
      System.out.println("Nome: " + p.getNomeProduto());
      System.out.println("Tipo: " + p.getTipoProduto());
      System.out.println("Valor: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }

  public void imprimeProdutos(Double valor) {
    produtos.forEach((p) -> {
      System.out.println("Id: " + p.getId());
      System.out.println("Nome: " + p.getNomeProduto());
      System.out.println("Tipo: " + p.getTipoProduto());
      System.out.println("Valor: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }
}
