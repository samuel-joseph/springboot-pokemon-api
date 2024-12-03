package com.example.springboot.pokemon.api.model;

public class Types {
  private Type type;

  // Getters and Setters
  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public static class Type {
    private String name;

    // Getters and Setters
    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
