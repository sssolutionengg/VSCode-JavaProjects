# **Triggered breakpoints**
A trigged breakpoint is a breakpoint that is automatically enabled once another breakpoint is hit. They can be very useful when diagnosing failure cases in code that happen only after a certain precondition.

## Inline breakpoints
Inline breakpoints are only hit when the execution reaches the column associated with the inline breakpoint. This is particularly useful when debugging minified code which contains multiple statements in a single line.

An inline breakpoint can be set using ⇧F9 or through the context menu during a debug session. Inline breakpoints are shown inline in the editor.

### Function breakpoints
Instead of placing breakpoints directly in source code, a debugger can support creating breakpoints by specifying a function name. This is useful in situations where source is not available but a function name is known.

A function breakpoint is created by pressing the + button in the BREAKPOINTS section header and entering the function name. 