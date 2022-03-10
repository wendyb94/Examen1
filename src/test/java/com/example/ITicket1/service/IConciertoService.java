
package com.example.ITicket1.service;
import com.example.ITicket1.entity.Concierto;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface IConciertoService {
    public List<Concierto> getAllConcierto();
    public void saveConcierto(Concierto concierto);
    public Concierto getConciertoById(long id);
    public void delete(long id);
}
