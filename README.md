# Scala Generic Class: Unexpected Type Inference with Option

This example demonstrates a subtle issue related to type inference in Scala generic classes when dealing with `Option` types.  While the code seems straightforward, the output might be unexpected for users unfamiliar with how Scala handles type inference in these scenarios.

The issue is that the `printValue` method behaves differently depending on the input type due to the way Scala handles type printing for Options.