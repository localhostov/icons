package me.localx.icons.rounded.bold

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
                arcTo(3.142f, 3.142f, 0.0f, false, false, 19.725f, 0.208f)
                lineTo(3.354f, 6.653f)
                arcToRelative(5.3f, 5.3f, 0.0f, false, false, -3.19f, 6.2f)
                arcTo(15.686f, 15.686f, 0.0f, false, false, 11.145f, 23.836f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.305f, 5.305f, 0.0f, false, false, 6.205f, -3.2f)
                lineToRelative(6.457f, -16.4f)
                arcTo(3.126f, 3.126f, 0.0f, false, false, 23.072f, 0.929f)
                close()
                moveTo(19.36f, 7.344f)
                arcToRelative(2.985f, 2.985f, 0.0f, true, false, -2.178f, 5.531f)
                lineToRelative(-2.62f, 6.654f)
                arcToRelative(2.342f, 2.342f, 0.0f, false, true, -0.253f, 0.459f)
                curveToRelative(-5.076f, -0.126f, -10.173f, -5.223f, -10.3f, -10.3f)
                arcToRelative(2.331f, 2.331f, 0.0f, false, true, 0.45f, -0.248f)
                lineTo(20.787f, 3.014f)
                arcToRelative(0.133f, 0.133f, 0.0f, false, true, 0.164f, 0.036f)
                arcToRelative(0.136f, 0.136f, 0.0f, false, true, 0.05f, 0.126f)
                horizontalLineToRelative(0.0f)
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
