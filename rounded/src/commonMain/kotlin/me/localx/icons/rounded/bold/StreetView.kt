package me.localx.icons.rounded.bold

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

public val Icons.Bold.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                close()
                moveTo(8.0f, 11.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 1.393f, -0.819f, 2.599f, -2.0f, 3.162f)
                verticalLineToRelative(2.838f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-2.838f)
                curveToRelative(-1.181f, -0.563f, -2.0f, -1.769f, -2.0f, -3.162f)
                close()
                moveTo(11.0f, 11.5f)
                curveToRelative(0.0f, 0.276f, 0.225f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.275f, 0.0f, 0.5f, -0.224f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.551f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(18.865f, 15.045f)
                curveToRelative(-0.806f, -0.203f, -1.619f, 0.286f, -1.82f, 1.09f)
                curveToRelative(-0.201f, 0.803f, 0.286f, 1.618f, 1.09f, 1.82f)
                curveToRelative(1.698f, 0.426f, 2.497f, 0.936f, 2.777f, 1.203f)
                curveToRelative(-0.67f, 0.642f, -3.674f, 1.842f, -8.912f, 1.842f)
                reflectiveCurveToRelative(-8.242f, -1.2f, -8.912f, -1.842f)
                curveToRelative(0.28f, -0.268f, 1.079f, -0.777f, 2.777f, -1.203f)
                curveToRelative(0.804f, -0.202f, 1.291f, -1.017f, 1.09f, -1.82f)
                curveToRelative(-0.202f, -0.804f, -1.02f, -1.292f, -1.82f, -1.09f)
                curveToRelative(-3.312f, 0.832f, -5.135f, 2.293f, -5.135f, 4.114f)
                curveToRelative(0.0f, 3.344f, 6.027f, 4.841f, 12.0f, 4.841f)
                reflectiveCurveToRelative(12.0f, -1.497f, 12.0f, -4.841f)
                curveToRelative(0.0f, -1.821f, -1.823f, -3.283f, -5.135f, -4.114f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
