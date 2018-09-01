# DoubleXP plugin for minecraft spigot server
Double your experience.

```kotlin
@EventHandler
fun onPlayerExpChange(event: PlayerExpChangeEvent?) {
    event ?: return
    event.amount = event.amount * 2
}
```

That's all of this plugin.
