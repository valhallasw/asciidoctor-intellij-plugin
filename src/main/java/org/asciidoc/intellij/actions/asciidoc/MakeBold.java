package org.asciidoc.intellij.actions.asciidoc;

/**
 * @author Erik Pragt
 */
public class MakeBold extends SimpleFormatAsciiDocAction {

  @Override
  public String getName() {
    return "MakeBold";
  }

  @Override
  public String getFormatCharacter() {
    return "*";
  }
}
