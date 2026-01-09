export function decodedResistorValue(colors: string[]): string {
  const convertTab = [
    "black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white"
  ];

  const v1 = convertTab.indexOf(colors[0]);
  const v2 = convertTab.indexOf(colors[1]);
  const v3 = convertTab.indexOf(colors[2]);

  const baseValue = v1 * 10 + v2;
  const ohms = baseValue * 10 ** v3;

  if (ohms >= 1_000_000_000) {
    return `${ohms / 1_000_000_000} gigaohms`;
  }

  if (ohms >= 1_000_000) {
    return `${ohms / 1_000_000} megaohms`;
  }

  if (ohms >= 1_000) {
    return `${ohms / 1_000} kiloohms`;
  }

  return `${ohms} ohms`;
}

