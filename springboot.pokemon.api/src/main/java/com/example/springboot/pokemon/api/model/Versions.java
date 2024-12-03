package com.example.springboot.pokemon.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Versions {

  @JsonProperty("generation-v")
  private GenerationV generationV;

  // Getters and Setters
  public GenerationV getGenerationV() {
      return generationV;
  }

  public void setGenerationV(GenerationV generationV) {
      this.generationV = generationV;
  }
}
