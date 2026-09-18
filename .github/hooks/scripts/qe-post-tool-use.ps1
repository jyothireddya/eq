$ErrorActionPreference = 'Stop'
$event = [Console]::In.ReadToEnd()
if ([string]::IsNullOrWhiteSpace($event)) {
    Write-Output "QE hook completed."
    exit 0
}
try {
    $payload = $event | ConvertFrom-Json
    $tool = $payload.toolName
    if ($tool) {
        Write-Output ("QE hook observed tool: " + $tool)
    } else {
        Write-Output "QE hook completed."
    }
} catch {
    Write-Output "QE hook completed; event payload was not JSON."
}
