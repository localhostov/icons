package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.PizzaSlice: ImageVector
    get() {
        if (_pizzaSlice != null) {
            return _pizzaSlice!!
        }
        _pizzaSlice = Builder(name = "PizzaSlice", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2f, 0.8f)
                arcTo(2.716f, 2.716f, 0.0f, false, false, 20.3f, 0.176f)
                lineTo(3.155f, 6.929f)
                arcToRelative(4.976f, 4.976f, 0.0f, false, false, -3.0f, 5.824f)
                arcToRelative(15.855f, 15.855f, 0.0f, false, false, 11.094f, 11.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, 5.825f, -3.009f)
                lineTo(23.832f, 3.672f)
                arcTo(2.71f, 2.71f, 0.0f, false, false, 23.2f, 0.8f)
                close()
                moveTo(11.746f, 21.911f)
                arcTo(13.8f, 13.8f, 0.0f, false, true, 2.09f, 12.254f)
                arcToRelative(2.949f, 2.949f, 0.0f, false, true, 1.265f, -3.18f)
                arcTo(11.987f, 11.987f, 0.0f, false, false, 14.924f, 20.646f)
                arcTo(2.947f, 2.947f, 0.0f, false, true, 11.746f, 21.911f)
                close()
                moveTo(15.773f, 18.684f)
                curveToRelative(-6.191f, -0.1f, -10.355f, -4.265f, -10.456f, -10.457f)
                lineTo(21.01f, 2.047f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, 0.771f, 0.17f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.181f, 0.747f)
                lineTo(21.3f, 4.645f)
                curveToRelative(-5.758f, -1.98f, -8.942f, 6.209f, -3.413f, 8.668f)
                close()
                moveTo(18.62f, 11.452f)
                arcToRelative(2.654f, 2.654f, 0.0f, false, true, 1.943f, -4.935f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _pizzaSlice!!
    }

private var _pizzaSlice: ImageVector? = null
