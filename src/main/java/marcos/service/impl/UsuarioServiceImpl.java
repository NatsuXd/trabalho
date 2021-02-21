package marcos.service.impl;

import marcos.domain.entity.Usuario;
import marcos.domain.repository.UsuarioRepository;
import marcos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public Usuario salvar(Usuario usuario) {
       return repository.salvar(usuario);

    }
}


