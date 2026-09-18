# QE Copilot Instructions

You are working on the EQ QE automation lifecycle.

Repository:
https://github.com/jyothireddya/eq.git

Local workspace:
C:\Users\JyothiAnnapureddy\IdeaProjects\Eq1

Automation root:
test-framework

QE flow:

Requirement
-> Test Plan
-> Test Cases
-> Test Data
-> Test Code
-> Execute
-> Self-Healing
-> Regression

Rules:

- Inspect the existing framework before creating automation code.
- Extend the existing framework; never replace it.
- Never invent requirements, acceptance criteria or expected results.
- Ask the user when required information is missing or ambiguous.
- Use synthetic test data only.
- Never change assertions to make a test pass.
- Do not modify unrelated files.
- Validate code locally before source-control changes.
- Do not modify .github unless explicitly requested.
- Maximum 3 self-healing attempts per failing test. After the third failed attempt, stop, summarize what was tried, and ask the user before any further code changes.