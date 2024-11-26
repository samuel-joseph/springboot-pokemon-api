package com.example.springboot.pokemon.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.pokemon.api.model.Pokemon;
import com.example.springboot.pokemon.api.repository.PokemonRepository;

@Service
public class PokemonService {

  @Autowired
  private PokemonRepository pokemonRepository;

  // @Autowired
  // private MoveRepository moveRepository;

  public List<Pokemon> getAllPokemons() {
    return pokemonRepository.findAll();
  }

  public Optional<Pokemon> getPokemonById(String id) {
    return pokemonRepository.findById(id);
  }

  public Pokemon savePokemon(Pokemon pokemon) {
    // for (Moveset move : pokemon.getMoves()) {
    // moveRepository.save(move);
    // }
    return pokemonRepository.save(pokemon);
  }
}
