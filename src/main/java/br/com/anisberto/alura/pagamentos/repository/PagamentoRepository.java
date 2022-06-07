package br.com.anisberto.alura.pagamentos.repository;

import br.com.anisberto.alura.pagamentos.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository< Pagamento, Long> {
}