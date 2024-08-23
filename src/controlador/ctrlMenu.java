
package controlador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.Menu;
import vista.frmMenú;


public class ctrlMenu implements MouseListener, KeyListener {
    
    //1- Mandar a llamar a las otras dos capas (modelo, vista)
    private Menu modeloMenu;
    private frmMenú vistaMenu;
    
    
    
    //2- crear el constructor de la clase
    public ctrlMenu(Menu ModeloQuePido, frmMenú vistaQuepido){
        this.modeloMenu = ModeloQuePido;
        this.vistaMenu = vistaQuepido;
        
        //siempre poner todos los botones que vamos ocupar
        vistaQuepido.btnGuardar.addMouseListener(this);
        vistaQuepido.jtbMenu.addMouseListener(this);
        vistaQuepido.btnEliminar.addMouseListener(this);
        vistaQuepido.btnActualizar.addMouseListener(this);
        
        
        modeloMenu.Mostrar(vistaMenu.jtbMenu);
        
    }
    
    

    
    @Override
    public void mouseClicked(MouseEvent e) {
        
               if(e.getSource() == vistaMenu.btnGuardar)
               {
            
        modeloMenu.setNombre(vistaMenu.txtNombre.getText());
        modeloMenu.setPrecio(Double.parseDouble(vistaMenu.txtPrecio.getText()));
        modeloMenu.setIngredientes(vistaMenu.txtIngredientes.getText());
        
        modeloMenu.Guardar();
        modeloMenu.Mostrar(vistaMenu.jtMenu);
        
    }
               if(e.getSource() == vistaMenu.btnEliminar)
               {
      System.out.println("se dio click a eliminar");
      modeloMenu.Eliminar(vistaMenu.jtbMenu);
      modeloMenu.Mostrar(vistaMenu.jtbMenu);
        
        
               }
               
               if(e.getSource() == vistaMenu.jtbMenu)
               {
                   modeloMenu.cargarDatosTabla(vistaMenu);
               }
               
               if(e.getSource() == vistaMenu.btnActualizar){
                   modeloMenu.setNombre(vistaMenu.txtNombre.getText());
                   modeloMenu.setPrecio(Double.parseDouble(vistaMenu.txtPrecio.getText()));
                   modeloMenu.setIngredientes(vistaMenu.txtIngredientes.getText());
                   
                   modeloMenu.Actualizar(vistaMenu.jtbMenu);
                   modeloMenu.Mostrar(vistaMenu.jtbMenu);
               }


    
}

    @Override
    public void mousePressed(MouseEvent e) {
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

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}