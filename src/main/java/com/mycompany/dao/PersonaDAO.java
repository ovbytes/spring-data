
package com.mycompany.dao;

import com.mycompany.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long>{
    
}
