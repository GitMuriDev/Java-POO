import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo>frota;

    public Locadora() {
        this.frota = new ArrayList<>();

    }

    public void adicionarVeiculo(Veiculo veiculo){
        frota.add(veiculo);

    }

    public void listarVeiculo(){
        for(int i = 0; i < frota.size(); i++){
            Veiculo v = frota.get(i);

            System.out.printf("[%f] %s %s| Diária: R$ %.2f\n", (i + 1), v.getMarca(), v.getModelo(), v.calcularDiaria());
        }
        System.out.println("===================================================================");
    }

    public List<Veiculo> getFrota() {
        return frota;
    }

    public void alugarVeiculo(int dias, int idVeiculo){

            Veiculo v = frota.get(idVeiculo-1);

            double aluguel = v.calcularDiaria() * dias;

            System.out.println("====== Resumo do aluguel do veículo ======");
            System.out.println("Veículo: "+ v.exibirDados());
            System.out.println("Quantidade de dias: "+ dias);
            System.out.println("Valor da diária: " + v.calcularDiaria());
            System.out.println("Valor total do aluguel: " + aluguel);
        }
    }


