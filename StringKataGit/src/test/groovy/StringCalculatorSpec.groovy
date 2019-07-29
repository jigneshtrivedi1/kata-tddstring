import static org.junit.Assert.*

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

import spock.lang.Specification

class StringCalculatorSpec extends Specification{
	
	def 'Add string numbers'(){
		given: "input string"
		input
		when:
			StringCalculator obj = new StringCalculator()
			def result = obj.addString(input)
		then:
			result == expectedResult
		where:
		input		|		expectedResult
		""			|		0
		null		|		0
		
	}

}

