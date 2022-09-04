
public class Retangulo {

    private int altura;
    private int largura;

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    
    public int area() {
        return altura * largura;
    }

    public int perimetro() {
        return 2 * (altura + largura);
    }

}
