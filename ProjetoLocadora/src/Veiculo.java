//PILAR 1 - ABSTRAÇÃO
//Modelar apenas o que importa: marca, modelo, ano, placa, preço base.
//MÉTODO calcularDiaria()
//abstrato pois cada veículo terá sua própria diária (calculado)

abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;
    //Construtor da classe
    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;
    }

    public abstract double calcularDiaria();

    //PILAR 2 - ENCAPSULAMENTO
    //Modificadores via getters e setters
    //O setter de precobase tem validação: não aceita valores negativos

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getPlaca(){
        return placa;

    }


    public int getAno(){
        return ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase){
        if (precoBase > 0){
            System.out.println("Erro! Não são permitidos valores negativos!");
            return;
        }

        this.precoBase = precoBase;
    }

    public  String exibirDados(){
        return marca + " " + modelo + " (" + ano + ") ";
    }
}

// PILAR 3 - HERANÇA
//Carro e moto herdam tudo de veículo, mas cada um adiciona
// seus proprios atributos e implementa calcularDiaria() do seu jeito.

//Carro -> qtdPortas (atributo)
//método calcular diária -> se qtdPortas >= 4 então acréscimo de 20%

