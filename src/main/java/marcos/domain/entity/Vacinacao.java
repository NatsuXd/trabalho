package marcos.domain.entity;

import javax.persistence.*;

@Entity
public class Vacinacao {
        @Id
        @GeneratedValue(strategy =  GenerationType.AUTO)
        @Column(name = "id")
        private Integer id;
        @Column (name = "vacina",length = 100)
        private String vacina;
        @Column(name = "email",length = 100)
        private String email;
        @Column(name = "data",length = 8)
        private String data;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getVacina() {
            return vacina;
        }

        public void setVacina(String vacina) {
            this.vacina = vacina;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
}

