package fr.mychal.service;

import java.util.List;

import fr.mychal.exception.ServiceException;
import fr.mychal.model.ToDo;

public interface ToDoService {

	public void add(ToDo toDo) throws ServiceException;

	public List<ToDo> getAll() throws ServiceException;

	public ToDo get(Integer id) throws ServiceException;

	public void delete(Integer id) throws ServiceException;
}
