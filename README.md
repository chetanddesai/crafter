# Gaming Crafter

A simple java app to perform time-intervaled keyclicks.  This can be used to do tedious things like crafting in a game.

### Configuration

Modify [`Crafter.java`](Crafter.java) to set the time intervals and key to click.

```java
// ---------------------------------------------------
// MODIFY THE FOLLOWING VARIABLES TO CHANGE DELAY TIME
// ---------------------------------------------------
// Set duration to time inbetween crafts in millisec
// it can only go from 0-60000 ms so combine 2 of them
// Add in 2 extra seconds for lag purposes.
int duration = 4000;
//int duration2 = 18000;
```

Set the `KeyEvent` you want to click.  See the [`KeyEvent`](http://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyEvent.html) java docs for looking up what you're interested in.

```java
// Set the KeyEvent you want to click
myRobo.keyPress(KeyEvent.VK_2);
```

### Usage

From a command prompt, compile the Java code, and run the Java code.  Alt-tab back to your game and let it click away!  The program will give you a "Knock that shit off!" button for when you want to cancel the key clicks.

```shell
cdesai$ javac Crafter.java
cdesai$ java Crafter
```

### License
[MIT](LICENSE)
