# Location: /zap/check_zap_report.py
import json
import sys

def load_report(file_path):
    with open(file_path) as f:
        return json.load(f)

def check_threshold(report, threshold="MEDIUM"):
    thresholds = {"LOW":0, "MEDIUM":1, "HIGH":2, "CRITICAL":3}
    max_severity = max((a['riskcode'] for s in report['site'] for a in s['alerts']), default=0)
    return max_severity >= thresholds.get(threshold.upper(), 1)

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python3 zap/check_zap_report.py report.json [MEDIUM]")
        sys.exit(1)
    
    exit(0 if not check_threshold(load_report(sys.argv[1]), sys.argv[2] if len(sys.argv)>2 else "MEDIUM") else 1)
