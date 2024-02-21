package classeobjetos.aula02.ex1;

public class Aluno {
    private String ra;
    private String nome;
    private float p1;
    private float p2;
    private float t1;
    private float t2;

    public Aluno(String ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public float calcularMedia() {
        return (p1 + p2 + t1 + t2) / 4.0f;
    }

    public boolean isAprovado() {
        if (calcularMedia() >= 5)
            return true;
        return false;
    }

    public String getRA() {
        return ra;
    }

    public void setRA(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0 && p1 <= 10)
            this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0 && p2 <= 10)
            this.p2 = p2;
    }

    public float getT1() {
        return t1;
    }

    public void setT1(float t1) {
        if (t1 >= 0 && t1 <= 10)
            this.t1 = t1;
    }

    public float getT2() {
        return t2;
    }

    public void setT2(float t2) {
        if (t2 >= 0 && t2 <= 10)
            this.t2 = t2;
    }

    @Override
    public String toString() {
        return "aluno [ra=" + ra + ", nome=" + nome + ", p1=" + p1 + ", p2=" + p2 + ", t1=" + t1 + ", t2=" + t2 + "]";
    }

}
