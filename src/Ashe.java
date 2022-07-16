public class Ashe extends Champion implements AsheActionCallbacks{

    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BLACK);
        s.showImage("h1.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void hawkShot(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BLACK);
        s.showImage("h2.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BLACK);
        s.showImage("h3.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BLACK);
        s.showImage("h4.gif");
        s.setBounds(200,100,1100,900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BLACK);
        s.showImage("h5.gif");
        s.setBounds(200,100,1100,900);
    }
}
