package com.mallika.lambda;

public class Transcation {
Trader trader;

int year;
int value;
public Transcation(Trader trader,int year,int value) {
	// TODO Auto-generated constructor stub
	this.trader=trader;
	this.year=year;
	this.value=value;
}
public Trader getTrader() {
	return trader;
}
public void setTrader(Trader trader) {
	this.trader = trader;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
@Override
public String toString() {
	return "Transcation [trader=" + trader + ", year=" + year + ", value="
			+ value + "]";
}

}
