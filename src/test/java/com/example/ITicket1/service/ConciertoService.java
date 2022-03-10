
package com.example.ITicket1.service;
import com.example.ITicket1.entity.Concierto;
import java.util.List;
import java.util.Optional;
import com.example.ITicket1.service.IConciertoService;
import com.example.ITicket1.repository.ConciertoRepository;
import com.example.ITicket1.service.IConciertoService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ConciertoService implements IConciertoService{
        //Inyeccion de dependencias
    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Concierto> getAllConcierto() {
            return (List<Concierto>)conciertoRepository.findAll();
    }

    @Override
    public void saveConcierto(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public Concierto getConciertoById(long id) {
        return conciertoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(long id) {
        conciertoRepository.deleteById(id);
    }
}
