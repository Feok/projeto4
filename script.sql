DROP TABLE tbCurso;
DROP TABLE tbTurma;
DROP TABLE tbInstrutor;
DROP TABLE tbAluno;
DROP TABLE tbMatricula;
DROP TABLE tbAVista;
DROP TABLE tbAPrazo;

CREATE TABLE tbCurso (
sigla_curso VARCHAR2(2) NOT NULL
    CONSTRAINT pk_sigla PRIMARY KEY,
nome_curso VARCHAR2(30),
cargaHoraria_curso NUMBER(3),
valor_curso NUMBER(6,2),
dataVigencia_curso VARCHAR2(10),
valorHoraInstrutor_curso NUMBER(5,2), 
programa_curso VARCHAR2(50)
);

CREATE TABLE tbInstrutor (
cpf_instrutor VARCHAR2(11) NOT NULL
	CONSTRAINT pk_cpfInstrutor PRIMARY KEY,
nome_instrutor VARCHAR2(30),
dataNasc_instrutor VARCHAR2(8),
sexo_instrutor VARCHAR2(9),
estadoCivil_instrutor VARCHAR2(10),
endereco_instrutor VARCHAR2(30),
numeroEnd_instrutor NUMBER(5,0),
bairro_instrutor VARCHAR2(15),
cep_instrutor VARCHAR2(8),
cidade_instrutor VARCHAR2(15),
estado_instrutor VARCHAR2(2),
telefone_instrutor VARCHAR2(10),
rg_instrutor VARCHAR2(9),
celular_instrutor VARCHAR2(10),
formacao_instrutor VARCHAR2(20),
areaAtuacao_instrutor VARCHAR2(20),
email_instrutor VARCHAR2(25)
);

CREATE TABLE tbTurma (
sigla_turma VARCHAR2(2) NOT NULL
	CONSTRAINT pk_turma PRIMARY KEY,
siglaCurso_turma VARCHAR2(2),
cpf_instrutor VARCHAR2(11),
descricao_turma VARCHAR2(30),
dataInicio_turma VARCHAR2(10), 
dataTermino_turma VARCHAR2(10), 
periodo_turma VARCHAR2(20), 
qtdVagas_turma NUMBER(2), 
observacoes_turma VARCHAR2(30) 
);

ALTER TABLE tbTurma
    ADD CONSTRAINT fk_siglacurso FOREIGN KEY (siglaCurso_turma)
        REFERENCES tbCurso (sigla_curso);

CREATE TABLE tbAluno (
cpf_aluno VARCHAR2(11) NOT NULL
	CONSTRAINT pk_cpfAluno PRIMARY KEY,
nome_aluno VARCHAR2(30),
dataNasc_aluno VARCHAR2(8),
sexo_aluno VARCHAR2(9),
estadoCivil_aluno VARCHAR2(10),
endereco_aluno VARCHAR2(30),
numeroEnd_aluno NUMBER(5,0),
bairro_aluno VARCHAR2(15),
cep_aluno VARCHAR2(8),
cidade_aluno VARCHAR2(15),
estado_aluno VARCHAR2(2),
telefone_aluno VARCHAR2(10),
rg_aluno VARCHAR2(9),
celular_aluno VARCHAR2(10),
escolaridade_aluno VARCHAR2(20),
email_aluno VARCHAR2(25)
);

CREATE TABLE tbMatricula (
data_matricula VARCHAR2(8),
qtdeFaltas_matricula NUMBER(3),
nota_curso NUMBER(5,2),
cpfAluno_matricula VARCHAR2(11) NOT NULL
	CONSTRAINT pk_matricula PRIMARY KEY,
siglaTurma_matricula VARCHAR2(2)
);

CREATE TABLE tbAvista (
valor_avista NUMBER(5,2),
agencia_avista NUMBER(5),
nCheque_avista NUMBER(5),
preData_avista VARCHAR(8),
data_matricula VARCHAR2(8),
cpfAluno_matricula VARCHAR2(11) NOT NULL
	CONSTRAINT pk_avista PRIMARY KEY,
siglaTurma_matricula VARCHAR2(2)
);

CREATE TABLE tbAprazo (
valor_aprazo NUMBER(5,2),
dtVencimento_aprazo VARCHAR2(8),
taxaJuros_aprazo NUMBER(5,2),
qtdeMensalidade_aprazo NUMBER(3),
data_matricula VARCHAR2(8),
cpfAluno_matricula VARCHAR2(11) NOT NULL
	CONSTRAINT pk_aprazo PRIMARY KEY,
siglaTurma_matricula VARCHAR2(2)
);

SELECT * FROM tbCurso;
SELECT * FROM tbTurma;
SELECT * FROM tbInstrutor;
SELECT * FROM tbAluno;
SELECT * FROM tbMatricula;
SELECT * FROM tbAVista;
SELECT * FROM tbAPrazo;