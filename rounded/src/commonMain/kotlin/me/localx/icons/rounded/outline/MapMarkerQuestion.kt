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

public val Icons.Outline.MapMarkerQuestion: ImageVector
    get() {
        if (_mapMarkerQuestion != null) {
            return _mapMarkerQuestion!!
        }
        _mapMarkerQuestion = Builder(name = "MapMarkerQuestion", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveToRelative(1.336f, 1.306f, 3.542f, 1.286f, 4.837f, 0.02f)
                lineToRelative(3.984f, -3.682f)
                curveToRelative(1.671f, -1.673f, 2.608f, -3.933f, 2.608f, -6.336f)
                reflectiveCurveToRelative(-0.937f, -4.664f, -2.636f, -6.364f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.7f, -1.7f, -3.96f, -2.636f, -6.364f, -2.636f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.551f, 0.408f, -1.208f, 0.929f, -1.495f)
                curveToRelative(1.5f, -0.827f, 2.307f, -2.523f, 2.008f, -4.222f)
                curveToRelative(-0.283f, -1.613f, -1.607f, -2.937f, -3.221f, -3.22f)
                curveToRelative(-1.181f, -0.205f, -2.379f, 0.11f, -3.287f, 0.873f)
                curveToRelative(-0.908f, 0.763f, -1.429f, 1.879f, -1.429f, 3.064f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.592f, 0.261f, -1.151f, 0.715f, -1.533f)
                curveToRelative(0.46f, -0.388f, 1.05f, -0.542f, 1.655f, -0.435f)
                curveToRelative(0.787f, 0.138f, 1.458f, 0.81f, 1.597f, 1.596f)
                curveToRelative(0.153f, 0.87f, -0.242f, 1.704f, -1.004f, 2.125f)
                curveToRelative(-1.156f, 0.637f, -1.963f, 1.972f, -1.963f, 3.247f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(13.5f, 17.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _mapMarkerQuestion!!
    }

private var _mapMarkerQuestion: ImageVector? = null
