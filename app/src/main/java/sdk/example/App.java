package sdk.example;

import com.equo.application.client.EquoAppBuilder;

public class App {
    public static void main(String[] args) {
        new EquoAppBuilder()
                .enableChromeRuntime()
                .launch("https://equo.dev");
    }
}
