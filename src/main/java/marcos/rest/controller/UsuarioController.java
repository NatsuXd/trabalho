package marcos.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/api/usuario")
public class UsuarioController {
    @PostMapping(value = "/{id,nome,email,cpf} " )
     public String exemplo;
}

    public String     (@PathVariable  String nomeUsuario) {

}
