package marcos.domain.entity;

public class VacinacaoDTO {
    private String Vacinan;
    private String email;
    private String data;

    public VacinacaoDTO(String Vacina, String email, String data) {
        this.Vacinan = Vacina;
        this.email = email;
        this.data = data;
    }

    public String getVacinan() {
        return Vacinan;
    }

    public String getEmail() {
        return email;
    }

    public String getData() {
        return data;
    }

}
