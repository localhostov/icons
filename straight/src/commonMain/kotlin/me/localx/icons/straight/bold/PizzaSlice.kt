package me.localx.icons.straight.bold

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

public val Icons.Bold.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.072f, 0.929f)
                arcTo(3.149f, 3.149f, 0.0f, false, false, 19.716f, 0.211f)
                lineTo(0.0f, 8.122f)
                verticalLineTo(9.137f)
                arcTo(14.881f, 14.881f, 0.0f, false, false, 14.864f, 24.0f)
                horizontalLineToRelative(1.014f)
                lineTo(23.807f, 4.238f)
                arcTo(3.126f, 3.126f, 0.0f, false, false, 23.072f, 0.929f)
                close()
                moveTo(19.441f, 7.064f)
                arcToRelative(3.785f, 3.785f, 0.0f, false, false, -2.753f, 6.861f)
                lineToRelative(-2.412f, 6.012f)
                arcTo(11.338f, 11.338f, 0.0f, false, true, 4.063f, 9.725f)
                lineTo(20.787f, 3.014f)
                arcToRelative(0.133f, 0.133f, 0.0f, false, true, 0.164f, 0.036f)
                arcTo(0.15f, 0.15f, 0.0f, false, true, 21.0f, 3.169f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
