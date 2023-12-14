package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utilities.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distance;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryType;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement tempPerm;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findButton;

    public void enterJobTitle(String job){
        sendTextToElement(jobTitle, job);
    }

    public void enterLocation(String area){
        sendTextToElement(location, area);
    }

    public void selectDistanceFromDropdown(String value){
        selectByVisibleText(distance, value);
    }

    public void enterMinimumSalary(String minSalary){
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaximumSalary(String maxSalary){
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryFromDropdown(String salary){
        selectByVisibleText(salaryType, salary);
    }

    public void selectJobTypeFromDropdown(String jobType){
        selectByVisibleText(tempPerm, jobType);
    }

    public void clickOnFindJobsButton(){
        clickOnElement(findButton);
    }
}
