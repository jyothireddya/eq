# Swag Labs UI Test Framework

Minimal Java 17 + Maven + Selenium + Cucumber + TestNG framework for the Swag Labs UI.

## Run

From `.vscode/test-framework`:

```text
mvn -q test
```

Override the application and credentials without editing source files:

```text
mvn -q test -Dapp.url=https://www.saucedemo.com/ -Dtest.user=standard_user -Dtest.password=secret_sauce
```

The default values are for the public Swag Labs demo environment only. Do not place real credentials in this repository.

## Structure

- `src/test/java/com/eq/framework/browser` - WebDriver lifecycle
- `src/test/java/com/eq/framework/config` - configuration loading
- `src/test/java/com/eq/framework/pages` - page objects and reusable page behavior
- `src/test/java/com/eq/framework/steps` - Cucumber step definitions
- `src/test/java/com/eq/framework/hooks` - Cucumber lifecycle hooks
- `src/test/java/com/eq/framework/runner` - Cucumber/TestNG runners
- `src/test/resources/features` - Cucumber feature files
- `src/test/resources/config.properties` - non-secret defaults

Locators prefer stable IDs and semantic selectors. XPath is not used unless a future page requires a dynamic relative XPath; absolute XPath is prohibited.
