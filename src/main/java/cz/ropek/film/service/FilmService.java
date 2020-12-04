package cz.ropek.film.service;

import java.util.List;

import cz.ropek.film.entity.Film;

public interface FilmService {

	public List<Film> findAll();

	public Film findById(int theId);

	public void save(Film film);

	public void deleteById(int theId);

}
