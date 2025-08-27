package app.Configs;

import java.util.List;

public class PublicRoutesConfig {
    public static List<String> routes =List.of(
            "/auth/**",
            "/home"
    );
}
