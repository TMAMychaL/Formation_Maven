#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import ${package}.exception.DAOException;
import ${package}.model.ToDo;

public interface ToDoDao extends JpaRepository<ToDo, Integer> {

	List<ToDo> findAllByName(@Param("name") String name) throws DAOException;
}
