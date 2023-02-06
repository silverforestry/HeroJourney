import java.util.*;
import java.util.concurrent.TimeUnit;

/*
* Main.java
*
* Anna Silva Silvestre
* Shandi Gomez
* English III AP
* 19 May 2022
*
* 101092
*/

//This code is chicken scratch, it mainly contains information like sources and credits
//Click the green button to run, interact with the console to the right
//I recommend running this program in a full screen

class Main
{
  private static final String ANSI_CYAN = "\u001B[36m";
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLUE = "\u001B[34m";
  private static final String ANSI_RED = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";

  private static final String CLEAR = "\033[H\033[2J";
  
  //Art by emojicombos.com
  public static final String fox = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠙⠻⢶⣄⡀⠀⠀⠀⢀⣤⠶⠛⠛⡇⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣇⠀⠀⣙⣿⣦⣤⣴⣿⣁⠀⠀⣸⠇⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣡⣾⣿⣿⣿⣿⣿⣿⣿⣷⣌⠋⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣿⣷⣄⡈⢻⣿⡟⢁⣠⣾⣿⣦⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣿⠘⣿⠃⣿⣿⣿⣿⡏⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠈⠛⣰⠿⣆⠛⠁⠀⡀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣦⠀⠘⠛⠋⠀⣴⣿⠁⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣾⣿⣿⣿⣿⡇⠀⠀⠀⢸⣿⣏⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠀⠀⠀⠾⢿⣿⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⣠⣿⣿⣿⣿⣿⣿⡿⠟⠋⣁⣠⣤⣤⡶⠶⠶⣤⣄⠈⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⢰⣿⣿⣮⣉⣉⣉⣤⣴⣶⣿⣿⣋⡥⠄⠀⠀⠀⠀⠉⢻⣄⠀⠀⠀⠀⠀\n⠀⠀⠀⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣋⣁⣤⣀⣀⣤⣤⣤⣤⣄⣿⡄⠀⠀⠀⠀\n⠀⠀⠀⠀⠙⠿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⠋⠉⠁⠀⠀⠀⠀⠈⠛⠃⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";

  //Art by Shanaka Dias
  public static final String rose = "    _,--._.-,\n   /\\_r-,\\_ )\n.-.) _;=\'_/ (.;\n \\ \\\'     \\/S )\n  L.\'-. _.\'|-\'\n <_`-\'\\\'_.\'/\n   `\'-._( \\\n    ___   \\\\,      ___\n    \\ .\'-. \\\\   .-\'_. /\n     \'._\' \'.\\\\/.-\'_.\'\n        \'--``\\(\'--\'\n        snd   \\\\\n              `\\\\,\n                \\|";

  //Original art by Antoine de Saint Exupery
  public static final String prince = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠟⣹⣷⡀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣶⠿⠚⠁⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣶⣧⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⣦⣤⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠸⠻⣿⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⡿⠻⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⢀⣠⠤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⠻⢧⣄⣽⡗⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⢀⡏⠀⠀⠀⠙⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣻⣻⣯⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⢧⣀⠀⠀⣠⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀\n⠀⠀⠀⠈⠉⠉⠁⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣷⣿⠄⡌⠳⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⢀⣼⣟⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⡂⡏⢹⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⣰⡦⣶⣃⠀⠀⠀⠀⠀⠀⠀⠀⠀⢷⡀⠀⠀⠀⠀⠀⠀⠀⠙⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡏⠙⢻⠇⣸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠛⢻⡟⠋⠀⠀⠀⠀⠀⠀⠀⠀⡄⠀⠙⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⣀⣼⢀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣄⠀⠘⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡼⠀⡟⠈⠋⡏⠀⢠⣴⣿⠄⠀⠀⠀⣀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣆⣀⠙⣆⠀⣴⠒⢶⡄⠀⠀⠀⠀⠀⠀⣠⣤⡀⠀⠀⢠⠇⠀⡇⠀⠀⢣⠀⣰⠟⠉⠀⢀⣴⡟⢿⡁⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠘⢧⡙⠾⠟⠁⠀⠀⠀⠀⠀⠀⠛⢿⣇⣀⡤⡿⠷⢲⠁⠀⠀⢸⣲⠳⠶⠤⠖⣻⣿⠀⠹⣷⣸\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⡄⣿⡄⠀⠀⠀⠀⠀⠀⣀⣠⠴⠚⣯⠀⠀⠀⠀⠈⠉⠉⠉⠉⠁⠀⠀⠀⠀⠈⠈⠀⠐⠸⣯\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢾⣿⣄⠀⠀⣀⣴⣾⠿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡿⠛⠺⢧⠰⡌⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⢶⡶⠀⠀⠀⠀⠀⠀⣧⠀⠀⠘⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢻⡟⠃⠀⠀⠀⠀⢀⣾⠛⣇⠈⠓⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠛⠲⠌⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣶⢲⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⡧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣿⡯⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠳⣧⡼⡇⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣳⣧⣤⣼⡃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⢰⣦⣴⠀⠀⠀⠀⠀⠀⠸⠟⢿⣿⠁⠀⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠻⣿⠉⠁⠀⠀⠀⠀⠀⠀⠐⢿⠈⢧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣧⠀⠀⠀⠀⠀⢀⣽⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣹⡏⠀⠀⠀⠀⠀⠀⠀⢸⢿⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";

