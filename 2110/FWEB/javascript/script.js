// Quando o botão for clicado, mostrar uma mensagem aleatória divertida!

// Lista de mensagens divertidas
const mensagens = [
    "Você é mais rápido que um bug no código! 🐞",
    "Parabéns! Você acabou de programar algo! 💻",
    "O JavaScript manda um salve pra você! ✌️",
    "Você clicou no botão mágico... E funcionou! ✨",
    "Hackeando o sistema... Brincadeira! 😎",
	"Hoje é atum!",
	"Hoje é ovo"
];

// Captura o botão e o parágrafo onde a mensagem será exibida
const botao = document.getElementById("botaoMagico");
const paragrafoMensagem = document.getElementById("mensagem");

// Adiciona o evento de clique ao botão
botao.addEventListener("click", function () {
    // Gera um número aleatório para escolher uma mensagem
    const indiceAleatorio = Math.floor(Math.random() * mensagens.length);
    const mensagemEscolhida = mensagens[indiceAleatorio];

    // Exibe a mensagem na tela
    paragrafoMensagem.textContent = mensagemEscolhida;
});