package mobile.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:mobile/browserstack.properties"
})
public interface BrowserstackConfig extends Config {
    @Key("browserstack.user")
    String user();

    @Key("browserstack.key")
    String key();

    @Key("browserstack.app")
    String app();

    @Key("device.android")
    String androidDevice();

    @Key("os.android")
    String androidOsVersion();

}