  //Original art by Antoine de Saint Exupery
  public static final String death_scene = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣻⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠿⠗⠍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⢰⠶⣾⡿⢂⢀⣀⣄⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠰⣾⡀⠅⠀⢸⣧⣤⡴⢀⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⣅⣹⡟⣯⡿⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⢉⡏⣿⣧⡿⠁⠀⠈⢧⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⢀⡟⢉⡏⢁⡑⢦⣀⢄⠘⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠘⠓⠒⠒⠚⣷⣄⠉⣷⡶⠟⠙⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠈⠙⡋⣀⠀⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡟⢧⡀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠸⣇⠀⢀⣿⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣀⣾⠛⢿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⢿⡿⠫⢱⡿⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⠤⠴⠒⠒⠋⠉⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣻⣷⢲⣜⣷⡒⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⠶⠖⠒⠚⠋⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⢏⢿⣾⡆⠁⠀⠀⠀⠀⠀⢀⣀⣴⠶⠛⠋⠉⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⣀⣀⣠⣀⣀⣠⣤⣤⣤⣀⣠⠤⠼⣯⣯⢿⣿⢀⣀⣀⣠⣴⡖⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠒⠒⠛⠛⠉⠉⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠀⠁⠀⠀⠀⠈⠉⠙⠙⠓⠒⠒⠒⠶⠶⠦⠤⠴⠶⢤⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠒⠦⢤⣄⣀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠛⠻⢤⣤⡀";

  //Original art by Joan Stark
  public static final String plane = "            __/\\__\n           `==/\\==`\n ____________/__\\____________\n/____________________________\\\n  __||__||__/.--.\\__||__||__\n /__|___|___( >< )___|___|__\\\n           _/`--`\\_\njgs       (/------\\)";

  //Art by textart.io
  public static final String snake = "      _    _\n   ,-(|)--(|)-.\n   \\_   ..   _/\n     \\______/\n       V  V                                  ____\n       `.^^`.                               /^,--`\n         \\^^^\\                             (^^\\\n         |^^^|                  _,-._       \\^^\\\n        (^^^^\\      __      _,-\'^^^^^`.    _,\'^^)\n         \\^^^^`._,-\'^^`-._.\'^^^^__^^^^ `--\'^^^_/\n          \\^^^^^ ^^^_^^^^^^^_,-\'  `.^^^^^^^^_/ hjw\n           `.____,-\' `-.__.\'        `-.___.\'   `97";

  //Original Art by Antoine de Saint Exupery
  public static final String wall = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⠀⠀⠀⢀⣠⡦⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⠿⡇⣠⡴⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣟⡁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣤⣿⠯⣻⣷⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⡗⠯⠿⢻⠝⠐⠒⠂⠋⠉⠁⢰⣿⣦⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⢀⡠⠐⠂⢸⣿⣻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⢻⠀⠀⠀⠀\n⠀⠀⠀⠀⡎⠀⠀⠀⠈⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢱⣄⢂⠀⠀⠀\n⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⠻⡆⠀⠀\n⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠞⠤⡇⠀⠀\n⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⠀⠀\n⠀⠀⠀⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⢀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⡆⢸⠀⠀⠀\n⠀⠀⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢧⠄⡆⠀⠀\n⠀⣀⡀⠀⠀⠃⠀⠀⠀⠀⠀⠀⠀⠀⠘⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡦⠬⡄⠀\n⠘⢙⠛⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣇⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠇⠀\n⣄⣸⠠⠤⠤⠦⠤⠄⠯⡵⠦⠤⣶⣶⣶⡯⠤⠤⠾⠤⠼⠶⠤⠤⠤⠀⠧⠤⠦⠤\n⠁⠀⠀⠀⠀⠐⠒⠒⠂⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";

  //Art by asciiart.eu
  public static final String stars = "                 \'\n   \n        *          .\n                   *       \'\n         \n    *                *\n\n\n\n\n\n   *   \'*\n           *\n                *\n                       *\n               *\n                     *\n\n         .                      .\n         .                      ;\n         :                  - --+- -\n         !           .          !\n         |        .             .\n         |_         +\n      ,  | `.\n--- --+-<#>-+- ---  --  -\n      `._|_,\'\n         T\n         |\n         !\n         :         . : \n         .       *\n\nOjo";

