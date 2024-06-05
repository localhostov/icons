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

public val Icons.Bold.SortAlt: ImageVector
    get() {
        if (_sortAlt != null) {
            return _sortAlt!!
        }
        _sortAlt = Builder(name = "SortAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.067f, 17.445f)
                curveToRelative(0.582f, 0.589f, 0.577f, 1.539f, -0.012f, 2.121f)
                lineToRelative(-3.793f, 3.75f)
                curveToRelative(-0.484f, 0.483f, -1.121f, 0.726f, -1.759f, 0.726f)
                reflectiveCurveToRelative(-1.282f, -0.243f, -1.77f, -0.731f)
                lineToRelative(-3.787f, -3.744f)
                curveToRelative(-0.589f, -0.582f, -0.594f, -1.532f, -0.012f, -2.121f)
                curveToRelative(0.582f, -0.59f, 1.533f, -0.594f, 2.122f, -0.012f)
                lineToRelative(1.945f, 1.923f)
                verticalLineTo(1.5f)
                curveToRelative(0.0f, -0.828f, 0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineTo(19.357f)
                lineToRelative(1.945f, -1.923f)
                curveToRelative(0.59f, -0.582f, 1.539f, -0.578f, 2.122f, 0.012f)
                close()
                moveTo(23.055f, 4.477f)
                lineToRelative(-3.787f, -3.744f)
                curveToRelative(-0.974f, -0.975f, -2.56f, -0.975f, -3.529f, -0.006f)
                lineToRelative(-3.793f, 3.75f)
                curveToRelative(-0.589f, 0.582f, -0.594f, 1.532f, -0.012f, 2.121f)
                curveToRelative(0.582f, 0.59f, 1.533f, 0.594f, 2.122f, 0.012f)
                lineToRelative(1.945f, -1.923f)
                verticalLineTo(22.5f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                verticalLineTo(4.686f)
                lineToRelative(1.945f, 1.923f)
                curveToRelative(0.292f, 0.289f, 0.674f, 0.434f, 1.055f, 0.434f)
                curveToRelative(0.387f, 0.0f, 0.773f, -0.148f, 1.067f, -0.445f)
                curveToRelative(0.582f, -0.589f, 0.577f, -1.539f, -0.012f, -2.121f)
                close()
            }
        }
        .build()
        return _sortAlt!!
    }

private var _sortAlt: ImageVector? = null
