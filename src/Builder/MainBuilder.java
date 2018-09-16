package Builder;

public class MainBuilder {

    public static void main(String[] args) {

        EquipamentoEletronico equip = new EquipamentoEletronico("Padrão");

        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.CHIP, "Chip01", "A"));
        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.RESISTOR, "Res02", "B"));
        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.CAPACITOR, "Cap03", "C"));
        equip.getComponentes().add(EquipBuilder.geraComponente(EquipBuilder.CatComp.INDUTOR, "Ind04", "D"));

        Placa placa = new Placa("Placa Nova");
        placa.getComponentes().add(new Resistor("Res005", "E"));
        placa.getComponentes().add(new Resistor("Res006", "F"));

        equip.getComponentes().add(placa);

        equip.getInfo();

    }
}
