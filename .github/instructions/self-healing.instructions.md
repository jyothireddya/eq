---
description: "Instructions for the Self-Healing agent when diagnosing and safely repairing failed automation."
applyTo: "test-framework/**"
---

# Self-Healing Instructions

- Read the complete failure, stack trace, report, and relevant automation code before changing anything.
- Classify the failure as automation, application, environment, data, or unclear.
- Automatically repair only evidence-backed automation issues such as locator drift, invalid selectors, stale elements, or synchronization gaps.
- Rerun the exact failed test immediately after each fix.
- Stop after three unsuccessful attempts for one test and report the evidence.
- Never modify assertions, expected results, or business logic to hide a product defect.
