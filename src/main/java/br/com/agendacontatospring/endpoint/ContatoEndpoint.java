package br.com.agendacontatospring.endpoint;

import br.com.agendacontatospring.error.CustomErrorType;
import br.com.agendacontatospring.error.ResourceNotFoundException;
import br.com.agendacontatospring.model.Contato;
import br.com.agendacontatospring.repository.ContatoRepository;
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

    private final ContatoRepository contatoDao;

    public ContatoEndpoint(ContatoRepository contatoDao) {
        this.contatoDao = contatoDao;
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(contatoDao.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getContatoById(@PathVariable("id") Long id) {
        Contato contato = contatoDao.findById(id).get();
        if (contato == null)
            throw new ResourceNotFoundException("Contato não Encontrado pelo id :"+ id);
        return new ResponseEntity<>(contato, HttpStatus.OK);
    }

    @GetMapping(path = "/findByName/{name}")
    public ResponseEntity<?> findContatosByName(@PathVariable String name){
        return new ResponseEntity<>(contatoDao.findByNameIgnoreCaseContaining(name),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Contato contato) {
        return new ResponseEntity<>(contatoDao.save(contato), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        contatoDao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Contato contato) {
        contatoDao.save(contato);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
