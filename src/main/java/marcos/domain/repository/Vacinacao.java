package marcos.domain.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
    @Repository
    public class Vacinacao {
        private  static String INSERT ="insert into vacinacao (nome) values (?)";
        @Autowired
        private JdbcTemplate jdbcTemplate;
        @Autowired
        private EntityManager entityManager;
        @Transactional
        public marcos.domain.repository.Vacinacao salvar(marcos.domain.repository.Vacinacao vacinacao) {
            entityManager.persist(vacinacao);
            return vacinacao();
        }
}
