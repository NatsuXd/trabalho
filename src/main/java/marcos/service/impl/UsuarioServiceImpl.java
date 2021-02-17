package marcos.service.impl;

import marcos.domain.entity.Usuario;
import marcos.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class UsuarioServiceImpl implements VacinacaoService {
    @Autowired
    private Usuario repository;

    }


