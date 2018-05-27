package com.example.connection.database.model;

import java.awt.image.BufferedImage;

public class Movie {

	public Person person;
	private String name;
	private String year;
	private String plot;
	BufferedImage image;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPlot() {
		return plot;
	}

	public void setPlot(String plot) {
		this.plot = plot;
	}

	public byte getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		originalImage = 
                              ImageIO.read(new File("ig5.jpg"));

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ImageIO.write( originalImage, "jpg", baos );
    baos.flush();
    byte[] imageInByte = baos.toByteArray();
	}
}
