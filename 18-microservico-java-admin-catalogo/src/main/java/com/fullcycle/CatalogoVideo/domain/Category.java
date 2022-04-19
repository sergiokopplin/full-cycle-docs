package com.fullcycle.CatalogoVideo.domain;

import java.util.UUID;

public class Category {
  private UUID id;
  private String name;
  private String description;
  private Boolean isActive;

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

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }
}
