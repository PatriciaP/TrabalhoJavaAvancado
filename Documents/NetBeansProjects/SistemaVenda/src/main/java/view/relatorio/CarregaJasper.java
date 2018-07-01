package view.relatorio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Patricia Pieroni
 */
public class CarregaJasper {

    static Connection connection = null;

    
    public void generateSubReport(String reportName,String report) throws IOException{
         try {
            Map<String, Object> parameters = new HashMap<>();
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sistema_venda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

            // compiles jrxml
            JasperCompileManager.compileReportToFile(
                    new File("src/main/resources/relatorios/" + reportName + ".jrxml").getAbsolutePath());
            
            System.out.println("filling");

            // fills compiled report with parameters and a connection
            JasperPrint print = JasperFillManager.fillReport(
                    new File("src/main/resources/relatorios/" + reportName + ".jasper").getAbsolutePath(), parameters, connection);
            System.out.println(print);

             generateReport(report);

        } catch (SQLException | JRException e) {
            throw new RuntimeException("It's not possible to generate the pdf report.", e);
        } finally {
            // it's your responsibility to close the connection, don't forget it!
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }
        
    }

    public void generateReport(String reportName) throws IOException {
        try {
            Map<String, Object> parameters = new HashMap<>();
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sistema_venda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");

            // compiles jrxml
            JasperCompileManager.compileReportToFile(
                    new File("src/main/resources/relatorios/" + reportName + ".jrxml").getAbsolutePath());
            
            System.out.println("filling");

            // fills compiled report with parameters and a connection
            JasperPrint print = JasperFillManager.fillReport(
                    new File("src/main/resources/relatorios/" + reportName + ".jasper").getAbsolutePath(), parameters, connection);
            System.out.println(print);

            // exports report to pdf
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, new File("src/main/resources/relatorios/" + reportName + ".pdf").getAbsolutePath());
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
            exporter.exportReport();

            openPDF(new File("src/main/resources/relatorios/" + reportName + ".pdf").getAbsolutePath());

        } catch (SQLException | JRException e) {
            throw new RuntimeException("It's not possible to generate the pdf report.", e);
        } finally {
            // it's your responsibility to close the connection, don't forget it!
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                }
            }
        }

    }

    private void openPDF(String name) {
        File pdf = new File(name);
        try {
            Desktop.getDesktop().open(pdf);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
        }
    }

    public static void openReport(
            String titulo,
            InputStream inputStream,
            Map parametros,
            Connection conexao) throws JRException {

        /*
         * Cria um JasperPrint, que é a versão preenchida do relatório,
         * usando uma conexão.
         */
        JasperPrint print = JasperFillManager.fillReport(
                inputStream, parametros, conexao);

        // abre o JasperPrint em um JFrame
        viewReportFrame(titulo, print);

    }

    public void abrirRelatorio() {
        InputStream inputStream = getClass().getResourceAsStream("/Clientes.jasper");

        // mapa de parâmetros do relatório (ainda vamos aprender a usar)
        Map parametros = new HashMap();

        try {

            // abre o relatório
            openReport("Clientes", inputStream, parametros,
                    connection);

        } catch (JRException exc) {
            exc.printStackTrace();
        }
    }

    private static void viewReportFrame(String titulo, JasperPrint print) {

        /*
         * Cria um JRViewer para exibir o relatório.
         * Um JRViewer é uma JPanel.
         */
        JRViewer viewer = new JRViewer(print);

        // cria o JFrame
        JFrame frameRelatorio = new JFrame(titulo);

        // adiciona o JRViewer no JFrame
        frameRelatorio.add(viewer, BorderLayout.CENTER);

        // configura o tamanho padrão do JFrame
        frameRelatorio.setSize(500, 500);

        // maximiza o JFrame para ocupar a tela toda.
        frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // configura a operação padrão quando o JFrame for fechado.
        frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // exibe o JFrame
        frameRelatorio.setVisible(true);

    }

}
