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

public val Icons.Bold.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.311f, 4.094f)
                arcToRelative(5.506f, 5.506f, 0.0f, false, false, -10.622f, 0.0f)
                arcToRelative(5.543f, 5.543f, 0.0f, false, false, -3.9f, 8.312f)
                lineTo(12.0f, 24.11f)
                lineToRelative(9.207f, -11.7f)
                arcTo(5.543f, 5.543f, 0.0f, false, false, 17.311f, 4.094f)
                close()
                moveTo(19.0f, 9.5f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, -0.065f, 0.5f)
                lineTo(13.523f, 10.0f)
                curveTo(13.177f, 6.428f, 18.762f, 5.834f, 19.0f, 9.5f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 2.221f, 1.377f)
                arcTo(5.774f, 5.774f, 0.0f, false, false, 12.0f, 5.881f)
                arcToRelative(5.774f, 5.774f, 0.0f, false, false, -2.221f, -1.5f)
                arcTo(2.493f, 2.493f, 0.0f, false, true, 12.0f, 3.0f)
                close()
                moveTo(7.75f, 7.0f)
                arcToRelative(2.736f, 2.736f, 0.0f, false, true, 2.727f, 3.0f)
                lineTo(5.065f, 10.0f)
                arcTo(2.564f, 2.564f, 0.0f, false, true, 7.75f, 7.0f)
                close()
                moveTo(7.062f, 13.0f)
                horizontalLineToRelative(9.876f)
                lineTo(12.0f, 19.265f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
