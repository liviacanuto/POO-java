package classeobjetos.aula03.ex01;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
    }

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void exibirHorario() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public int calcularSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return this.segundo;
    }
}
