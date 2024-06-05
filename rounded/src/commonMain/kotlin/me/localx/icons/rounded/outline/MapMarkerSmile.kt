package me.localx.icons.rounded.outline

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
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.431f, 0.0f, -2.783f, -0.551f, -3.807f, -1.552f)
                lineToRelative(-3.943f, -3.643f)
                curveToRelative(-2.106f, -2.105f, -3.25f, -4.867f, -3.25f, -7.805f)
                reflectiveCurveToRelative(1.144f, -5.701f, 3.222f, -7.778f)
                curveTo(6.299f, 1.145f, 9.062f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.7f, 1.145f, 7.778f, 3.222f)
                curveToRelative(2.078f, 2.077f, 3.222f, 4.839f, 3.222f, 7.778f)
                reflectiveCurveToRelative(-1.145f, 5.7f, -3.222f, 7.778f)
                lineToRelative(-3.992f, 3.689f)
                curveToRelative(-1.003f, 0.981f, -2.355f, 1.533f, -3.787f, 1.533f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-2.404f, 0.0f, -4.665f, 0.936f, -6.364f, 2.636f)
                curveToRelative(-1.7f, 1.7f, -2.636f, 3.959f, -2.636f, 6.364f)
                reflectiveCurveToRelative(0.936f, 4.664f, 2.636f, 6.364f)
                lineToRelative(3.935f, 3.635f)
                curveToRelative(1.336f, 1.306f, 3.543f, 1.286f, 4.837f, 0.02f)
                lineToRelative(3.984f, -3.682f)
                curveToRelative(1.671f, -1.673f, 2.608f, -3.933f, 2.608f, -6.336f)
                reflectiveCurveToRelative(-0.937f, -4.664f, -2.636f, -6.364f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.636f, -6.364f, -2.636f)
                close()
                moveTo(16.707f, 13.05f)
                curveToRelative(0.391f, -0.391f, 0.391f, -1.023f, 0.0f, -1.414f)
                reflectiveCurveToRelative(-1.023f, -0.391f, -1.414f, 0.0f)
                curveToRelative(-0.879f, 0.879f, -2.049f, 1.364f, -3.293f, 1.364f)
                reflectiveCurveToRelative(-2.414f, -0.484f, -3.293f, -1.364f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.391f, -1.414f, 0.0f)
                reflectiveCurveToRelative(-0.391f, 1.023f, 0.0f, 1.414f)
                curveToRelative(1.257f, 1.257f, 2.929f, 1.95f, 4.707f, 1.95f)
                reflectiveCurveToRelative(3.45f, -0.692f, 4.707f, -1.95f)
                close()
                moveTo(9.5f, 7.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(14.5f, 7.0f)
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
