<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&customColorList=6,11,20&height=200&section=header&text=ViaCEP&fontSize=50&fontColor=fff&animation=twinkling&fontAlignY=35&desc=Consumo+de+APIs+em+Java&descAlignY=51" />

[![Status](https://img.shields.io/badge/status-concluído-brightgreen?style=flat-square)](https://github.com/kevinhsdev/ViaCEP)
[![Language](https://img.shields.io/badge/language-Java-orange?style=flat-square&logo=java)](https://www.java.com)
[![Level](https://img.shields.io/badge/level-iniciante-blue?style=flat-square)](https://github.com/kevinhsdev)

</div>

---

# ViaCEP

Uma aplicação simples em Java para consultar endereços a partir de um CEP usando a API pública ViaCEP (https://viacep.com.br). Este projeto foi criado para demonstrar como consumir APIs externas com Java puro, tratar JSON e apresentar resultados de forma legível no terminal.

## 🚀 Principais pontos

- Consumo direto da API ViaCEP usando HttpURLConnection
- Desserialização de JSON com Gson (integração disponível)
- Saída formatada no console
- Tratamento básico de erros e respostas não encontradas

---

## ✨ Funcionalidades

- 🔎 Consulta por CEP (formatos aceitos: `99999-999` ou `99999999`)
- 🌐 Requisição HTTP com `HttpURLConnection`
- 📋 Impressão formatada dos dados do endereço no console
- ⚠️ Mensagens amigáveis para CEP inválido ou não encontrado

---

## 🖥️ Exemplo de uso

```console
Digite o CEP: 01310-100

=== Endereço encontrado ===
CEP:         01310-100
Logradouro:  Avenida Paulista
Complemento: de 1 a 610 - lado par
Bairro:      Bela Vista
Cidade:      São Paulo
UF:          SP
DDD:         11
```

---

## 🗂️ Estrutura do projeto

```
ViaCEP/
├── src/
│   ├── Main.java          # Entrada da aplicação e leitura do CEP
│   ├── ViaCEPService.java # Lógica de requisição HTTP à API
│   └── Endereco.java      # Modelo de dados do endereço
├── .gitignore
└── ViaCEP.iml
```

---

## ▶️ Requisitos

- JDK 17 ou superior
- Conexão com a internet para consultar a API ViaCEP

---

## ▶️ Como executar

```bash
# Clone o repositório
git clone https://github.com/kevinhsdev/ViaCEP.git

# Acesse a pasta do projeto
cd ViaCEP

# Compile os arquivos Java
javac src/*.java -d out/

# Execute a aplicação
java -cp out/ Main
```

> Pré-requisito: **JDK 17+** instalado na máquina.

---

## 🧭 Sugestões de melhorias (práticas)

- Validar o formato do CEP antes de enviar a requisição (regex: `^\\d{5}-?\\d{3}$`).
- Tratar códigos de status HTTP diferentes de 200 e exibir mensagens de erro claras.
- Implementar timeout nas conexões para evitar travamentos.
- Adicionar testes unitários para a lógica de parsing e validação.

---

## ✅ Roadmap / Melhorias futuras

- [X] Integração com Gson para desserialização automática do JSON
- [ ] Validação de formato do CEP antes de realizar a requisição
- [ ] Interface gráfica simples com Java Swing
- [ ] Exportar o resultado da consulta para um arquivo `.json`

---

## 🤝 Contribuições

Contribuições são bem-vindas! Abra uma issue para discutir mudanças ou envie um pull request com melhorias, correções ou novas funcionalidades.

---

## 👤 Autor

<a href="https://github.com/kevinhsdev">
  <img src="https://img.shields.io/badge/kevinhsdev-GitHub-181717?style=for-the-badge&logo=github" />
</a>

---

<small>Projeto criado para aprendizado — sinta-se livre para clonar, estudar e aprimorar.</small>

<img src="https://capsule-render.vercel.app/api?type=waving&customColorList=6,11,20&height=100&section=footer&text=Let's+Code!&fontSize=24&fontColor=fff&animation=twinkling" width="100%"/>
