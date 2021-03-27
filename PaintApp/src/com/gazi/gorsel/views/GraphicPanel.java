/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.views;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author schea
 */
public class GraphicPanel extends JPanel implements MouseListener, MouseMotionListener {

    //Nesneleri tekrar çizdirebilmek için Shape nesnesi ve ArrayList
    Shape shape;
    public ArrayList<Shape> shapes = new ArrayList<Shape>();
    public ArrayList<Shape> removeShapes=new ArrayList<Shape>();
    ArrayList<Point> pointList = null;

    //Çizim Tipleri
    public enum drawMode {
        freeHand,
        line,
        rectangle,
        triangle,
        rightTriangle,
        oval,
        clear,
        sandglass
    }

    public enum takeIt {
        takeitback,
        takeforward
    }

    //Çizim modları
    public enum drawType {
        line,
        fill,
        lineFill
    }
    drawMode dm = drawMode.line;

    //Constructor
    public GraphicPanel() {
        setLayout(new GridLayout(6, 6));
        /*JButton btn=new JButton();
        this.add(btn);*/
        setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(600, 400));
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }
    //Fieldlar
    private Color fillColor = Color.BLACK;
    private Color backgroundColor=Color.WHITE;
    private Color lineColor = Color.BLACK;
    private Color gridColor = Color.GREEN;
    private int thickness;
    private String DrawState = "line";
    Point startDrag, endDrag;
    //Izgaranın görünürlüğünü atadığımız field
    private boolean gridState = true;
    //Image'i GraphicPanelde Açmak için field
    private Image OpenImage = null;
    //Grid Büyüklükleri
    private Point GridSize=new Point(10, 10);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(2.5f));
        if (isGridState()) {
            drawGrid(g);
        }
        //Arraylistteki Nesnelerin sırayla yazdırılması        
        for (Shape shape : shapes) {
            shape.drawShape(g);
        }
        if (getOpenImage() != null) {
            g2.drawImage(getOpenImage(), 1, 1, this);
        }
        if (dm == drawMode.clear) {
            Dimension d = this.getSize();
            d.width = this.getX();
            d.height = this.getY();
            g2.clearRect(0, 0, d.width, d.height);
            shapes.clear();
            repaint();
            dm = drawMode.line;
        }
        //Dragged yaparken de nesnenin çizilmesi için if kontrolü ve DrawMouseDragged methodu
        if (startDrag != null && endDrag != null) {
            DrawMouseDragged(g);
        }
    }

    public void drawGrid(Graphics g) {
        //Izgara Şeklini Çizdirme
        Dimension d = this.getSize();
        for (int i = 0; i < d.width; i += GridSize.x) {
            for (int j = 0; j < d.height; j += GridSize.x) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(1));
                g2.setColor(getGridColor());
                g2.drawRect(i, j, GridSize.x, GridSize.y);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        startDrag = e.getPoint();
        endDrag = startDrag;
        if (dm == drawMode.freeHand) {
            /*
            Eğer free Hand durumunda mouse press olayı gerçekleştiyse
            yeni bir arraylist oluşutuyoruz ve serbest çizimin değerlerini
            bu listeye atıyoruz
            */
            pointList = new ArrayList<Point>();
            pointList.add(e.getPoint());
        }
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //Switch caseler ile çizilecek şeklin seçimi yapılıyor
        Shape shape = null;
        switch (dm) {
            case line:
                //Çizgi
                shape = drawLine(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            case rectangle:
                //Dikdörtgen
                shape = drawRectangle(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            case triangle:
                //Üçgen
                shape = drawTriangle(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            case rightTriangle:
                //Dik Üçgen
                shape = drawRightTriangle(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            case oval:
                //Oval
                shape = drawOval(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            case sandglass:
                //Kum saati benzeri şekil
                shape = drawSandglass(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            //FreeHand Kullanmamamızın sebebi DrawMouseDragged methodunda ve mouse dragged eventinde çizdiryor olmamız
        }
        //Eğer bir şekil belirtilmişse bu nesneyi arraylise atama
        if (shape != null) {
            shapes.add(shape);
        }
        //Çizdiğimiz nesneden sonra yeni bir nesne çizerken sorunla karşılaşmamak için değerleri null yapıyoruz
        startDrag = null;
        endDrag = null;
        shape = null;
        repaint();
    }

    //Dragged yaparken nesnelerin çizilmesini sağlayan method
    public void DrawMouseDragged(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //Değer atamaları
        g2.setStroke(new BasicStroke(thickness));
        g2.setColor(lineColor);
        //switch case kontrolüyle seçilen nesnenin çizilmesi
        switch (dm) {
            case line:
                g2.drawLine(startDrag.x, startDrag.y, endDrag.x, endDrag.y);
                break;
            case rectangle:
                /*İf Blokları eğer kullanıcın çizimi mouseın tıklandığı noktadan x ve y eksenlerinde artarak gitmiyorsa yani mouseu tutup aşağı doğru
                ve sağa doğru çekmiyorsa yukarıya ya da sola doğru çekiyorsa çizimin o yönde devam etmesini sağlıyor*/
                if (endDrag.x < startDrag.x && endDrag.y < startDrag.y) {
                    //Mouse'a tıklanıp Sol Yukarı doğru yani sol çapraza doğru çizim yapılırken çizilecek dikdörtgen
                    g2.drawRect(endDrag.x, endDrag.y, startDrag.x - endDrag.x, startDrag.y - endDrag.y);
                } else if (endDrag.y < startDrag.y) {
                    //Mouse'a tıklanıp Sağ Yukarı doğru yani sağ çapraza doğru çizim yapılırken çizilecek dikdörtgen
                    g2.drawRect(startDrag.x, endDrag.y, endDrag.x - startDrag.x, startDrag.y - endDrag.y);
                } else if (endDrag.x < startDrag.x) {
                    //Mouse'a tıklanıp Sol Aşağıya doğru yani sol alt çapraza doğru çizim yapılırken çizilecek dikdörtgen
                    g2.drawRect(endDrag.x, startDrag.y, startDrag.x - endDrag.x, endDrag.y - startDrag.y);
                } else {
                    //Else durumu mouseun tutup aşağı ve sola doğru çekilmesi durumunda çalışıyor
                    g2.drawRect(startDrag.x, startDrag.y, endDrag.x - startDrag.x, endDrag.y - startDrag.y);
                }
                /*
                Kum Saati
                g2.drawPolygon(new int[]{startDrag.x,endDrag.x,startDrag.x,endDrag.x}, new int[]{startDrag.y,startDrag.y,endDrag.y,endDrag.y}, 4);
                 */

                break;
            case triangle:
                g2.drawPolygon(new int[]{startDrag.x, endDrag.x, (Math.abs(startDrag.x + endDrag.x) / 2)}, new int[]{endDrag.y, endDrag.y, startDrag.y}, 3);
                break;
            case rightTriangle:
                g2.drawPolygon(new int[]{startDrag.x, endDrag.x, startDrag.x}, new int[]{endDrag.y, endDrag.y, startDrag.y}, 3);
                break;
            case oval:
                /*İf Blokları eğer kullanıcın çizimi mouseın tıklandığı noktadan x ve y eksenlerinde artarak gitmiyorsa yani mouseu tutup aşağı doğru
                ve sağa doğru çekmiyorsa yukarıya ya da sola doğru çekiyorsa çizimin o yönde devam etmesini sağlıyor*/
                if (endDrag.x < startDrag.x && endDrag.y < startDrag.y) {
                    //Mouse'a tıklanıp Sol Yukarı doğru yani sol çapraza doğru çizim yapılırken çizilecek Oval
                    g2.drawOval(endDrag.x, endDrag.y, startDrag.x - endDrag.x, startDrag.y - endDrag.y);
                } else if (endDrag.y < startDrag.y) {
                    //Mouse'a tıklanıp Sağ Yukarı doğru yani sağ çapraza doğru çizim yapılırken çizilecek Oval
                    g2.drawOval(startDrag.x, endDrag.y, endDrag.x - startDrag.x, startDrag.y - endDrag.y);
                } else if (endDrag.x < startDrag.x) {
                    //Mouse'a tıklanıp Sol Aşağıya doğru yani sol alt çapraza doğru çizim yapılırken çizilecek Oval
                    g2.drawOval(endDrag.x, startDrag.y, startDrag.x - endDrag.x, endDrag.y - startDrag.y);
                } else {
                    //Else durumu mouse'a tıklanıp Sağ Aşağıya doğru yani sağ çapraza doğru çizim yapılırken çizilecek Oval
                    g2.drawOval(startDrag.x, startDrag.y, Math.abs(endDrag.x - startDrag.x), Math.abs(endDrag.y - startDrag.y));
                }
                break;
            case sandglass:
                //kum saati şekli çizme
                g2.drawPolygon(new int[]{startDrag.x, endDrag.x, startDrag.x, endDrag.x}, new int[]{startDrag.y, startDrag.y, endDrag.y, endDrag.y}, 4);
                break;
            case freeHand:
                //Free Hand çizimde her dragged'da çizim yapılması gerektiği için yeni bir nesne oluşturup arrayliste atıyoruz
                //Eğer yapılmazsa çizerken sadece başlangıç noktasında bir adet nokta gözüküyor
                shape = new Shape("free hand", lineColor, getThickness(), pointList);
                shapes.add(shape);
                /*pointList nullsa yani herhangi bir press ya da dragged olayı olmamışsa
                nullPointer exception almamak için if kontrolü yapıyoruz*/
                if (pointList != null) {
                    /*Point ArrayListinden çizdirmemizin sebebi mouse dragged olurken her kordinatı yakalayamıyor 
                    eğer iki değer arasında bir boşluk varsa pointList.get(i+1).x/y kullanarak aradaki boşluğu da çiziyoruz
                    bu sayede anti aliasing belirli bir seviyede sağlanmış oluyor*/
                    for (int i = 0; i < pointList.size() - 1; i++) {
                        //free hand çizimi
                        g2.drawLine(pointList.get(i).x, pointList.get(i).y, pointList.get(i + 1).x, pointList.get(i + 1).y);
                    }
                }
                break;
        }

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        endDrag = e.getPoint();
        if (dm == drawMode.freeHand) {
            //eğer free hand çizimindeyse arrayliste x ve y değerlerini atıyoruz
            pointList.add(e.getPoint());
        }
        repaint();
    }

    //Kullanılmayan mouse eventleri
    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    //Kodun kötü görünmemesi için Nesneleri çizdiren methodlar
    public Shape drawLine(int x1, int y1, int x2, int y2) {
        //çizgi
        return new Shape(x1, y1, x2, y2, "line", lineColor, getFillColor(), "line", getThickness());
    }

    public Shape drawRectangle(int x1, int y1, int x2, int y2) {
        //Dikdörtgen
        return new Shape(x1, y1, x2, y2, "rectangle", lineColor, getFillColor(), DrawState, getThickness());
    }

    public Shape drawTriangle(int x1, int y1, int x2, int y2) {
        //üçgen
        return new Shape(x1, y1, x2, y2, "triangle", lineColor, getFillColor(), DrawState, getThickness());
    }

    public Shape drawRightTriangle(int x1, int y1, int x2, int y2) {
        //dik üçgen
        return new Shape(x1, y1, x2, y2, "right triangle", lineColor, getFillColor(), DrawState, getThickness());
    }

    public Shape drawOval(int x1, int y1, int x2, int y2) {
        //Oval
        return new Shape(x1, y1, x2, y2, "oval", lineColor, getFillColor(), DrawState, getThickness());
    }

    public Shape drawFreeHand(Color color) {
        //Serbest Çizim
        return new Shape("free hand", color, getThickness(), pointList);
    }

    public Shape drawSandglass(int x1, int y1, int x2, int y2) {
        //Kum Saati Şeklinde Çizim
        return new Shape(x1, y1, x2, y2, "sandglass", lineColor, getFillColor(), DrawState, getThickness());
    }

    //Encapsulate
    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getDrawState() {
        return DrawState;
    }

    public void setDrawState(String DrawState) {
        this.DrawState = DrawState;
    }

    public boolean isGridState() {
        return gridState;
    }

    public void setGridState(boolean gridState) {
        this.gridState = gridState;
    }

    public Color getGridColor() {
        return gridColor;
    }

    public void setGridColor(Color gridColor) {
        this.gridColor = gridColor;
    }

    public Image getOpenImage() {
        return OpenImage;
    }

    public void setOpenImage(Image OpenImage) {
        this.OpenImage = OpenImage;
    }

    public Point getGridSize() {
        return GridSize;
    }

    public void setGridSize(Point GridSize) {
        this.GridSize = GridSize;
    }

}
