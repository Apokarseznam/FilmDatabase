package cz.ropek.film.dao;

import java.util.List;

import cz.ropek.film.entity.Film;

public interface FilmDAO {

	public List<Film> findAll();

	public Film findById(int theId);

	public void save(Film film);

	public void deleteById(int theId);

}
