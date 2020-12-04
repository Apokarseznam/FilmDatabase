package cz.ropek.film.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cz.ropek.film.entity.Film;

@Repository
public class FilmDAOImpl implements FilmDAO {

	private EntityManager entityManager;

	@Autowired
	public FilmDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Film> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);

		Query<Film> theQuery = currentSession.createQuery("from Film", Film.class);

		List<Film> film = theQuery.getResultList();

		return film;
	}

	@Override
	public Film findById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Film film = currentSession.get(Film.class, theId);

		return film;
	}

	@Override
	public void save(Film film) {

		Session currentSession = entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate(film);
	}

	@Override
	public void deleteById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		Query theQuery = currentSession.createQuery("delete from Film where id=:ID");
		theQuery.setParameter("ID", theId);

		theQuery.executeUpdate();
	}

}
