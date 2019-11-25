package com.arpia.tecnologia.conditional;

import com.arpia.tecnologia.helper.Conditional;
import org.junit.Test;

import java.util.function.Consumer;

import static org.junit.Assert.*;

public class TesteConditional {

  @Test
  public void testeBooleanNull() {
    Boolean isOk = null;

    Consumer<Boolean> apply = _$ -> assertNull(_$);

    Conditional.of(isOk)
               .ifNullPresent(apply);
  }

  @Test
  public void testeBoolanTrue() {
    boolean isOk = true;

    Consumer<Boolean> apply = _$ -> assertTrue(_$);

    Conditional.of(isOk)
               .ifTruePresent(apply);
  }

  @Test
  public void testeBoolanFalse() {
    boolean isOk = false;

    Consumer<Boolean> apply = _$ -> assertFalse(_$);

    Conditional.of(isOk)
               .orElse(apply);
  }

  @Test
  public void testeExecutarNull() {
    Boolean isOk = null;

    Consumer<Boolean> apply = _$ -> assertNull(_$);

    Conditional.of(isOk)
               .ifNull(apply)
               .ifTrue(apply)
               .orElse(apply);
  }
}
