package marcos.controller;
import io.swagger.annotations.ApiParam;
import marcos.domain.entity.Vacinacao;
import marcos.domain.entity.VacinacaoDTO;
import marcos.service.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/vacinacao", produces = MediaType.APPLICATION_JSON_VALUE)
public class VacinacaoController {
    @Autowired
    private VacinacaoService vacinacaoService;

    public VacinacaoController(VacinacaoService vacincaoService) {
        this.vacinacaoService = vacincaoService;
    }

    @PostMapping(path = "/", consumes = "application/json")
    public HttpEntity<Vacinacao> SalvarVacinacao(
            @ApiParam(name = "request", value = "Vacinação", required = true)
            @RequestBody VacinacaoDTO request
    ) {
        try {
            Vacinacao vacinacao = new Vacinacao();
           vacinacao.setVacina(request.getVacinan());
           vacinacao.setEmail(request.getEmail());
           vacinacao.setData(request.getData());

            Vacinacao entity = vacinacaoService.salvar(vacinacao);
            return new ResponseEntity<Vacinacao>(entity, HttpStatus.CREATED);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}

