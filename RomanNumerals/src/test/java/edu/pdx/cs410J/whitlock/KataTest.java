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
    assertThat(Kata.romanNumeralFor(12), equalTo("XII"));
    assertThat(Kata.romanNumeralFor(13), equalTo("XIII"));
    assertThat(Kata.romanNumeralFor(14), equalTo("XIV"));
    assertThat(Kata.romanNumeralFor(15), equalTo("XV"));
    assertThat(Kata.romanNumeralFor(16), equalTo("XVI"));
    assertThat(Kata.romanNumeralFor(17), equalTo("XVII"));
    assertThat(Kata.romanNumeralFor(18), equalTo("XVIII"));
    assertThat(Kata.romanNumeralFor(19), equalTo("XIX"));
    assertThat(Kata.romanNumeralFor(20), equalTo("XX"));
  }

  @Test
  public void romanNumeralsBetween21And30() {
    assertThat(Kata.romanNumeralFor(21), equalTo("XXI"));
    assertThat(Kata.romanNumeralFor(22), equalTo("XXII"));
    assertThat(Kata.romanNumeralFor(23), equalTo("XXIII"));
    assertThat(Kata.romanNumeralFor(24), equalTo("XXIV"));
    assertThat(Kata.romanNumeralFor(25), equalTo("XXV"));
    assertThat(Kata.romanNumeralFor(26), equalTo("XXVI"));
    assertThat(Kata.romanNumeralFor(27), equalTo("XXVII"));
    assertThat(Kata.romanNumeralFor(28), equalTo("XXVIII"));
    assertThat(Kata.romanNumeralFor(29), equalTo("XXIX"));
    assertThat(Kata.romanNumeralFor(30), equalTo("XXX"));
  }

}
