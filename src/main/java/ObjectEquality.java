public class ObjectEquality {
    private int value;

    public boolean equals(Object obj){
        if (obj == null)
            return false;
        if(!(obj instanceof Integer))
            return false;
        return this.value == (Integer) obj;
    }
}
