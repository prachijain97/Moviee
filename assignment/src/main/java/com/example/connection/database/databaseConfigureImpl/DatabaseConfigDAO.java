package com.example.connection.database.databaseConfigureImpl;

import com.example.connection.database.model.Movie;

import java.sql.SQLException;

public interface DatabaseConfigDAO {

    public abstract int createMovieList(Movie movie) throws SQLException;

    public abstract List<Movie> getList();


}
