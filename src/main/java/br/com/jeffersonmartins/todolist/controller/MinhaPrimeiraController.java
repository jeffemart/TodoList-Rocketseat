package br.com.jeffersonmartins.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // --> Anotation responsável por receber requisição e enviar respostas -> REST --
@RequestMapping("/primeiraRota") // --> Anotation responsável por informar o path/caminho que precisa acessar a rota --

// --> Classe do java --------
public class MinhaPrimeiraController {

  // --> Método (Funcionalidade de uma classe) que retorna mensagem --
  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem() {
    return "Funcionou";
  }

}
