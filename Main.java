


public class Main {
    public static void main(String[] args) {
        UserInputManager uim = new UserInputManager();
        int userInputValue;
        do{
            userInputValue = uim.retrieveUserOption();
            switch (userInputValue) {
                case 1:
                    uim.retrieveClientInfo();

                    break;
                case 2:
                    uim.retrieveAccountType();
                default:
                    break;
                case 3,4,5,6,7:
                    System.out.println("not implemented yet, the two first selections were put to give the teacher an idea of the project as discussed in class");
                    break;
                }
        }while(userInputValue != 0);
    }
}
