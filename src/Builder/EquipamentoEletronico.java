package Builder;

import java.util.ArrayList;

public class EquipamentoEletronico {

    private String nomeEquipamento;
    private final ArrayList<IComponente> componentes = new ArrayList<>();

    public EquipamentoEletronico(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getnomeEquipamento() {
        return nomeEquipamento;
    }

    public void setnomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public ArrayList<IComponente> getComponentes() {
        return componentes;
    }

    public void getInfo() {

        System.out.println("Equipamento Eletrônico: " + this.getnomeEquipamento());

        for (IComponente componente : componentes) {
            componente.getInfo();
        }
    }
}
