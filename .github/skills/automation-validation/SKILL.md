---
name: automation-validation
description: Validate generated automation safely before source-control publication.
---

# Automation Validation

Use this skill before the Test Code Generator or Self-healing agent creates a PR.

1. Inspect repository status and existing commands.
2. Compile with the project's supported build command; for Maven use `mvn -q compile test-compile` when appropriate.
3. Run the smallest relevant tagged or runner-based test set.
4. Inspect TestNG/Extent/CI output and distinguish product failures from automation failures.
5. Record exact commands, environment assumptions, pass/fail counts, and known gaps.
6. Do not open a PR with unverified code. Never weaken assertions to obtain a green run.

