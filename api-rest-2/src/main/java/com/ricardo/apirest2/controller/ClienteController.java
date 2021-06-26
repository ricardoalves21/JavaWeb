package com.ricardo.apirest2.controller;

import com.ricardo.apirest2.model.Cliente;
import com.ricardo.apirest2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    /* Estamos anotando que esta classe será um controlador rest onde serão desenvolvidos endpoints rest, ou seja, que
    receberá as requisições e respostas. */

@RequestMapping("/clientes")
    // Esta anotação irá mapear os endpoints que receberão as requisições no caminho especificado.

public class ClienteController {

    @Autowired
    // Instanciará um objeto de cliente.
    private ClienteRepository clienteRepository;

    @GetMapping
    // Usamos o verbo @GetMapping para apontar o método get para este método.
    public List<Cliente> listar() {  // Método que listará os clientes
        return clienteRepository.findAll();
    }

    @PostMapping
    // Usamos o verbo @PostMapping para inserir dados em nosso banco de dados.
    @ResponseStatus(HttpStatus.CREATED)
    // Esta anotação @ResponseStatus diz para ao invés de retornar a resposta padrão, que seja retornado a resposta do CREATED (201)
    public Cliente adicionar(@RequestBody Cliente cliente){
        // O @RequestBody faz com que o corpo da requisição seja convertido pra objeto Java do tipo Cliente.
        return clienteRepository.save(cliente);
    }

}