package com.example.springboot.pokemon.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.pokemon.api.model.Pokemon;
import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, String> {

  Optional<Pokemon> findByNameIgnoreCase(String name);

  List<Pokemon> findByTypeIgnoreCase(String type);

  List<Pokemon> findByHpGreaterThanEqual(int hp);

  Optional<Pokemon> findById(String id);
}
