package tests;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AerotekTests extends TestBase {
    @Test
    @DisplayName("Main page successfully opens and has label \"A Global Recruiting & Staffing Agency\"")
    public void mainPageOpensTest() {
        open("https://www.aerotek.com/en/");
        $(".aerotek-ab-home-corporate-tagline").shouldHave(text("A Global Recruiting & Staffing Agency"));
    }

    @Test
    @DisplayName("Career Opportunities page successfully opens")
    public void careerOpportunitiesPageOpensFromMainPageTest() {
        open("https://www.aerotek.com/en/");
        if($(".optanon-alert-box-button.optanon-button-allow").exists()) { $(".optanon-alert-box-button.optanon-button-allow").click(); }
        $(Selectors.byText("CAREER OPPORTUNITIES")).click();
        $("body").shouldHave(text("Search our current openings or explore our specializations."));
    }

    @Test
    @DisplayName("About Us page successfully opens")
    public void aboutUsPageOpensFromMainPageTest() {
        open("https://www.aerotek.com/en/");
        if($(".optanon-alert-box-button.optanon-button-allow").exists()) { $(".optanon-alert-box-button.optanon-button-allow").click(); }
        $(Selectors.byText("About Us")).click();
        $("body").shouldHave(text("Our mission is as simple today as it was thirty plus years ago:"));
    }

    @Test
    @DisplayName("See Tony's Story page successfully opens")
    public void seeTonysStoryPageOpensTest() {
        open("https://www.aerotek.com/en/");
        $(Selectors.byTitle("Read Tony's Story")).click();
        $(".score-document-header").shouldHave(text("Tony Layne, Electromechanical Assembler"));
    }

}


