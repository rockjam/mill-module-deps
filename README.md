This example shows usage of transitive deps from module deps. Here we use `akka-http-circe` in `root` module, even we don't depend on it directly, but transitively depend via `models` module.

To check run:
```
mill -i root.run
```


