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

public val Icons.Filled.RectangleXmark: ImageVector
    get() {
        if (_rectangleXmark != null) {
            return _rectangleXmark!!
        }
        _rectangleXmark = Builder(name = "RectangleXmark", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                lineTo(3.0f, 2.0f)
                curveTo(1.346f, 2.0f, 0.0f, 3.346f, 0.0f, 5.0f)
                lineTo(0.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 5.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(16.457f, 15.043f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-3.043f, -3.043f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(-3.043f, -3.043f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(3.043f, 3.043f)
                lineToRelative(3.043f, -3.043f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.043f, 3.043f)
                lineToRelative(3.043f, 3.043f)
                close()
            }
        }
        .build()
        return _rectangleXmark!!
    }

private var _rectangleXmark: ImageVector? = null
