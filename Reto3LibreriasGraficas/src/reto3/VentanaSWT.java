package reto3;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;

public class VentanaSWT {

    public static void main(String[] args) {

        Display display = new Display();
        Shell shell = new Shell(display);

        shell.setText("Ejemplo SWT");
        shell.setSize(400, 250);
        shell.setLayout(null);

        Label lbl = new Label(shell, SWT.NONE);
        lbl.setText("Nombre:");
        lbl.setBounds(20, 20, 80, 25);

        Text txt = new Text(shell, SWT.BORDER);
        txt.setBounds(100, 20, 150, 25);

        Button btn = new Button(shell, SWT.PUSH);
        btn.setText("Aceptar");
        btn.setBounds(270, 20, 80, 25);

        Button chk = new Button(shell, SWT.CHECK);
        chk.setText("Opción 1");
        chk.setBounds(20, 70, 100, 25);

        Combo combo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        combo.setBounds(140, 70, 100, 25);
        combo.setItems(new String[] {"Uno", "Dos", "Tres"});
        combo.select(0);

        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }

        display.dispose();
    }
}