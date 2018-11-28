import divisions.SubDivisions;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public static void main(String[] args) {
        new ChoiceDivisionForm(Offer.getChoiceOfSubdivision(), SubDivisions.getSubDivisions());
    }
}
