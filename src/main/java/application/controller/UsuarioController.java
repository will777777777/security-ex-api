package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import application.record.GenericResponse;
import application.record.UsuarioDTO;
import application.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public GenericResponse insert(@RequestBody UsuarioDTO usuario) {
        // if(usuario.nomeDeUsuario().trim().length() == 0) {
        //     throw new ResponseStatusException(
        //         HttpStatus.BAD_REQUEST, "Nome de Usuário Não Definido"
        //     );
        // }
        // if(usuario.senha().trim().length() == 0) {
        //     throw new ResponseStatusException(
        //         HttpStatus.BAD_REQUEST, "Senha de Usuário Não Definido"
        //     );
        // }

        String returnMessage = "";
        if(usuario.nomeDeUsuario().trim().length() == 0) {
            returnMessage = "Nome de Usuário Não Definido";
        }
        if(usuario.senha().trim().length() == 0) {
                if(returnMessage.length() > 0)
                    returnMessage += ", ";
                returnMessage += "Senha de Usuário Não Definido";
        }
        if(returnMessage.length() > 0) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, returnMessage
            );
        }
        return usuarioService.insert(usuario);
    }
}
