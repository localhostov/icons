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

public val Icons.Outline.MapMarkerSmile: ImageVector
    get() {
        if (_mapMarkerSmile != null) {
            return _mapMarkerSmile!!
        }
        _mapMarkerSmile = Builder(name = "MapMarkerSmile", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.994f)
                lineToRelative(-7.063f, -6.908f)
                curveToRelative(-1.897f, -1.896f, -2.937f, -4.408f, -2.937f, -7.079f)
                reflectiveCurveToRelative(1.04f, -5.182f, 2.929f, -7.071f)
                curveTo(6.818f, 1.046f, 9.329f, 0.006f, 12.0f, 0.006f)
                reflectiveCurveToRelative(5.182f, 1.041f, 7.07f, 2.929f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.889f, 1.889f, 2.929f, 4.4f, 2.929f, 7.071f)
                reflectiveCurveToRelative(-1.04f, 5.183f, -2.929f, 7.071f)
                lineToRelative(-7.071f, 6.916f)
                close()
                moveTo(12.0f, 2.007f)
                curveToRelative(-2.137f, 0.0f, -4.146f, 0.832f, -5.657f, 2.343f)
                reflectiveCurveToRelative(-2.343f, 3.52f, -2.343f, 5.657f)
                reflectiveCurveToRelative(0.832f, 4.146f, 2.343f, 5.657f)
                lineToRelative(5.657f, 5.532f)
                lineToRelative(5.665f, -5.54f)
                curveToRelative(1.503f, -1.503f, 2.335f, -3.513f, 2.335f, -5.649f)
                reflectiveCurveToRelative(-0.832f, -4.146f, -2.343f, -5.657f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.511f, -1.511f, -3.52f, -2.343f, -5.656f, -2.343f)
                close()
                moveTo(16.706f, 12.051f)
                lineToRelative(-1.414f, -1.414f)
                curveToRelative(-0.879f, 0.879f, -2.049f, 1.364f, -3.292f, 1.364f)
                reflectiveCurveToRelative(-2.414f, -0.484f, -3.293f, -1.364f)
                lineToRelative(-1.414f, 1.414f)
                curveToRelative(1.258f, 1.257f, 2.93f, 1.95f, 4.708f, 1.95f)
                reflectiveCurveToRelative(3.449f, -0.692f, 4.707f, -1.95f)
                close()
                moveTo(9.499f, 6.001f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.499f, 6.001f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mapMarkerSmile!!
    }

private var _mapMarkerSmile: ImageVector? = null
