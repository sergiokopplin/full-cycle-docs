package com.fullcycle.admin.catalogo.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {
  private String id;
  private String name;
  private String description;
  private boolean active;
  private Instant createdAt;
  private Instant updatedAt;
  private Instant deletedAt;

  private Category(
    final String id,
    final String name,
    final String description,
    final boolean active,
    final Instant createdAt,
    final Instant updatedAt,
    final Instant deletedAt
  ) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.active = active;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.deletedAt = deletedAt;
  }
  
  public static Category newCategory(
    final String aName,
    final String aDescription,
    final boolean aIsActive
  ) {
    final var id = UUID.randomUUID().toString();
    final var now = Instant.now();
    return new Category(id, aName, aDescription, aIsActive, now, now, null);  
  }

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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Instant getDeletedAt() {
    return deletedAt;
  }

  public void setDeletedAt(Instant deletedAt) {
    this.deletedAt = deletedAt;
  }
}
