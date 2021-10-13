import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

  List<Produtos> produtos = new ArrayList<>();

  public void adicionar(Produtos cp) {
    produtos.add(cp);
  }

  public void listaProdutos() {
    produtos.forEach((p) -> {
      System.out.println("Nome: " + p.getId());
      System.out.println("Modelo: " + p.getNomeProduto());
      System.out.println("Tamanho: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }

  public void listaProdutos(Integer id) {
    produtos.forEach((p) -> {
      System.out.println("Nome: " + p.getId());
      System.out.println("Modelo: " + p.getNomeProduto());
      System.out.println("Tamanho: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }

  public void listaProdutos(String nome) {
    produtos.forEach((p) -> {
      System.out.println("Nome: " + p.getId());
      System.out.println("Modelo: " + p.getNomeProduto());
      System.out.println("Tamanho: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }

  public void listaProdutos(Double valor) {
    produtos.forEach((p) -> {
      System.out.println("Nome: " + p.getId());
      System.out.println("Modelo: " + p.getNomeProduto());
      System.out.println("Tamanho: " + p.getValor());
      System.out.println("-----------------------------");
    });
  }
}
