/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package BO;

import javax.swing.*;
import java.beans.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/* ImagePreview.java by FileChooserDemo2.java. */
public class ImagePreview extends JComponent
        implements PropertyChangeListener {

    BufferedImage currentImage = null;
    File file = null;

    public ImagePreview(JFileChooser fc) {
        setPreferredSize(new Dimension(500, 400));
        fc.addPropertyChangeListener(this);
    }

    public void loadImage() {
        if (file == null) {
            currentImage = null;
            return;
        } else {
            try {
                //Don't use createImageIcon (which is a wrapper for getResource)
                //because the image we're trying to load is probably not one
                //of this program's own resources.
                BufferedImage temp = ImageIO.read(new File(file.getAbsolutePath()));
                currentImage = temp;
            } catch (IOException ex) {
                Logger.getLogger(ImagePreview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void propertyChange(PropertyChangeEvent e) {
        boolean update = false;
        String prop = e.getPropertyName();

        //If the directory changed, don't show an image.
        if (JFileChooser.DIRECTORY_CHANGED_PROPERTY.equals(prop)) {
            file = null;
            update = true;

            //If a file became selected, find out which one.
        } else if (JFileChooser.SELECTED_FILE_CHANGED_PROPERTY.equals(prop)) {
            file = (File) e.getNewValue();
            update = true;
        }

        //Update the preview accordingly.
        if (update) {
            currentImage = null;
            if (isShowing()) {
                loadImage();
                repaint();
            }
        }
    }

    protected void paintComponent(Graphics g) {
        if (currentImage != null) {
            g.clearRect(0, 0, this.getWidth(), this.getHeight());
            int imgWidth = currentImage.getWidth();
            int imgHeight = currentImage.getHeight();
            double ratio = 1.0 * imgWidth / imgHeight;
            int areaWidth = this.getWidth();
            int areaHeight = this.getHeight();
            if (imgWidth <= areaWidth && imgHeight <= areaHeight) {
                areaWidth = imgWidth;
                areaHeight = imgHeight;
            } else if (imgWidth > imgHeight) {
                if (imgWidth < areaWidth) {
                    areaWidth = imgWidth;
                }
                areaHeight = (int) (areaWidth / ratio);
            } else {
                if (imgHeight < areaHeight) {
                    areaHeight = imgHeight;
                }
                areaWidth = (int) (areaHeight * ratio);
            }
            g.drawImage(currentImage, 0, 0, areaWidth, areaHeight, this);
        }
    }
}
