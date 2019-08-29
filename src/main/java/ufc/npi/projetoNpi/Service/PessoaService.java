package ufc.npi.projetoNpi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ufc.npi.projetoNpi.model.PessoaModel;
import ufc.npi.projetoNpi.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public PessoaModel adicionar_pessoa(PessoaModel pessoaModel){
        return pessoaRepository.save(pessoaModel);
    }

    public List<PessoaModel> retornar_todas_as_pessoas(){
        return pessoaRepository.findAll();
    }
/*
    public PessoaModel buscar_por_id(Long id){
        return pessoaRepository.findById(id).get();
    }
 */
    public void remover_pessoa(Long id){
        pessoaRepository.deleteById(id);
    }
}
