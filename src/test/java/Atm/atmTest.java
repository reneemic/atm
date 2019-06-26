package Atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import atm.Atm;

public class atmTest {

	@Test
	public void shouldHaveDefaultBalanceof0() {
		Atm underTest = new Atm(0, "");
		int balance = underTest.getBalance();
		assertEquals(0, balance);
	}
	
	@Test
	public void shouldHaveDefaultBalanceof200() {
		Atm underTest = new Atm(200, "");
		int balance = underTest.getBalance();
		assertEquals(200, balance);
	}
	
	@Test
	public void shouldHaveBalanceOf100AfterWithdrawalof100() {
		Atm underTest = new Atm(200, "");
		underTest.withdraw(100);
		int balance = underTest.getBalance();
		assertEquals(100, balance);
	}
	
	@Test
	public void shouldHaveBalanceOf0AfterWithdrawalof300() {
		Atm underTest = new Atm (200, "");
		underTest.withdraw(200);
		int balance = underTest.getBalance();
		assertEquals(0, balance);
	}
	
	@Test
	public void shouldHaveBalanceOf200AfterDeposit() {
		Atm underTest = new Atm(0,"");
		underTest.deposit(200);
		int balance = underTest.getBalance();
		assertEquals(200, balance);
	}
	
	@Test
	public void shouldAllowAccessByPin() {
		Atm underTest = new Atm(0, "1234");
		boolean access = underTest.allowAccess("1234");
		assertTrue(access);
	}

	@Test
	public void shouldDenyAccessbByPin() {
		Atm underTest = new Atm(0, "1234");
		boolean access = underTest.allowAccess("2345");
		assertFalse(access);
	}
}
	

