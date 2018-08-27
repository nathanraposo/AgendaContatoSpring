package br.com.agendacontatospring.endpoint;

import br.com.agendacontatospring.model.Contato;
import br.com.agendacontatospring.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

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

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> findAll() {
        //System.out.println("Data " + dateUtil.formataTipoLocalDateParaDatabase(LocalDateTime.now()));
        return new ResponseEntity(Contato.contatoList,HttpStatus.OK);
    }
}
