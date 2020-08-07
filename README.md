# # [ExceptionsEx1](https://www.udemy.com/course/java-curso-completo/learn/lecture/10793870?components=buy_button%2Cdiscount_expiration%2Cgift_this_course%2Cpurchase%2Cdeal_badge%2Credeem_coupon#overview)


Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:

- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada


# uml

# Example

Room number: 8021\
Check-in date (dd/MM/yyyy): 23/09/2019\
Check-out date (dd/MM/yyyy): 26/09/2019\
Reservation: Room 8021, check-in: 23/09/2019, check-out: 26/09/2019, 3 nights\

Enter data to update the reservation:\
Check-in date (dd/MM/yyyy): 24/09/2019\
Check-out date (dd/MM/yyyy): 29/09/2019\
Reservation: Room 8021, check-in: 24/09/2019, check-out: 29/09/2019, 5 nights\

Room number: 8021
Check-in date (dd/MM/yyyy): 23/09/2019\
Check-out date (dd/MM/yyyy): 21/09/2019\
Error in reservation: Check-out date must be after check-in date\
