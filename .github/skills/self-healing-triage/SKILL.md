---
name: self-healing-triage
description: Classify automation failures and repair only evidence-backed locator or wait drift.
---

# Self-Healing Triage

Build a failure table with test, exception, evidence, classification, confidence, action, and validation result.

- Locator drift and stale-element failures may be repaired when the replacement is directly supported by the current DOM/app evidence.
- Timeout and race failures may be repaired with explicit condition-based waits.
- Enforce a hard limit of 3 self-healing attempts per failing test. After the third failed attempt, stop, summarize the attempted fixes and evidence, and ask the user before making any additional code changes.
- Environment, test-data, assertion, product, and ambiguous failures must be escalated.
- Never edit expected results or remove assertions to make a test pass.
- Never loop endlessly on the same failure or keep reattempting the same change without a new hypothesis.
- Preserve an audit trail and run the failed test plus a focused regression subset after each repair.