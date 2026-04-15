import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Carro carro1 = new Carro("Porshe", "Cayanne", 2027, "hhh-8888", 4000, 2);

        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2025, "iii-677",190,1000);


        System.out.println(carro1);
        System.out.println(moto1);

        Locadora locadora = new Locadora();

        locadora.adicionarVeiculo(new Carro("Porshe", "Cayanne", 2027, "hhh-8888", 4000, 2));

        locadora.adicionarVeiculo(new Moto("Suzuki", "Hayabusa", 2025, "iii-677",190,1000));

        locadora.listarVeiculo();
        int tamanho = locadora.getFrota().size();

        Scanner sc = new  Scanner(System.in);

        System.out.println("Escolha o veículo (1 a " + tamanho + ")");
        int veiculoSelecionado = sc.nextInt();

        System.out.println("Quantos dias você deseja ficar com o veículo: ");
        int dias = sc.nextInt();

        locadora.alugarVeiculo(dias, veiculoSelecionado);
    }



}
