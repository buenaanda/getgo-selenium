package com.wc.getgo.selenium.global;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliExtension {

    private Screen screen = new Screen();
    private Pattern pattern = new Pattern();

    public static SikuliExtension sikuliExtension() {
        return new SikuliExtension();
    }

    public SikuliExtension screenshot(String path) {
        this.pattern = new Pattern(path);
        return this;
    }

    public SikuliExtension mouseMove() {
        try {
            this.screen.mouseMove(pattern);
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        return this;
    }

    public SikuliExtension doubleClick() {
        this.screen.doubleClick();
        return this;
    }

    public SikuliExtension click() {
        this.screen.click();
        return this;
    }

    public SikuliExtension type(String input) {
        this.screen.type(input);
        return this;
    }
}
