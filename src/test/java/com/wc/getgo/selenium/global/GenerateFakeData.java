package com.wc.getgo.selenium.global;

import org.fluttercode.datafactory.impl.DataFactory;
import org.jfairy.Fairy;
import org.jfairy.producer.company.Company;
import org.jfairy.producer.person.Person;

import static com.wc.getgo.selenium.global.RandomNumber.randomNumber;

public class GenerateFakeData {

    Company company;
    Person person;
    Fairy fairy;

    DataFactory df = new DataFactory();

    public static GenerateFakeData generateFakeData() {
        return new GenerateFakeData();
    }

    private GenerateFakeData generatePersonData() {
        fairy = Fairy.create();
        this.person = fairy.person();
        return this;
    }

    private GenerateFakeData generateCompanyData() {
        fairy = Fairy.create();
        this.company = fairy.company();
        return this;
    }

    public String title() {
        String[] titleList = {"", "Ms.", "Mr."};
        int n = randomNumber().generateRandomRangeNumber(1, titleList.length - 1);
        return titleList[n];
    }

    public String supTitle() {
        String[] titleList = {"", "Ms", "Mr"};
        int n = randomNumber().generateRandomRangeNumber(1, titleList.length - 1);
        return titleList[n];
    }

    public String homeOwnership() {
        String[] homeOwnership = {"", "Owned/Not Mortgaged", "Owned/Mortgaged", "Living with Parents/Relatives", "Rented", "Used for free/Others"};
        int n = randomNumber().generateRandomRangeNumber(1, homeOwnership.length - 1);
        return homeOwnership[n];
    }

    public String employmentStatus() {
        String[] employmentStatusList = {"", "Regular", "Contractual", "Probationary", "Self-Employed", "Others"};
        int n = randomNumber().generateRandomRangeNumber(1, employmentStatusList.length - 1);
        return employmentStatusList[n];
    }

    public String civilStatus() {
        String[] civilStatusList = {"", "Single", "Married", "Separated", "Widowed"};
        int n = randomNumber().generateRandomRangeNumber(1, civilStatusList.length - 1);
        return civilStatusList[n];
    }

    public String relationshipWithPrincipal() {
        String[] relationshipWithPrincipal = {"", "Wife", "Daughter", "Father", "Mother", "Son", "Grandfather", "Grandmother"};
        int n = randomNumber().generateRandomRangeNumber(1, relationshipWithPrincipal.length - 1);
        return relationshipWithPrincipal[n];
    }

    public String occupationGroup() {
        String[] occupationGroup = {"", "Executive", "Manager and Officer", "Staff/Clerk", "Business Owner", "Other Occupation Group"};
        int n = randomNumber().generateRandomRangeNumber(1, occupationGroup.length - 1);
        return occupationGroup[n];
    }

    public String mobileAreaCode() {
        int mobileAreaCode = randomNumber().generateRandomRangeNumber(900, 999);
        return String.valueOf(mobileAreaCode);
    }

    public String subLimitAmount() {
        int mobileAreaCode = randomNumber().generateRandomRangeNumber(10000, 999999999);
        return String.valueOf(mobileAreaCode);
    }

    public String grossAnnualIncome() {
        int grossAnnualIncome = randomNumber().generateRandomRangeNumber(100000, 999999999);
        return String.valueOf(grossAnnualIncome);
    }

    public String creditCardNumber() {
        int creditCardNumber1 = randomNumber().generateRandomRangeNumber(100000000, 999999999);
        int creditCardNumber2 = randomNumber().generateRandomRangeNumber(1000000, 9999999);
        String creditCardNumber = String.format("%s%s", creditCardNumber1, creditCardNumber2);
        return String.valueOf(creditCardNumber);
    }

    public String mobileNumber() {
        int mobileNumber = randomNumber().generateRandomRangeNumber(1000000, 9999999);
        return String.valueOf(mobileNumber);
    }

    public String yearsOfStay() {
        int yearsOfStay = randomNumber().generateRandomRangeNumber(1, 99);
        if(String.valueOf(yearsOfStay).length() == 1) {
            return String.format("0%s", yearsOfStay);
        }
        return String.valueOf(yearsOfStay);
    }

