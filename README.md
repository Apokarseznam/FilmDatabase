# FilmDatabase

[![Build Status](https://travis-ci.org/Apokarseznam/FilmDatabase.svg?branch=main)](https://travis-ci.org/Apokarseznam/FilmDatabase)

This is a Spring Boot Java app.

### Technologies used:
* Maven 
* Spring Boot
* MySQL
* Hibernate 
* Bootstrap 
* Docker 
* Docker compose 

### To get the code:
```shell
$ git clone https://github.com/Apokarseznam/FilmDatabase.git
```
### Running the app with Docker:
Just need to execute:

```shell
docker-compose up
```
You can then access app here: http://localhost:8088/unWatchedFilm

The Database
* Port: 3307 
* Username: root 
* Password: root 

The app defines following CRUD APIs.

| Method | Url |
| --- | --- |
| GET | /api/films	 |
| GET | /api/films/	{filmId} |
| POST | /api/films |
| PUT | /api/films/ |
| DELETE | /api/films/{filmId} |
