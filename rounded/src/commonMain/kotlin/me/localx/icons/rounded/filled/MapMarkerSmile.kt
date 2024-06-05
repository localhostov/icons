package me.localx.icons.rounded.filled

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
                moveTo(19.778f, 3.222f)
                curveTo(17.7f, 1.145f, 14.938f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(6.299f, 1.145f, 4.222f, 3.222f)
                curveToRelative(-2.078f, 2.077f, -3.222f, 4.839f, -3.222f, 7.778f)
                reflectiveCurveToRelative(1.144f, 5.7f, 3.25f, 7.805f)
                lineToRelative(3.943f, 3.643f)
                curveToRelative(1.023f, 1.001f, 2.375f, 1.552f, 3.807f, 1.552f)
                reflectiveCurveToRelative(2.784f, -0.551f, 3.787f, -1.533f)
                lineToRelative(3.992f, -3.689f)
                curveToRelative(2.078f, -2.078f, 3.222f, -4.84f, 3.222f, -7.778f)
                reflectiveCurveToRelative(-1.145f, -5.701f, -3.222f, -7.778f)
                close()
                moveTo(14.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.5f, 7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16.707f, 13.05f)
                curveToRelative(-1.257f, 1.257f, -2.929f, 1.95f, -4.707f, 1.95f)
                reflectiveCurveToRelative(-3.45f, -0.692f, -4.707f, -1.95f)
                curveToRelative(-0.391f, -0.391f, -0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(1.023f, -0.391f, 1.414f, 0.0f)
                curveToRelative(0.879f, 0.879f, 2.049f, 1.364f, 3.293f, 1.364f)
                reflectiveCurveToRelative(2.414f, -0.484f, 3.293f, -1.364f)
                curveToRelative(0.391f, -0.391f, 1.023f, -0.391f, 1.414f, 0.0f)
                reflectiveCurveToRelative(0.391f, 1.023f, 0.0f, 1.414f)
                close()
            }
        }
        .build()
        return _mapMarkerSmile!!
    }

private var _mapMarkerSmile: ImageVector? = null
