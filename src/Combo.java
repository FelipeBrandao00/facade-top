import java.util.Objects;

public class Combo {
    private Burguer _burguer = new Burguer();
    private Bebida _bebida = new Bebida();
    private Sobremesa _sobremesa = new Sobremesa();

    public void CriarCombo(int tipo){
        switch (tipo){
            case 1:
                _burguer.setPreco(20);
                _burguer.setDescricao("Hamburguer de carne");
                _burguer.setGramas(100);

                _bebida.setPreco(10);
                _bebida.setDescricao("Suco de uva");
                _bebida.setML(200);

                _sobremesa.setPreco(5);
                _sobremesa.setDescricao("Sorvete");
                _sobremesa.setTamanho("pequena");
                break;
            case 2:
                _burguer.setPreco(30);
                _burguer.setDescricao("Hamburguer de frango");
                _burguer.setGramas(400);

                _bebida.setPreco(20);
                _bebida.setDescricao("Suco de uva");
                _bebida.setML(400);

                _sobremesa.setPreco(10);
                _sobremesa.setDescricao("Milkshake");
                _sobremesa.setTamanho("pequena");
                break;
            default:
        }
    }

    @Override
    public String toString(){
        if (Objects.equals(_burguer.getDescricao(), null) && Objects.equals(_bebida.getDescricao(), null) && Objects.equals(_sobremesa.getDescricao(), null)) return "Combo inexistente";

     String retorno = "Burguer : " + _burguer.getDescricao() + " Peso: " + _burguer.getGramas() + "gramas Valor: " + _burguer.getPreco() + "\r\n";
     retorno += "Bebida : " + _bebida.getDescricao() + " Mls: " + _bebida.getML() + " Valor: " + _bebida.getPreco() + "\r\n";
     retorno += "Sobremesa : " + _sobremesa.getDescricao() + " Tamanho: " + _sobremesa.getTamanho() + " Valor: " + _sobremesa.getPreco() + "\r\n";

     return retorno;
    }
}
