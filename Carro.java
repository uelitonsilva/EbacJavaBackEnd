
public class Carro {
    
    // Propriedades do carro
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private boolean ligado;
    
    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false;  
    }
    
    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }
    
    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }
    
    // Método para acelerar o carro
    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando.");
        } else {
            System.out.println("Você precisa ligar o carro primeiro.");
        }
    }

    // Métodos getters e setters para acessar as propriedades do carro
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigado() {
        return ligado;
    }
}