  //Original art by Antoine de Saint Exupery
  public static final String boa = "⠀⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⢀⣾⣿⣯⣿⣷⣤⣤⣤⡄⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣟⡄⠀⠀⠀⠀⠀⠀⠀\n⣀⣀⣠⣤⣿⣿⣷⣿⣾⣿⣿⣿⣿⣷⣷⣤⣠⣤⣤⣤⣤⣄";

  //Art by emojicombos.com
  public static final String bell = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⡛⢻⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣟⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⣿⣿⣿⣆⠹⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⡄⢹⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⡇⠈⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⣾⠀⠀⡐⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣇⠀⢻⣇⠀⠀⠀⢂⠀⠀⢷⠀⠀\n⠀⢸⡇⠀⢰⡇⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⠻⣧⡀⠀⢸⡆⠀⢸⡇⠀\n⠀⢸⣷⠀⣿⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠹⣷⠀⢸⣿⠀⣼⡇⠀\n⠀⢸⣿⠀⢿⣇⠀⠙⠛⠿⠿⢿⣿⣿⣿⣿⣿⣿⡿⠷⠶⠚⠋⠀⣸⣿⠀⣿⡇⠀\n⠀⠈⣿⡇⠘⣿⡄⠀⠀⠶⠦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠇⢸⣿⠃⠀\n⠀⠀⠸⣷⡀⠘⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠋⢀⣾⠇⠀⠀\n⠀⠀⠀⠙⣷⡄⠀⠙⠦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠴⠋⠀⢠⣾⠋⠀⠀⠀\n⠀⠀⠀⠀⠈⠻⢦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠟⠁⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠁⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠈⠀⠀⠀⠀⠀⠀⠀";

  //Original art by Antoine de Saint Exupery
  public static final String flying = "⢀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⢇⡀⡅⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⢀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⡾⠛⣯⣢⢄⡀⠀⡀⣠⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠘⠋⠙⢂⣌⠰⢟⠻⢄⠀⠀⠀⢀⣠⣶⠃⠀⠀⠀⣀⡠⣤⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⢀⣤⡖⡿⡉⠁⠢⡑⠠⡑⢄⢰⠾⠩⢧⡄⠀⠀⣴⠿⢝⡅⠀⠀⢀⣠⡤⢖⠶⠒⠀⠀⠀⢀⠦⣴⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠈⠁⠈⠟⠀⠑⠢⡈⠢⢈⠑⢝⠢⡀⠀⠑⢄⠀⠁⠀⠘⡀⠀⠀⣶⠞⠛⡔⠿⠁⠀⠀⠀⠀⠹⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⣼⢳⢿⣛⢣⡑⠢⡈⠪⡢⡀⠀⠑⢄⠀⠀⠱⡀⠀⢀⣠⣲⠧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠈⠉⠉⠙⠉⠒⠌⡒⢌⠐⢌⠪⡢⣴⠶⣿⡟⠁⠱⡀⡿⠣⡵⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣄⠼⠲⣯⡵⣱⠿⡻⡓⣕⡬⢆⠀⠡⠀⠀⠱⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⢣⣻⠳⡪⡢⢌⠪⡫⡫⡢⡣⡀⢃⣗⣆⠇⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠀⠈⠘⠳⣕⢬⡻⡪⣷⣝⠌⠎⠀⠸⢁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠮⣮⡪⣿⣯⣎⢆⠀⠿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣮⣿⣯⣆⠘⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣿⣿⣄⢫⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⢿⣮⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⠾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡗⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣹⡒⢿⠁⠀⣄⣀⡀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⢳⠼⣄⡼⡙⡆⢱⠆⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢧⠇⡖⠓⠲⠷⣾⣟⠁⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠦⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⡁⠒⡲⠈⠻⡦⡀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⠉⠉⡟⠁⠀⠀⠑⣈⠁⠢⡀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠁⡇⠀⠁⠀⠀⠀⠀⠀⠱⡄⠾\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⡇⢧⡘⠤⢄⡀⠀⠀⠀⠀⠘⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠣⣴⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡤⠋⠢⣀⡄⠀⠀⠀⠀⠀⡀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠛⠁⢀⡔⠋⠙⠂⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⢤⠄⠀⠀⣀⡴⠃⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠛⠞⠁⠀⢠⠏⠂⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡎⠀⠀⢀⠀⠀⠀⢀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⢾⣶⣿⠆⣆⣼⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⠀⠛⠛⠚⠚⠓⠚⠀";

  //Original art by Antoine de Saint Exupery
  private static final String scene = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠄⠂⠉⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠠⠒⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n⠀⠀⠀⣀⣀⣠⡤⣶⣶⣺⢒⣒⢒⠺⠓⠤⠩⠭⠿⠟⠶⠶⠶⠒⠶⠤⠤⠤⢀⣀\n⠰⡚⠛⠁⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙";
  
