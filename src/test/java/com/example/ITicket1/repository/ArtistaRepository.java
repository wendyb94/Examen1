package com.example.ITicket1.repository;
import com.example.ITicket1.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista,Long> {
    
}
