---
description: "Instructions for the Test Code Generator agent when extending and validating automation candidates."
applyTo: "test-framework/src/test/java/**"
---

# Test Code Generator Instructions

- Implement only automation candidates confirmed by the test-case handoff.
- Inspect the current framework and reuse its pages, steps, hooks, driver, config, and runner conventions.
- Do not duplicate existing coverage or bootstrap a framework without explicit approval.
- Use supplied test data rather than hardcoded values in step definitions.
- Compile and run the changed tests locally, then review the generated report.
- For failures, use the minimal evidence-backed locator or wait fix and stop after three attempts.
