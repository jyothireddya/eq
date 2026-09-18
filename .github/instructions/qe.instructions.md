---
description: "Shared QE lifecycle rules for requirement, planning, test design, data, automation, execution, healing, and regression work."
applyTo: "test-framework/**"
---

# QE Instructions

- Preserve the existing framework, package structure, tests, reports, and workflow.
- Follow the lifecycle: requirement, test plan, test cases, test data, automation, execution, self-healing, regression.
- Use only confirmed acceptance criteria and synthetic test data.
- Keep changes focused on the requested feature; do not alter unrelated files.
- Validate changes locally before source-control publication.
- Never change assertions or expected results to make a test pass.
