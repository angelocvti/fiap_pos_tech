<div>
    <h2>API de gestão de endereços</h2>
</div>

<div>
    <p>API de gestão de endereços com objetivo de permitir o cadastro o gerenciamento de informações sobre os endereços cadastrados no sistema.</p>
    <p>A API recebe as solicitações em formato POST, os campos são:</p>
    <ul>
        <li>Rua</li>
        <li>Número</li>
        <li>Bairro</li>
        <li>Cidade</li>
        <li>Estado</li>
    </ul>
    <p>A request deve ser enviada para localhost:8080/enderecos (executando localmente).</p>
    <hr>
    <p>JSON exemplo:</p>
    <code>{
    "rua": "Rua Rio Colônia",
    "numero": 22,
    "bairro": "Jardim Varginha",
    "cidade": "São Paulo",
    "estado": "sao_paulo"
}</code>
    <p></p>
    <p>A request retornará código 201 (created) em caso de sucesso.</p>
    <hr>
    <h3>Atributos</h3>
    <p>"rua" (valor obrigatório) é uma String entre 5 e 50 caracteres.</p>
    <p>"numero" (valor obrigatório) é um Long que deve ter o valor positivo.</p>
    <p>"bairro" (valor obrigatório) é uma String entre 5 e 50 caracteres.</p>
    <p>"cidade" (valor obrigatório) é uma String entre 5 e 50 caracteres.</p>
    <p>"estado" (valor obrigatório) aceita os valores (case insensitive):</p>
    <ul>
        <li>"AMAZONAS"</li>
        <li>"ALAGOAS"</li>
        <li>"ACRE"</li>
        <li>"AMAPA"</li>
        <li>"BAHIA"</li>
        <li>"PARA"</li>
        <li>"MATO_GROSSO"</li>
        <li>"MINAS_GERAIS"</li>
        <li>"MATO_GROSSO_DO_SUL"</li>
        <li>"GOIAS"</li>
        <li>"MARANHAO"</li>
        <li>"RIO_GRANDE_DO_SUL"</li>
        <li>"TOCANTINS"</li>
        <li>"PIAUI"</li>
        <li>"SAO_PAULO"</li>
        <li>"RONDONIA"</li>
        <li>"RORAIMA"</li>
        <li>"PARANA"</li>
        <li>"CEARA"</li>
        <li>"PERNAMBUCO"</li>
        <li>"SANTA_CATARINA"</li>
        <li>"PARAIBA"</li>
        <li>"RIO_GRANDE_DO_NORTE"</li>
        <li>"ESPIRITO_SANTO"</li>
        <li>"RIO_DE_JANEIRO"</li>
        <li>"SERGIPE"</li>
        <li>"DISTRITO_FEDERAL"</li>
    </ul>
</div>
</div>