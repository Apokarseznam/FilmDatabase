package cz.ropek.film.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;

import cz.ropek.film.entity.Film;
import cz.ropek.film.service.FilmService;

import javax.validation.Valid;

@Controller
public class FilmController {

	@Autowired
	private FilmService filmService;

	@GetMapping(value = "/watchedFilm")
	public String listWatchedFilm(Model theModel) {

		return "watchedFilm";
	}

	@GetMapping(value = "/unWatchedFilm")
	public String listUnWatchedFilm(Model theModel) {

		return "unWatchedFilm";
	}

	@GetMapping(value = "/delete")
	public String delete(HttpServletRequest getId, Model model) {

		Film film = filmService.findById(Integer.parseInt(getId.getParameter("Id")));

		model.addAttribute("film", film);

		return "delete";
	}

	@GetMapping(value = "/deleteConfirmed")
	public String deleteConfirmed(HttpServletRequest getId) {

		filmService.deleteById(Integer.parseInt(getId.getParameter("Id")));

		return "redirect:/unWatchedFilm";
	}

	@PostMapping("/addFilm")
	public String addFilm(@Valid @ModelAttribute("film") Film film, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "add";
		} else {

			film.setViewed(false);
			film.setScore(0);
			filmService.save(film);

			return "redirect:/unWatchedFilm";
		}
	}

	@PostMapping("/updateFilm")
	public String updateFilm(@Valid @ModelAttribute("film") Film film, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "update";
		} else {

			filmService.save(film);

			return "redirect:/watchedFilm";
		}
	}

	@GetMapping(value = "/add")
	public String add(Model model) {
		Film film = new Film();
		model.addAttribute("film", film);

		return "add";
	}

	@GetMapping(value = "/update")
	public String update(HttpServletRequest getId, Model model) {

		Film film = filmService.findById(Integer.parseInt(getId.getParameter("Id")));

		model.addAttribute("film", film);

		return "update";
	}

	@GetMapping(value = "/evaluate")
	public String evaluate(HttpServletRequest getId, Model model) {

		Film film = filmService.findById(Integer.parseInt(getId.getParameter("Id")));

		model.addAttribute("film", film);

		return "evaluate";
	}

	@PostMapping("/evaluateFilm")
	public String evaluateFilm(@Valid @ModelAttribute("film") Film film, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {

			return "evaluate";
		} else {
			film.setViewed(true);
			filmService.save(film);

			return "redirect:/watchedFilm";
		}
	}

}
