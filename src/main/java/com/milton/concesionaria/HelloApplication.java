package com.milton.concesionaria;

import com.milton.concesionaria.controllers.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class HelloApplication extends Application {

    private Stage stageRoot;

    @Override
    public void start(Stage stage) throws IOException {
        stageRoot = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root);
        if (BootstrapFX.bootstrapFXStylesheet() != null) {
            scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());
        }

        stage.setTitle("NameApplication - Home");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

        MenuController controller = fxmlLoader.getController();
        controller.setMainApplication(this);
    }

    public Stage getStageRoot() {
        return stageRoot;
    }

    public void openEmployeeWindow() {
        newStage("menuGerente-view", "MenuGerente");
        closeCurrentStage();
    }

    public void openManagerMenu() {
        openMenu("menuVendedor-view", "MenuVendedor");
        closeCurrentStage();
    }

    public static void newStage(String fxml, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
            Parent root = loader.load();

            Stage stageView = new Stage();
            stageView.setTitle(title);
            stageView.setScene(new Scene(root));
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void openMenu(String fxml, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
            Parent root = loader.load();

            Stage stageView = new Stage();
            stageView.setTitle(title);
            stageView.setScene(new Scene(root));
            stageView.initModality(Modality.APPLICATION_MODAL);
            stageView.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    private void closeCurrentStage() {
        stageRoot.close();
    }

    public static void main(String[] args) {
        launch();
    }
}

        /*
            Scanner keyboard = new Scanner(System.in);
            Gerente gerente = new Gerente();
            Vendedor vendedor = new Vendedor();
            Automovil car = new Automovil();
            Administracion admon = new Administracion();
            boolean bandera = true;

            System.out.println("Introduce el nombre del gerente:");
            gerente.setNombre(keyboard.nextLine());
            System.out.println("Introduce el Apellido del Gerente:");
            gerente.setApellido(keyboard.nextLine());
            UUID uuid = UUID.randomUUID();
            gerente.setUuid(UUID.fromString(uuid.toString()));
            System.out.println("El Id del gerente es: " + gerente.getUuid());

            do {
                System.out.println("Bienvenido");
                System.out.println("¿Quién eres?");
                System.out.println("1.- Gerente");
                System.out.println("2.- Vendedor");
                int opc = keyboard.nextInt();
                keyboard.nextLine();

                switch (opc) {
                    case 1:
                        System.out.println("Bienvenido: " + gerente.getNombre() + " " + gerente.getApellido());
                        System.out.println("¿Qué desea hacer hoy?");
                        System.out.println("1.- Agregar nuevos automóviles.");
                        System.out.println("2.- Agregar Vendedor");
                        System.out.println("3.- Ver carros");
                        System.out.println("4.- Modificar datos de un vehículo:");
                        int opc1 = keyboard.nextInt();
                        keyboard.nextLine();

                        switch (opc1) {
                            case 1:
                                System.out.println("¿Qué tipo de auto es?");
                                System.out.println("1.- Sedan");
                                System.out.println("2.- Deportivo");
                                System.out.println("3.- Camioneta");
                                int respuesta1 = keyboard.nextInt();
                                keyboard.nextLine();

                                switch (respuesta1) {
                                    case 1:
                                        System.out.println("Introduzca el Modelo");
                                        String modelo = keyboard.nextLine();
                                        System.out.println("Itroduzca el color del auto");
                                        String color = keyboard.nextLine();
                                        System.out.println("Introduzca el Cilindraje ");
                                        int cilindros = keyboard.nextInt();
                                        keyboard.nextLine();
                                        System.out.println("Introduzca el precio del automóvil");
                                        int precio = keyboard.nextInt();
                                        System.out.println("Introduzca el año del carro");
                                        int año = keyboard.nextInt();
                                        keyboard.nextLine();
                                        System.out.println("Introduzca el No. de serie del motor");
                                        String noMotor2 = keyboard.nextLine();
                                        System.out.println("Introdusca la cantidad de puertas");
                                        int puertas = keyboard.nextInt();

                                        car.setAnnio(año);
                                        car.setColor(color);
                                        car.setModelo(modelo);
                                        car.setCilindros(cilindros);
                                        car.setPrecio(precio);
                                        car.setNoMotor(noMotor2);
                                        Sedan sedan = new Sedan(modelo, color, cilindros, precio, año, noMotor2, puertas);
                                        admon.addCarros(sedan);

                                        break;
                                    case 2:
                                        System.out.println("Introduzca el Modelo");
                                        String modelo1 = keyboard.nextLine();
                                        System.out.println("Itroduzca el color del auto");
                                        String color1 = keyboard.nextLine();
                                        System.out.println("Introduzca el Cilindraje ");
                                        int cilindros1 = keyboard.nextInt();
                                        System.out.println("Introduzca el precio del automóvil");
                                        int precio1 = keyboard.nextInt();
                                        System.out.println("Introduzca el año del carro");
                                        int año1 = keyboard.nextInt();
                                        keyboard.nextLine();
                                        System.out.println("Introduzca el No. de serie del motor");
                                        String noMontor1 = keyboard.nextLine();
                                        System.out.println("Introdusca la velocidad maxima:");
                                        int velocidadMax = keyboard.nextInt();
                                        System.out.println("Introudce los caballos de fuerza");
                                        int caballosFuerza = keyboard.nextInt();
                                        car.setAnnio(año1);
                                        car.setColor(color1);
                                        car.setModelo(modelo1);
                                        car.setCilindros(cilindros1);
                                        car.setPrecio(precio1);
                                        car.setNoMotor(noMontor1);
                                        Deportivo dep = new Deportivo(modelo1, color1, cilindros1, precio1, año1, noMontor1, velocidadMax, caballosFuerza);
                                        admon.addCarros(dep);
                                        break;
                                    case 3:
                                        System.out.println("Introduzca el Modelo");
                                        String modelo2 = keyboard.nextLine();
                                        System.out.println("Itroduzca el color del auto");
                                        String color2 = keyboard.nextLine();
                                        System.out.println("Introduzca el Cilindraje ");
                                        int cilindros2 = keyboard.nextInt();
                                        System.out.println("Introduzca el precio del automóvil");
                                        int precio2 = keyboard.nextInt();
                                        System.out.println("Introduzca el año del carro");
                                        int año3 = keyboard.nextInt();
                                        keyboard.nextLine();
                                        System.out.println("Introduzca el No. de serie del motor");
                                        String no_motor = keyboard.nextLine();
                                        System.out.println("¿la camioneta es todo terreno?");
                                        boolean todoTerreno = keyboard.hasNext();
                                        System.out.println("Introduzca la capacidad de carga");
                                        int capacidadCarga = keyboard.nextInt();
                                        car.setAnnio(año3);
                                        car.setColor(color2);
                                        car.setModelo(modelo2);
                                        car.setCilindros(cilindros2);
                                        car.setPrecio(precio2);
                                        car.setNoMotor(no_motor);
                                        Camioneta camioneta = new Camioneta(modelo2, color2, cilindros2, precio2, año3, no_motor, todoTerreno, capacidadCarga);
                                        admon.addCarros(camioneta);
                                        break;
                                    default:
                                        System.out.println("Opción no válida");
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("¿Quieres agregar un Vendedor?");
                                String respuesta = keyboard.nextLine();
                                if (respuesta.equalsIgnoreCase("S")) {
                                    Vendedor vendedors = new Vendedor();
                                    System.out.println("Introduce el nombre del vendedor:");
                                    vendedors.setNombre(keyboard.nextLine());
                                    System.out.println("Introduce el apellido del Vendedor:");
                                    vendedors.setApellido(keyboard.nextLine());
                                    System.out.println("El Id del vendedor es: " );
                                    admon.addVendedor(vendedors);
                                }
                                break;

                            case 3:
                                System.out.println("Lista de carros:");
                                ArrayList<Automovil> listaCarros = admon.getListaCarros();
                                for (Automovil auto : listaCarros) {
                                    System.out.println(auto);
                                }
                                break;

                            case 4:
                                System.out.println("Seleccione el carro a modificar:");

                                for (int i = 0; i < admon.getListaCarros().size(); i++) {
                                    System.out.println((i + 1) + ". " + admon.getListaCarros().get(i).getModelo());
                                }

                                int seleccionCarro = keyboard.nextInt();
                                if (seleccionCarro >= 1 && seleccionCarro <= admon.getListaCarros().size()) {
                                    Automovil carroSeleccionado = admon.getListaCarros().get(seleccionCarro - 1);

                                    System.out.println("Seleccione qué desea modificar:");
                                    System.out.println("1. Modelo");
                                    System.out.println("2. Color");
                                    System.out.println("3. Cilindraje");
                                    System.out.println("4. Precio");
                                    System.out.println("5. Año");
                                    System.out.println("6. Número de serie del motor");
                                    System.out.println("7. Volver al menú principal");

                                    int opcionModificacion = keyboard.nextInt();
                                    keyboard.nextLine();

                                    switch (opcionModificacion) {
                                        case 1:
                                            System.out.println("Introduzca el nuevo modelo:");
                                            String nuevoModelo = keyboard.nextLine();
                                            carroSeleccionado.setModelo(nuevoModelo);
                                            break;
                                        case 2:
                                            System.out.println("Introduzca el nuevo color:");
                                            String nuevoColor = keyboard.nextLine();
                                            carroSeleccionado.setColor(nuevoColor);
                                            break;
                                        case 3:
                                            System.out.println("Introduzca el nuevo cilindraje:");
                                            int nuevoCilindraje = keyboard.nextInt();
                                            carroSeleccionado.setCilindros(nuevoCilindraje);
                                            break;
                                        case 4:
                                            System.out.println("Introduzca el nuevo precio:");
                                            int nuevoPrecio = keyboard.nextInt();
                                            carroSeleccionado.setPrecio(nuevoPrecio);
                                            break;
                                        case 5:
                                            System.out.println("Introduzca el nuevo año:");
                                            int nuevoAnio = keyboard.nextInt();
                                            carroSeleccionado.setAnnio(nuevoAnio);
                                            break;
                                        case 6:
                                            System.out.println("Introduzca el nuevo número de serie del motor:");
                                            String nuevoNumSerie = keyboard.nextLine();
                                            carroSeleccionado.setNoMotor(nuevoNumSerie);
                                            break;
                                        case 7:
                                            break;
                                        default:
                                            System.out.println("Opción no válida");
                                            break;
                                    }
                                } else {
                                    System.out.println("Selección no válida");
                                }
                                break;

                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("Bienvenido");
                        System.out.println("1.- Inicio de Sesion ");
                        System.out.println("2.- Menú");
                        int opc3 = keyboard.nextInt();
                        int intentos = 0;
                        Gestion gest = new Gestion();
                        ArrayList<Usuario> listaNueva = new ArrayList<>();
                        Scanner teclado = new Scanner(System.in);

                        switch (opc3) {
                            case 1:
                                System.out.println("Agregue el nombre de usuario: ");
                                String nuevoUsuario = teclado.nextLine();
                                while (true) {
                                    System.out.println("Agregue la contraseña del usuario: ");
                                    int nuevaContraseña = teclado.nextInt();

                                    if (nuevaContraseña >= 100000 && nuevaContraseña <= 999999) {
                                        Usuario usuario = new Usuario(nuevoUsuario, nuevaContraseña);

                                        if (!listaNueva.contains(usuario)) {
                                            listaNueva.add(usuario);
                                            System.out.println("Usuario añadido correctamente.");
                                        } else {
                                            System.out.println("----------------------------------");
                                            System.out.println("Usuario, no se pudo agregar");
                                            System.out.println("----------------------------------");
                                        }
                                        break;
                                    } else {
                                        System.out.println("La contraseña ingresada no cumple con los requerimientos.");
                                        System.out.println("Inténtelo de nuevo.");
                                    }
                                }
                                break;

                            case 2:
                                do {
                                        System.out.println("Bienvenido");
                                        System.out.println("¿Qué desea hacer hoy?");
                                        System.out.println("1.- Realizar una Venta");
                                        System.out.println("2.- Generar una cita ");
                                        System.out.println("3.- Ver todas las citas");
                                        int opcion1 = keyboard.nextInt();
                                        keyboard.nextLine();

                                        switch (opcion1) {
                                            case 1:
                                                Venta venta = new Venta();
                                                System.out.println("Lista de automóviles disponibles:");
                                                for (Automovil auto : admon.getListaCarros()) {
                                                    System.out.println(auto);
                                                }
                                                System.out.println("Seleccione el número del automóvil que desea comprar:");
                                                int seleccionAutomovil = keyboard.nextInt();

                                                if (seleccionAutomovil >= 1 && seleccionAutomovil <= admon.getListaCarros().size()) {
                                                    Automovil automovil = admon.getListaCarros().get(seleccionAutomovil - 1);
                                                    admon.getListaCarros().remove(automovil);
                                                    System.out.println("¡Venta completada con éxito!");
                                                    System.out.println("Automóvil vendido: " + automovil);
                                                    venta.addCarVendido(automovil);
                                                    gest.addVenta(venta);
                                                } else {
                                                    System.out.println("Selección no válida");
                                                }
                                                break;

                                            case 2:
                                                boolean clientes = true;
                                                do {
                                                    Citas citas = new Citas();
                                                    Cliente client = new Cliente();
                                                    System.out.println("Introduce la fecha");
                                                    citas.setDate(LocalDate.now());
                                                    System.out.println("Introduce el nombre del cliente");
                                                    client.setNombre(teclado.nextLine());
                                                    System.out.println("Introduce el apellido");
                                                    client.setApellido(teclado.nextLine());
                                                    System.out.println("Introduce el correo electrónico del cliente");
                                                    client.setCorreoElectronico(teclado.nextLine());
                                                    System.out.println("Introduce el número telefónico del cliente");
                                                    client.setNumTelefonico(teclado.nextInt());
                                                    teclado.nextLine();
                                                    System.out.println("Todo es correcto");
                                                    String resp = teclado.nextLine();
                                                    if (resp.equalsIgnoreCase("s")) {
                                                        citas.addCliente(client);
                                                        System.out.println("La cita fue agregada con éxito");
                                                        clientes = false;
                                                    }
                                                } while (clientes);
                                                break;

                                            case 3:
                                                System.out.println("Todas las citas son:");
                                                for (Citas cits : gest.getListasCitas()) {
                                                    System.out.println("Cita Fecha: " + cits.getDate() +
                                                            ", Hora: " + cits.getHour() +
                                                            ", Cliente: " + cits.getClient() +
                                                            ", Automóvil: " + cits.getCarro());
                                                }
                                                break;

                                            default:
                                                System.out.println("Opción no válida");
                                                break;
                                        }
                                } while (intentos < 3);

                                break;

                            default:
                                System.out.println("Opción no válida");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } while (bandera);
        }


    }
    */


