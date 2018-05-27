package com.example.connection.database.controller;

import com.example.connection.database.databaseConfigureImpl.DatabaseConfigDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieListController {


    @Autowired DatabaseConfigDAO databaseConfigDAO;



    @PostMapping(value="/add/movieProfile")
    public ResponseEntity<Object> createMovieList(@RequestBody Movie movie){
        databaseConfigDAO.createMovieList(movie);

        return new ResponseEntity("Update Successfully",HttpStatus.OK);

    }
    @GetMapping(value="/get/movieProfile")
    public ResponseEntity<Object> getMovieList(){

        return new ResponseEntity(databaseConfigDAO.getList(),HttpStatus.OK);


    }


    @RequestMapping(value="/update/movieList",method=RequestMethod.PUT)

    public ResponseEntity<Object> updateMovieList(@RequestBody Movie movie,@PathVariable("id") String id){
        databaseConfigDAO.updateList(movie,id);
        return new ResponseEntity("successfully updated",HttpStatus.OK);
    }
}
