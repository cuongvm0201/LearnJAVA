package service;

import model.ActorFilm;
import model.Film;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FilmService {
        public ArrayList<Film> getFilmByRating (Connection conn){
                String query = "SELECT title, description, release_year, length, rating, JSON_ARRAYAGG(name) AS 'category'\n" +
                        "FROM film\n" +
                        "INNER JOIN film_category ON film.film_id = film_category.film_id\n" +
                        "INNER JOIN category ON film_category.category_id = category.category_id\n" +
                        "WHERE rating = 'PG'\n" +
                        "GROUP BY film.film_id";
                ArrayList<Film> films = new ArrayList<>();
                try {
                        //Tạo truy vấn
                        Statement stm = conn.createStatement();

                        //Thực thi truy vấn
                        ResultSet rs = stm.executeQuery(query);
                        while (rs.next()) {
                                String title = rs.getString("title");
                                String description = rs.getString("description");
                                String release_year = rs.getString("release_year");
                                String length = rs.getString("length");
                                String rating = rs.getString("rating");
                                String category = rs.getString("category");
                                films.add(new Film(title,description,release_year,length,rating,category));
                        }
                       for (Film f: films){
                               System.out.println(f);
                       }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return films;
        }

        public ArrayList<ActorFilm> getActorByFilm (Connection conn){
                String query = "SELECT first_name, last_name, JSON_ARRAYAGG(title) AS 'title_film'\n" +
                        "FROM actor\n" +
                        "INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id\n" +
                        "INNER JOIN film ON film_actor.film_id = film.film_id\n" +
                        "WHERE film.film_id IN (SELECT film.film_id FROM film WHERE film.title LIKE '%ACADEMY%' )\n" +
                        "GROUP BY actor.actor_id";
                ArrayList<ActorFilm> actorFilms = new ArrayList<>();
                try {
                        //Tạo truy vấn
                        Statement stm = conn.createStatement();

                        //Thực thi truy vấn
                        ResultSet rs = stm.executeQuery(query);
                        while (rs.next()) {
                                String title = rs.getString("title_film");
                                String first_name = rs.getString("first_name");
                                String last_name = rs.getString("last_name");

                                actorFilms.add(new ActorFilm(title,first_name,last_name));
                        }
                        for (ActorFilm af: actorFilms){
                                System.out.println(af);
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return actorFilms;
        }

        public Film findTitleFilm (Connection conn, String newTitle){
                String query = "SELECT title, description, release_year, length, rating, JSON_ARRAYAGG(name) AS 'category'\n" +
                        "FROM film\n" +
                        "INNER JOIN film_category ON film.film_id = film_category.film_id\n" +
                        "INNER JOIN category ON film_category.category_id = category.category_id\n" +
                        "WHERE film.title LIKE '%"+newTitle+"%'\n"+
                        "GROUP BY film.film_id";
                Film film = null;
                try {
                        //Tạo truy vấn
                        Statement stm = conn.createStatement();

                        //Thực thi truy vấn
                        ResultSet rs = stm.executeQuery(query);
                        while (rs.next()) {
                                String title = rs.getString("title");
                                String description = rs.getString("description");
                                String release_year = rs.getString("release_year");
                                String length = rs.getString("length");
                                String rating = rs.getString("rating");
                                String category = rs.getString("category");
                                film = new Film(title,description,release_year,length,rating,category);
                                System.out.println(film);
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }

                return film;
        }



}