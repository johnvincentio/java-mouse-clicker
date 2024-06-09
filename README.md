

Create file `java-mouse-clicker`

```
#!/bin/sh
#
# script to run java Mouse Clicker
#
DEV_HOME=/Users/jv/Desktop/MyDevelopment/github/java/Utilities/java-mouse-clicker/MouseClicker
cd $DEV_HOME

MYCP=$DEV_HOME/bin

DELAY="$1"		# Delay in seconds
PERIOD="$2"		# Period in seconds

if [ -z "$DELAY" ]; then
	echo "Usage: java-mouse-clicker initial_delay(in seconds) delay_next_invocation(in seconds)"
	exit 1
fi
if [ -z "$PERIOD" ]; then
	echo "Usage: java-mouse-clicker initial_delay(in seconds) delay_next_invocation(in seconds)"
	exit 1
fi

echo "Delay $DELAY"
echo "Period $PERIOD"
java -cp $MYCP io.johnvincent.clicker.Main $DELAY $PERIOD
```

To execute

```
java-mouse-clicker 2 5
```


## References

[How to simulate a mouse click](https://stackoverflow.com/questions/12123150/how-to-programmatically-simulate-a-mouse-click-without-moving-mouse-in-cocoa/21685404#21685404)

[How to obtain mouse click coordinates outside my window in Java](https://stackoverflow.com/questions/2419555/how-to-obtain-mouse-click-coordinates-outside-my-window-in-java)

[Robot.mouseMove](https://www.tabnine.com/code/java/methods/java.awt.Robot/mouseMove)

## End

