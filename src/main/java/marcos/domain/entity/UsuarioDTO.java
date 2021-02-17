package marcos.domain.entity;

public class UsuarioDTO {
    private String nome;
    private String cpf;
    private String dtNascimento;
    private String email;

    public UsuarioDTO(String nome, String cpf, String dtNascimento, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public String getEmail() {
        return email;
    }
}
