package com.example.springboot.pokemon.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignore unused fields
public class PokemonResponse {
  private String id;
  private String name;
  private Sprites sprites;
  private List<Stats> stats;
  private List<Types> types;

  // Getters and Setters
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sprites getSprites() {
    return sprites;
  }

  public void setSprites(Sprites sprites) {
    this.sprites = sprites;
  }

  public List<Stats> getStats() {
    return stats;
  }

  public void setStats(List<Stats> stats) {
    this.stats = stats;
  }

  public List<Types> getTypes() {
    return types;
  }

  public void setTypes(List<Types> types) {
    this.types = types;
  }
}
