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

public val Icons.Filled.Route: ImageVector
    get() {
        if (_route != null) {
            return _route!!
        }
        _route = Builder(name = "Route", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.535f, 14.464f)
                curveToRelative(-0.944f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.536f, 1.464f)
                curveToRelative(-1.95f, 1.949f, -1.95f, 5.122f, 0.026f, 7.096f)
                lineToRelative(1.99f, 1.849f)
                curveToRelative(0.428f, 0.398f, 0.976f, 0.596f, 1.524f, 0.596f)
                reflectiveCurveToRelative(1.1f, -0.2f, 1.528f, -0.6f)
                lineToRelative(2.001f, -1.871f)
                curveToRelative(0.945f, -0.944f, 1.465f, -2.2f, 1.465f, -3.535f)
                reflectiveCurveToRelative(-0.52f, -2.591f, -1.465f, -3.536f)
                close()
                moveTo(17.48f, 10.409f)
                curveToRelative(0.428f, 0.397f, 0.976f, 0.596f, 1.524f, 0.596f)
                reflectiveCurveToRelative(1.101f, -0.2f, 1.529f, -0.6f)
                lineToRelative(2.001f, -1.871f)
                curveToRelative(1.95f, -1.949f, 1.95f, -5.122f, 0.0f, -7.071f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.945f, -0.944f, -2.2f, -1.464f, -3.535f, -1.464f)
                reflectiveCurveToRelative(-2.591f, 0.52f, -3.536f, 1.464f)
                curveToRelative(-1.95f, 1.949f, -1.95f, 5.122f, 0.026f, 7.096f)
                lineToRelative(1.99f, 1.849f)
                close()
                moveTo(24.0f, 19.999f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                lineTo(11.0f, 23.999f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, -1.794f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.692f, 1.072f, -3.208f, 2.667f, -3.772f)
                curveToRelative(0.522f, -0.185f, 1.092f, 0.089f, 1.276f, 0.61f)
                curveToRelative(0.184f, 0.521f, -0.089f, 1.092f, -0.61f, 1.276f)
                curveToRelative(-0.797f, 0.282f, -1.333f, 1.04f, -1.333f, 1.886f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _route!!
    }

private var _route: ImageVector? = null
