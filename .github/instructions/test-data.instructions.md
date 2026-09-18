---
description: "Instructions for the Test Data Agent when creating synthetic, traceable data for QE tests."
applyTo: "test-framework/src/test/resources/**"
---

# Test Data Instructions

- Detect and follow the existing test-data format and location before creating anything.
- Use deterministic synthetic or masked data only; never use production or personal data.
- Cover valid, invalid, boundary, empty, and locale variations when required by the test cases.
- Map each test case ID to its data file or record and test level.
- Ask before overwriting shared data files used by existing tests.
- Report any missing business-critical values instead of guessing.
