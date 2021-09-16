package com.itau.spring02.controller;
import java.util.List;

import com.itau.spring02.model.Usuario;
import com.itau.spring02.repository.UsuarioRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //indica que a classe é um controller REST
@RequestMapping("/user")
@CrossOrigin("*") //liberando para acesso de diferentes origens
public class UsuarioController {
    
    @Autowired // Pede para implementar a classe e os metódos de acesso
    private UsuarioRepo repo;
    
    @GetMapping("/all")
    public List<Usuario> obterTodos() {
        return(List<Usuario>) repo.findAll();

    }

    @GetMapping("/id/{codigo}")
    public ResponseEntity<Usuario> obterUsuario(@PathVariable long codigo){
        // procura um usuario cujo id = código do parâmetro.
        //se não encontrar coloca "null" no usuário encontrado.
        Usuario usuarioEncontrado = repo.findById(codigo).orElse(null);

        if(usuarioEncontrado != null) {
            return ResponseEntity.ok(usuarioEncontrado); //retorna 200 - OK
    }else {
            return ResponseEntity.notFound().build(); //resposta vazia com 404   
    }
}
}