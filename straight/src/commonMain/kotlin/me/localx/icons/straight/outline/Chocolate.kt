package me.localx.icons.straight.outline

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

public val Icons.Outline.Chocolate: ImageVector
    get() {
        if (_chocolate != null) {
            return _chocolate!!
        }
        _chocolate = Builder(name = "Chocolate", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.121f, 7.243f)
                lineTo(16.758f, 0.879f)
                arcToRelative(3.073f, 3.073f, 0.0f, false, false, -4.243f, 0.0f)
                lineTo(0.879f, 12.515f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.242f)
                lineToRelative(6.364f, 6.364f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.242f, 0.0f)
                lineTo(23.121f, 11.485f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -4.242f)
                close()
                moveTo(13.929f, 2.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineToRelative(2.443f, 2.443f)
                lineTo(15.459f, 7.063f)
                lineToRelative(-3.15f, -3.15f)
                close()
                moveTo(11.968f, 13.382f)
                lineTo(15.182f, 16.6f)
                lineToRelative(-2.077f, 2.077f)
                lineTo(9.891f, 15.459f)
                close()
                moveTo(8.477f, 14.045f)
                lineTo(5.327f, 10.9f)
                lineTo(7.4f, 8.818f)
                lineToRelative(3.15f, 3.15f)
                close()
                moveTo(13.377f, 11.968f)
                lineTo(15.454f, 9.891f)
                lineTo(18.668f, 13.105f)
                lineTo(16.6f, 15.182f)
                close()
                moveTo(11.963f, 10.554f)
                lineTo(8.818f, 7.4f)
                lineTo(10.9f, 5.327f)
                lineToRelative(3.15f, 3.15f)
                close()
                moveTo(2.0f, 14.636f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, 0.293f, -0.707f)
                lineToRelative(1.62f, -1.62f)
                lineToRelative(3.15f, 3.15f)
                lineTo(4.736f, 17.786f)
                lineTo(2.292f, 15.342f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 2.0f, 14.636f)
                close()
                moveTo(10.071f, 21.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(6.15f, 19.2f)
                lineToRelative(2.327f, -2.327f)
                lineToRelative(3.214f, 3.214f)
                close()
                moveTo(21.707f, 10.071f)
                lineToRelative(-1.62f, 1.62f)
                lineTo(16.873f, 8.477f)
                lineTo(19.2f, 6.15f)
                lineToRelative(2.507f, 2.507f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.413f)
                close()
            }
        }
        .build()
        return _chocolate!!
    }

private var _chocolate: ImageVector? = null
