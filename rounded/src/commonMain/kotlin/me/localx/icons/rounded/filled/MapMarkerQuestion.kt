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

public val Icons.Filled.MapMarkerQuestion: ImageVector
    get() {
        if (_mapMarkerQuestion != null) {
            return _mapMarkerQuestion!!
        }
        _mapMarkerQuestion = Builder(name = "MapMarkerQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 19.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(13.929f, 11.505f)
                curveToRelative(-0.521f, 0.287f, -0.929f, 0.944f, -0.929f, 1.495f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.274f, 0.807f, -2.609f, 1.963f, -3.247f)
                curveToRelative(0.762f, -0.42f, 1.157f, -1.254f, 1.004f, -2.125f)
                curveToRelative(-0.138f, -0.787f, -0.81f, -1.458f, -1.597f, -1.596f)
                curveToRelative(-0.605f, -0.107f, -1.195f, 0.047f, -1.655f, 0.435f)
                curveToRelative(-0.455f, 0.381f, -0.715f, 0.94f, -0.715f, 1.533f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                curveToRelative(0.0f, -1.185f, 0.521f, -2.302f, 1.429f, -3.064f)
                curveToRelative(0.908f, -0.762f, 2.106f, -1.077f, 3.287f, -0.873f)
                curveToRelative(1.613f, 0.283f, 2.938f, 1.607f, 3.221f, 3.22f)
                curveToRelative(0.298f, 1.698f, -0.509f, 3.395f, -2.008f, 4.222f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestion!!
    }

private var _mapMarkerQuestion: ImageVector? = null
