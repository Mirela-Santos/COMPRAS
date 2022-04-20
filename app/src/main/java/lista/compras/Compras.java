package lista.compras;

public class Compras {

    private String name;
    private String quantidade;
    private int backgroundColor;

    public Compras(String name, String quantidade, int backgroundColor) {
        this.name = name;
        this.quantidade = quantidade;
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
