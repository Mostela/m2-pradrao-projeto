package entity;

import com.company.Status;

public class Pedido {
    private long id;
    private String descricao;
    private double total;
    private Status status;

    public Pedido() {
    }

    public Pedido(long id, String descricao, double total, Status status) {
        this.id = id;
        this.descricao = descricao;
        this.total = total;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getTotal() {
        return total;
    }

    public Status getStatus() {
        return status;
    }
}
