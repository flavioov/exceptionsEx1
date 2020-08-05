package model.exceptions;


/*
 * Class Exception obligates exception treatment
 *
 * Class RunTimeException do not obligates exception treatment
 * */
public class DomainException extends Exception {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
