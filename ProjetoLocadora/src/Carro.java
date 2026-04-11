public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, String placa, double precoBase, int quantidadePortas) {
        super(marca, modelo, ano, placa, precoBase);
        this.quantidadePortas = quantidadePortas;
    }
    @Override
    public double calcularDiaria(){
        if(quantidadePortas >= 4){
            return getPrecoBase() * 1.20;

        }

        return getPrecoBase();

    }
    public String toString() {
        return "A quantidade é:  " + quantidadePortas;
    }
}