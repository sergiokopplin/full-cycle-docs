package com.fullcycle.CatalogoVideo.domain;

public class NotNullException extends DomainException {
  public NotNullException() {
    super();
  }

  public NotNullException(String message) {
    super(message);
  }
}
