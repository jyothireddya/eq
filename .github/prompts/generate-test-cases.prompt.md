---
name: generate-test-cases
description: Generate timestamped Confluence test cases, Excel output, and a separate automation-candidate list.
agent: Test Case Generator
---

Generate test cases from this requirement or test plan: ${input:requirement_or_plan}

Target workspace: ${input:target_workspace}

Cover every confirmed acceptance criterion with positive, negative, boundary, and relevant regression cases. Include IDs, preconditions, level, type, steps, data, expected result, and priority. Always create a new timestamped Confluence page and an Excel workbook with separate Test Cases and Automation Candidates sheets. If publishing/export access is unavailable, report it explicitly instead of claiming completion.

