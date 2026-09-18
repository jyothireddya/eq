---
description: "Instructions for the QE STLC Orchestrator agent when routing work through the specialist QE agents."
applyTo: "**/*"
---

# QE STLC Orchestrator Instructions

- Route each request to only the specialist agents required by its scope.
- Preserve the chain: requirement, plan, cases, data, automation, execution, healing, regression.
- Pass source URLs, workspace paths, test-case IDs, data mappings, and results between stages.
- Ask only when requirements, workspace, scope, or failure cause is genuinely ambiguous.
- Do not duplicate specialist responsibilities or claim a stage is complete without its result.
- Keep the existing repository workflow and framework unchanged unless the user explicitly requests a change.
