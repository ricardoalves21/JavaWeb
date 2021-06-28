package com.zup.apirestricardo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")

public class ListaVeiculo {

    @Autowired
    private ListaVeiculo listaVeiculo;

    @GetMapping("/veiculo/{codigo}/usuario")
    public ResponseEntity<usuarioComVeiculo> = this.listagemVeiculos.obterPorCodigo(codigo);

    retur ResponseEntity.ok(usuarioComVeiculo);
}