  public static void main(String[] args)
  {
    /*System.out.println("The Monomyth:");
    System.out.println(" _            ______      _    _  _    ______       _                   \n| |           | ___ \\    | |  (_)| |   | ___ \\     (_)                  \n| |      ___  | |_/ /___ | |_  _ | |_  | |_/ /_ __  _  _ __    ___  ___ \n| |     / _ \\ |  __// _ \\| __|| || __| |  __/| '__|| || '_ \\  / __|/ _ \\\n| |____|  __/ | |  |  __/| |_ | || |_  | |   | |   | || | | || (__|  __/\n\\_____/ \\___| \\_|   \\___| \\__||_| \\__| \\_|   |_|   |_||_| |_| \\___|\\___|");

    System.out.println("\nBy Antoine de Saint Exupery\n");

    System.out.println("A Project by Anna Silvesre\n");

    System.out.println();

    System.out.println("The Hero's Journey:");
    System.out.println("(1) The Ordinary World");
    System.out.println("(2) The Call to Adventure");
    System.out.println("(3) Assistance");
    System.out.println("(4) Crossing the Threshold");
    System.out.println("(5) Trials, Allies, and Enemies");
    System.out.println("(6) The Innermost Cave");
    System.out.println("(7) Ordeal");
    System.out.println("(8) Reward");
    System.out.println("(9) The Road Back");
    System.out.println("(10) A New Life");
    System.out.println("(11) Resolution");
    System.out.println("(12) Return with the Elixir\n");*/

    while(true)
    { 
      boolean breaking = false; 
      
      System.out.println("The Hero's Journey in...");
      System.out.println(" _            ______      _    _  _    ______       _                   \n| |           | ___ \\    | |  (_)| |   | ___ \\     (_)                  \n| |      ___  | |_/ /___ | |_  _ | |_  | |_/ /_ __  _  _ __    ___  ___ \n| |     / _ \\ |  __// _ \\| __|| || __| |  __/| '__|| || '_ \\  / __|/ _ \\\n| |____|  __/ | |  |  __/| |_ | || |_  | |   | |   | || | | || (__|  __/\n\\_____/ \\___| \\_|   \\___| \\__||_| \\__| \\_|   |_|   |_||_| |_| \\___|\\___|");

      System.out.println("\nBy Antoine de Saint-Éxupery\n");

      System.out.println("An AP English III Project by Anna Silvestre\n");

      System.out.println("The Hero's Journey:");
      System.out.println("(1) The Ordinary World");
      System.out.println("(2) The Call to Adventure");
      System.out.println("(3) Assistance");
      System.out.println("(4) Crossing the Threshold");
      System.out.println("(5) Trials, Allies, and Enemies");
      System.out.println("(6) The Innermost Cave");
      System.out.println("(7) Ordeal");
      System.out.println("(8) Reward");
      System.out.println("(9) The Road Back");
      System.out.println("(10) A New Life");
      System.out.println("(11) Resolution");
      System.out.println("(12) Return with the Elixir\n");

      boolean thread = false;

      do
      {
        thread = false;
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Which stage would you like to view?\n(Enter its corresponding number or type \"quit\" to leave, then press ENTER)\n>>");
        String x = reader.nextLine();

        if(x.toLowerCase().contains("quit"))
        {
          System.out.print(CLEAR);
          breaking = true;
        }
        else
        {
          switch(x.toLowerCase())
          {
            case "1": ordinaryWorld();
              break;
            case "2": call();
              break;
            case "3": assistance();
              break;
            case "4": crossing();
              break;
            case "5": tests();
              break;
            case "6": innermost();
              break;
            case "7": ordeal();
              break;
            case "8": reward();
              break;
            case "9": road();
              break;
            case "10": newLife();
              break;
            case "11": resolution();
              break;
            case "12": elixir();
              break;
            case "quit": breaking = true;
              break;
            default: System.out.println("Invalid input, please try again\n");
              thread = true;
              break;
          }
        }

        if(!thread && !breaking)
        {
          System.out.print("(press ENTER to clear and select a new stage)");
        reader.nextLine();
        System.out.print(CLEAR);
        }

        if(breaking)
        {
          System.out.println("Thanks for playing!");
          System.exit(0);
        }
      } while(thread);
    }
  }

