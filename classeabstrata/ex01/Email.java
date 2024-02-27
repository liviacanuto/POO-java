package classeabstrata.ex01;

public class Email extends Contato {
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Email(String email) {
        this.email = email;
        this.tipo = "Email";
    }

    @Override
    public String toString() {
        return "Email: " + this.email;
    }

}
