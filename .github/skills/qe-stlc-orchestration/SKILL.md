---
name: qe-stlc-orchestration
description: Orchestrate the QE agents through the STLC while preserving traceability and test-pyramid coverage.
---

# QE STLC Orchestration

Use this skill when the user asks to drive a feature through the QE/STLC workflow.

## Sequence

1. Read the requirement with **Test Plan Generator**.
2. Pass the plan and source traceability to **Test Case Generator**.
3. Pass approved case IDs and level/type mapping to **Test Data Agent**.
4. Pass only automation candidates and mapped data to **Test Code Generator**.
5. Pass execution reports to **Self-healing** after tests run.

For UI/E2E work, carry the application URL through every handoff. Before code generation, detect the repository framework. Extend an existing framework; if none exists, request explicit approval before bootstrapping the minimal layer-appropriate framework. UI locators must prefer stable semantic selectors, and any XPath must be dynamic and relative, never absolute.

Do not skip a stage silently. If an artifact cannot be created or read, stop at that handoff and state the blocker. Keep an artifact manifest containing source URL, generated names, timestamps, case IDs, data files, code files, commands, and results.

