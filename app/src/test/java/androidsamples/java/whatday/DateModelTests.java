package androidsamples.java.whatday;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit tests for the public methods in the {@link DateModel}.
 */
public class DateModelTests {
  @Test
  public void aprilDoesNotHave31Days() {
    DateModel.initialize("1998", "4", "31");
    assertThat(DateModel.getMessage(), is("This month does not have 31 days"));
  }

  @Test
  public void monthsCannotBeAbove12() {
    DateModel.initialize("1998", "14", "31");
    assertThat(DateModel.getMessage(), is("Invalid month"));
  }

  @Test
  public void eightIsNotInProperFormat() {
    DateModel.initialize("1947", "eight", "15");
    assertThat(DateModel.getMessage(), is("Enter values in a proper numeric format"));
  }

  @Test
  public void Feb29_2019_isNotAValidDate() {
    DateModel.initialize("2019", "2", "29");
    assertThat(DateModel.getMessage(), is("February of 2019 does not have 29 days"));
  }

  @Test
  public void Aug15_1947_Friday() {
    DateModel.initialize("1947", "8", "15");
    assertThat(DateModel.getMessage(), is("Friday"));
  }

  @Test
  public void Jan1_2022_Saturday() {
    DateModel.initialize("2022", "1", "1");
    assertThat(DateModel.getMessage(), is("Saturday"));
  }

  @Test
  //This input is impossible as the only invalid characters allowed are 
  //given that only numbers are presented on the android keyboard
  public void GibberishInput() {
    DateModel.initialize("dafsj", ")#@(*$*]", "431jh314jkb");
    assertThat(DateModel.getMessage(), is("Enter values in a proper numeric format"));
  }

  @Test
  public void Dec31_9999_Friday() {
    DateModel.initialize("9999", "12", "31");
    assertThat(DateModel.getMessage(), is("Friday"));
  }
  
  @Test
  public void test42isInvalidDate() {
    DateModel.initialize("2021", "8", "42");
    assertThat(DateModel.getMessage(), is("Invalid date"));
  }
  
  @Test
  public void decimalIsInvalidDate() {
    DateModel.initialize("2021", "8", "12.32");
    assertThat(DateModel.getMessage(), is("Invalid date"));
  }


}