    public String phoneAreaCode() {
        int phoneAreaCode = randomNumber().generateRandomRangeNumber(1, 999);
        return String.format("0%s", String.valueOf(phoneAreaCode));
    }

    public String phoneNumber() {
        int mobileNumber = randomNumber().generateRandomRangeNumber(1000000, 9999999);
        return String.valueOf(mobileNumber);
    }

    public String birthYear() {
        String[] year = {"", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980"};
        int n = randomNumber().generateRandomRangeNumber(1, year.length - 1);
        return year[n];
    }

    public String birthMonth() {
        String[] month = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int n = randomNumber().generateRandomRangeNumber(1, month.length - 1);
        return month[n];
    }

    public String companyName() {
        generateCompanyData();
        return company.name();
    }

    public String occupation() {
        String[] occupation = {"", "Architect", "Artist", "Assistance Vice President", "Assistant Manager", "Athlete", "Businessman/business Owner", "Chef", "Chief Executive Officer", "Doctor", "Engineer", "Executive Vice President", "First Vice President", "Flight Attendant", "Government Worker", "Junior Officer", "Lawyer", "Manager", "Nurse", "Others", "Pensioner", "Pilot", "President", "Professional", "Senior Manager", "Senior Vice President", "Skilled Worker", "Student", "Supervisor", "Teacher/ Professor", "Vice President"};
        int n = randomNumber().generateRandomRangeNumber(1, occupation.length - 1);
        return occupation[n];
    }

    public String businessIndustry() {
        String[] businessIndustry = {"", "Agriculture, Hunting, Forestry", "Computer Company", "Construction", "Education (Private Education Services)", "Electricity, Gas and Water Supply", "Financial Institutions", "Financial Intermediation", "Health and Social Work", "Holdings Company", "Hotels and Restaurants", "International Bodies", "Manufacturing", "Mining and Quarrying", "Not Specified", "Other Community, Social, Personal Service", "Professional", "Real Estate, Renting, Business Activities", "Transport, Storage and Communications", "Transportation", "Wholesale, Retail Trade, Motor Repair"};
        int n = randomNumber().generateRandomRangeNumber(1, businessIndustry.length - 1);
        return businessIndustry[n];
    }

    public String nationality() {
        String[] nationality = {"", "Afghanistan", "American Samoa", "Antigua and Barbuda", "Bahamas", "Bonaire, Sint Eustatius, and Saba", "Cape Verde", "El Salvador", "Ethiopia", "Fiji", "Philippines", "Manufacturing", "Gambia", "Heard and Mcdonald Islands", "Malaysia", "Martinique", "Senegal", "Uganda", "United States", "Viet Nam", "Western Sahara"};
        int n = randomNumber().generateRandomRangeNumber(1, nationality.length - 1);
        return nationality[n];
    }

    public String address() {
        return df.getAddress();
    }

    public String placeOfBirth() {
        return df.getCity();
    }

    public String birthDay() {
        int day = randomNumber().generateRandomRangeNumber(1, 28);
        return String.valueOf(day);
    }

    public String tin() {
        int tin = randomNumber().generateRandomRangeNumber(100000000, 999999999);
        return String.valueOf(tin);
    }

    public String sssNumber() {
        int number1 = randomNumber().generateRandomRangeNumber(100000000, 999999999);
        int number2 = randomNumber().generateRandomRangeNumber(0, 9);
        String sss = String.format("%s%s", number1, number2);
        return String.valueOf(sss);
    }

    public String gsisNumber() {
        int number1 = randomNumber().generateRandomRangeNumber(100000000, 999999999);
        int number2 = randomNumber().generateRandomRangeNumber(10, 99);
        String gsis = String.format("%s%s", number1, number2);
        return String.valueOf(gsis);
    }

    public String firstName() {
        generatePersonData();
        return person.firstName();
    }

    public String middleName() {
        generatePersonData();
        return person.middleName();
    }

    public String lastName() {
        generatePersonData();
        return person.lastName();
    }

    public String email() {
        generatePersonData();
        return person.email();
    }
}
