# ProjetoSI

## Descrição

Carona-me! é a mais nova definição do conceito de oferecer caronas para pessoas que moram no mesmo bairro, possuem horários compatíveis e com o destino comum : a UFCG.

O projeto visa oferecer uma solução computacional na prática da carona, levando em conta a complexidade e até mesmo a dificuldade em achar alguém com a mesma origem, destino e horários compatíveis com os nossos. Além disso, muita das pessoas que tem como destino a UFCG vão em seus carros sozinhas ou com vagas ociosas, que, na prática, poderiam ser ocupadas por outros alunos da instituição. 
Pensando nisso, surge então a ideia de criar um sistema informacional com enfoque em facilitar o oferecimento e o pedido de caronas. 


## Interação com as telas

1. A primeira tela diz respeito ao login no sistema. Caso o usuário não tenha cadastro, ele terá a opção de se cadastrar clicando no botão “Cadastrar” ao lado de “Login”.

2. Ao clicar no botão “Cadastrar”, ele será redirecionado para a tela na qual cadastrará as suas informações pessoais de acordo com o tipo de usuário: Motorista ou Passageiro. É necessário que todos os campos estejam preenchidos adequadamente para se cadastrar com sucesso. Uma vez cadastrado, ele será redirecionado para a tela inicial, na qual contém o menu de opções e a foto do usuário, a qual pode ser trocada.

3. Por outro lado, ao clicar no botão “Login” e caso o usuário pertença ao sistema, ele será redirecionado para a tela inicial supracitada. No entanto, caso ele clique em “Login” sem fornecer informações para os campos, será apresentado uma mensagem informando que os campos estão em branco. Não obstante, caso seja um usuário que não esteja no sistema, aparecerá uma mensagem indicando que ele inexiste no banco de dados. 

4. Uma vez dentro do sistema, no caso de ser um passageiro, o usuário tem a opção de buscar caronas no botão “Buscar” no menu superior. Já na tela de busca, aparecerão, a princípio, os motoristas que possuem os horários compatíveis com o dele, embora seja possível filtrar caronas para outros momentos. Para isso, o usuário poderá escolher o tipo de carona, se é Ida ou Volta, o horário e o dia da semana. Ao clicar em buscar, serão mostrados todos motoristas que se enquadram nas descrições fornecidas.

5. Além disso, há a opção de editar as informações fornecidas no cadastro na opção “Cadastro” do menu superior. Estando nela, todas as informações do usuário estarão automaticamente nos campos, podendo ser editadas.

6. Já em “Horários”, temos a opção de definir os horários do usuário. As diferenças entre Passageiro e Motorista nessa tela são: na deste aparecerá a opção de rota, bem como as vagas dos momentos do dia escolhidos e na daquele não. Além disso, há também o que é comum aos dois: o quadro semanal que ele escolherá os momentos de ida e volta.

7. Há também a opção “Notificações” em que é possível visualizar todas as notificações recebidas, tanto no caso do Motorista quanto no do Passageiro. Não obstante, uma vez estando na tela de notificações, o usuário tem a opção de filtrar as solicitações de caronas. Para o caso do motorista, os pedidos, as pendentes e as aceitas; para o passageiro, as que ele pediu, as aceitadas e as pendentes. 

8. Por fim, o botão sair em que fará logoff do sistema de caronas.