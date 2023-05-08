# TestFX

In order to run from Eclipse, go to run -> run configuration and add the following to VM arguments:

```
--module-path [Directory where JavaFX jar files are available] --add-modules=javafx.controls,javafx.fxml
```

Also uncheck the option: Us the -XstartOnFirstThread argument when launching with SWT
