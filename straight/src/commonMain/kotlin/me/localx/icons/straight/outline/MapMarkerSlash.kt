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

public val Icons.Outline.MapMarkerSlash: ImageVector
    get() {
        if (_mapMarkerSlash != null) {
            return _mapMarkerSlash!!
        }
        _mapMarkerSlash = Builder(name = "MapMarkerSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.778f, 17.364f)
                lineToRelative(0.293f, -0.286f)
                curveToRelative(1.889f, -1.889f, 2.929f, -4.4f, 2.929f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.182f, -2.929f, -7.071f)
                curveTo(17.182f, 1.046f, 14.671f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveTo(6.818f, 1.046f, 4.93f, 2.935f)
                curveToRelative(-0.097f, 0.097f, -0.192f, 0.197f, -0.284f, 0.297f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.179f, -5.179f)
                close()
                moveTo(6.343f, 4.35f)
                curveToRelative(1.511f, -1.511f, 3.521f, -2.343f, 5.657f, -2.343f)
                reflectiveCurveToRelative(4.145f, 0.832f, 5.656f, 2.343f)
                reflectiveCurveToRelative(2.343f, 3.52f, 2.343f, 5.657f)
                reflectiveCurveToRelative(-0.832f, 4.146f, -2.335f, 5.649f)
                lineToRelative(-0.301f, 0.294f)
                lineTo(6.061f, 4.647f)
                curveToRelative(0.091f, -0.101f, 0.185f, -0.2f, 0.282f, -0.297f)
                close()
                moveTo(14.504f, 18.747f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.918f, 3.833f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-2.782f, -2.782f, -3.608f, -6.792f, -2.403f, -10.308f)
                lineToRelative(1.624f, 1.624f)
                curveToRelative(-0.524f, 2.555f, 0.218f, 5.295f, 2.185f, 7.263f)
                lineToRelative(5.657f, 5.532f)
                lineToRelative(2.504f, -2.449f)
                close()
            }
        }
        .build()
        return _mapMarkerSlash!!
    }

private var _mapMarkerSlash: ImageVector? = null
