package arbolbinario;

import javax.swing.JOptionPane;

public class ArbolBinario {
    public static void main(String[] args) {
        int opcion = 0, elemento;
        ArbolB arbol = new ArbolB();
        String nulo = null;
        do{
           // try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Elige Opción\n"
                            + "1. Agregar Nodo\n"
                            + "2. Tamaño del Arbol\n"
                            + "3. Buscar nodo\n"
                            + "4. Mostrar Arbol InOrden\n"
                            + "5. Mostrar Arbol Preorden\n"         
                            + "6. Mostrar Arbol Posorden\n"
                            + "7. Promedio del arbol\n"
                            + "8. Número de hijos\n"
                            + "9. Buscar nodo padre\n"
                            + "10. Salir \n", "Arbol Binario"                        
                              , JOptionPane.QUESTION_MESSAGE));

                switch (opcion){
                    case 1:
                        do{
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el valor del nodo. \n "
                              + "Para salir, digite 999", "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        if(elemento !=999){
                            arbol.agregarNodo(elemento);
                        }
                        }while(elemento !=999);
                        break;
                    case 2:
                        elemento = arbol.tamaño();
                        JOptionPane.showMessageDialog(null, "El tamaño del arbo es: "+ elemento +" nodos", "Tamaño", JOptionPane.INFORMATION_MESSAGE);                            
                        //System.out.println("El tamaño del arbo es: "+arbol.tamaño());
                        break;
                    case 3:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el nodo a buscar: ", "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));
                        if(arbol.busca(elemento)==true){
                            JOptionPane.showMessageDialog(null, "El nodo con valor de "+ elemento +" fue encontrado.", "Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "El nodo con valor de "+ elemento +" no fue encontrado.", "No encontrado", JOptionPane.INFORMATION_MESSAGE);
                        }               
                        break;
                    case 4:
                        //elemento = arbol.inorden();
                        JOptionPane.showMessageDialog(null, "El recorrido InOrden es: \n"+ arbol.inorden(), "InOrden", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El recorrido PreOrden es: \n"+ arbol.preorden(), "PreOrden", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "El recorrido PosOrden es: \n"+ arbol.posorden(), "PosOrden", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "El promedio del arbol es: \n"+ arbol.promedio(), "PosOrden", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 8:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Cuanto hijos tiene el nodo: ", "Buscando Nodos Hijos", JOptionPane.QUESTION_MESSAGE));
                        elemento = arbol.buscarHijos(elemento);
                        JOptionPane.showMessageDialog(null, "El tamaño de hijos es: "
                                + elemento +" hijos", "Hijos", JOptionPane.INFORMATION_MESSAGE);                        
                        break;
                    case 9:
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingresa el nodo a buscar: ", "Buscando Nodo", JOptionPane.QUESTION_MESSAGE));
                        
                        JOptionPane.showMessageDialog(null, "El nodo padre es "+ arbol.nodoPadre(elemento) +" fue encontrado.", "Encontrado", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 10:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Incorrecta", "Intentar de nuevo", JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            //}catch(NumberFormatException n){JOptionPane.showMessageDialog(null, "error "+n.getMessage());}
        }while(opcion !=10);
        
    }
    
}
