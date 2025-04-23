<?php

class roster {
    private $items = [];

    public function addItem(string $item): void {
        $this->items[] = $item;
    }

    public function getItem(int $index): ?string {
        return $this->items[$index] ?? null;
    }

    public function getItems(): array {
        return $this->items;
    }
}

?>