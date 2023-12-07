public class HeightAdapter implements MeterHeight {

    private Tree tree;

    public HeightAdapter(Tree tree){
        this.tree = tree;
    }
    @Override
    public double getHeightInMetres(){
        return tree.getHeight() * 0.3048;
    }
}
