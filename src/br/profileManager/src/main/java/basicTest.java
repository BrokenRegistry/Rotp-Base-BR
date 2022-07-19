package br.profileManager.src.main.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;


class basicTest {

	double cos(double a) {
		return Math.cos(Math.toRadians(a));
	}
	double sin(double a) {
		return Math.sin(Math.toRadians(a));
	}
	double atan2(double x, double y) {
		return Math.toDegrees(Math.atan2(y, x));
	}
	@Test void ValidationElement_String() {
		double step = 15;
		double ray = 10;
		double x;
		double y;
		double b;
		double z;
//		for (double a=0; a<=360; a+= step) {
//			x = ray * sin(a);
//			y = ray * cos(a);
//			b = Math.round(atan2(x, y));
//
////			System.out.println("a=" + a + "b=" + b + "	x=" + x + "	y=" + y);
//			System.out.println("a=" + a + "	b=" + b);
//		}
		x = ray;
		y = 0;
		double a = 0;
		b = Math.round(atan2(x, y));
		System.out.println("a=" + a + "	b=" + b);
		
		for (int i=0; i<=360/step; i++) {
			z = x * cos(step) + y * sin(step);
			y = x * -sin(step) + y * cos(step);
			x = z;
			a+= step;
			b = Math.round(atan2(x, y));

//			System.out.println("a=" + a + "b=" + b + "	x=" + x + "	y=" + y);
			System.out.println("a=" + a + "	b=" + b);
		}
	 	
		
		assertEquals("XXX", "XXX"
				, "should have been «XXX»");
	}


}
