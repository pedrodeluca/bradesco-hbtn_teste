package com.techcamps.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        assertTrue(Pessoa.emailValid("email_teste@dominio.com.br"));
    }

    @Test
    public void testar_email_sem_arroba() {
        assertFalse(Pessoa.emailValid("email_testedominio.com.br"));
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        assertEquals(false, Pessoa.emailValid("mail_teste_muito_longo_nao_deve_ser_valido@dominio.com.br"));
    }
}
