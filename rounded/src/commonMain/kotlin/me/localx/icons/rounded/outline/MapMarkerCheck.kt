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
                moveTo(12.0f, 24.0f)
                curveToRelative(-1.432f, 0.0f, -2.784f, -0.551f, -3.807f, -1.552f)
                lineToRelative(-3.943f, -3.643f)
                curveToRelative(-2.106f, -2.105f, -3.25f, -4.867f, -3.25f, -7.805f)
                reflectiveCurveToRelative(1.144f, -5.701f, 3.222f, -7.778f)
                curveTo(6.3f, 1.145f, 9.062f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(5.7f, 1.144f, 7.778f, 3.222f)
                horizontalLineToRelative(0.0f)
                curveToRelative(2.078f, 2.077f, 3.222f, 4.839f, 3.222f, 7.778f)
                reflectiveCurveToRelative(-1.144f, 5.7f, -3.222f, 7.778f)
                lineToRelative(-3.992f, 3.689f)
                curveToRelative(-1.002f, 0.981f, -2.354f, 1.533f, -3.786f, 1.533f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(-2.404f, 0.0f, -4.664f, 0.936f, -6.364f, 2.636f)
                curveToRelative(-1.7f, 1.7f, -2.636f, 3.959f, -2.636f, 6.364f)
                reflectiveCurveToRelative(0.936f, 4.664f, 2.636f, 6.364f)
                lineToRelative(3.936f, 3.635f)
                curveToRelative(1.336f, 1.306f, 3.542f, 1.286f, 4.837f, 0.02f)
                lineToRelative(3.984f, -3.682f)
                curveToRelative(1.672f, -1.673f, 2.607f, -3.933f, 2.607f, -6.336f)
                reflectiveCurveToRelative(-0.937f, -4.664f, -2.636f, -6.364f)
                curveToRelative(-1.7f, -1.7f, -3.961f, -2.636f, -6.364f, -2.636f)
                close()
                moveTo(11.906f, 14.419f)
                lineToRelative(5.793f, -5.707f)
                curveToRelative(0.394f, -0.388f, 0.397f, -1.021f, 0.01f, -1.414f)
                curveToRelative(-0.387f, -0.393f, -1.02f, -0.398f, -1.414f, -0.011f)
                lineToRelative(-5.809f, 5.701f)
                lineToRelative(-2.793f, -2.707f)
                curveToRelative(-0.396f, -0.383f, -1.029f, -0.375f, -1.414f, 0.022f)
                curveToRelative(-0.385f, 0.396f, -0.375f, 1.029f, 0.021f, 1.414f)
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
