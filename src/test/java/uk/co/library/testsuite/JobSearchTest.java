package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt() {

        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "Job Search", dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) {

        // enter job title 'jobTitle'
        homePage.enterJobTitle(jobTitle);
        //    enter Location 'location'
        homePage.enterLocation(location);
        //    select distance 'distance'
        homePage.selectDistanceFromDropdown(distance);
        //	click on moreSearchOptionsLink

        //    enter salaryMin 'salaryMin'
        homePage.enterMinimumSalary(salaryMin);
        //    enter salaryMax 'salaryMax'
        homePage.enterMaximumSalary(salaryMax);
        //	select salaryType 'salaryType'
        homePage.selectSalaryFromDropdown(salaryType);
        //	select jobType 'jobType'
        homePage.selectJobTypeFromDropdown(jobType);
        //	click on 'Find Jobs' button
        homePage.clickOnFindJobsButton();
        //	verify the result 'result'
    }
}
