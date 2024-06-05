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

public val Icons.Bold.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.684f, 15.0f)
                horizontalLineToRelative(-3.398f)
                lineToRelative(-1.742f, -3.095f)
                lineToRelative(1.771f, -2.905f)
                horizontalLineToRelative(3.372f)
                lineToRelative(1.824f, 3.003f)
                lineToRelative(-1.827f, 2.997f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -1.032f, 0.175f, -2.024f, 0.496f, -2.948f)
                lineToRelative(3.347f, 5.948f)
                horizontalLineToRelative(-3.329f)
                curveToRelative(-0.333f, -0.939f, -0.515f, -1.948f, -0.515f, -3.0f)
                close()
                moveTo(17.197f, 9.0f)
                horizontalLineToRelative(3.288f)
                curveToRelative(0.333f, 0.939f, 0.515f, 1.948f, 0.515f, 3.0f)
                curveToRelative(0.0f, 0.911f, -0.136f, 1.791f, -0.389f, 2.62f)
                lineToRelative(-3.413f, -5.62f)
                close()
                moveTo(18.702f, 6.0f)
                horizontalLineToRelative(-6.558f)
                lineToRelative(1.711f, -2.807f)
                curveToRelative(1.906f, 0.401f, 3.592f, 1.407f, 4.847f, 2.807f)
                close()
                moveTo(10.369f, 3.148f)
                lineToRelative(-3.511f, 5.759f)
                lineToRelative(-1.607f, -2.855f)
                curveToRelative(1.308f, -1.483f, 3.096f, -2.532f, 5.118f, -2.904f)
                close()
                moveTo(5.298f, 18.0f)
                horizontalLineToRelative(6.558f)
                lineToRelative(-1.711f, 2.807f)
                curveToRelative(-1.906f, -0.401f, -3.592f, -1.407f, -4.847f, -2.807f)
                close()
                moveTo(13.631f, 20.852f)
                lineToRelative(3.634f, -5.961f)
                lineToRelative(1.701f, 2.802f)
                curveToRelative(-1.324f, 1.617f, -3.199f, 2.767f, -5.335f, 3.16f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
