public enum size{
    XXS(32){
        @Override
        public String getDescription(){
            return ("Детский размер");
        }
    }, XS(34), S(36), M(38), L(40);
    public String getDescription(){
        return ("Взрослый размер");
    }
    final int euroSize;
    size(int euroSize){
        this.euroSize = euroSize;
    }
}