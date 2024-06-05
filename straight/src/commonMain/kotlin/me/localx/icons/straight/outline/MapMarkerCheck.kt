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

public val Icons.Outline.MapMarkerCheck: ImageVector
    get() {
        if (_mapMarkerCheck != null) {
            return _mapMarkerCheck!!
        }
        _mapMarkerCheck = Builder(name = "MapMarkerCheck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.994f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-3.906f, -3.907f, -3.906f, -10.251f, -0.008f, -14.15f)
                curveTo(6.818f, 1.046f, 9.329f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveToRelative(5.182f, 1.04f, 7.071f, 2.929f)
                horizontalLineToRelative(0.0f)
                curveToRelative(3.898f, 3.899f, 3.898f, 10.243f, 0.0f, 14.142f)
                lineToRelative(-7.071f, 6.916f)
                close()
                moveTo(12.0f, 2.007f)
                curveToRelative(-2.137f, 0.0f, -4.146f, 0.832f, -5.657f, 2.343f)
                curveToRelative(-3.119f, 3.119f, -3.119f, 8.194f, 0.0f, 11.314f)
                lineToRelative(5.657f, 5.532f)
                lineToRelative(5.665f, -5.54f)
                curveToRelative(3.111f, -3.111f, 3.11f, -8.187f, -0.008f, -11.306f)
                curveToRelative(-1.512f, -1.511f, -3.521f, -2.343f, -5.657f, -2.343f)
                close()
                moveTo(11.906f, 13.42f)
                lineToRelative(5.793f, -5.707f)
                lineToRelative(-1.404f, -1.425f)
                lineToRelative(-5.809f, 5.701f)
                lineToRelative(-2.793f, -2.707f)
                lineToRelative(-1.393f, 1.437f)
                lineToRelative(2.782f, 2.696f)
                curveToRelative(0.391f, 0.391f, 0.903f, 0.585f, 1.416f, 0.585f)
                reflectiveCurveToRelative(1.021f, -0.193f, 1.407f, -0.58f)
                close()
            }
        }
        .build()
        return _mapMarkerCheck!!
    }

private var _mapMarkerCheck: ImageVector? = null
