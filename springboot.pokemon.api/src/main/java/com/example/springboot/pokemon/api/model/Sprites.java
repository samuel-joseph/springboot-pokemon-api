package com.example.springboot.pokemon.api.model;

import com.example.springboot.pokemon.api.model.Versions;

public class Sprites {
  private String back_default;
  private String front_default;
  private Versions versions;

  // Getters and Setters
  public String getBack_default() {
    return back_default;
  }

  public void setBack_default(String back_default) {
    this.back_default = back_default;
  }

  public String getFront_default() {
    return front_default;
  }

  public void setFront_default(String front_default) {
    this.front_default = front_default;
  }

  public Versions getVersions() {
    return versions;
  }

  public void setVersions(Versions versions) {
    this.versions = versions;
  }
}
