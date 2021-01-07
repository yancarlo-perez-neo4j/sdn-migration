package org.neo4j.sdnlegacy.controller;

import org.neo4j.sdnlegacy.movie.MovieEntity;
import org.neo4j.sdnlegacy.movie.MovieRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository movieRepository;
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/{actorName}")
    Flux<MovieEntity> getActorMovies(@PathVariable String actorName){
        return movieRepository.findMoviesByActorNameWithCypherPlaceholder(actorName);
    }

}
