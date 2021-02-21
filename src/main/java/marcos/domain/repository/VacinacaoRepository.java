package marcos.domain.repository;

import marcos.domain.entity.Vacinacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
public class VacinacaoRepository {
    private static String INSERT ="insert into vacinacao (nome) values (?)";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EntityManager entityManager;
    @Transactional
    public Vacinacao salvar(Vacinacao vacinacao) {
        entityManager.persist(vacinacao);
        return vacinacao;
    }
}