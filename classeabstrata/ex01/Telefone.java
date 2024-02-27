package classeabstrata.ex01;

public class Telefone extends Contato {
    private String telefone;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Telefone(String telefone) {
        this.telefone = telefone;
        this.tipo = "Telefone";
    }

    @Override
    public String toString() {
        return "Telefone: " + this.telefone;
    }
}
