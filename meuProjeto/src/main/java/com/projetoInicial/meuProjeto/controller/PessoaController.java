package com.projetoInicial.meuProjeto.controller;

import com.projetoInicial.meuProjeto.dto.PessoaDto;
import com.projetoInicial.meuProjeto.model.Pessoa;
import com.projetoInicial.meuProjeto.repository.PessoaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping("/pessoa")
    public ResponseEntity<Pessoa> cratePessoa(@RequestBody PessoaDto pessoaDto){
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaDto, pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaRepository.save(pessoa));
    }
}
