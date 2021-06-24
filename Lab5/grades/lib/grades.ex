defmodule Grades.Calculator do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """
  def percentage_grade(marks) do
    :rand.uniform(100)
  end

  def letter_grade(marks) do
    Enum.at(["A+", "A", "A-", "B+", "B", "C+", "C", "D+", "D", "E", "F"], :rand.uniform(10))
  end

  def numeric_grade(marks) do
    :rand.uniform(10)
  end
end
