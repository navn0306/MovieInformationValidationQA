package com.movies.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.movies.qa.base.TestBase;
import com.movies.qa.pages.ImdbPage;
import com.movies.qa.pages.WikiPage;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class MovieDataTest extends TestBase {

	ImdbPage imdb;
	WikiPage wiki;

	public MovieDataTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		imdb = new ImdbPage();
		wiki = new WikiPage();
	}

	@Test(priority = 1, description = "Verifying if the County of Origin is Same on both Websites")
	@Severity(SeverityLevel.NORMAL)
	public void test_WhenComparedTheCountryOfTheMovie_OnBothWebsites_ShouldBeSame() throws InterruptedException {
		
		// Calling both the methods in Assert statement to compare the results returned.
		Assert.assertEquals(imdb.getMovieCountryFromIMDB(), wiki.getMovieCountryFromWiki());
	}

	@Test(priority = 2, description = "Verifying if the Date Of release in India is same on both Websites")
	@Severity(SeverityLevel.NORMAL)
	public void test_WhenComparedTheReleaseDateOfTheMovie_OnBothWebsites_ShouldBeSame() throws InterruptedException {

		// Calling both the methods in Assert statement to compare the results returned.
		Assert.assertEquals(imdb.getMovieReleaseDateFromIMDB(), wiki.getMovieReleaseDateFromWiki());
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
