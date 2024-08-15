# Chess Game in Java

A simple chess game implementation in Java, including logic for different pieces and game mechanics.

## Features

- **Knight Movement**: Implements the unique "L" shaped moves of the knight.
- **Piece Representation**: Includes classes for all standard chess pieces (Pawn, Rook, Knight, Bishop, Queen, King).
- **Board State**: Maintains and updates the state of the chessboard.

## Getting Started

### Prerequisites

- Java 8 or higher

### Running the Project

1. Clone the repository:
   ```sh
   git clone https://github.com/derlasilva/Chess.git

Navigate to the project directory:

sh
Copiar código
cd chess
Compile the project:

sh
Copiar código
javac -d bin src/*.java

Run the project:

sh
Copiar código
java -cp bin Main



Knight Movement Logic
The knight moves in an "L" shape:

Two squares in one direction and then one square perpendicular, or
One square in one direction and then two squares perpendicular.
The following moves are possible from any position (x, y):

(x + 2, y + 1)
(x + 2, y - 1)
(x - 2, y + 1)
(x - 2, y - 1)
(x + 1, y + 2)
(x + 1, y - 2)
(x - 1, y + 2)
(x - 1, y - 2)
Usage
To use the knight movement functionality, you can call the getPossibleMoves method from the Knight class. For example:

java
Copiar código
import java.util.List;

public class Main {
public static void main(String[] args) {
int startX = 3;
int startY = 3;

        List<int[]> moves = Knight.getPossibleMoves(startX, startY);

        for (int[] move : moves) {
            System.out.println("Move to: (" + move[0] + ", " + move[1] + ")");
        }
    }
}
Contributing
Feel free to open issues and submit pull requests if you want to contribute to the project.

License
This project is licensed under the MIT License - see the LICENSE file for details.

markdown
Copiar código

### Descrição das Seções:
- **Features**: Descreva as funcionalidades principais do projeto.
- **Getting Started**: Explique como clonar, compilar e executar o projeto.
- **Knight Movement Logic**: Detalhe a lógica específica do movimento do cavalo.
- **Usage**: Mostre exemplos de como utilizar o código, se aplicável.
- **Contributing**: Instrua como os outros podem contribuir para o projeto.
- **License**: Indique a licença sob a qual o projeto é distribuído.

Isso deve cobrir as principais informações necessárias para qualquer pessoa que esteja interessada em usar ou contribuir para o seu projeto.





