package br.com.agendacontatospring.endpoint;

import br.com.agendacontatospring.error.CustomErrorType;
import br.com.agendacontatospring.model.Contato;
import br.com.agendacontatospring.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*
 * O Endpoint é o ponto final onde os usuarios vão acessar a API
 * Tudo que for relacionado no caso Contato vai ficar aqui como:
 * Salvar,listar deletar etc...
 * */

/*
 *
 * */
@RestController
@RequestMapping("contatos")
public class ContatoEndpoint {

    /*
     * Anotação faz parte do framework de injeção de depencias
     * do spring vai instanciar o objeto.
     * */
    @Autowired
    private DateUtil dateUtil;

    public ContatoEndpoint(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        //System.out.println("Data " + dateUtil.formataTipoLocalDateParaDatabase(LocalDateTime.now()));
        return new ResponseEntity(Contato.contatoList, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getContatoById(@PathVariable("id") int id) {
        Contato contato = new Contato();
        contato.setId(id);
        int index = Contato.contatoList.indexOf(contato);
        if (index == -1)
            return new ResponseEntity<>(new CustomErrorType("Contato não Encontrado"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(Contato.contatoList.get(index), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Contato contato) {
        Contato.contatoList.add(contato);
        return new ResponseEntity<>(contato, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Contato contato) {
        Contato.contatoList.remove(contato);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Contato contato) {
        Contato.contatoList.remove(contato);
        Contato.contatoList.add(contato);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
