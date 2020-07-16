package edu.pdx.cs410J.whitlock;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiamondTest
{

  @Test
  public void cDiamond() {
    Diamond diamond = new Diamond('C');
    List<String> diamondText = diamond.getText();
    assertThat(diamondText.get(0), equalTo("  A  "));
    assertThat(diamondText.get(1), equalTo(" B B "));
    assertThat(diamondText.get(2), equalTo("C   C"));
    assertThat(diamondText.get(3), equalTo(" B B "));
    assertThat(diamondText.get(4), equalTo("  A  "));

  }

}
