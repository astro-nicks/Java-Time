import pywhatkit as kit

phone_number = "+233257323509"  # Use the full international format, e.g., +1234567890
message = "Hello, this is a test message!"
hour = 12  # 24-hour format (3 PM)
minute = 56  # Specific minute to send the message

# Send the message
kit.sendwhatmsg(phone_number, message, hour, minute)
