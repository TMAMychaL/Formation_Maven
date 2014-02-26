package fr.mychal.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.mychal.dao.ToDoDao;
import fr.mychal.exception.ServiceException;
import fr.mychal.model.ToDo;
import fr.mychal.service.ToDoService;

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
