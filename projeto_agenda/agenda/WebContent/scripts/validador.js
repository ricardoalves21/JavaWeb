/**
 * Validação de formulário
 * @author Ricardo Alves
 */

function validar() {
	let nome = frmContato.nome.value;
	let fone = frmContato.fone.value;
	
	if (nome === "") {
		alert('Preencha o compo nome');
		frmContato.nome.focus();
		return false;
	} else if (fone === "") {
		alert('Preencha o compo fone');
		frmContato.fone.focus();
		return false;
	} else {
		document.forms["frmContato"].submit();
	}
}