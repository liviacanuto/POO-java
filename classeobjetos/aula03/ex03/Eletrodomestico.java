package classeobjetos.aula03.ex03;

// · Um método para exibir um relatório, passando como parâmetro o custo do Kwatts.
// Exemplo de relatório:
// Eletrodoméstico: Telefone Sem Fio
// Potência do aparelho: P=3.0 watts;
// Tempo de utilização do aparelho: 24.0 horas/dia
// Watts/Dia = 72.0 W
// Watts/Mês = 2160.0 W
// Watts/Ano = 25920.0 W
// Preço do Kwatt R$ 0.27
// Gasto mensal é: R$ 0.58320004
public class Eletrodomestico {
    private String nome;
    private double potenciaW;
    private int tempo;

    public void exibirRelatorio(double precoKwatts) {
        System.out.println(
                "Eletrodomestico: " + nome + "\n"
                        + "Potencia do aparelho: P=" + potenciaW + "watts" + "\n"
                        + "Tempo de utilização do aparelho: " + tempo + "horas/dia" + "\n"
                        + "Watts/Dia = " + calcularWattsDia() + " W" + "\n"
                        + "Watts/Mês = " + calcularWattsMes() + " W" + "\n"
                        + "Watts/Ano = " + calcularWattsAno() + " W" + "\n"
                        + "Preço do kWatt: R$" + precoKwatts + "\n"
                        + "Gasto mensal é: R$" + calcularGastoMes(precoKwatts) + "\n");
    }

    public Eletrodomestico() {
    }

    public Eletrodomestico(String nome, int potenciaW, int tempo) {
        this.nome = nome;
        this.potenciaW = potenciaW;
        this.tempo = tempo;
    }

    public double calcularWattsDia() {
        return potenciaW * tempo;
    }

    public double calcularWattsMes() {
        return calcularWattsDia() * 30;
    }

    public double calcularWattsAno() {
        return calcularWattsMes() * 12;
    }

    public double calcularGastoMes(double precoKwatts) {
        return (calcularWattsMes() / 1000) * precoKwatts;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPotenciaW() {
        return potenciaW;
    }

    public void setPotenciaW(int potenciaW) {
        this.potenciaW = potenciaW;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

}
