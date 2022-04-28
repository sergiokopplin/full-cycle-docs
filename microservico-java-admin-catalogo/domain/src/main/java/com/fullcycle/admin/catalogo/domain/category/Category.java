package com.fullcycle.admin.catalogo.domain.category;
import com.fullcycle.admin.catalogo.domain.AggregateRoot;
import java.time.Instant;

public class Category extends AggregateRoot<CategoryID> {
  private String name;
  private String description;
  private boolean active;
  private Instant createdAt;
  private Instant updatedAt;
  private Instant deletedAt;

  private Category(
    final CategoryID anId,
    final String aName,
    final String aDescription,
    final boolean isActive,
    final Instant aCreationDate,
    final Instant anUpdateDate,
    final Instant aDeletedDate
  ) {
    super(anId);
    this.name = aName;
    this.description = aDescription;
    this.active = isActive;
    this.createdAt = aCreationDate;
    this.updatedAt = anUpdateDate;
    this.deletedAt = aDeletedDate;
  }
  
  public static Category newCategory(
    final String aName,
    final String aDescription,
    final boolean aIsActive
  ) {
    final var id = CategoryID.unique();
    final var now = Instant.now();
    return new Category(id, aName, aDescription, aIsActive, now, now, null);  
  }

  public CategoryID getId() {
    return id;
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
