---
description: "Shared automation implementation and validation rules for the existing EQ test framework."
applyTo: "test-framework/src/test/**"
---

# Automation Instructions

- Extend the existing Java, Selenium, Cucumber, and TestNG framework; do not recreate it.
- Reuse existing driver, page, hook, configuration, wait, and reporting utilities.
- Keep framework code under the existing source and resource locations.
- Compile with `mvn -q compile test-compile` and run the relevant tests after changes.
- If a test fails, make one evidence-based fix and rerun the same failing test.
- Allow no more than three healing attempts per failing test.
