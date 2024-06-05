package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

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
                moveTo(16.9f, 20.958f)
                lineTo(15.676f, 24.0f)
                lineTo(15.0f, 24.0f)
                arcTo(15.017f, 15.017f, 0.0f, false, true, 0.0f, 9.0f)
                lineTo(0.0f, 8.324f)
                lineTo(3.042f, 7.1f)
                curveTo(3.454f, 15.459f, 8.541f, 20.546f, 16.9f, 20.958f)
                close()
                moveTo(23.832f, 3.673f)
                lineTo(17.687f, 18.989f)
                curveToRelative(-8.074f, -0.115f, -12.561f, -4.6f, -12.676f, -12.675f)
                lineTo(20.3f, 0.181f)
                arcToRelative(2.734f, 2.734f, 0.0f, false, true, 3.536f, 3.492f)
                close()
                moveTo(13.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 11.0f)
                close()
                moveTo(18.784f, 10.883f)
                lineTo(20.63f, 6.283f)
                arcTo(2.487f, 2.487f, 0.0f, true, false, 18.784f, 10.883f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
