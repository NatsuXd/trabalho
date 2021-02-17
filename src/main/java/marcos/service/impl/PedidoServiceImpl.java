package marcos.service.impl;

import marcos.domain.repository.Usuario;
import marcos.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Usuario repository;

    public PedidoServiceImpl(Usuario repository) {
        this.repository = repository;
    }
}
