package br.com.agendacontatospring.error;

public class ResourceNotFoundDetails {

    private String titulo;
    private int status;
    private String detalhe;
    private long timestamp;
    private String mensagemDesenvolvedor;

    private ResourceNotFoundDetails() {
    }

    public String getTitulo() {
        return titulo;
    }

    public int getStatus() {
        return status;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMensagemDesenvolvedor() {
        return mensagemDesenvolvedor;
    }


    public static final class Builder {
        private String titulo;
        private int status;
        private String detalhe;
        private long timestamp;
        private String mensagemDesenvolvedor;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder setTitulo(String tiulo) {
            this.titulo = tiulo;
            return this;
        }

        public Builder setStatus(int status) {
            this.status = status;
            return this;
        }

        public Builder setDetalhe(String detalhe) {
            this.detalhe = detalhe;
            return this;
        }

        public Builder setTimeStamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setMensagemDesenvolvedor(String mensagemDesenvolvedor) {
            this.mensagemDesenvolvedor = mensagemDesenvolvedor;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.detalhe = this.detalhe;
            resourceNotFoundDetails.mensagemDesenvolvedor = this.mensagemDesenvolvedor;
            resourceNotFoundDetails.status = this.status;
            resourceNotFoundDetails.titulo = this.titulo;
            resourceNotFoundDetails.timestamp = this.timestamp;
            return resourceNotFoundDetails;
        }
    }
}
