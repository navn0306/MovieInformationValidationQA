package com.movies.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.movies.qa.base.TestBase;

public class WikiPage extends TestBase {

	@FindBy(xpath = "//input[@id='searchInput']")
	WebElement searchInput;

	@FindBy(xpath = "//input[@id='searchButton']")
	WebElement movieName;

	@FindBy(xpath = "//tbody/tr[14]/td[1]")
	WebElement country;

	@FindBy(xpath = "//tbody/tr[12]/td[1]")
	WebElement releaseDate;

	public WikiPage() {
		PageFactory.initElements(driver, this);
	}

	// Method to search movie on the application
	public void searchMovie() {
		driver.navigate().to("https://en.wikipedia.org/");
		searchInput.sendKeys("Pushpa: The Rise");
		movieName.click();
	}

	// Method to get the Country Origin from Wiki
	public String getMovieCountryFromWiki() {
		searchMovie();
		String wikiCountryData = country.getText();
		System.out.println(wikiCountryData);
		return wikiCountryData;
	}
	// Method to get the Release Date from Wikipedia
	public String getMovieReleaseDateFromWiki() {
		searchMovie();
		String wikiReleaseDate = releaseDate.getText();
		System.out.println(wikiReleaseDate);
		return wikiReleaseDate;
	}
}
