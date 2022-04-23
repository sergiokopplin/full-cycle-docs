package com.fullcycle.CatalogoVideo.domain;

import java.util.UUID;

public class Category {
  private UUID id;
  private String name;
  private String description;
  private Boolean isActive = true;

  public Category(UUID id, String name, String description) throws Exception {
    this.setId(id);
    this.setName(name);
    this.setDescription(description);
  }

  public Category(String name, String description) throws Exception {
    this.id = UUID.randomUUID();
    this.setName(name);
    this.setDescription(description);
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) throws Exception {
    if (name == null) {
      throw new Exception("Cannot be null");
    }

    if (name.isEmpty()) {
      throw new Exception("Cannot be blank");
    }

    this.name = name;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Boolean isIsActive() {
    return this.isActive;
  }

  public Boolean getIsActive() {
    return this.isActive;
  }

  public Boolean activate() {
    return this.isActive = true;
  }

  public Boolean deactivate() {
    return this.isActive = false;
  }
}
