---
name: generate-test-code
description: Implement approved automation candidates in the existing framework, validate locally, and prepare a PR.
agent: Test Code Generator
---

Implement these approved automation candidates: ${input:automation_candidates}

Layer: ${input:ui_api_or_mobile}

Application URL (for UI/E2E): ${input:application_url}

First detect the existing framework and its conventions. Extend it when present. If it is missing, stop and ask for explicit approval before creating the minimal framework required for the requested layer. Reuse page objects, step definitions, waits, driver factories, data, tags, and reporting. For UI locators, use stable semantic selectors or dynamic relative XPath only; never absolute XPath. Compile and run the smallest relevant local test set before any commit or PR. Stop and ask if the framework, scope, mobile pattern, or repository state is not clear.

