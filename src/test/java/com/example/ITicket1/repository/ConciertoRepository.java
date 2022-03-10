
package com.example.ITicket1.repository;
import com.example.ITicket1.entity.Artista;
import com.example.ITicket1.entity.Concierto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ConciertoRepository extends CrudRepository<Concierto,Long> {
  
}
