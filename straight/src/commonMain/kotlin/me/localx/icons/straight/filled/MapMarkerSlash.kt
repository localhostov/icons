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

public val Icons.Filled.MapMarkerSlash: ImageVector
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
                curveToRelative(-0.098f, 0.098f, -0.182f, 0.204f, -0.276f, 0.306f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineTo(22.543f, 23.957f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-5.179f, -5.179f)
                close()
                moveTo(2.534f, 6.777f)
                lineToRelative(13.384f, 13.384f)
                lineToRelative(-3.918f, 3.833f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-2.782f, -2.782f, -3.608f, -6.792f, -2.403f, -10.308f)
                close()
            }
        }
        .build()
        return _mapMarkerSlash!!
    }

private var _mapMarkerSlash: ImageVector? = null
