---
name: generate-test-data
description: Generate synthetic and traceable data for QE test cases by testing level and type.
agent: Test Data Agent
---

Generate and map test data for these test cases: ${input:test_cases_or_artifact}

Testing level(s)/type(s): ${input:test_levels_and_types}

Detect and follow the repository's existing test-data format and location. Cover valid, invalid, boundary, empty/null, and relevant locale or volume cases. Use synthetic or masked data only, and output a Test Case ID to data-record/file mapping without overwriting shared data unexpectedly.

