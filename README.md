# IShield — Audio Steganography

A Java Swing desktop application that hides encrypted text messages inside WAV
audio files using LSB (least significant bit) steganography.

Built as a NetBeans/Ant project (`AudioSteganography`).

## Features

- **Login screen** — simple credential gate before the main menu.
- **Encode** — load a `.txt` message and a `.wav` file, encrypt the text with a
  keyed cipher, embed the ciphertext bits into the audio, and save a new `.wav`.
- **Decode** — extract the hidden bits from an encoded WAV and decrypt them
  with the same key.
- **Report** — shows statistics about the encode/decode operation.
- **Playback** — play/stop the original and the encoded audio for comparison.

## How it works

1. The message is encrypted with a keyed substitution cipher
   (`CryptoSystem` + `CMatrix`, a 9×10 matrix built from an alphabetic key).
2. The ciphertext is converted to a binary string.
3. Starting from the end of the WAV file, one bit per audio byte is overwritten
   with a ciphertext bit (`StEncode.encode`, `layer = 2`).
4. Decoding reads those bits back out and decrypts with the same key.

## Project structure

```
src/        Java sources and UI assets
audio/      Sample / input / output WAV files
test/       (empty — no tests yet)
build/      Compiled output (not tracked)
nbproject/  NetBeans project config
build.xml   Ant build script
```

## Running

Open the project in NetBeans and run `StLogin.java` (or `StMenu.java` to skip
the login screen).

Requires a JDK with Swing support (any modern JDK works; the project targets
Java 8-era syntax).

## Login

See `src/StLogin.java` — the credentials are hard-coded for demonstration
purposes.
