package com.example.springboot.pokemon.api.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pokemon {

  @Id
  private String id;
  private String name;
  private int hp;
  private int speed;
  private int attack;
  private int specialAttack;
  private int defense;
  private int specialDefense;
  private String frontImage;
  private String backImage;
  private String type;
  private String gifFrontImage;
  private String gifBackImage;

  // @OneToMany
  // private List<Moveset> moves;

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

  public int getHp() {
    return hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getAttack() {
    return attack;
  }

  public void setAttack(int attack) {
    this.attack = attack;
  }

  public int getSpecialAttack() {
    return specialAttack;
  }

  public void setSpecialAttack(int specialAttack) {
    this.specialAttack = specialAttack;
  }

  public int getDefense() {
    return defense;
  }

  public void setDefense(int defense) {
    this.defense = defense;
  }

  public int getSpecialDefense() {
    return specialDefense;
  }

  public void setSpecialDefense(int specialDefense) {
    this.specialDefense = specialDefense;
  }

  public String getFrontImage() {
    return frontImage;
  }

  public void setFrontImage(String frontImage) {
    this.frontImage = frontImage;
  }

  public String getBackImage() {
    return backImage;
  }

  public void setBackImage(String backImage) {
    this.backImage = backImage;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getGifFrontImage() {
    return gifFrontImage;
  }

  public void setGifFrontImage(String gifFrontImage) {
    this.gifFrontImage = gifFrontImage;
  }

  public String getGifBackImage() {
    return gifBackImage;
  }

  public void setGifBackImage(String gifBackImage) {
    this.gifBackImage = gifBackImage;
  }
}
