import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird implements ActionListener, MouseListener, KeyListener {

    public static FlappyBird flappyBird;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public Rectangle bird;

    public ArrayList<Rectangle> columns;

    public int ticks, score, highScore;
    
    public double yMotion, birdY;

    public boolean gameOver, started, flash;

    public Random rand;

    public FlappyBird() {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(7, this);

        renderer = new Renderer();
        rand = new Random();

        jframe.add(renderer);
        jframe.setTitle("Flappy Bird");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.addMouseListener(this);
        jframe.addKeyListener(this);
        jframe.setResizable(false);
        jframe.setVisible(true);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 24, 24);
        birdY = bird.y;
        columns = new ArrayList<Rectangle>();

        addColumn(true);
        addColumn(true);
        addColumn(true);
        addColumn(true);

        timer.start();
    }

    public void addColumn(boolean start) {
        int space = 280;
        int width = 100;
        int height = 50 + rand.nextInt(300);

        if (start) {
            columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
        } else {
            columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
        }
    }

    public void paintColumn(Graphics g, Rectangle column) {
        g.setColor(new Color(34, 139, 34)); // Forest Green
        g.fillRect(column.x, column.y, column.width, column.height);
        g.setColor(Color.BLACK);
        g.drawRect(column.x, column.y, column.width, column.height);
    }

    public void jump() {
        if (gameOver) {
            if (ticks > 40) { 
                bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 24, 24);
                birdY = bird.y;
                columns.clear();
                yMotion = 0;
                score = 0;
                ticks = 0;
                flash = false;

                addColumn(true);
                addColumn(true);
                addColumn(true);
                addColumn(true);

                gameOver = false;
            }
        }

        if (!started) {
            started = true;
            ticks = 0;
        } else if (!gameOver) {
            yMotion = -5.8;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double speed = 4.2;

        if (started && !gameOver) {
            ticks++;
            for (int i = 0; i < columns.size(); i++) {
                Rectangle column = columns.get(i);
                column.x -= (int)speed;
            }

            yMotion += 0.22; 
            
            if (yMotion > 12) {
                yMotion = 12;
            }

            for (int i = 0; i < columns.size(); i++) {
                Rectangle column = columns.get(i);
                if (column.x + column.width < 0) {
                    columns.remove(column);
                    if (column.y == 0) {
                        addColumn(false);
                    }
                }
            }

            birdY += yMotion;
            bird.y = (int) birdY;

            for (Rectangle column : columns) {
                if (column.y == 0 && bird.x + bird.width / 2 > column.x + column.width / 2 - 5 && bird.x + bird.width / 2 < column.x + column.width / 2 + 5) {
                    score++;
                    if (score > highScore) {
                        highScore = score;
                    }
                }

                if (column.intersects(bird)) {
                    triggerGameOver();
                    bird.x = column.x - bird.width;
                }
            }

            if (bird.y > HEIGHT - 120 - bird.height || bird.y < 0) {
                triggerGameOver();
            }
        } else if (gameOver) {
            ticks++;
        }

        renderer.repaint();
    }

    private void triggerGameOver() {
        if (!gameOver) {
            gameOver = true;
            flash = true;
            ticks = 0;
        }
    }

    public void repaint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Sky
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // Columns
        for (Rectangle column : columns) {
            paintColumn(g, column);
        }

        // Ground
        g.setColor(new Color(222, 184, 135)); // Sand
        g.fillRect(0, HEIGHT - 120, WIDTH, 120);
        g.setColor(new Color(34, 139, 34)); // Grass
        g.fillRect(0, HEIGHT - 120, WIDTH, 20);

        // Bird
        g.setColor(Color.YELLOW);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);
        g.setColor(Color.BLACK);
        g.drawRect(bird.x, bird.y, bird.width, bird.height);
        // Eye
        g.setColor(Color.WHITE);
        g.fillRect(bird.x + 14, bird.y + 4, 6, 6);
        g.setColor(Color.BLACK);
        g.fillRect(bird.x + 18, bird.y + 6, 2, 2);

        // Dim background on game over
        if (gameOver) {
            g.setColor(new Color(0, 0, 0, 150));
            g.fillRect(0, 0, WIDTH, HEIGHT);
        }

        // UI Text
        g.setColor(Color.WHITE);
        
        if (!started) {
            drawCenteredString(g, "FLAPPY BIRD", new Font("Arial", Font.BOLD, 80), HEIGHT / 2 - 150);
            drawCenteredString(g, "Press Space to Start", new Font("Arial", Font.BOLD, 30), HEIGHT / 2);
        }

        if (gameOver) {
            drawCenteredString(g, "RUN OVER", new Font("Arial", Font.BOLD, 90), HEIGHT / 2 - 120);
            drawCenteredString(g, "Score: " + score, new Font("Arial", Font.BOLD, 40), HEIGHT / 2 - 20);
            drawCenteredString(g, "Best: " + highScore, new Font("Arial", Font.BOLD, 40), HEIGHT / 2 + 30);
            
            if (ticks > 40) {
                g.setColor(new Color(255, 255, 255, Math.min(255, (ticks - 40) * 5)));
                drawCenteredString(g, "Press Space to Try Again", new Font("Arial", Font.BOLD, 25), HEIGHT / 2 + 120);
            }
        }

        if (!gameOver && started) {
            g.setFont(new Font("Arial", Font.BOLD, 80));
            String s = String.valueOf(score);
            g.drawString(s, WIDTH / 2 - g.getFontMetrics().stringWidth(s) / 2, 100);
        }

        // Flash Effect
        if (flash && ticks < 10) {
            g.setColor(new Color(255, 255, 255, 200));
            g.fillRect(0, 0, WIDTH, HEIGHT);
        }
    }

    private void drawCenteredString(Graphics g, String text, Font font, int y) {
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        int x = (WIDTH - fm.stringWidth(text)) / 2;
        g.drawString(text, x, y);
    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        jump();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            jump();
        }
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    class Renderer extends JPanel {
        private static final long serialVersionUID = 1L;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            FlappyBird.flappyBird.repaint(g);
        }
    }
}
