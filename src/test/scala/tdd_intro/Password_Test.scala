package tdd_intro

import org.scalatest.FunSpec
import org.scalatest.Matchers

class Password_Test extends FunSpec with Matchers {
  
   describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters") {

        val tooShort = "abcde"
		val tooShort1 = "12345"
        val longEnough = "abcdef"        
		val longEnough1 = "123456"
        val evenLonger = "abcdefghi"
		val evenLonger1 = "123456789"

        Password.isValid(tooShort) shouldBe false
		Password.isValid(tooShort1) shouldBe false
        Password.isValid(longEnough) shouldBe true
		Password.isValid(longEnough1) shouldBe true
        Password.isValid(evenLonger) shouldBe true
		Password.isValid(evenLonger1) shouldBe true
      }   
    }
  }
}