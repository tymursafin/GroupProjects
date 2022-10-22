class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers = {new ChromeDriver(), new FirefoxDrive(), new SafariDriver()};
        for (RemoteWebDriver driver : remoteWebDrivers) {
            driver.open();
            driver.getTitle();
            driver.navigate();
            driver.getScreenshot();
            driver.close();
        }
    }
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("chrome open");
    }

    @Override
    public void close() {
        System.out.println("chrome close");
    }

    @Override
    public String getTitle() {
        return "chrome get title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("chrome get screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("chrome navigate");
    }
}

class FirefoxDrive implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("firefox open");
    }

    @Override
    public void close() {
        System.out.println("firefox close");
    }

    @Override
    public String getTitle() {
        return "firefox get title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("firefox get screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("firefox navigate");
    }
}

class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("safari open");
    }

    @Override
    public void close() {
        System.out.println("safari close");
    }

    @Override
    public String getTitle() {
        return "safari get title";
    }

    @Override
    public void getScreenshot() {
        System.out.println("safari get screen shot");
    }

    @Override
    public void navigate() {
        System.out.println("safari navigate");
    }
}