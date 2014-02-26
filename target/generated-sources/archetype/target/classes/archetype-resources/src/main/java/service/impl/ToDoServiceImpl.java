#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.dao.ToDoDao;
import ${package}.exception.ServiceException;
import ${package}.model.ToDo;
import ${package}.service.ToDoService;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoDao toDoDao;

	@Override
	@Transactional
	public void add(ToDo toDo) throws ServiceException {
		try {
			toDoDao.save(toDo);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public List<ToDo> getAll() throws ServiceException {

		List<ToDo> toDos = new ArrayList<>();
		try {
			toDos = toDoDao.findAll();
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}

		return toDos;
	}

	@Override
	public ToDo get(Integer id) throws ServiceException {
		try {
			return toDoDao.findOne(id);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	@Transactional
	public void delete(Integer id) throws ServiceException {
		try {
			toDoDao.delete(id);
		} catch (Exception e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
