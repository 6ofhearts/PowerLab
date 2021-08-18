
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.setIn;
import static java.lang.System.setOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PowerTest {
	


  private static final NoSuchElementException NoSuchElementException = null;
@Test
  public void getXCharTest1() {
	  //done
	  String expectedValue ="������� x:\r\n������� y:\r\n��������� ���������� ����� 1073741824\r\n";
	  ByteArrayOutputStream output = new ByteArrayOutputStream();
	  PrintStream old= out;
	  ByteArrayInputStream testIn1 = new
	  ByteArrayInputStream(("2\n").getBytes());
	  ByteArrayInputStream testIn2 = new
	  ByteArrayInputStream(("30\n").getBytes());
	  SequenceInputStream in = new SequenceInputStream(testIn1,testIn2);
	  setIn(in);
	  setOut(new PrintStream(output));
	  Power.main(new String[] {});
	  assertEquals(output.toString(),expectedValue);
	  setOut(old);
	  setIn(in);
  }

  

@Test
	void testErrorX() {
	Power app = new Power();
		 String expectedString ="������� x:\r\n�� ��������� ������ ��� ����� �����. ���������� ��� ���.\r\n";
		 ByteArrayOutputStream output = new ByteArrayOutputStream();
		 //SequenceInputStream in = new SequenceInputStream(testIn1);
		 PrintStream old=System.out;
		 try { 
		 System.setIn(in);
		 }
			catch (NoSuchElementException e) {
				System.out.println("Something went wrong.");
				}
		 System.setOut(new PrintStream(output));
		 
			 
		 app.main(new String[] {});

		 assertEquals(expectedString, output.toString());
		 System.setOut(old);
		}


@Test
  public void yCapacity() {
	  //
	 Power app = new Power();
	  int x = 2;
	  int y = 31;
	  long expectedValue = 2147483648L;
	  assertEquals(expectedValue, app.test(x, y));
	  
  }

@Test
public void xyLowEdgeValue() {
	  //
	 Power app = new Power();
	  int x = -1;
	  int y = 1;
	  long expectedValue = -1;
	  assertEquals(expectedValue, app.test(x, y));
	  
}

@Test
public void xCapacity() {
	  //done
	 Power app = new Power();
	  int x = 999;
	  int y = 5;
	  double expectedValue = 29.9500999e+14;
	  assertEquals(expectedValue, app.test(x, y));
}	  

  @Test
  public void printRezTest() {

	  String expectedValue ="������� x:\r\n������� y:\r\n��������� ���������� ����� 8\r\n";
	  ByteArrayOutputStream output = new ByteArrayOutputStream();
	  PrintStream old=System.out;
	  //����������� ��� ������ Scanner
	  ByteArrayInputStream testIn1 = new
	  ByteArrayInputStream(("2\n").getBytes());
	  ByteArrayInputStream testIn2 = new
	  ByteArrayInputStream(("3\n").getBytes());
	  //���������� ��� ������
	  SequenceInputStream in = new SequenceInputStream(testIn1,testIn2);
	  System.setIn(in);
	  System.setOut(new PrintStream(output));
	  //�������� ����������� ����� main()
	  Power.main(new String[] {});
	  //���������� ��������� � �����������
	  assertEquals(output.toString(),expectedValue);
	  //���������� ����������� ������
	  System.setOut(old);
	  System.setIn(in);
  }


	  @Rule
	  public final NoSuchElementException exception = NoSuchElementException;
	  @Test
	  void testExpectedNoSuchElementException() {
		  //done
	   
	    //First argument - specifies the expected exception. 
	    //Here it expects that code block will throw NumberFormatException
	    //Second argument - is used to pass an executable code block or lambda expression 
	    Assertions.assertThrows(NoSuchElementException.class, () -> {
	    		
	    		  String expectedValue ="������� x:\n"
	    		  		+ "-10\n"
	    		  		+ "�� ��������� ������ ��� ����� �����. ���������� ��� ���.\n"
	    		  		+ "������� x:\n"
	    		  		+ "1\n"
	    		  		+ "������� y:\n"
	    		  		+ "-2\n"
	    		  		+ "�� ��������� ������ ��� ����� �����. ���������� ��� ���.\n"
	    		  		+ "������� y:\n"
	    		  		+ "2\n"
	    		  		+ "��������� ���������� ����� 1";
	    		  ByteArrayOutputStream output = new ByteArrayOutputStream();
	    		  PrintStream old= out;
	    		 
	    		  ByteArrayInputStream testIn1 = new ByteArrayInputStream(("-10\n"+ "1\n"+"-2\n"+"2\n").getBytes());
	    		  setIn(testIn1);
	    		  setOut(new PrintStream(output));
	    		  Power.main(new String[] {});
	    		  assertEquals(output.toString(),expectedValue);
	    		  setOut(old);
	    		  setIn(in);
	    });
	   
	  }

}
