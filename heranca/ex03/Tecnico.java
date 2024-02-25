package heranca.ex03;

public class Tecnico extends Funcionario {
    private String nivel;

    public Tecnico() {
        super();
    }

    public Tecnico(int codigo, String nome, double salario, String nivel) {
        super(codigo, nome, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + "Nivel: " + nivel + "\n";
    }
}