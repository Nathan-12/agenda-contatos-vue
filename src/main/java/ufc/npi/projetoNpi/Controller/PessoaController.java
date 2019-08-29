package ufc.npi.projetoNpi.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ufc.npi.projetoNpi.Service.PessoaService;
import ufc.npi.projetoNpi.model.PessoaModel;

import java.util.List;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> listarPessoa() {
        return pessoaService.retornar_todas_as_pessoas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PessoaModel adicionarPessoa(@RequestBody PessoaModel pessoaModel){
        return pessoaService.adicionar_pessoa(pessoaModel);
    }


    @DeleteMapping("/excluir/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirPessoa(@PathVariable("id") long id) {
         pessoaService.remover_pessoa(id);
    }

    @PutMapping("/{id}")
    public PessoaModel editarPessoa(@PathVariable("id") Long id, @RequestBody PessoaModel pessoaModel){
        return pessoaService.adicionar_pessoa(pessoaModel);
    }



}
