package inheritance;

interface MyInterface{
    public int sum(int x, int y);
    public int sub(int x, int y);
    public int mul(int x, int y);
    public double div(int x, int y);
}


public class InterfaceEx implements MyInterface{

    @Override
    public int sum(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public int sub(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sub'");
    }

    @Override
    public int mul(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mul'");
    }

    @Override
    public double div(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'div'");
    }
    
}
