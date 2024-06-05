package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.424f, 21.974f)
                arcToRelative(4.943f, 4.943f, 0.0f, false, true, -5.176f, 1.874f)
                horizontalLineToRelative(0.0f)
                arcTo(15.857f, 15.857f, 0.0f, false, true, 0.153f, 12.753f)
                arcTo(4.937f, 4.937f, 0.0f, false, true, 2.027f, 7.584f)
                arcTo(14.429f, 14.429f, 0.0f, false, false, 16.424f, 21.974f)
                close()
                moveTo(23.832f, 3.674f)
                lineTo(17.4f, 20.0f)
                lineTo(17.0f, 20.0f)
                arcTo(12.574f, 12.574f, 0.0f, false, true, 4.0f, 7.0f)
                lineTo(4.0f, 6.6f)
                lineTo(20.3f, 0.178f)
                arcTo(2.749f, 2.749f, 0.0f, false, true, 23.832f, 3.673f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
                moveTo(18.122f, 12.716f)
                lineTo(20.676f, 6.23f)
                curveTo(16.416f, 4.738f, 14.058f, 10.906f, 18.122f, 12.716f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
