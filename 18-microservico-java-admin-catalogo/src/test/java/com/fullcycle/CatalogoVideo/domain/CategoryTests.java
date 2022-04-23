package com.fullcycle.CatalogoVideo.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fullcycle.CatalogoVideo.domain.entity.Category;
import com.fullcycle.CatalogoVideo.domain.exception.DomainException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CategoryTests {

  @Test
  public void throwDomainExceptionWhenNameIsNull() {
    assertThrows(DomainException.class, () -> new Category(null, "Name"));
  }

  @Test
  public void throwDomainExceptionWhenNameIsBlank() {
    assertThrows(DomainException.class, () -> new Category("", "Name"));
  }

  @Test
  public void createCategoryWithNameWithDescriptionNull() {
    final Category entity = new Category(
        "Name 1",
        null);

    assertNotNull(entity);
    assertEquals(entity.getName(), "Name 1");
    assertNull(entity.getDescription());
  }

  @Test
  public void createCategoryWithNameAndDescription() {
    final Category entity = new Category(
        "Name 1",
        "Description 2");

    assertNotNull(entity);
    assertEquals(entity.getName(), "Name 1");
    assertEquals(entity.getDescription(), "Description 2");
  }

  @Test
  public void createCategoryAndActive() {
    final Category entity = new Category(
        "Name 1",
        "Description 2");

    assertNotNull(entity);
    assertTrue(entity.getIsActive());
  }

  @Test
  public void createCategoryAndIsDeactive() {
    final Category entity = new Category(
        "Name 1",
        "Description 2");

    entity.deactivate();
    assertNotNull(entity);
    assertFalse(entity.getIsActive());
  }

  @Test
  public void updateCategoryWithDeactive() {
    final Category entity = new Category(
        "Name 1",
        "Description 2");

    entity.update("Name 2", "Description 3", false);
    assertNotNull(entity);
    assertEquals(entity.getName(), "Name 2");
    assertEquals(entity.getDescription(), "Description 3");
    assertFalse(entity.getIsActive());
  }

  @Test
  public void updateCategoryWithActive() {
    final Category entity = new Category(
        "Name 1",
        "Description 2");

    entity.update("Name 2", "Description 3", true);
    assertNotNull(entity);
    assertEquals(entity.getName(), "Name 2");
    assertEquals(entity.getDescription(), "Description 3");
    assertTrue(entity.getIsActive());
  }
}
