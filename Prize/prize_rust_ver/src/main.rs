use std::io;

fn main() {
    println!("Enter the prize number. (1 for the first, 2 for the second, 3 for the third, 0 to participate)");

    let mut prize_number = String::new();

    io::stdin()
        .read_line(&mut prize_number)
        .expect("Failed to read line");

    let prize_number: u32 = match prize_number.trim().parse() {
        Ok(num) => num,
        Err(_) => {
            println!("Invalid input! Please enter a number!");
            return;
        }
    };

    match prize_number {
        1 => println!("10000RMB! You will buy a new notebook."),
        2 => println!("5000RMB! You will buy a new iPad."),
        3 => println!("2000RMB! You will buy a new backpack."),
        0 => println!("Thanks for participating."),
        _ => println!(
            "Invalid prize number! Please enter a number between 1 and 3, or 0 to participate."
        ),
    }
}
