public class Produtos {
  private Integer id;
  private Double valor;
  private String nomeProduto;
  private String tipo;

  // Geter's e Setter's

  public int getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTipoProduto() {
    return tipo;
  }

  public void setTipoProduto(String tipo) {
    this.tipo = tipo;
  }

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

}
