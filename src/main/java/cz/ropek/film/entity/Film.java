package cz.ropek.film.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Film")
public class Film {

	@NotNull(message = "Zadejte rok")
    	@Min(value=1800, message="Rok minimalne 1800")  
    	@Max(value=3000, message="Rok maximálně 3000")  
	@Column(name = "Year")
	private Integer year;

	@NotBlank(message = "Zadejte název")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Name")
	private String name;

	@NotBlank(message = "Zadejte režiséra")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Director")
	private String director;

	@NotBlank(message = "Zadejte zemi původu")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Country")
	private String country;

	@NotBlank(message = "Zadejte žánr")
	@Size(max = 20, message = "Maximalně 20 znaků")
	@Column(name = "Genres")
	private String genres;
	
	@Min(value=0, message="Hodnocení minimálně 0")  
    	@Max(value=100, message="Hodnocení maximálně 100")  
	@Column(name = "Score")
	private Integer score;

	@Column(name = "Viewed")
	private Boolean viewed;

	@Id
	@Column(name = "ID")
	private int id;

	public Film() {
	}

	public Film(int year, String name, String director, String country, String genres, int score, Boolean viewed,
			int id) {

		this.year = year;
		this.name = name;
		this.director = director;
		this.country = country;
		this.genres = genres;
		this.score = score;
		this.viewed = viewed;
		this.id = id;
	}

	public Film(int year, String name, String director, String country, String genres, int score, Boolean viewed) {

		this.year = year;
		this.name = name;
		this.director = director;
		this.country = country;
		this.genres = genres;
		this.score = score;
		this.viewed = viewed;
	}

	public Film(int year, String name, String director, String country, String genres) {

		this.year = year;
		this.name = name;
		this.director = director;
		this.country = country;
		this.genres = genres;

	}

	public Film(int score) {

		this.year = 1111;
		this.name = "gg";
		this.director = "ff";
		this.country = "dd";
		this.genres = "dd";
		this.score = score;
		this.viewed = true;
		this.id = 55;

	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Boolean getViewed() {
		return viewed;
	}

	public void setViewed(Boolean viewed) {
		this.viewed = viewed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", year=" + year + ", name=" + name + ", score=" + score + ", genres=" + genres
				+ ", viewed=" + viewed + ", country=" + country + ", director=" + director + "]";
	}

}
