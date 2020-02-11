package entites;

public abstract class Animal {
    private double peso;
    private double altura;
    
    public Animal(){ 
    }
    
    public abstract void cadastrar();
    public abstract void salvar();
    public abstract void apagar();
    public abstract void deletar();
    
}
