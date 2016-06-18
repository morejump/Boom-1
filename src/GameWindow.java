import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by admin on 6/11/2016.
 */
public class GameWindow extends Frame implements Runnable {

//    Image background;
   BufferedImage bufferedImage;

//    ArrayList<ExplosiveBarrier> explosiveBarriers;
//    ArrayList<NonExplovsiveBarrier> nonExplovsiveBarriers;
//    Player player;
//    Pirate pirate;
//    long startTime;
//    long startTime01;
//    int count = 0;

    public GameWindow() {// constructor
        this.setSize(750, 650);
        this.setTitle("Boom-Techkids");
        this.setVisible(true);
        MenuScreen menuScreen = new MenuScreen();
        menuScreen.setFrame(this);
        GameManager.getInstance().getStackScreen().push(menuScreen);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });// closing window
//        pirate = new Pirate(400, 500, "haitac");
//        player = new Player(500, 400, "player");
//        explosiveBarriers = new ArrayList<ExplosiveBarrier>();
//        nonExplovsiveBarriers = new ArrayList<NonExplovsiveBarrier>();
//
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 25, "HoNuoc"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 84, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 200, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 300, "CayDua"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 500, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(38, 500, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(38, 559, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(0, 257, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(200, 25, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(238, 25, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(278, 25, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 25, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 82, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(520, 25, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 25, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(340, 388, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(660, 570, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 512, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 300, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 357, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 432, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(700, 512, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 150, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 512, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 400, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 300, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(560, 350, "HoNuoc"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(600, 600, "House01"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(600, 640, "CaySuongRong"));
//        nonExplovsiveBarriers.add(new NonExplovsiveBarrier(600, 680, "House01"));
//
//        explosiveBarriers.add(new ExplosiveBarrier(38, 84, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 400, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 444, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(40, 444, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 650, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(0, 580, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(276, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 139, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 189, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(440, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(480, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(598, 25, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(300, 300, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(340, 300, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(340, 344, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 600, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 556, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 536, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 306, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 400, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(300, 556, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(300, 500, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 600, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 644, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(400, 688, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(440, 644, "Gach"));
//        explosiveBarriers.add(new ExplosiveBarrier(700, 489, "Gach"));
        this.addMouseListener(new MouseListener() {
            @Override

            public void mouseClicked(MouseEvent e) {

                Rectangle rectangle = new Rectangle(150, 500, 167, 54);
                Point p = new Point(e.getX(), e.getY());
                Rectangle rectangle1 = new Rectangle(400, 500, 167, 54);

                if (rectangle.contains(p)) {
                    // chuyen sang man hinh huong dan
                    menuScreen.pressM();
                }
                if (rectangle1.contains(p)) {
                    // chuyen sang man hinh choi
                    menuScreen.pressN();
                }

            }


            @Override
            public void mousePressed(MouseEvent e) {
//                if(e.getButton() == MouseEvent.BUTTON1)
//                {
//                    x =(int) e.getPoint().getX();
//                    y = (int) e.getPoint().getY();
//                    player2.move(x,y);
//                }
//                else if(e.getButton() == MouseEvent.BUTTON3)
//                {
//                    ((PlaneSupport)player2).m++;
//                    if(((PlaneSupport)player2).m>50)((PlaneSupport)player2).m=1;
//                    ((PlaneSupport)player2).mypaste[((PlaneSupport)player2).m] = new paste(player2.positionx,player2.positiony);
//                    ((PlaneSupport)player2).mypaste[((PlaneSupport)player2).m].shot=true;
//                    if(((PlaneSupport)player2).m>((PlaneSupport)player2).n)((PlaneSupport)player2).n=((PlaneSupport)player2).m;
//                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        this.addKeyListener(new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_B){
                GameManager.getInstance().getStackScreen().pop();
            } else if (e.getKeyCode() == KeyEvent.VK_N) {
                GameManager.getInstance().getStackScreen().peek().pressN();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    });

//        this.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                //vua an phim
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//                //phim duoc an va giu
//                switch (e.getKeyCode()) {
//                    case KeyEvent.VK_UP:
//                        player.vector = 1;
//
//                        player.speedY = -5;
//
//
//                        break;
//                    case KeyEvent.VK_LEFT:
//                        player.vector = 4;
//
//                        player.speedX = -5;
//
//                        break;
//                    case KeyEvent.VK_DOWN:
//                        player.vector = 3;
//
//                        player.speedY = 5;
//
//
//                        break;
//                    case KeyEvent.VK_RIGHT:
//                        player.vector = 2;
//
//                        player.speedX = 5;
//
//
//                        break;
//                    case KeyEvent.VK_SPACE:
//                        if (player.boomPlayers.size() == 0) {
//                            startTime = System.currentTimeMillis();// starting count time here form time of droping bomb
//                            startTime01 = System.currentTimeMillis();
//                            BoomPlayer boomPlayer = player.dropBoom();
//                            for (ExplosiveBarrier explosiveBarrier : explosiveBarriers) {
//                                if (getDistance(explosiveBarrier.positionX + 45, explosiveBarrier.positionY + 45, boomPlayer.positionX + 45, boomPlayer.positionY + 45) <= 120) {
//                                    boomPlayer.register(explosiveBarrier);// checking a distance before register
//
//                                }
//                            }
//                        }
//                        break;
//                }
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//                player.speedX = 0;
//                player.speedY = 0;
//            }
//        });// catch key and move
//        try {
//            background = ImageIO.read(new File("Resources/Background.png"));// set background
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

//    public int testMove() {
//        Rectangle myPlay = new Rectangle(player.positionX+10, player.positionY+40, player.image1.getWidth(), player.image1.getHeight()+20);
//        for (int i = 0; i < explosiveBarriers.size(); i++) {
//            Rectangle myTree = new Rectangle(explosiveBarriers.get(i).positionX, explosiveBarriers.get(i).positionY, explosiveBarriers.get(i).image.getWidth(), explosiveBarriers.get(i).image.getHeight());
//            if (myPlay.intersects(myTree)) {
//                System.out.println("cham");
//                if (player.positionX+10 <= explosiveBarriers.get(i).positionX && player.vector == 2) {
//                    player.positionX -= 1;
//                    System.out.println("2");
//                    return 2;
//                }
//                if (player.positionX+10 >= explosiveBarriers.get(i).positionX && player.vector == 4) {
//                    player.positionX += 1;
//                    System.out.println("4");
//                    return 4;
//                }
//                if ( player.positionY+40 <= explosiveBarriers.get(i).positionY && player.vector == 3) {
//                    player.positionY -= 1;
//                    System.out.println("3");
//                    return 3;
//                }
//                if ( player.positionY+40 >= explosiveBarriers.get(i).positionY && player.vector == 1) {
//                    player.positionY += 1;
//                    System.out.println("1");
//                    return 1;
//                }
//            }
//        }
//        for (int i = 0; i < nonExplovsiveBarriers.size(); i++) {
//            Rectangle myTree = new Rectangle(nonExplovsiveBarriers.get(i).positionX, nonExplovsiveBarriers.get(i).positionY, nonExplovsiveBarriers.get(i).image.getWidth(), nonExplovsiveBarriers.get(i).image.getHeight());
//            if (myPlay.intersects(myTree)) {
//                System.out.println("cham");
//                if (player.positionX+10 <= nonExplovsiveBarriers.get(i).positionX && player.vector == 2) {
//                    player.positionX -= 1;
//                    System.out.println("2");
//                    return 2;
//                }
//                if (player.positionX+10 >= nonExplovsiveBarriers.get(i).positionX && player.vector == 4) {
//                    player.positionX += 1;
//                    System.out.println("4");
//                    return 4;
//                }
//                if ( player.positionY+40 <= nonExplovsiveBarriers.get(i).positionY && player.vector == 3) {
//                    player.positionY -= 1;
//                    System.out.println("3");
//                    return 3;
//                }
//                if ( player.positionY+40 >= nonExplovsiveBarriers.get(i).positionY && player.vector == 1) {
//                    player.positionY += 1;
//                    System.out.println("1");
//                    return 1;
//                }
//            }
//        }
//        if (player.positionX >= 690) player.positionX = 690;
//        if (player.positionX <= 0) player.positionX = 0;
//        if (player.positionY >= 560) player.positionY = 560;
//        if (player.positionY <= 0) player.positionY = 0;
//
//        return 0;
//    }

    public void gameUpdate() throws InterruptedException {


        GameManager.getInstance().getStackScreen().peek().update();
//        if (testMove() != player.vector)
//            player.update();
//        pirate.update();
//        if (System.currentTimeMillis() - startTime >= 2000) {// calcuting time to explosive bomb here :))
//            for (BoomPlayer boomPlayer1 : player.boomPlayers) {
//                try {
//                    boomPlayer1.notifyBarrier(0, 0);
//
//                } catch (IOException e1) {
//                    e1.printStackTrace();
//                } catch (InterruptedException e1) {
//                    e1.printStackTrace();
//                }
//            }
//            player.boomPlayers.clear();// after explosiving barrier, then delete remove all bomb from arraylist :)
//        }

    }

    @Override
    public void update(Graphics g) {
//        g.clearRect(0,0,800,600);

//        count++;
        if (bufferedImage == null) {
            bufferedImage = new BufferedImage(750, 650, 1);
        }
        Graphics bufferedGraphics = bufferedImage.getGraphics();
        GameManager.getInstance().getStackScreen().peek().draw(bufferedGraphics);


        g.drawImage(bufferedImage,0,0,null);
//        bufferedGraphics.drawImage(background, 0, 0, null);
//
//        pirate.draw(bufferedGraphics);
//        for (ExplosiveBarrier explosiveBarrier : explosiveBarriers) {
//            if (explosiveBarrier.isLive == true)
//                explosiveBarrier.draw(bufferedGraphics);// draw
//            if (explosiveBarrier.isLive == false) {
//                if (System.currentTimeMillis() - startTime01 <= 4000) {
//                    explosiveBarrier.draw(bufferedGraphics);
//                } else {
//                    explosiveBarriers.remove(explosiveBarrier);
////                    count=0;
//                }
//            }
//
//        }
//        for (NonExplovsiveBarrier nonExplovsiveBarrier : nonExplovsiveBarriers) {
//            nonExplovsiveBarrier.draw(bufferedGraphics);
//        }
//        player.draw(bufferedGraphics);
//        g.drawImage(bufferedImage, 0, 0, null);
    }

    @Override
    public void run() {
        while (true) {
            try {

                Thread.sleep(17);
                gameUpdate();
                repaint();// this method will invoke update method above which is overided
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


//    public double getDistance(int x1, int y1, int x2, int y2) {
//        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//    }
}

