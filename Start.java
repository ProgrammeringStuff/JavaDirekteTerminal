//Det var virkelig besværligt men lykkedes til sidst at køre en ren Java applikation, der anvender Processing via en unix-konsol
//Her direkte fra unix-terminal:

//.....1.) VÆLG JAVA 8!! (kilde: https://github.com/processing/processing/wiki/Supported-Platforms)
//Først skal man være sikker på man anvender java version 8.
//for at se tilgængelige versioner af java
//Anderss-iMac:java_konsol_1 andersjuulr.petersen$ /usr/libexec/java_home -V
//
//vælg den rigtige version_
//Anderss-iMac:java_konsol_1 andersjuulr.petersen$ export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_202`

//.....2.) KOMPILER OG KØR JAVA-FIL DER AFHÆNGER AF PROCESSING CORE!!
//Compile:
//Anderss-iMac:java_konsol_1 andersjuulr.petersen$ javac -cp ".:./core.jar" Start.java
//Kør:
//Anderss-iMac:java_konsol_1 andersjuulr.petersen$ java -cp .:./core.jar Start
//

import processing.core.*;

public class Start extends PApplet {
  public void setup() {
    println("hej2");
    noLoop();
  }

  static public void main(String[] passedArgs) {
      PApplet.main("Start");
  }

}
