package com.movies.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.movies.qa.base.TestBase;

public class ImdbPage extends TestBase {

	@FindBy(xpath = "//input[@id='suggestion-search']")
	WebElement searchInputImdb;

	@FindBy(xpath = "//ul[@role='listbox']//li/descendant::div[@class='sc-hBEYos dWjUC searchResult__constTitle']")
	WebElement movieName;

	@FindBy(xpath = "(//a[contains(text(),'India')])[1]")
	WebElement imdbCountry;

	@FindBy(xpath = "//li[@data-testid='title-details-releasedate']//a[@aria-label='See more']")
	WebElement moreInfo;

	@FindBy(xpath = "//tbody/tr[6]/td[2]")
	WebElement imdbRelease;

	public ImdbPage() {
		PageFactory.initElements(driver, this);
	}

	// Method to search movie on the application
	public void searchMovie() {
		driver.navigate().to("https://www.imdb.com/");
		searchInputImdb.sendKeys("Pushpa :The Rise");
		movieName.click();
	}

	// Method to get the Country Origin from IMDB
	public String getMovieCountryFromIMDB() {
		searchMovie();
		String imdbCountryData = imdbCountry.getText();
		System.out.println(imdbCountryData);
		return imdbCountryData;
	}

	// Method to get the Release Date in India from IMDB
	public String getMovieReleaseDateFromIMDB() {
		searchMovie();
		moreInfo.click();
		String imdbReleaseDate = imdbRelease.getText();
		System.out.println(imdbReleaseDate);
		return imdbReleaseDate;
	}
}