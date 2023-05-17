<div>
    <h2>API de gestão de eletrodomésticos</h2>
</div>

<div>
    <p>API de gestão de eletrodomésticos com objetivo de permitir o cadastro e gerenciamento de informações sobre os aparelhos eletrônicos dos usuários cadastrado no sistema.</p>
    <p>A API recebe as solicitações em formato POST, os campos são:</p>
    <ul>
        <li>Nome</li>
        <li>Modelo</li>
        <li>Potência</li>
        <li>Outras informações relevantes</li>
    </ul>
    <p>A request deve ser enviada para localhost:8080/eletrodomesticos (executando localmente).</p>
    <hr>
    <p>JSON exemplo:</p>
    <code>{
    "nome": "Batedeira",
    "modelo": "Mondial - Bella Massa",
    "potencia": 100,
    "outrasInformacoes": "Cor preta."
}</code>
    <p></p>
    <p>A request retornará código 201 (created) em caso de sucesso.</p>
    <hr>
    <h3>Atributos</h3>
    <p>"nome" (valor obrigatório) é uma String entre 5 e 50 caracteres.</p>
    <p>"modelo" (valor obrigatório) é uma data no formato yyyy-mm-dd e deve estar no passado.</p>
    <p>"potencia" (valor obrigatório) aceita o valor "MASCULINO" ou "FEMININO" (case insensitive).</p>
    <p>"outrasInformacoes" é uma String até 100 caracteres.</p>
</div>
