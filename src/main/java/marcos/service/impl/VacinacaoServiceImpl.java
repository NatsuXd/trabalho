package marcos.service.impl;

import marcos.domain.repository.Vacinacao;
import marcos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinacaoServiceImpl implements UsuarioService {
    @Autowired
    private Vacinacao repository;
}
