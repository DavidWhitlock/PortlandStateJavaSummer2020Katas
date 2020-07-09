package edu.pdx.cs410J.whitlock;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void romanNumeralFor1IsI() {
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void romanNumeralFor2IsII() {
    assertThat(Kata.romanNumeralFor(2), equalTo("II"));
  }

  @Test
  public void romanNumeralFor3IsIII() {
    assertThat(Kata.romanNumeralFor(3), equalTo("III"));
  }

  @Test
  public void romanNumeralFor4IsIV() {
    assertThat(Kata.romanNumeralFor(4), equalTo("IV"));
  }

  @Test
  public void romanNumeralFor5IsV() {
    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void romanNumeralFor6IsVI() {
    assertThat(Kata.romanNumeralFor(6), equalTo("VI"));
  }

  @Test
  public void romanNumeralFor7IsVII() {
    assertThat(Kata.romanNumeralFor(7), equalTo("VII"));
  }

  @Test
  public void romanNumeralFor8IsVIII() {
    assertThat(Kata.romanNumeralFor(8), equalTo("VIII"));
  }

  @Test
  public void romanNumeralFor9IsIX() {
    assertThat(Kata.romanNumeralFor(9), equalTo("IX"));
  }

  @Test
  public void romanNumeralFor10IsX() {
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumeralsBetween11And20() {
    assertThat(Kata.romanNumeralFor(11), equalTo("XI"));
  }

}
