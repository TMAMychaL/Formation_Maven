#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service;

import java.util.List;

import ${package}.exception.ServiceException;
import ${package}.model.ToDo;

public interface ToDoService {

	public void add(ToDo toDo) throws ServiceException;

	public List<ToDo> getAll() throws ServiceException;

	public ToDo get(Integer id) throws ServiceException;

	public void delete(Integer id) throws ServiceException;
}
