package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "Job Search")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "50000", "Per annum", "Permanent", "Permanent Tester job in Harrow on the Hill"},
                {"Software Engineer", "Wembley", "up to 10 miles", "4000", "4800", "Per month", "Permanent", "Contract Tester job in Wembley on the Hill"},
                {"Senior Tester", "Sudbury", "up to 15 miles", "800", "900", "Per week", "Permanent", "Part Time Tester job in Harrow on the Hill"},
                {"Experience Tester", "Kingsbury", "up to 50 miles", "300", "500", "Per day", "Permanent", "Temporary Tester job in Harrow on the Hill"},
                {"Software Tester", "Stanmore", "up to 35 miles", "25", "28", "Per hour", "Permanent", "Apprenticeship Tester job in Harrow on the Hill"},
                {"QA Tester", "London", "up to 25 miles", "35000", "55000", "Per annum", "Permanent", "Permanent Tester job in Harrow on the Hill"}
        };
        return data;
    }
}