  public static void ordinaryWorld()
  {
    String x = "The Little Prince is a young boy who lives alone on asteroid B-612. He cleans his three volcanoes every day, tends to his flowers and grass, pulls out weeds and baobab shoots, and watches the sunset as much as he pleases. This is the status quo of his life.";

    slowPrint(ANSI_BLUE + "Stage 1: The Ordinary World" + ANSI_RESET);
    System.out.println(prince + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

    //quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "\"The Innocent\"";
    
    boolean correct = false;
    System.out.println("The Little Prince is a child who learns about the lives of the grown-ups he meets and finds himself perplexed by the way they've lost sight of what\'s important. In addition to being the Hero, which archetype is the Prince an example of? (please enter the number of your answer)");
    System.out.println("(1) The Outlaw");
    System.out.println("(2) The Innocent");
    System.out.println("(3) The Creator");
    System.out.println("(4) The Jester");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = true;
          break;
        case 3: correct = false;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("Though the Prince is the hero in this story, he is still a child and his innocence and purity are constantly being juxtaposed against the world of maturity and overcomplication that he discovers in the book.");

    System.out.println();

    waiting();
  }
  public static void call()
  {
    String x = "One day, a seed lands on the asteroid. She takes root and grows over time until, one day, she blooms into a lovely Rose. The Prince is captivated by her beauty and begins to tend to her, but this Rose is vain and unappreciative, demanding more and more of the Prince each time. She loses his trust, and the Prince leaves his asteroid brokenhearted, disrupting the status quo.\n\nThe Prince\'s adventure is not explicit at this point, but it's ultimately revealed that his quest is to return to his rose--a quest that begins the moment he leaves her";

    slowPrint(ANSI_BLUE + "Stage 2: The Call to Adventure" + ANSI_RESET);
    System.out.println(rose+ "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "\"the Ruler\"";
    
    boolean correct = false;
    System.out.println("As the Prince starts his journey, he visits a few neighboring asteroids and speaks to the people who inhabit them-- all of them grown-ups. The first person he visits is the King, who claims to rule over the stars. When the Prince asks if he can order the sun to set for him (the Prince is very fond of sunsets), the King says he can do so \"when conditions are favorable\"-- which he says would be around 10 past 8:00 in this case. The King is a playful caricature of which archetype? (please enter the number of your answer)");
    System.out.println("(1) The Ruler");
    System.out.println("(2) The Rebel");
    System.out.println("(3) The Hero");
    System.out.println("(4) The Explorer");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = true;
          break;
        case 2: correct = false;
          break;
        case 3: correct = false;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The King wants to be in control of everything around him, and when he finds that he is not, he resorts to attempting to convince others of his influence so as to gain a sense of stability and responsibility.");
    
    System.out.println();
    
    waiting();
  }
  public static void assistance()
  {
    String x = "Though the Prince goes on much of his quest alone, he begins to encounter friends on Earth. He lands in a desert, and the first creature he encounters is a snake, who tells the Prince that he has the ability to return anyone he touches to the \"earth from whence he came\". He offers to remedy the Prince\'s homesickness should it become too much to bear. The Prince refuses his offer, and thus refuses the call to venture home, though he is now acquainted with a tool that will help him on such a journey.";

    slowPrint(ANSI_BLUE + "Stage 3: Assistance/Supernatural Help" + ANSI_RESET);
    System.out.println(snake + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "Death";
    
    boolean correct = false;
    System.out.println("The Prince remarks on the Snake's small size and lack of feet, but the Snake tells the Prince that he holds great power and can take him very far, though the Prince does not seem fazed by the Snake's claims. He tells the Prince that he speaks in riddles because he can answer all riddles. Knowing this, what could the Snake represent? (please enter the number of your answer)");
    System.out.println("(1) Knowledge");
    System.out.println("(2) Home");
    System.out.println("(3) Power");
    System.out.println("(4) Death");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = true;
          break;
        case 2: correct = false;
          break;
        case 3: correct = false;
          break;
        case 4: correct = true;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The Snake is full of absolutes, and we are intimidated by it in spite of its unassuming nature--much like death. The author uses the Snake to make a point about the role of death in one's journey through life, and how such a simple thing holds so much power to those who understand and fear its impact. There is also probably something to be said about the Prince\'s (innocence) lack of fear of the Snake (death).");

    System.out.println();

    waiting();
  }
  public static void crossing()
  {
    String x = "The Prince has already departed from his asteroid, but his true journey has yet to begin. Though he has met many people on this adventure, he does not commit to his return to his rose until he befriends a fox. The Fox asks the Prince to tame him, and they begin to form a close friendship. The Fox shares some wisdom to the Prince: that the beauty of life is in the unseen--in the secrets--because they make the ordinary special, like how a relationship makes an ordinary fox into a unique friend. They then separate as the Prince decides to begin his journey back home, thus crossing the threshold.";

    slowPrint(ANSI_BLUE + "Stage 4: Crossing the Threshold" + ANSI_RESET);
    System.out.println(fox + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "\"The Mentor\"";
    
    boolean correct = false;
    System.out.println("The Fox enters the story after the Prince encounters a garden full of roses like his own. Realizing that his Rose is not unique, the Prince is discouraged and questions whether he should return to her. The Fox\'s wisdom teaches the Prince that it is the time he has spent with his Rose that makes her unique. Which archetype does the Fox fall under? (please enter the number of your answer)");
    System.out.println("(1) The Lover");
    System.out.println("(2) The Shadow");
    System.out.println("(3) The Mentor");
    System.out.println("(4) The Wizard");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = false;
          break;
        case 3: correct = true;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The Fox is the one who trains the Prince in the ways of friendship and who shares wisdom with him that encourages him to commit to his journey and cross the threshold. Although the Snake offers assistance to the Prince, it is the Fox who ultimately fills this role because of the relationship he has with the Prince.");

    System.out.println();

    waiting();
  }
  public static void tests()
  {
    String x = "The Prince has already met a number of characters on his adventure, but only a few have proved to be truly influential. The Prince has decided that it is time to go home, but he has one more step to take in order to finish his journey. It is at this point in the story, near the anniversary of his arrival on Earth, that the Prince meets the Aviator, who is stranded in the desert, and asks him to draw him a sheep to take home with him (signifying his intent to go home). They spend a few days together, work on repairing the Aviator's plane, find a well, exchange stories, and reveal wisdom to one another. In short, they become allies and endure the trials of desert survival together--and the Aviator\'s grown-up nature is so contrary to the Prince\'s childlike wonder that it proves to be an enemy of sorts.";

    slowPrint(ANSI_BLUE + "Stage 5: Trials, Enemies, and Allies" + ANSI_RESET);
    System.out.println(plane + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "Desert vs Water";
    
    boolean correct = false;
    System.out.println("One of the trials that the Prince and the Aviator experience together is the search for a well in the desert. Upon finding it, the Prince says \"The stars are beautiful, because of a flower that cannot be seen...\" and \"What makes the desert beautiful... is that somewhere it hides a well...\" The latter quote is an example of which symbolic archetype? (please enter the number of your answer)");
    System.out.println("(1) Light vs Dark");
    System.out.println("(2) Good vs Evil");
    System.out.println("(3) Water vs Desert");
    System.out.println("(4) Fire vs Ice");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = false;
          break;
        case 3: correct = true;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The idea of the well's water and its refreshment and livelihood not only juxtaposes well against the arid and lifeless nature of the desert, but it also exemplifies the \"hidden life\" that makes the supposedly lifeless things seem special to those who understand what lies beneath the surface. There is also an element of Haven vs Wilderness present if the focus is placed on the well itself instead of the water.");

    System.out.println();

    waiting();
  }
  public static void innermost()
  {
    String x = "The Prince meets the Snake in the desert, representing his entry into the innermost cave. This is the beginning of the end of his journey as he commits to his return to his asteroid. It is the anniversary of his arrival on Earth (so the Earth and his asteroid are aligned), and he is at the location where he first arrived, which means his departure is approaching. He does not face a physical fight or unwanted peril, but there is still a struggle to come, and the Prince must prepare for it.";

    slowPrint(ANSI_BLUE + "Stage 6: The Innermost Cave" + ANSI_RESET);
    System.out.println(wall + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "Light vs Dark";
    
    boolean correct = false;
    System.out.println("The Prince meets with the Snake so he can accept his help. This dichotomy of innocence paired with death represents which symbolic archetype? (please enter the number of your answer)");
    System.out.println("(1) Light vs Dark");
    System.out.println("(2) Nature vs Machine");
    System.out.println("(3) Good vs Evil");
    System.out.println("(4) The Maze");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = true;
          break;
        case 2: correct = false;
          break;
        case 3: correct = false;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The Prince comes to symbolize a sort of purity and untainted wisdom throughout the book, while the Snake carries the stain of death. The fact that one is aiding the other helps convey this idea that death is not the looming evil we perceive it to be, and helps the author assert the idea that darkness is a necessary step to take on the way home.");

    System.out.println();

    waiting();
  }
  public static void ordeal()
  {
    String x = "The Prince\'s ordeal is his last conversation with the Aviator, in which he must confront his friend\'s fears as well as his own--a test of his childlike innocence and strength before he returns home. The Prince is afraid of the journey back, but he must return to his Rose.\n\nIt is here that the focus shifts to the Aviator, as he is the one who ultimately completes the Prince\'s journey in the hero cycle.\n\nAlthough it is not the sort of ordeal we typically associate with the hero's journey, this is the climactic point of this phase of the cycle, and this is where the Prince faces the most conflict. The \"ordeal\" being a matter of relationships fits well with the book's theme.";

    slowPrint(ANSI_BLUE + "Stage 7: The Ordeal" + ANSI_RESET);
    System.out.println(stars + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "The Reward";
    
    boolean correct = false;
    System.out.println("The Prince attempts to remedy the Aviator\'s sadness at his departure by telling him \"In one of the stars I shall be living. In one of them I shall be laughing. And so it will be as if all the stars were laughing, when you look at the sky at night...you-- only you-- will have stars that can laugh!\" What do the stars represent? (please enter the number of your answer)");
    System.out.println("(1) The Threshold");
    System.out.println("(2) Darkness");
    System.out.println("(3) The Magic Weapon");
    System.out.println("(4) The Reward");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = false;
          break;
        case 3: correct = false;
          break;
        case 4: correct = true;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The \"laughing stars\" are the Aviator\'s reward for listening to the Prince's wisdom and looking beneath the surface. This is the point in the story where the Aviator begins his own journey, completing the rest of the cycle in the absence of the Prince.");

    System.out.println();

    waiting();
  }
  public static void reward()
  {
    String x = "The reward the Prince receives is the friendship of the Aviator– and vice versa. The author uses the \"laughing stars\" to symbolixe this, and describes how their friendship influences their worldviews. The Prince understands the responsibilities of the world and how to nurture relationships, and the Aviator has learned how to view the world with renewed wonder and openness.";

    slowPrint(ANSI_BLUE + "Stage 8: The Reward" + ANSI_RESET);
    System.out.println(boa + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "The Mentor";
    
    boolean correct = false;
    System.out.println("The Prince and the Aviator have formed a strong friendship and have taught each other a lot about the world through out their time together, but it is arguable the Prince wh does the most teaching, with his simpler wisdom stemming from his childlike nature. This is a reversed take on which of the following archetypes? (please enter the number of your answer)");
    System.out.println("(1) The Damsel");
    System.out.println("(2) The Mentor");
    System.out.println("(3) The Earth Mother");
    System.out.println("(4) The Shadow");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = true;
          break;
        case 3: correct = false;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("Though the Prince has been perplexed by the world around him throughout his journey, he has been unable to comment on it until this point. Through the wisdom that he has gained from this adventure, the Prince himself becomes a mentor to the Aviator (even though the mentor is tupically older than the pupil) and shares his wisdom before ending his journey. In a sense, the Aviator becomes the initiate and, with the help of the Prince, is now ready to complete the cycle.");

    System.out.println();

    waiting();
  }
  public static void road()
  {
    String x = "The Prince walks into the distance and is bitten by the snake. He is gone, and his journey ends here. The Prince leaves the \"shell\" of his body so he can make the trip home. The Aviator states that he believes that the Prince ultimately returns to B-612 with his sheep (a new life), and that he reconciles with his rose (resolution) and applies his newfound wisdom to their relationship (return to the ordinary world with the elixir), thus completing the cycle. This part, however, is left open-ended, and the reader may interpret it however they would like.\n\nThis is where the Aviator becomes the focus of the story as the narrator. He ultimately manages to repair his plane and return home, and he tells the story of the Little Prince six years later.";

    slowPrint(ANSI_BLUE + "Stage 9: The Road Back" + ANSI_RESET);
    System.out.println(death_scene + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "The Initiate";
    
    boolean correct = false;
    System.out.println("The Aviator\'s story continues with his new life, resolution, and return with elixir. He has taken on the rest of the cycle. What position does this put him in? (please enter the number of your answer)");
    System.out.println("(1) The Mentor");
    System.out.println("(2) The Platonic Ideal");
    System.out.println("(3) The Initiate");
    System.out.println("(4) The Scapegoat");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = false;
          break;
        case 3: correct = true;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The Aviator is now the one who receives wisdom and training in his journey. He is the one who's left to tell the Prince's tale and return home with his new knowledge-- he completes the cycle that the Prince started. Though the Aviator was simply stranded in the desert when he met the Prince, their encounter became his call to a more personal adventure of discovery that fulfills the Prince's physical journey.");

    System.out.println();

    waiting();
  }
  public static void newLife()
  {
    String x = "The Aviator is committed to viewing the world with an open heart, and he frequently looks up to the sky to hear the stars laugh like \"five hundred million little bells\" and thinks of the Prince. He goes on after the Prince\'s departure, living a new life inspired by what the Prince taught him prior to the ordeal.";

    slowPrint(ANSI_BLUE + "Stage 10: A New Life" + ANSI_RESET);
    System.out.println(bell + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "The Shadow";
    
    boolean correct = false;
    System.out.println("The Aviator begins his narration of the book by remarking on a picture he drew as a kid--it was a picture of a boa constrictor that had eaten an elephant, but all of the grown-ups in his life had assumed it was a hat. As he grew up, the Aviator abandoned that childish curiosity and, like many other adults, took on the world of superficial appearances and strict logic. Knowing this about the Aviator, which archetype could he represent in the book? (please enter the number of your answer)");
    
    System.out.println("(1) The Hero");
    System.out.println("(2) The Shadow");
    System.out.println("(3) The Threshold Guardian");
    System.out.println("(4) The Outcast");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = true;
          break;
        case 3: correct = false;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The Aviator starts off in a place very similar to that of the Prince--childhood. The Aviator, however, faced the opposition of the world outside and thus conformed to the expectations of adulthood, closing off his mind and heart. This causes him to be somewhat impatient with the Prince at first. While there is no battle, the Prince does have to face the Aviator, and he reminds him of the simple truths that children are far more aware of thatn adults. Since the Aviator is the one who we see experience the final stages of the journey, it makes sense for him to be a \"corrupted\" reflection of the Prince");

    System.out.println();

    waiting();
  }
  public static void resolution()
  {
    String x = "The Aviator lives in tension, not knowing what happened to the Little Prince or what his life is like right now, but he also lives in comfort, believing that he made it home safely and hoping to see him again. There is no resolution to the aPrince\'s story in the book, but the Aviator\'s life has settled, and he has reached his own resolution.";

    slowPrint(ANSI_BLUE + "Stage 11: The Resolution" + ANSI_RESET);
    System.out.println(scene + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);

//quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "The Scapegoat";
    
    boolean correct = false;
    System.out.println("What other archetype might the Prince align with? (please enter the number of your answer)");
    System.out.println("(1) The Outcast");
    System.out.println("(2) The Gothic Hero");
    System.out.println("(3) The Earth Mother");
    System.out.println("(4) The Scapegoat");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = false;
          break;
        case 2: correct = false;
          break;
        case 3: correct = false;
          break;
        case 4: correct = true;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("While the Prince does not die for the sake of any particular person, his death is the ultimate fulfilment of his journey as it is whay allows him to complete the last three steps. So even if his death was more personally motivated, it is still an inspiring factor of his journey--it is what causes the Aviator to understand the importance of what he learned from the Prince--and brings about the end of the Prince\'s participation in the cycle.");

    System.out.println();

    waiting();
  }
  public static void elixir()
  {
    String x = "The Aviator shares this story with others, hoping to inspire them to view the world with an open heart and understand that the truly important things in life are those that we cannot see-- time spent with others, relationships, emotions, and wisdom. This knowledge is his elixir, and he aims to share it with the world.";

    slowPrint(ANSI_BLUE + "Stage 12: Return with the Elixir" + ANSI_RESET);
    System.out.println(flying + "\n");
    slowPrint(ANSI_CYAN + x + ANSI_RESET);


    //quiz section
    Scanner yeeter = new Scanner(System.in);
    String c_answer = "The Tragic Quest";
    
    boolean correct = false;
    System.out.println("What kind of hero's journey story does this book tell? (please enter the number of your answer)");
    System.out.println("(1) The Tragic Quest");
    System.out.println("(2) The Grail Quest");
    System.out.println("(3) The Quest for Identity");
    System.out.println("(4) The Quest to rid the Land of Danger");
    System.out.print(">>");
    int answer = yeeter.nextInt();

    switch(answer)
      {
        case 1: correct = true;
          break;
        case 2: correct = false;
          break;
        case 3: correct = false;
          break;
        case 4: correct = false;
          break;
        default: correct = false;
          break;
      }

    if(correct)
      System.out.println(ANSI_GREEN + "\nCorrect!" + ANSI_RESET);
    else
      System.out.println(ANSI_RED + "\nIncorrect, the answer is " + ANSI_RESET + c_answer);

    System.out.println("The Prince\'s journey is a complex one that involves a number of factors, but it ultimately becomes the Tragic Quest. His journey begins as a simple break from the status quo, then becomes a search for love as the Prince tries to return to his rose--which also makes it a fool\'s quest that could have been avoided if he'd never left. The Prince acquires wisdom along the way, giving purpose to the adventure, but he ultimately dies to complete his journey, and though there\'s room for a happy ending, the ending is tragic just the same.");

    System.out.println();

    waiting();
  }

  public static void slowPrint(String output)
  {
    for (int i = 0; i<output.length(); i++)
    {
      char c = output.charAt(i);
      System.out.print(c);
      try
      {
        TimeUnit.MILLISECONDS.sleep(30);
      }
      catch (Exception e)
      {

      }
    }

    System.out.println("\n");

    try
    {
      TimeUnit.MILLISECONDS.sleep(1000);
    }
    catch (Exception e)
    {
        
    }
  }
  
  public static void waiting()
  {
    try
    {
      TimeUnit.MILLISECONDS.sleep(1000);
    }
    catch (Exception e)
    {
        
    }
  }
}

//Anna Silvestre