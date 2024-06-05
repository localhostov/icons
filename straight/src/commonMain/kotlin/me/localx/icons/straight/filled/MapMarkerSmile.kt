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

public val Icons.Filled.MapMarkerSmile: ImageVector
    get() {
        if (_mapMarkerSmile != null) {
            return _mapMarkerSmile!!
        }
        _mapMarkerSmile = Builder(name = "MapMarkerSmile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.071f, 2.936f)
                curveTo(17.182f, 1.047f, 14.671f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveTo(6.818f, 1.046f, 4.929f, 2.936f)
                curveToRelative(-1.889f, 1.889f, -2.929f, 4.4f, -2.929f, 7.071f)
                reflectiveCurveToRelative(1.04f, 5.183f, 2.937f, 7.079f)
                lineToRelative(7.063f, 6.908f)
                lineToRelative(7.071f, -6.916f)
                curveToRelative(1.889f, -1.889f, 2.929f, -4.4f, 2.929f, -7.071f)
                reflectiveCurveToRelative(-1.04f, -5.182f, -2.929f, -7.071f)
                close()
                moveTo(14.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.5f, 6.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-1.778f, 0.0f, -3.45f, -0.692f, -4.708f, -1.95f)
                lineToRelative(1.414f, -1.414f)
                curveToRelative(0.88f, 0.879f, 2.05f, 1.364f, 3.293f, 1.364f)
                reflectiveCurveToRelative(2.413f, -0.484f, 3.292f, -1.364f)
                lineToRelative(1.414f, 1.414f)
                curveToRelative(-1.257f, 1.257f, -2.929f, 1.95f, -4.707f, 1.95f)
                close()
            }
        }
        .build()
        return _mapMarkerSmile!!
    }

private var _mapMarkerSmile: ImageVector? = null
