// ------------------ UTIL ------------------
function showSection(sectionId) {
    document.querySelectorAll('section').forEach(sec => sec.style.display = 'none');
    document.getElementById(sectionId).style.display = 'block';
}

// ------------------ ANIMAIS ------------------
const formAnimal = document.getElementById('formAnimal');
formAnimal.addEventListener('submit', async e => {
    e.preventDefault();

    const id = parseInt(document.getElementById('animalId').value);
    const nome = document.getElementById('animalNome').value;
    const idade = parseInt(document.getElementById('animalIdade').value);
    const situacao = document.getElementById('animalSituacao').value;
    const tipo = document.getElementById('animalTipo').value;
    const sexo = document.getElementById('animalSexo').value;

    const url = tipo === 'Cachorro'
        ? 'http://localhost:8080/animais/cadastrar/cachorro'
        : 'http://localhost:8080/animais/cadastrar/gato';

    try {
        await fetch(url, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ id, nome, idade, situacao, sexo })
        });
        formAnimal.reset();
        listarAnimais();
    } catch (err) {
        console.error('Erro ao cadastrar animal:', err);
        alert('Não foi possível cadastrar o animal.');
    }
});

async function listarAnimais() {
    try {
        const res = await fetch('http://localhost:8080/animais');
        const animais = await res.json();
        const tbody = document.querySelector('#tabelaAnimais tbody');
        tbody.innerHTML = '';

        animais.forEach(a => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
                <td>${a.id}</td>
                <td>${a.nome}</td>
                <td>${a.idade}</td>
                <td>${a.situacao}</td>
                <td>${a.tipo}</td>
                <td>${a.sexo}</td>
                <td><button class="deletar" onclick="deletarAnimal(${a.id})">Delete</button></td>
            `;
            tbody.appendChild(tr);
        });
    } catch (err) {
        console.error('Erro ao listar animais:', err);
    }
}

async function deletarAnimal(id) {
    try {
        await fetch(`http://localhost:8080/animais/${id}`, { method: 'DELETE' });
        listarAnimais();
    } catch (err) {
        console.error('Erro ao deletar animal:', err);
    }
}

// ------------------ PESSOAS ------------------
const formPessoa = document.getElementById('formPessoa');
formPessoa.addEventListener('submit', async e => {
    e.preventDefault();

    const id = parseInt(document.getElementById('pessoaId').value);
    const nome = document.getElementById('pessoaNome').value;
    const tipo = document.getElementById('pessoaTipo').value;

    try {
        await fetch('http://localhost:8080/clientes/cadastrar', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ id, nome, tipo })
        });
        formPessoa.reset();
        listarPessoas();
    } catch (err) {
        console.error('Erro ao cadastrar pessoa:', err);
        alert('Não foi possível cadastrar a pessoa.');
    }
});

async function listarPessoas() {
    try {
        const res = await fetch('http://localhost:8080/clientes');
        const pessoas = await res.json();
        const tbody = document.querySelector('#tabelaPessoas tbody');
        tbody.innerHTML = '';

        pessoas.forEach(p => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
                <td>${p.id}</td>
                <td>${p.nome}</td>
                <td>${p.tipo || 'Cliente'}</td>
                <td><button class="deletar" onclick="deletarPessoa(${p.id})">Delete</button></td>
            `;
            tbody.appendChild(tr);
        });
    } catch (err) {
        console.error('Erro ao listar pessoas:', err);
    }
}

async function deletarPessoa(id) {
    try {
        await fetch(`http://localhost:8080/clientes/${id}`, { method: 'DELETE' });
        listarPessoas();
    } catch (err) {
        console.error('Erro ao deletar pessoa:', err);
    }
}

// ------------------ DOAÇÕES ------------------
const formDoacao = document.getElementById('formDoacao');
formDoacao.addEventListener('submit', async e => {
    e.preventDefault();

    const id = parseInt(document.getElementById('doacaoId').value);
    const nome = document.getElementById('doacaoProduto').value;
    const quantidade = parseInt(document.getElementById('doacaoQuantidade').value);

    try {
        await fetch('http://localhost:8080/produtos/cadastrar', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ id, nome, quantidade })
        });
        formDoacao.reset();
        listarDoacoes();
    } catch (err) {
        console.error('Erro ao registrar doação:', err);
        alert('Não foi possível registrar a doação.');
    }
});

async function listarDoacoes() {
    try {
        const res = await fetch('http://localhost:8080/produtos');
        const produtos = await res.json();
        const tbody = document.querySelector('#tabelaDoacoes tbody');
        tbody.innerHTML = '';

        produtos.forEach(p => {
            const tr = document.createElement('tr');
            tr.innerHTML = `
                <td>${p.id}</td>
                <td>${p.nome}</td>
                <td>${p.quantidade}</td>
                <td><button class="deletar" onclick="deletarDoacao(${p.id})">Delete</button></td>
            `;
            tbody.appendChild(tr);
        });
    } catch (err) {
        console.error('Erro ao listar doações:', err);
    }
}

async function deletarDoacao(id) {
    try {
        await fetch(`http://localhost:8080/produtos/${id}`, { method: 'DELETE' });
        listarDoacoes();
    } catch (err) {
        console.error('Erro ao deletar doação:', err);
    }
}

// ------------------ TRANSAÇÕES ------------------
const formTransacao = document.getElementById('formTransacao');
formTransacao.addEventListener('submit', async e => {
    e.preventDefault();

    const animalId = parseInt(document.getElementById('transacaoAnimalId').value);
    const tipo = document.getElementById('transacaoTipo').value;

    try {
        if(tipo === 'Adoção') {
            await fetch(`http://localhost:8080/animais/${animalId}`, {
                method: 'PATCH',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ situacao: 'Adotado' })
            });
        } else if(tipo === 'Eutanásia') {
            await fetch(`http://localhost:8080/animais/${animalId}`, {
                method: 'PATCH',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ situacao: 'Eutanasiado' })
            });
        }
        adicionarHistorico(animalId, tipo);
        listarAnimais();
    } catch (err) {
        console.error('Erro ao registrar transação:', err);
        alert('Não foi possível registrar a transação.');
    }
});

function adicionarHistorico(animalId, tipo) {
    const tbody = document.querySelector('#tabelaTransacoes tbody');
    const tr = document.createElement('tr');
    tr.innerHTML = `<td>${animalId}</td><td>${tipo}</td>`;
    tbody.appendChild(tr);
}

// ------------------ INICIALIZAÇÃO ------------------
listarAnimais();
listarPessoas();
listarDoacoes();

