<div>
    <h2>API de gestão de pessoas</h2>
</div>

<div>
    <p>API de gestão de eletrodomésticos com objetivo de permitir o cadastro e gerenciamento de informações sobre os aparelhos eletrônicos dos usuários cadastrados no sistema.</p>
    <p>A API recebe as solicitações em formato POST, os campos são:</p>
    <ul>
        <li>Nome</li>
        <li>Data de nascimento</li>
        <li>Sexo</li>
        <li>Parentesco</li>
        <li>Outros dados relevantes</li>
    </ul>
    <p>A request deve ser enviada para localhost:8080/pessoas (executando localmente).</p>
    <hr>
    <p>JSON exemplo:</p>
    <code>{
    "nome": "Fernanda",
    "dataNascimento": "1992-12-24",
    "sexo": "feminino",
    "parentesco": "esposa",
    "outrosDados": "Lorem ipsum."
}</code>
    <p></p>
    <p>A request retornará código 201 (created) em caso de sucesso.</p>
    <hr>
    <h3>Atributos</h3>
    <p>"nome" (valor obrigatório) é uma String entre 5 e 50 caracteres.</p>
    <p>"dataNascimento" (valor obrigatório) é uma data no formato yyyy-mm-dd e deve estar no passado.</p>
    <p>"sexo" (valor obrigatório) aceita o valor "MASCULINO" ou "FEMININO" (case insensitive).</p>
    <p>"parentesco" (valor obrigatório) aceita os valores (case insensitive):</p>
    <ul>
        <li>"PAI"</li>
        <li>"MAE"</li>
        <li>"IRMAO"</li>
        <li>"IRMA"</li>
        <li>"TIO"</li>
        <li>"TIA"</li>
        <li>"PRIMO"</li>
        <li>"PRIMA"</li>
        <li>"AVO_M"</li>
        <li>"AVO_F"</li>
        <li>"ESPOSO"</li>
        <li>"ESPOSA"</li>
        <li>"NAMORADO"</li>
        <li>"NAMORADA"</li>
        <li>"FILHO"</li>
        <li>"FILHA"</li>
        <li>"NETO"</li>
        <li>"NETA"</li>
    </ul>
    <p>"outrosDados" é uma String.</p>
</div>
