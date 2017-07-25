/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmathml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.HTMLEditor;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 *
 * @author scientificware2015
 */
public class JavaFXMathML extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Guy Abossolo Foh 5 mai 2016 - JavaFX et MathML");
        primaryStage.setWidth(400);
        primaryStage.setHeight(500);
        
        final HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setHtmlText(content);

        primaryStage.setScene(new Scene(htmlEditor));        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    WebView webview = new WebView();
        
    String javaversion =  "Version de Java.. : " + System.getProperty("java.runtime.version");
    String javafxversion ="Version de JavaFX : " + System.getProperty("javafx.runtime.version");
    String osinfo =       "OS .............. : " + System.getProperty("os.name") + ", " + System.getProperty("os.arch");
    String agent =        "User Agent ...... : " + webview.getEngine().getUserAgent();
    
    String content = "<!doctype html>"
            + "<html>"
            + "   <head>"
            + "      <meta charset=\"UTF-8\">"
            + "      <title>Petite démonstration de JavaFW et MathML.</title>"
            + "   </head>"
            + "   <body>"
            + "      <p>"
            + "         Ce texte comprenant du code MathML est affiché avec l'éditeur HTML de JavaFX"
            + "      </p>"
            + "      <p>"
            + "         <math>"
            + "            <mrow>"
            + "               <msup><mi>a</mi><mn>2</mn></msup>"
            + "               <mo>+</mo>"
            + "               <msup><mi>b</mi><mn>2</mn></msup>"
            + "               <mo>=</mo>"
            + "               <msup><mi>c</mi><mn>2</mn></msup>"
            + "            </mrow>"
            + "         </math>"
            + "      </p>"
            + "      <p>"
            + "         <math>"
            + "	       <mrow>"
            + "               <mfrac>"
            + "    	            <mrow> <mi>x</mi><mo>+</mo><mn>2</mn></mrow>"
            + "    	            <mrow><mn>3</mn></mrow>"
            + "               </mfrac>"
            + "            </mrow>"
            + "         </math>"
            + "      </p>"
            + "      <p>"
            + "         <math>"
            + "	       <mrow>"
            + "               <mfrac>"
            + "    	            <mn>2</mn>"
            + "    	            <mn>3</mn>"
            + "               </mfrac>"
            + "            </mrow>"
            + "         </math>"
            + "      </p>"
            + "      <p>"
            + "         <math>"
            + "	       <mrow>"
            + "               <mroot>"
            + "    	            <mn>16</mn>"
            + "               </mroot>"
            + "            </mrow>"
            + "         </math>"
            + "      </p>"
            + "      <p>"
            + "         <math>"
            + "            <mrow>"
            + "              <mi>A</mi>"
            + "              <mo>=</mo>"
            + "              <mfenced open=\"[\" close=\"]\">"
            + "                 <mtable>"
            + "                    <mtr>"
            + "                       <mtd><mi>x</mi></mtd>"
            + "                       <mtd><mi>y</mi></mtd>"
            + "                    </mtr>"
            + "                    <mtr>"
            + "                       <mtd><mi>z</mi></mtd>"
            + "                       <mtd><mi>w</mi></mtd>"
            + "                    </mtr>"
            + "                 </mtable>"
            + "              </mfenced>"
            + "            </mrow>"
            + "          </math>"
            + "      </p>"
            + "      <ul>"
            + "         <li>"+javaversion+"</li>"
            + "         <li>"+javafxversion+"</li>"
            + "         <li>"+osinfo+"</li>"
            + "         <li>"+agent+"</li>"
            + "      </ul>"
            + "   </body>"
            + "</html> ";

}
