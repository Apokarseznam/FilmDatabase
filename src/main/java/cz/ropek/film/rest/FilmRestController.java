package cz.ropek.film.rest;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.ropek.film.entity.Film;
import cz.ropek.film.service.FilmService;

@RestController
@RequestMapping(value = "/api")
public class FilmRestController {

	@Autowired
	private FilmService filmService;

	@GetMapping(value = "/watchedFilm")
	public List<Film> watchedFilm() {

		List<Film> film = filmService.findAll();

		List<Film> watchedFilm = film.stream().filter(p -> p.getViewed() == true).collect(Collectors.toList());

		return watchedFilm;
	}

	@GetMapping("/unWatchedFilm")
	public List<Film> listUnWatchedFilm() {

		List<Film> film = filmService.findAll();

		List<Film> unWatchedFilm = film.stream().filter(p -> p.getViewed() == false).collect(Collectors.toList());

		return unWatchedFilm;
	}

	@GetMapping("/films/{filmid}")
	public Film getFilm(@PathVariable int filmid) {

		Film film = filmService.findById(filmid);

		if (film == null) {
			throw new RuntimeException("Film id not found - " + filmid);
		}

		return film;
	}

	@PostMapping("/films")
	public Film addFilm(@RequestBody Film film) {

		film.setId(0);

		filmService.save(film);

		return film;
	}

	@PutMapping("/films")
	public Film updateFilm(@RequestBody Film film) {

		filmService.save(film);

		return film;
	}

	@DeleteMapping("/films/{filmid}")
	public String deleteFilm(@PathVariable int filmid) {

		Film film = filmService.findById(filmid);

		if (film == null) {
			throw new RuntimeException("Film id not found - " + filmid);
		}

		filmService.deleteById(filmid);

		return "Deleted Film id - " + filmid;
	}

}
