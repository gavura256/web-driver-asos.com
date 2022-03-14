package org.epam.poland.aqa.course.properties.conventors;

import org.epam.poland.aqa.course.enumeration.SupportedBrowsers;

public class SupportedBrowserConverter {
    private SupportedBrowserConverter() {
    }

    public static SupportedBrowsers valueOfWebBrowser(String webBrowser) {
        return switch (webBrowser) {
            case "local_chrome" -> SupportedBrowsers.LOCAL_CHROME;
            case "local_firefox" -> SupportedBrowsers.LOCAL_FIREFOX;
            default -> throw new IllegalArgumentException("No appropriate browser found");
        };
    }
}
