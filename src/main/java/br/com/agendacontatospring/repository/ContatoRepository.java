package br.com.agendacontatospring.repository;

import br.com.agendacontatospring.model.Contato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ContatoRepository extends CrudRepository<Contato, Long> {
    List<Contato> findByNameIgnoreCaseContaining(String name);
}
