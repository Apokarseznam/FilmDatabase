package cz.ropek.film.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cz.ropek.film.dao.FilmDAO;
import cz.ropek.film.entity.Film;

@Service
public class FilmServiceImpl implements FilmService {

	private FilmDAO filmDAO;

	@Autowired
	public FilmServiceImpl(FilmDAO theFilmDAO) {
		filmDAO = theFilmDAO;
	}

	@Override
	@Transactional
	public List<Film> findAll() {
		return filmDAO.findAll();
	}

	@Override
	@Transactional
	public Film findById(int theId) {
		return filmDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Film theFilmDAO) {
		filmDAO.save(theFilmDAO);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		filmDAO.deleteById(theId);
	}

}
