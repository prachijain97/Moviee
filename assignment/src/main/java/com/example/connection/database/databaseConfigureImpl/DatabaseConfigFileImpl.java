package com.example.connection.database.databaseConfigureImpl;

import com.example.connection.database.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.KeyHolder;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DatabaseConfigFileImpl implements DatabaseConfigDAO {

    @Autowired JdbcTemplate jdbc;
    @Override
    public int createMovieList(Movie movie) throws SQLException {
        KeyHolder keyholder = new GenerateKeyHolder();
        jdbc.update(Connection connection){
            PreparedStatement preparedStatement;
            preparedStatement = connection.prepareStatement("INSERT INTO MOVIE(ACTOR,MOVIE,PRODUCER) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setObject(1,movie.getPerson());
            preparedStatement.setString(2,movie.getName());
            preparedStatement.setString(3,movie.getPlot());
            preparedStatement.setString(3,movie.getYear()));
            preparedStatement.setByte(3,movie.getImage());
            return preparedStatement;
        } ,keyholder);
        return keyHolder.getKey.intValue();
    }
    }

    @Override

    public List<Movie> getList() {
        List<Money> movieList = new ArrayList<>();
        Collection<Map<String,Object>> rows=null;
        rows = jdbc.queryForList("SELECT ACTOR,MOVIE,PRODUCER FROM MOVIE");
        rows.stream().map((row) ->{

            Movie m = new Movie();
            m.setPerson((String)row.get("PERSON"));
            m.setName((String)row.get("NAME"));
            m.setPlot((String)row.get("PLOT"));
            m.setYear((String)row.get("YEAR"));
            m.setImage((BufferedImage)row.get("IMAGE"));

            return m;
        }).forEach((ss) ->{
            movieList.add(ss);

        });
        return movieList;
    }
    }
public void updateList(Movie movie,String id){
        jdbc.update("UPDATE MOVIE SET ACTOR=?,MOVIE=?,PRODUCER=? WHERE ID=?",new Object[]{movie.getActor(),movie.getProducer,movie.getMovie,id});
        }
}
