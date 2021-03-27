/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gazi.gorsel.views;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author schea
 */
public class Shape {
    ArrayList<Point> pointList=new ArrayList<Point>();
    //Fields
    public int x1, y1, x2, y2;
    public int thickness;
    public String type;
    public Color colors;
    public Color fillColors;
    public String DrawType;

    //Constructor
    Shape(int x1, int y1, int x2, int y2, String type, Color color, Color fillColor, String DrawType, int thick) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.type = type;
        this.colors = color;
        this.fillColors = fillColor;
        this.DrawType = DrawType;
        this.thickness = thick;
        
    }
    Shape(String type,Color color,int thickness,ArrayList<Point> pointList){
        this.type = type;
        this.colors = color;
        this.thickness = thickness;
        this.pointList=pointList;
    }

    //Paint methodunda şekilleri çizdirebilmeyi sağlayan method,
    public void drawShape(Graphics g) {
        switch (type) {
            case "line":
                drawLine(g);
                break;
            case "rectangle":
                drawRectangle(g);
                break;
            case "triangle":
                drawTriangle(g);
                break;
            case "right triangle":
                drawRightTriangle(g);
                break;
            case "oval":
                drawOval(g);
                break;
            case "sandglass":
                drawSandGlass(g);
                break;
            case "free hand":
                drawFreeHand(g);
                break;
        }

    }

    //Şekilleri çizdiren methodlar
    //Çizgi
    public void drawLine(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.colors);
        g2.setStroke(new BasicStroke(thickness));
        g2.drawLine(x1, y1, x2, y2);
    }

    //Oval
    public void drawOval(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.colors);
        g2.setStroke(new BasicStroke(thickness));
        switch (DrawType) {
            case "line":
                //Sadece çizgi modu
                if (x2 < x1 && y2 < y1) {
                    g2.drawOval(x2, y2, x1 - x2, y1 - y2);
                } else if (y2 < y1) {
                    g2.drawOval(x1, y2, x2 - x1, y1 - y2);
                } else if (x2 < x1) {
                    g2.drawOval(x2, y1, x1 - x2, y2 - y1);
                } else {
                    g2.drawOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                }
                break;
            case "fill":
                //Sadece dolgu modu
                g2.setColor(fillColors);
                if (x2 < x1 && y2 < y1) {
                    g2.fillOval(x2, y2, x1 - x2, y1 - y2);
                } else if (y2 < y1) {
                    g2.fillOval(x1, y2, x2 - x1, y1 - y2);
                } else if (x2 < x1) {
                    g2.fillOval(x2, y1, x1 - x2, y2 - y1);
                } else {
                    g2.fillOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                }
                break;
            case "FillLine":
                //çizgi+dolgu modu
                //FillLine Durumunda yani hem çizgi hem dolgu durumunda ilk önce boş çizimi yapıyoruz daha sonra onun içini dolduruyoruz
                g2.setStroke(new BasicStroke(thickness));
                g2.setColor(colors);
                if (x2 < x1 && y2 < y1) {
                    g2.setColor(colors);
                    g2.drawOval(x2, y2, x1 - x2, y1 - y2);
                    g2.setColor(fillColors);
                    g2.fillOval(x2, y2, x1 - x2, y1 - y2);
                } else if (y2 < y1) {
                    g2.setColor(colors);
                    g2.drawOval(x1, y2, x2 - x1, y1 - y2);
                    g2.setColor(fillColors);
                    g2.fillOval(x1, y2, x2 - x1, y1 - y2);
                } else if (x2 < x1) {
                    g2.setColor(colors);
                    g2.drawOval(x2, y1, x1 - x2, y2 - y1);
                    g2.setColor(fillColors);
                    g2.fillOval(x2, y1, x1 - x2, y2 - y1);
                } else {
                    g2.setColor(colors);
                    g2.drawOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                    g2.setColor(fillColors);
                    g2.fillOval(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                }
                break;
        }
    }

    //Üçgen
    public void drawTriangle(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colors);
        g2.setStroke(new BasicStroke(thickness));
        switch (DrawType) {
            case "line":
                g2.drawPolygon(new int[]{x1, x2, (Math.abs(x1 + x2) / 2)}, new int[]{y2, y2, y1}, 3);
                break;
            case "fill":
                g2.setColor(fillColors);
                g2.fillPolygon(new int[]{x1, x2, (Math.abs(x1 + x2) / 2)}, new int[]{y2, y2, y1}, 3);
                break;
            case "FillLine":
                //FillLine Durumunda yani hem çizgi hem dolgu durumunda ilk önce boş çizimi yapıyoruz daha sonra onun içini dolduruyoruz
                g2.setColor(colors);
                g2.setStroke(new BasicStroke(thickness));
                g2.drawPolygon(new int[]{x1, x2, (Math.abs(x1 + x2) / 2)}, new int[]{y2, y2, y1}, 3);
                g2.setColor(fillColors);
                g2.fillPolygon(new int[]{x1, x2, (Math.abs(x1 + x2) / 2)}, new int[]{y2, y2, y1}, 3);
                break;
        }
    }

