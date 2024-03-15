public class Main {
    public static void main ( String[] args ) {
        checkLoginAndPassword ( 90, 666, 666 );
    }

    public static void checkLoginAndPassword ( String login,
                                               String password, String confirmPassword ) {
        if ( login.length ( ) > 20 ) {
            throw new WrongLoginException ( "слишком длинный логин" );
        }
        if ( !login.matches ( "[a-zA-z0-9_]+" ) ) {
            throw new WrongLoginException ( "недопустимые символы" );
        }
        if ( !password.matches ( "[a-zA-z0-9_]+" ) ) {
            throw new WrongPasswordException ( "недопустимые символы" );
        }
        if ( password.length ( ) > 20 ) {
            throw new WrongPasswordException ( "слишком длинный пароль" );
        }
        if ( !password.equals ( confirmPassword ) ) {
            throw new WrongPasswordException ( "пароли не совпадают" );
        }

    }
}

