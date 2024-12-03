package com.example.springboot.pokemon.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.pokemon.api.model.Pokemon;
import com.example.springboot.pokemon.api.service.PokemonService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/pokemon")
@CrossOrigin(origins = "http://localhost:3000")
public class PokemonController {

  @Autowired
  private PokemonService pokemonService;

  // @Autowired
  // private MoveRepository moveRepository;

  // @GetMapping
  // public List<Pokemon> getAllPokemons() {
  // return pokemonService.getAllPokemons();
  // }

  // to be continued
  @GetMapping
  public List<Pokemon> getAllPokemons() {
    return pokemonService.fetchPokemons();
  }

  @GetMapping("/{id}")
  public Optional getPokemonById(@PathVariable String id) {
    return pokemonService.getPokemonById(id);
  }

  @PostMapping
  public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
    return pokemonService.savePokemon(pokemon);
  }
}
