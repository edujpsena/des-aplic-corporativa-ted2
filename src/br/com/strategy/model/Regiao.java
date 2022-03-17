package br.com.strategy.model;

public enum Regiao implements Alocacao{

    NORTE {
        @Override
        public String definirAlocacaoFuncionario() {
            return "Porto Velho/RO";
        }
    },
    NORDESTE {
        @Override
        public String definirAlocacaoFuncionario() {
            return "João Pessoa/PB";
        }
    },
    CENTRO_OESTE {
        @Override
        public String definirAlocacaoFuncionario() {
            return "Brasilia/DF";
        }
    },
    SUDESTE {
        @Override
        public String definirAlocacaoFuncionario() {
            return "São Paulo/SP";
        }
    },
    SUL {
        @Override
        public String definirAlocacaoFuncionario() {
            return "Florianopolis/SC";
        }
    }

}
