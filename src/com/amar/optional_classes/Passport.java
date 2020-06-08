package com.amar.optional_classes;

public class Passport {
  private int passportNo ;

public final int getPassportNo() {
	return passportNo;
}

public final void setPassportNo(int passportNo) {
	this.passportNo = passportNo;
}

public Passport(int passportNo) {
	super();
	this.passportNo = passportNo;
}
  
}
