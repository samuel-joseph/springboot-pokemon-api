package com.example.springboot.pokemon.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.pokemon.api.model.Pokemon;
import com.example.springboot.pokemon.api.model.PokemonResponse;
import com.example.springboot.pokemon.api.repository.PokemonRepository;

@Service
public class PokemonService {

  @Autowired
  private PokemonRepository pokemonRepository;

  private final RestTemplate restTemplate;

  // Constructor to inject RestTemplate
  public PokemonService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  /**
   * Fetches a list of Pokemon by calling an external API.
   *
   * @return List of Pokemon
   */
  public List<Pokemon> fetchPokemons() {
    List<Pokemon> pokemons = new ArrayList<>();

    for (int i = 1; i <= 151; i++) {
      String url = "https://pokeapi.co/api/v2/pokemon/" + i;

      // Fetch Pokemon data from the API
      PokemonResponse response = restTemplate.getForObject(url, PokemonResponse.class);

      if (response != null) {
        Pokemon pokemon = new Pokemon();

        // Set Pokemon attributes
        pokemon.setId(response.getId());
        pokemon.setName(response.getName());
        pokemon.setFrontImage(response.getSprites().getFront_default());
        pokemon.setBackImage(response.getSprites().getBack_default());
        pokemon.setGifBackImage(
            response.getSprites().getVersions().getGenerationV().getBlackWhite().getAnimated().getBack_default());

        pokemon.setGifFrontImage(
            response.getSprites().getVersions().getGenerationV().getBlackWhite().getAnimated().getFront_default());

        // Map stats
        pokemon.setHp(response.getStats().get(0).getBase_stat());
        pokemon.setAttack(response.getStats().get(1).getBase_stat());
        pokemon.setDefense(response.getStats().get(2).getBase_stat());
        pokemon.setSpecialAttack(response.getStats().get(3).getBase_stat());
        pokemon.setSpecialDefense(response.getStats().get(4).getBase_stat());
        pokemon.setSpeed(response.getStats().get(5).getBase_stat());

        // Map type (only the first type is considered)
        pokemon.setType(response.getTypes().get(0).getType().getName());

        pokemons.add(pokemon);
      }
    }

    return pokemons;
  }

  /**
   * Retrieves all Pokemon from the database.
   *
   * @return List of Pokemon
   */
  public List<Pokemon> getAllPokemons() {
    return pokemonRepository.findAll();
  }

  /**
   * Retrieves a Pokemon by its ID from the database.
   *
   * @param id Pokemon ID
   * @return Optional Pokemon object
   */
  public Optional<Pokemon> getPokemonById(String id) {
    return pokemonRepository.findById(id);
  }

  /**
   * Saves a Pokemon to the database.
   *
   * @param pokemon Pokemon object
   * @return Saved Pokemon object
   */
  public Pokemon savePokemon(Pokemon pokemon) {
    return pokemonRepository.save(pokemon);
  }
}
