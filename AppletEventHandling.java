import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
 
public class AppletEventHandling extends Applet implements MouseListener {
StringBuffer strBuf;
 
public void init() {
addMouseListener(this);
strBuf = new StringBuffer();
addItem(" Initializing the applet");
addItem(" Welcome to the Edureka's Applet Tutorial");
}
 
public void start() {
addItem(" Starting the applet ");
 
}
 
public void stop() {
addItem(" Stopping the applet ");
 
}
 
public void destroy() {
addItem(" Destroying the applet");
addItem(" Good Bye!!");
 
}
 
void addItem(String word) {
System.out.println(word);
strBuf.append(word);
repaint();
}
 
public void paint(Graphics g) {
 
g.drawString(strBuf.toString(), 10, 20);
 
setForeground(Color.white);
setBackground(Color.black);
 
}
 
public void mouseEntered(MouseEvent event) {
}
public void mouseExited(MouseEvent event) {
}
public void mousePressed(MouseEvent event) {
}
public void mouseReleased(MouseEvent event) {
}
public void mouseClicked(MouseEvent event) {
addItem(" Mouse is Clicked!!");
}
}