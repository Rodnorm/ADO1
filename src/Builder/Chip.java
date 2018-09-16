package Builder;

public class Chip extends Componente {

    private String tipoChip;

    public Chip(String nomeChip, String tipoChip) {
        super(nomeChip);
        this.tipoChip = tipoChip;
    }

    @Override
    public void getInfo()
    {
        System.out.println("Nome do chip: " + super.getnomeChip() + " | " + this.tipoChip);
    }

}
