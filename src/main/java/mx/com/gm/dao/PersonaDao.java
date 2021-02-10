package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

//Esta es la clase que administra los queries de las bases de datos de la tabla persona. A diferencia de JEE 
//NO hay necesidad de implemetar esta interfaza ya que xtende de la clase JPA repository que contiene ya los metodos 
//mas basicos para la manupulacion de base de datos
public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
