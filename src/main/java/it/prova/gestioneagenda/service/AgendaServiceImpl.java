package it.prova.gestioneagenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.prova.gestioneagenda.model.Agenda;
import it.prova.gestioneagenda.repository.agenda.AgendaRepository;

@Service
public class AgendaServiceImpl implements AgendaService {
	@Autowired
	private AgendaRepository repository;

	public List<Agenda> listAllElements(boolean eager) {
		if (eager)
			return (List<Agenda>) repository.findAllAgendaEager();

		return (List<Agenda>) repository.findAll();
	}

	public Agenda caricaSingoloElemento(Long id) {
		return repository.findById(id).orElse(null);
	}

	public Agenda caricaSingoloElementoEager(Long id) {
		return repository.findSingleAgendaEager(id);
	}

	@Transactional
	public Agenda aggiorna(Agenda agendaInstance) {
		return repository.save(agendaInstance);
	}

	@Transactional
	public Agenda inserisciNuovo(Agenda agendaInstance) {
		return repository.save(agendaInstance);
	}

	@Transactional
	public void rimuovi(Agenda agendaInstance) {
		repository.delete(agendaInstance);
	}

	public List<Agenda> findByExample(Agenda example) {
		// da implementare
		return this.listAllElements(false);
	}

	@Override
	public List<Agenda> findByDescrizione(String descrizione) {
		return repository.findByDescrizione(descrizione);
	}
}
