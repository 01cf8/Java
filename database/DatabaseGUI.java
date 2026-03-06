package database;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class DatabaseGUI extends JFrame {
    private static final String FILE_NAME = "database/data.csv";
    private static final String DELIMITER = ",";
    private static final String HEADER = "Name,Age,Email";

    // Dark Theme Colors
    private static final Color BG_DARK = new Color(30, 30, 30);
    private static final Color BG_LIGHTER = new Color(45, 45, 45);
    private static final Color TEXT_LIGHT = new Color(220, 220, 220);
    private static final Color ACCENT_COLOR = new Color(70, 130, 180); // Steel Blue

    private JTextField nameField, ageField, emailField, searchField;
    private JTable dataTable;
    private DefaultTableModel tableModel;

    public DatabaseGUI() {
        setTitle("Java Database");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        getContentPane().setBackground(BG_DARK);
        setLayout(new BorderLayout(15, 15));

        ensureFileExists();
        applyGlobalStyles();

        // --- Input Panel (Top) ---
        JPanel inputPanel = createStyledPanel("Add New Record");
        inputPanel.setLayout(new GridLayout(2, 3, 15, 8));

        inputPanel.add(createStyledLabel("Name:"));
        inputPanel.add(createStyledLabel("Age:"));
        inputPanel.add(createStyledLabel("Email:"));

        nameField = createStyledTextField();
        ageField = createStyledTextField();
        emailField = createStyledTextField();

        inputPanel.add(nameField);
        inputPanel.add(ageField);
        inputPanel.add(emailField);

        // --- Table Panel (Center) ---
        setupTable();
        JScrollPane scrollPane = new JScrollPane(dataTable);
        scrollPane.getViewport().setBackground(BG_DARK);
        scrollPane.setBorder(BorderFactory.createLineBorder(BG_LIGHTER, 1));

        // --- Control Panel (Bottom) ---
        JPanel controlPanel = new JPanel(new BorderLayout(20, 0));
        controlPanel.setBackground(BG_DARK);
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        buttonPanel.setBackground(BG_DARK);
        JButton addButton = createStyledButton("Add Record", true);
        JButton refreshButton = createStyledButton("Refresh", false);
        buttonPanel.add(addButton);
        buttonPanel.add(refreshButton);

        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        searchPanel.setBackground(BG_DARK);
        searchPanel.add(createStyledLabel("Search Name:"));
        searchField = createStyledTextField();
        searchField.setPreferredSize(new Dimension(200, 30));
        searchPanel.add(searchField);

        controlPanel.add(buttonPanel, BorderLayout.WEST);
        controlPanel.add(searchPanel, BorderLayout.EAST);

        // Padding Wrapper
        JPanel mainWrapper = new JPanel(new BorderLayout(10, 10));
        mainWrapper.setBackground(BG_DARK);
        mainWrapper.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainWrapper.add(inputPanel, BorderLayout.NORTH);
        mainWrapper.add(scrollPane, BorderLayout.CENTER);
        mainWrapper.add(controlPanel, BorderLayout.SOUTH);

        add(mainWrapper);

        // --- Event Listeners ---
        addButton.addActionListener(e -> addRecord());
        refreshButton.addActionListener(e -> loadData());
        
        searchField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                searchRecord(searchField.getText().toLowerCase().trim());
            }
        });

        loadData();
    }

    private void applyGlobalStyles() {
        UIManager.put("OptionPane.background", BG_DARK);
        UIManager.put("OptionPane.messageForeground", TEXT_LIGHT);
        UIManager.put("Panel.background", BG_DARK);
    }

    private JPanel createStyledPanel(String title) {
        JPanel panel = new JPanel();
        panel.setBackground(BG_DARK);
        TitledBorder border = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(BG_LIGHTER), title);
        border.setTitleColor(ACCENT_COLOR);
        panel.setBorder(border);
        return panel;
    }

    private JLabel createStyledLabel(String text) {
        JLabel label = new JLabel(text);
        label.setForeground(TEXT_LIGHT);
        return label;
    }

    private JTextField createStyledTextField() {
        JTextField field = new JTextField();
        field.setBackground(BG_LIGHTER);
        field.setForeground(Color.WHITE);
        field.setCaretColor(Color.WHITE);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(60, 60, 60)),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        return field;
    }

    private JButton createStyledButton(String text, boolean primary) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        btn.setBackground(primary ? ACCENT_COLOR : BG_LIGHTER);
        btn.setForeground(Color.WHITE);
        btn.setBorder(BorderFactory.createEmptyBorder(8, 15, 8, 15));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return btn;
    }

    private void setupTable() {
        String[] columns = {"Name", "Age", "Email"};
        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };
        dataTable = new JTable(tableModel);
        
        dataTable.setBackground(BG_DARK);
        dataTable.setForeground(TEXT_LIGHT);
        dataTable.setGridColor(BG_LIGHTER);
        dataTable.setRowHeight(30);
        dataTable.setSelectionBackground(new Color(60, 60, 60));
        dataTable.setSelectionForeground(Color.WHITE);
        dataTable.setIntercellSpacing(new Dimension(10, 5));

        JTableHeader header = dataTable.getTableHeader();
        header.setBackground(BG_LIGHTER);
        header.setForeground(ACCENT_COLOR);
        header.setFont(new Font("SansSerif", Font.BOLD, 12));
        header.setBorder(BorderFactory.createLineBorder(BG_DARK));
    }

    private void ensureFileExists() {
        try {
            File dir = new File("database");
            if (!dir.exists()) dir.mkdir();
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
                    writer.println(HEADER);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadData() {
        tableModel.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase(HEADER) || line.trim().isEmpty()) continue;
                tableModel.addRow(line.split(DELIMITER));
            }
        } catch (IOException e) {
            System.err.println("Load error: " + e.getMessage());
        }
    }

    private void addRecord() {
        String name = nameField.getText().trim();
        String age = ageField.getText().trim();
        String email = emailField.getText().trim();

        if (name.isEmpty() || age.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             PrintWriter out = new PrintWriter(new BufferedWriter(fw))) {
            out.println(name + DELIMITER + age + DELIMITER + email);
            tableModel.addRow(new String[]{name, age, email});
            nameField.setText(""); ageField.setText(""); emailField.setText("");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void searchRecord(String query) {
        if (query.isEmpty()) { loadData(); return; }
        tableModel.setRowCount(0);
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Check if the line is a header or matches the query
                if (line.equalsIgnoreCase(HEADER) || line.trim().isEmpty()) continue;
                if (line.toLowerCase().contains(query)) {
                    tableModel.addRow(line.split(DELIMITER));
                }
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            new DatabaseGUI().setVisible(true);
        });
    }
}
