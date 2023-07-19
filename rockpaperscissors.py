import random

def determine_winner(player_choice, computer_choice):
    if player_choice == computer_choice:
        return "It's a tie!"
    elif player_choice == 'rock':
        if computer_choice == 'paper':
            return "Computer wins!"
        else:
            return "Player wins!"
    elif player_choice == 'paper':
        if computer_choice == 'scissors':
            return "Computer wins!"
        else:
            return "Player wins!"
    elif player_choice == 'scissors':
        if computer_choice == 'rock':
            return "Computer wins!"
        else:
            return "Player wins!"

def play_game():
    choices = ['rock', 'paper', 'scissors']

    print("Let's play Rock, Paper, Scissors!")
    print("Choose one: rock, paper, scissors")
    player_choice = input("Your choice: ").lower()

    while player_choice not in choices:
        print("Invalid choice. Please choose again.")
        player_choice = input("Your choice: ").lower()

    computer_choice = random.choice(choices)
    print("Computer chose:", computer_choice)

    result = determine_winner(player_choice, computer_choice)
    print(result)

# Run the game
play_game()
