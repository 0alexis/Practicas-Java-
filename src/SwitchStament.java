public class SwitchStament {
    public static void main(String[] args) {

        String colormode = "Night";

        switch (colormode){
            case "Light":
                System.out.println("selecionaste light mode");

                break;
            case "Blue Dark":
                System.out.println("selecionaste Blue Dark mode");

                break;
            case "Night":
                System.out.println("selecionaste Night mode");

                break;

            default:
                System.out.println("selecionaste una opcion incorrecta");
        }
    }
}
