package lista.compras;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.LinearLayout;
        import android.widget.TextView;

        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.List;

public class ComprasAdapter extends RecyclerView.Adapter<ComprasAdapter.ViewHolder> {

    private List<Compras> compras;

    public ComprasAdapter(List<Compras> compras) {
        this.compras = compras;
    }

    @NonNull
    @Override
    public ComprasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.compras_itens, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Compras compras = this.compras.get(position);
        holder.bind(compras);
    }

    @Override
    public int getItemCount() {
        return this.compras.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(Compras compras) {
            TextView txtName = itemView.findViewById(R.id.txt_compras_name);
            TextView txtCourse = itemView.findViewById(R.id.txt_compras_quantidade);
            LinearLayout linearLayout = itemView.findViewById(R.id.linear_compras_item);

            txtName.setText(compras.getName());
            txtCourse.setText(compras.getQuantidade());
            linearLayout.setBackgroundResource(compras.getBackgroundColor());
        }
    }
}
