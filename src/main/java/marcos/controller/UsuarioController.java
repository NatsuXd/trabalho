package marcos.controller;
import io.swagger.annotations.ApiParam;
import marcos.domain.entity.ErrorDTO;
import marcos.domain.entity.Usuario;
import marcos.domain.entity.UsuarioDTO;
import marcos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping(path = "/", consumes = "application/json")
    public HttpEntity SalvarUsuario(
            @ApiParam(name = "request", value = "Usuário", required = true)
            @RequestBody UsuarioDTO request
    ) {
        try {
            Usuario user = new Usuario();
            user.setCpf(request.getCpf());
            user.setEmail(request.getEmail());
            user.setNome(request.getNome());

            Usuario entity = usuarioService.salvar(user);
            return new ResponseEntity(entity, HttpStatus.CREATED);

        } catch (DataIntegrityViolationException dtEx) {
            String message = "";
            if (dtEx.getMessage().contains("CPF")) {
                message = "CPF já cadastrado";
            }else{
                message = "EMAIL já cadastrado";
            }
            ErrorDTO error =new ErrorDTO(message);
            return new
                    ResponseEntity(error, HttpStatus.BAD_REQUEST);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }
}
