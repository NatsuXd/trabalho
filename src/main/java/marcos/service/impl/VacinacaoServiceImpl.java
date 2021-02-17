package marcos.service.impl;

import marcos.domain.entity.Vacinacao;
import marcos.domain.repository.VacinacaoRepository;
import marcos.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacinacaoServiceImpl implements VacinacaoService {
    @Autowired
    private VacinacaoRepository repository;

    @Override
    public Vacinacao salvar(Vacinacao vacinacao) {
        repository.salvar(vacinacao);
        return vacinacao;
    }
}
