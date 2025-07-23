package org.launchcode;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //TODO: Refactor example test from instructions to use AAA pattern and message parameter
    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets returns true";
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

   @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "balance brackets in front of other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
   }

   @Test
    public void balancedBracketsAroundText() {
        String message = "balanced brackets around other characters returns true";
        String testData = "[Launchcode]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
   }

   @Test
    public void balancedBracketsWithinOtherCharcters() {
        String message = "blanaced brackets within other characters returns true";
        String testData = "Launch[code]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
   }

   @Test
    public void multiplePairsReturnsTrue() {
        String message = "multiple pairs of balanced brackets returns true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
   }

   @Test
    public void balancedNestedBracketsReturnsTrue() {
        String message = "nested balanced brackets returns true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
   }

   @Test
    public void singleOpenBracketReturnsFalse() {
        String message = "a single open bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets("[");
        assertFalse(result, message);
   }

   @Test
    public void singleClosingBracketReturnsFalse() {
        String message = "a single closing bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
   }

   @Test
    public void reversedBracketsReturnFalse() {
        String message = "reversed brackets, though balanced, returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
   }

   @Test
    public void singleBracketWithCharactersReturnsFalse() {
        String message = "a single opening bracket with characters returns false";
        String testData = "[Launchcode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
   }

   @Test
    public void unblancedBracketsWithinOtherCharacters() {
        String message = "unbalanced brackets within characters returns false";
        String testData = "Launch]code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
   }

    @Test
    public void mixedUnbalancedBrackets() {
        String message = "a series of mixed unbalanced brackets returns false";
        String testData = "[[][][][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }
}