package pages;

import pages.uiComponent.HomeLeftMenuComponent;

public class HomePage {

    private HomeLeftMenuComponent homeLeftMenuComponent;

    public HomeLeftMenuComponent getHomeLeftMenuComponent() {
        if (homeLeftMenuComponent == null) {
            homeLeftMenuComponent = new HomeLeftMenuComponent();
        }
        return homeLeftMenuComponent;
    }
}
