---
description: "Stable locator and synchronization rules for Selenium UI automation."
applyTo: "test-framework/src/test/java/**"
---

# Locator Instructions

- Prefer stable semantic selectors such as `data-testid`, `data-test`, `id`, `name`, roles, labels, and accessible names.
- Use relative XPath only when a stable CSS or semantic selector is unavailable.
- Never use absolute XPath beginning with `/html` or `/body`.
- Do not invent selectors without evidence from the DOM, page source, screenshots, or existing application markup.
- Repair locator and wait drift only; never change assertions or business expectations.
