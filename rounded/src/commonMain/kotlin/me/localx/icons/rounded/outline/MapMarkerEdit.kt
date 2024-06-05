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

public val Icons.Outline.MapMarkerEdit: ImageVector
    get() {
        if (_mapMarkerEdit != null) {
            return _mapMarkerEdit!!
        }
        _mapMarkerEdit = Builder(name = "MapMarkerEdit", defaultWidth = 512.0.dp, defaultHeight =
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
                moveTo(9.172f, 16.0f)
                horizontalLineToRelative(-1.172f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-1.171f)
                curveToRelative(0.0f, -1.335f, 0.521f, -2.591f, 1.465f, -3.536f)
                lineToRelative(3.414f, -3.414f)
                curveToRelative(1.17f, -1.17f, 3.072f, -1.17f, 4.242f, 0.0f)
                curveToRelative(0.566f, 0.566f, 0.879f, 1.32f, 0.879f, 2.121f)
                reflectiveCurveToRelative(-0.313f, 1.555f, -0.879f, 2.122f)
                lineToRelative(-3.414f, 3.414f)
                curveToRelative(-0.944f, 0.944f, -2.199f, 1.464f, -3.535f, 1.464f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(0.172f)
                curveToRelative(0.79f, 0.0f, 1.562f, -0.32f, 2.121f, -0.878f)
                lineToRelative(3.414f, -3.415f)
                curveToRelative(0.189f, -0.189f, 0.293f, -0.44f, 0.293f, -0.707f)
                reflectiveCurveToRelative(-0.104f, -0.518f, -0.293f, -0.707f)
                curveToRelative(-0.391f, -0.391f, -1.023f, -0.39f, -1.414f, 0.0f)
                lineToRelative(-3.414f, 3.414f)
                curveToRelative(-0.566f, 0.567f, -0.879f, 1.32f, -0.879f, 2.122f)
                verticalLineToRelative(0.171f)
                close()
            }
        }
        .build()
        return _mapMarkerEdit!!
    }

private var _mapMarkerEdit: ImageVector? = null
