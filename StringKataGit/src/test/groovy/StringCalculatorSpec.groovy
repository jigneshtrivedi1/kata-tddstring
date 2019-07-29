import static org.junit.Assert.*

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import spock.lang.Specification

class StringCalculatorSpec extends Specification{
	
	def 'Add string numbers'(){
		given: "String calculator object"
		StringCalculator obj = new StringCalculator();
		expect: obj.Add("") == 0
	}

}

