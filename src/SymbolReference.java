public class SymbolReference implements java.io.Serializable {
    private int indexInTable;
    private String symbol;

    public SymbolReference(String symbol, int index) {  //reference object constructor
        this.indexInTable = index;                      //maps symbol-table index to name-table index, therefore to stock object
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getIndex() {
        return this.indexInTable;
    }
}
