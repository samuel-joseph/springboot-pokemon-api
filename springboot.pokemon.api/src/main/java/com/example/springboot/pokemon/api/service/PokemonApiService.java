package com.example.springboot.pokemon.api.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonApiService {

  private final RestTemplate restTemplate;

  public PokemonApiService(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  public String getPokemonData(String pokemonId) {
    String url = "https://pokeapi.co/api/v2/pokemon/" + pokemonId;
    return restTemplate.getForObject(url, String.class);
  }
}
