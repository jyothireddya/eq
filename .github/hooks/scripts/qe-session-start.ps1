$ErrorActionPreference = 'Stop'
$required = @(
    '.github/copilot-instructions.md',
    '.github/agents/Test Plan Generator.agent.md',
    '.github/agents/Test Case Generator.agent.md',
    '.github/agents/Test Code Generator.agent.md',
    '.github/agents/Test Data Agent.agent.md',
    '.github/agents/Self-healing.agent.md'
)
$missing = @($required | Where-Object { -not (Test-Path -LiteralPath $_) })
if ($missing.Count -gt 0) {
    Write-Error ("Missing QE configuration files: " + ($missing -join ', '))
}
Write-Output "QE STLC configuration loaded."

