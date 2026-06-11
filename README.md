<div align="center">

<img src="https://capsule-render.vercel.app/api?type=waving&customColorList=6,11,20&height=200&section=header&text=ViaCEP&fontSize=50&fontColor=fff&animation=twinkling&fontAlignY=35&desc=Consumo+de+API+com+Java&descAlignY=60&descSize=18" width="100%"/>

[![Status](https://img.shields.io/badge/status-concluído-brightgreen?style=flat-square)](https://github.com/kevinhsdev/ViaCEP)
[![Language](https://img.shields.io/badge/language-Java-orange?style=flat-square&logo=java)](https://www.java.com)
[![Level](https://img.shields.io/badge/level-iniciante-blue?style=flat-square)](https://github.com/kevinhsdev)

</div>

---

## 📦 Sobre o projeto

Projeto de fim de semana desenvolvido para praticar o consumo de APIs externas com Java puro. A aplicação se conecta à [API pública ViaCEP](https://viacep.com.br), realiza uma requisição HTTP com um CEP informado pelo usuário e exibe os dados de endereço retornados: logradouro, bairro, cidade, UF e demais campos do JSON de resposta.

---

## ⚙️ Funcionalidades

| Funcionalidade | Descrição |
|---|---|
| 🔎 Consulta por CEP | Informa um CEP e recebe os dados completos do endereço |
| 🌐 Requisição HTTP | Conexão direta com a API pública `viacep.com.br` via `HttpURLConnection` |
| 📋 Exibição no console | Dados do endereço formatados e impressos no terminal |
| ⚠️ Tratamento de erros | Feedback ao usuário em caso de CEP inválido ou não encontrado |

---

## 🖥️ Demonstração

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

## 🚀 Melhorias futuras

- [X] Integração com Gson para desserialização automática do JSON
- [ ] Validação de formato do CEP antes de realizar a requisição
- [ ] Interface gráfica simples com Java Swing
- [ ] Exportar o resultado da consulta para um arquivo `.json`

---

## 👤 Autor

<a href="https://github.com/kevinhsdev">
  <img src="https://img.shields.io/badge/kevinhsdev-GitHub-181717?style=for-the-badge&logo=github" />
</a>

---

<img src="https://capsule-render.vercel.app/api?type=waving&customColorList=6,11,20&height=100&section=footer&text=Let's+Code!&fontSize=24&fontColor=fff&animation=twinkling" width="100%"/>