//Dik Üçgen
    public void drawRightTriangle(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colors);
        g2.setStroke(new BasicStroke(thickness));
        switch (DrawType) {
            
            case "line":
                //Sadece çizgi modu
                g2.drawPolygon(new int[]{x1, x2, x1}, new int[]{y2, y2, y1}, 3);
                break;
            case "fill":
                //Sadece dolgu modu
                g2.setColor(fillColors);
                g2.fillPolygon(new int[]{x1, x2, x1}, new int[]{y2, y2, y1}, 3);
                break;
            case "FillLine":
                //Çizgi+dolgu modu
                //FillLine Durumunda yani hem çizgi hem dolgu durumunda ilk önce boş çizimi yapıyoruz daha sonra onun içini dolduruyoruz
                g2.setColor(colors);
                g2.setStroke(new BasicStroke(thickness));
                g2.drawPolygon(new int[]{x1, x2, x1}, new int[]{y2, y2, y1}, 3);
                g2.setColor(fillColors);
                g2.fillPolygon(new int[]{x1, x2, x1}, new int[]{y2, y2, y1}, 3);
                break;
        }
    }

    //Dikdörtgen
    public void drawRectangle(Graphics g) {
        /*DrawType'ı kontrol eden switch case içindeki İf Blokları eğer kullanıcın çizimi mouseın tıklandığı noktadan x ve y eksenlerinde artarak gitmiyorsa yani mouseu tutup aşağı doğru
        ve sağa doğru çekmiyorsa yukarıya ya da sola doğru çekiyorsa çizimin o yönde devam etmesini sağlıyor*/
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colors);
        g2.setStroke(new BasicStroke(thickness));
        switch (DrawType) {
            //Sadece çizgi modu
            case "line":
                if (x2 < x1 && y2 < y1) {
                    g2.drawRect(x2, y2, x1 - x2, y1 - y2);
                } else if (y2 < y1) {
                    g2.drawRect(x1, y2, x2 - x1, y1 - y2);
                } else if (x2 < x1) {
                    g2.drawRect(x2, y1, x1 - x2, y2 - y1);
                } else {
                    g2.drawRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                }
                break;
                //Dolgu modu
            case "fill":
                g2.setColor(fillColors);
                if (x2 < x1 && y2 < y1) {
                    g2.fillRect(x2, y2, x1 - x2, y1 - y2);
                } else if (y2 < y1) {
                    g2.fillRect(x1, y2, x2 - x1, y1 - y2);
                } else if (x2 < x1) {
                    g2.fillRect(x2, y1, x1 - x2, y2 - y1);
                } else {
                    g2.fillRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                }
                break;
                //Çizgi + dolgu modu
            case "FillLine":
                //FillLine Durumunda yani hem çizgi hem dolgu durumunda ilk önce boş çizimi yapıyoruz daha sonra o çizimin içini dolduruyoruz
                g2.setStroke(new BasicStroke(thickness));
                g2.setColor(colors);
                if (x2 < x1 && y2 < y1) {

                    g2.drawRect(x2, y2, x1 - x2, y1 - y2);
                    g2.setColor(fillColors);
                    g2.fillRect(x2, y2, x1 - x2, y1 - y2);
                } else if (y2 < y1) {
                    g2.drawRect(x1, y2, x2 - x1, y1 - y2);
                    g2.setColor(fillColors);
                    g2.fillRect(x1, y2, x2 - x1, y1 - y2);
                } else if (x2 < x1) {
                    g2.drawRect(x2, y1, x1 - x2, y2 - y1);
                    g2.setColor(fillColors);
                    g2.fillRect(x2, y1, x1 - x2, y2 - y1);
                } else {
                    g2.drawRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                    g2.setColor(fillColors);
                    g2.fillRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
                }
                break;
            default:
                break;
        }
    }

    public void drawSandGlass(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
        g2.setColor(colors);
        g2.setStroke(new BasicStroke(thickness));
        switch (DrawType) {
            case "line":
                 g2.drawPolygon(new int[]{x1,x2,x1,x2}, new int[]{y1,y1,y2,y2}, 4);
                break;
            case "fill":
                g2.setColor(fillColors);
                g2.fillPolygon(new int[]{x1,x2,x1,x2}, new int[]{y1,y1,y2,y2}, 4);
                break;
            case "FillLine":
                //FillLine Durumunda yani hem çizgi hem dolgu durumunda ilk önce boş çizimi yapıyoruz daha sonra onun içini dolduruyoruz
                g2.setColor(colors);
                g2.setStroke(new BasicStroke(thickness));
                g2.drawPolygon(new int[]{x1,x2,x1,x2}, new int[]{y1,y1,y2,y2}, 4);
                g2.setColor(fillColors);
                g2.fillPolygon(new int[]{x1,x2,x1,x2}, new int[]{y1,y1,y2,y2}, 4);
                break;
        }
    }
    //Serbest Çizim
    public void drawFreeHand(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //Kalınlık ve renk atamaları
        g2.setStroke(new BasicStroke(thickness));
        g2.setColor(colors);
        /*Point ArrayListinden çizdirmemizin sebebi mouse dragged olurken her kordinatı yakalayamıyor 
        eğer iki değer arasında bir boşluk varsa pointList.get(i+1).x/y kullanarak aradaki boşluğu da çiziyoruz
        bu sayede anti aliasing belirli bir seviyede sağlanmış oluyor*/
        for (int i = 0; i < pointList.size()-1; i++) {
            g2.drawLine(pointList.get(i).x, pointList.get(i).y, pointList.get(i+1).x, pointList.get(i+1).y);
        }        
    }
}
