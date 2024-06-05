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

public val Icons.Bold.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = Builder(name = "LessThan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.891f, 23.062f)
                curveToRelative(-0.235f, 0.584f, -0.798f, 0.938f, -1.392f, 0.938f)
                curveToRelative(-0.187f, 0.0f, -0.377f, -0.035f, -0.561f, -0.109f)
                lineTo(2.783f, 16.155f)
                curveTo(1.08f, 15.467f, -0.021f, 13.836f, -0.021f, 12.0f)
                reflectiveCurveToRelative(1.101f, -3.467f, 2.803f, -4.155f)
                lineTo(21.938f, 0.109f)
                curveToRelative(0.767f, -0.311f, 1.643f, 0.062f, 1.952f, 0.829f)
                curveToRelative(0.311f, 0.768f, -0.061f, 1.643f, -0.829f, 1.952f)
                lineTo(3.906f, 10.626f)
                curveToRelative(-0.859f, 0.348f, -0.927f, 1.14f, -0.927f, 1.374f)
                reflectiveCurveToRelative(0.067f, 1.026f, 0.928f, 1.374f)
                lineToRelative(19.154f, 7.735f)
                curveToRelative(0.769f, 0.31f, 1.14f, 1.185f, 0.829f, 1.952f)
                close()
            }
        }
        .build()
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
