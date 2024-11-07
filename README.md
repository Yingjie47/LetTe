# LetTe
This is an open source repository for the article **“LetTe: Intent-driven Web UI Tests Repair with LLM”**, which contains the dataset we manually collected and experimental results.

- The basic information about our dataset is shown below:

| Application | ∆ V | Old Version | Updated Version | Test Cases | Broken Tests |
| :----:| :----: | :----: | :----: | :----: | :----: |
| Admidio | 12 | 4.2.0 | 4.2.13 | 63 | 5 |
| Collabtive | 2 | 3.0.0 | 3.1.0 | 43 | 5 |
| MantisBT | 11 | 2.24.3 | 2.26.0 | 40 | 23 |
| MRBS | 2 | 1.11.1 | 1.11.4 | 30 | 5 |
| PHP-Fusion | 5 | 9.03.90 | 9.10.30 | 160 | 69 |

- It contains the test cases after LetTe repair (successful repair or failed repair), as well as the log file of the repair process.
    - Experimental result of LetTe on the collected dataset.
    - Experimental results for variants of LetTe on the collected dataset.
    - The result of ablation experiment for intent of LetTe on the collected dataset.
    - Experimental result of LetTe on the dataset of the previous study.
