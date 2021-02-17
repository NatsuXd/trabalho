package  marcos.domain.repository ;

import marcos.domain.entity.Usuario;
import  org.springframework.beans.factory.annotation.Autowired ;
import  org.springframework.jdbc.core.JdbcTemplate ;
import  org.springframework.stereotype.Repository ;
import  org.springframework.transaction.annotation.Transactional ;

import  javax.persistence.EntityManager ;

@Repository
 public  class UsuarioRepository {
    private   static  String  INSERT  = " insert into usuario (nome) (?) " ;
    @Autowired
    private  JdbcTemplate jdbcTemplate;
    @Autowired
    private  EntityManager entityManager;
    @Transactional
    public Usuario salvar (Usuario usuario) {
        entityManager . persist (usuario);
        return usuario;
    }
}
