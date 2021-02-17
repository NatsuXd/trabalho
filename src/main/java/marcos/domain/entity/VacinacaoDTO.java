package marcos.domain.entity;

public class VacinacaoDTO {
    private String Vacina;
    private String email;
    private String data;

    public VacinacaoDTO(String Vacina, String email, String data) {
        this.Vacina = Vacina;
        this.email = email;
        this.data = data;
    }

    public String getVacinan() {
        return Vacina;
    }

    public String getEmail() {
        return email;
    }

    public String getData() {
        return data;
    }

}
