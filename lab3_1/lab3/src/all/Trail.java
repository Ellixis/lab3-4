package all;


import interfaces.Injectable;

public class Trail implements Injectable {
    private boolean isOwn;

    public Trail(boolean isOwn) {
        this.isOwn = isOwn;
    }

    @Override
    public void inspect() {
        if (isOwn) {
            System.out.println("След, похоже, мой собственный. Я, возможно, просто испугался.");
        } else {
            System.out.println("След кажется чужим. Это пугает.");
        }

    }

}