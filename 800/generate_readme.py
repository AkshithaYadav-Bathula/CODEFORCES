import os
import sys
import requests
from bs4 import BeautifulSoup

# ----------- USER CONFIG -------------
BASE_PATH = r"A:\CP\CODEFORCES"
DEFAULT_DIFFICULTY = "800"  # You can change or prompt later
# -------------------------------------

def beautify_title(title):
    return title.strip().replace(" ", "_").replace("/", "_")

def generate_readme(url):
    if "codeforces.com" not in url:
        print("❌ Invalid Codeforces link")
        return

    # Add User-Agent header
    headers = {
        "User-Agent": "Mozilla/5.0"
    }

    # Fetch page
    response = requests.get(url, headers=headers)
    if response.status_code != 200:
        print("❌ Failed to fetch problem page.")
        return

    soup = BeautifulSoup(response.text, 'html.parser')

    # Extract parts
    title_tag = soup.find('div', class_='title')
    time_tag = soup.find('div', class_='time-limit')
    memory_tag = soup.find('div', class_='memory-limit')
    statement_tag = soup.find('div', class_='problem-statement')

    if not all([title_tag, time_tag, memory_tag, statement_tag]):
        print("❌ Could not extract all data from problem.")
        return

    # Parse values
    title_full = title_tag.text.strip()           # e.g., A. Halloumi Boxes
    problem_code = title_full.split('.')[0].strip()   # e.g., A
    problem_title = beautify_title(title_full.split('.')[1])
    contest_id = url.split("/")[-2]               # e.g., 1903
    full_code = f"{contest_id}{problem_code}"     # e.g., 1903A
    difficulty = DEFAULT_DIFFICULTY

    folder_path = os.path.join(BASE_PATH, difficulty, f"{full_code}_{problem_title}")
    os.makedirs(folder_path, exist_ok=True)

    readme_path = os.path.join(folder_path, "README.md")
    java_path = os.path.join(folder_path, "Main.java")

    # Extract HTML and metadata
    problem_html = statement_tag.prettify()
    time_limit = time_tag.text.strip().replace("\n", " ")
    memory_limit = memory_tag.text.strip().replace("\n", " ")

    # Write README
    with open(readme_path, "w", encoding="utf-8") as f:
        f.write(f"# {full_code} - {title_full.split('.')[1].strip()}\n\n")
        f.write(f"- **Difficulty**: {difficulty}\n")
        f.write(f"- **Link**: [{url}]({url})\n")
        f.write(f"- **{time_limit}**\n")
        f.write(f"- **{memory_limit}**\n\n")
        f.write(f"---\n\n")
        f.write(f"## 🧠 Problem Statement:\n\n")
        f.write(problem_html)

    # Create blank Main.java
    if not os.path.exists(java_path):
        with open(java_path, "w", encoding="utf-8") as f:
            f.write(f"// {full_code} - {title_full.split('.')[1].strip()}\n")
            f.write("import java.util.*;\n\n")
            f.write("public class Main {\n")
            f.write("    public static void main(String[] args) {\n")
            f.write("        Scanner sc = new Scanner(System.in);\n")
            f.write("        // TODO: Write your solution\n")
            f.write("    }\n")
            f.write("}\n")

    print(f"✅ Generated in: {folder_path}")

# Run with: python generate_readme.py <link>
if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage:\n  python generate_readme.py <codeforces_problem_url>")
    else:
        generate_readme(sys.argv[1])
