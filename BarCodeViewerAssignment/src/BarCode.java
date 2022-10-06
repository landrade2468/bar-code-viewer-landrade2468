/**
 * Lauren Andrade - Bar Code Viewer Assignment - October 5, 2022
 */

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Renders the full component and stores the x & y coordinates of where the component should be drawn
 */
public class BarCode {
    private int x;
    private int y;

    /**
     * Creates an instance of the BarCodec class
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public BarCode(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Sets the barcode to certain points
     * @param g2 inherited from the Graphics2D class
     */
    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        Rectangle firstBlackRectangle = new Rectangle(x + 25, y, 5, 380);
        Rectangle secondBlackRectangle = new Rectangle(x + 35, y, 5, 380);
        Rectangle thirdBlackRectangle = new Rectangle(x + 55, y, 10, 380);
        Rectangle fourthBlackRectangle = new Rectangle(x + 70, y, 5, 380);
        Rectangle fifthBlackRectangle = new Rectangle(x + 80, y, 10, 360);
        Rectangle sixthBlackRectangle = new Rectangle(x + 105, y, 5, 360);
        Rectangle seventhBlackRectangle = new Rectangle(x + 118, y, 10, 360);
        Rectangle eighthBlackRectangle = new Rectangle(x + 136, y, 5, 360);
        Rectangle ninthBlackRectangle = new Rectangle(x + 149, y, 10, 360);
        Rectangle tenthBlackRectangle = new Rectangle(x + 167, y, 5, 360);
        Rectangle eleventhBlackRectangle = new Rectangle(x + 180, y, 10, 360);
        Rectangle twelfthBlackRectangle = new Rectangle(x + 199, y, 5, 360);
        Rectangle thirteenthBlackRectangle = new Rectangle(x + 211, y, 10, 360);
        Rectangle fourteenthBlackRectangle = new Rectangle(x + 231, y, 5, 360);
        Rectangle fifteenthBlackRectangle = new Rectangle(x + 241, y, 5, 380);
        Rectangle sixteenthBlackRectangle = new Rectangle(x + 251, y, 5, 380);
        Rectangle seventeenthBlackRectangle = new Rectangle(x + 261, y, 5, 360);
        Rectangle eighteenthBlackRectangle = new Rectangle(x + 271, y, 13, 360);
        Rectangle nineteenthBlackRectangle = new Rectangle(x + 289, y, 13, 360);
        Rectangle twentiethBlackRectangle = new Rectangle(x + 313, y, 5, 360);
        Rectangle twentyFirstBlackRectangle = new Rectangle(x + 323, y, 5, 360);
        Rectangle twentySecondBlackRectangle = new Rectangle(x + 338, y, 5, 360);
        Rectangle twentyThirdBlackRectangle = new Rectangle(x + 351, y, 5, 360);
        Rectangle twentyFourthBlackRectangle = new Rectangle(x + 364, y, 15, 360);
        Rectangle twentyFifthBlackRectangle = new Rectangle(x + 389, y, 15, 360);
        Rectangle twentySixthBlackRectangle = new Rectangle(x + 409, y, 5, 360);
        Rectangle twentySeventhBlackRectangle = new Rectangle(x + 427, y, 10, 380);
        Rectangle twentyEighthBlackRectangle = new Rectangle(x + 442, y, 10, 380);
        Rectangle twentyNinthBlackRectangle = new Rectangle(x + 460, y, 5, 380);
        Rectangle thirtiethBlackRectangle = new Rectangle(x + 470, y, 5, 380);

        g2.fill(firstBlackRectangle);
        g2.fill(secondBlackRectangle);
        g2.fill(thirdBlackRectangle);
        g2.fill(fourthBlackRectangle);
        g2.fill(fifthBlackRectangle);
        g2.fill(sixthBlackRectangle);
        g2.fill(seventhBlackRectangle);
        g2.fill(eighthBlackRectangle);
        g2.fill(ninthBlackRectangle);
        g2.fill(tenthBlackRectangle);
        g2.fill(eleventhBlackRectangle);
        g2.fill(twelfthBlackRectangle);
        g2.fill(thirteenthBlackRectangle);
        g2.fill(fourteenthBlackRectangle);
        g2.fill(fifteenthBlackRectangle);
        g2.fill(sixteenthBlackRectangle);
        g2.fill(seventeenthBlackRectangle);
        g2.fill(eighteenthBlackRectangle);
        g2.fill(nineteenthBlackRectangle);
        g2.fill(twentiethBlackRectangle);
        g2.fill(twentyFirstBlackRectangle);
        g2.fill(twentySecondBlackRectangle);
        g2.fill(twentyThirdBlackRectangle);
        g2.fill(twentyFourthBlackRectangle);
        g2.fill(twentyFifthBlackRectangle);
        g2.fill(twentySixthBlackRectangle);
        g2.fill(twentySeventhBlackRectangle);
        g2.fill(twentyEighthBlackRectangle);
        g2.fill(twentyNinthBlackRectangle);
        g2.fill(thirtiethBlackRectangle);

        g2.draw(firstBlackRectangle);
        g2.draw(secondBlackRectangle);
        g2.draw(thirdBlackRectangle);
        g2.draw(fourthBlackRectangle);
        g2.draw(fifthBlackRectangle);
        g2.draw(sixthBlackRectangle);
        g2.draw(seventhBlackRectangle);
        g2.draw(eighthBlackRectangle);
        g2.draw(ninthBlackRectangle);
        g2.draw(tenthBlackRectangle);
        g2.draw(eleventhBlackRectangle);
        g2.draw(twelfthBlackRectangle);
        g2.draw(thirteenthBlackRectangle);
        g2.draw(fourteenthBlackRectangle);
        g2.draw(fifteenthBlackRectangle);
        g2.draw(sixteenthBlackRectangle);
        g2.draw(seventeenthBlackRectangle);
        g2.draw(eighteenthBlackRectangle);
        g2.draw(nineteenthBlackRectangle);
        g2.draw(twentiethBlackRectangle);
        g2.draw(twentyFirstBlackRectangle);
        g2.draw(twentySecondBlackRectangle);
        g2.draw(twentyThirdBlackRectangle);
        g2.draw(twentyFourthBlackRectangle);
        g2.draw(twentyFifthBlackRectangle);
        g2.draw(twentySixthBlackRectangle);
        g2.draw(twentySeventhBlackRectangle);
        g2.draw(twentyEighthBlackRectangle);
        g2.draw(twentyNinthBlackRectangle);
        g2.draw(thirtiethBlackRectangle);

        g2.setFont(new Font("TimesRoman", Font.PLAIN, 40));
        g2.drawString("5 1 1 1 1", x + 80, y + 400);
        g2.drawString("4 0 7 5 9", x + 265, y + 400);
        g2.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g2.drawString("0", x, y + 400);
        g2.drawString("2", x + 490, y + 400);
    }
}
