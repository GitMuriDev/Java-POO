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
        for (Veiculo v: frota){
            System.out.println(v);
        }
    }

    public void alugarVeiculo(Veiculo veiculo){
        for(int i = 0; i < frota.size(); i++){
            Veiculo v = frota.get(i);

            System.out.printf("[%f] %s %s| Diária: R$ %.2f\n", (i + 1), v.getMarca(), v.getModelo(), v.calcularDiaria());

        }
        System.out.println("===================================================================");
        }
    }


