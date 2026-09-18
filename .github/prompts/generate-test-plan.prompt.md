---
name: generate-test-plan
description: Generate a WHAT/HOW STLC test plan from a Confluence story using the test pyramid.
agent: Test Plan Generator
---

Generate a test plan for this requirement: ${input:requirement_or_confluence_url}

Application URL (if UI/E2E is in scope): ${input:application_url}

Target workspace(s): ${input:target_workspaces}

Read the source requirement first. Extract acceptance criteria and distinguish confirmed facts from assumptions. Cover scope, test levels, test types, environments, entry/exit criteria, risks, and acceptance-criteria traceability. Prefer unit > API/integration > UI/E2E coverage. Ask one focused clarification question before drafting if the source or workspace scope is inaccessible or ambiguous.

