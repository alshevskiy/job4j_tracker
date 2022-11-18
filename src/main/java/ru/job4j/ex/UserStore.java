package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (login.equals(value.getUsername())) {
                user = value;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User is not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 4) {
            throw new UserInvalidException("Element is not valid");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Nikita Alshevskiy", true)
        };
        try {
            User user = findUser(users, "Nikita Alshevskiy");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            System.out.println("User is not valid");
        } catch (UserNotFoundException en) {
            System.out.println("User is not found");
        }
    }
}