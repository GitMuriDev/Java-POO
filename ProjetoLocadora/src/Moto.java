public class Moto extends Veiculo{
    //um novo atributo cilindrada
    //se cilindrada > 300 : acrescimo de 15%
    private int quantidadeCilindros;

    public Moto(String marca, String modelo, int ano, String placa, double precoBase, int quantidadeCilindros) {
        super(marca, modelo, ano, placa, precoBase);
        this.quantidadeCilindros = quantidadeCilindros;
    }
    @Override
    public double calcularDiaria(){
        if (quantidadeCilindros > 300){
            return getPrecoBase() * 1.15;
        }

        return getPrecoBase();
    }
    public String exibirDados() {return super.exibirDados() + "Cilindra: " + quantidadeCilindros;    }
}
