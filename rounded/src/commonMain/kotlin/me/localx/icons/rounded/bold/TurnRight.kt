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

public val Icons.Bold.TurnRight: ImageVector
    get() {
        if (_turnRight != null) {
            return _turnRight!!
        }
        _turnRight = Builder(name = "TurnRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 9.5f)
                curveToRelative(0.0f, 1.203f, -0.468f, 2.333f, -1.319f, 3.182f)
                lineToRelative(-5.146f, 4.904f)
                curveToRelative(-0.291f, 0.276f, -0.663f, 0.414f, -1.035f, 0.414f)
                curveToRelative(-0.396f, 0.0f, -0.791f, -0.156f, -1.086f, -0.465f)
                curveToRelative(-0.571f, -0.601f, -0.548f, -1.55f, 0.051f, -2.121f)
                lineToRelative(4.633f, -4.414f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(14.599f)
                lineToRelative(-4.634f, -4.414f)
                curveToRelative(-0.6f, -0.571f, -0.623f, -1.521f, -0.051f, -2.121f)
                curveToRelative(0.571f, -0.601f, 1.52f, -0.623f, 2.121f, -0.051f)
                lineToRelative(5.121f, 4.879f)
                curveToRelative(0.876f, 0.875f, 1.344f, 2.004f, 1.344f, 3.207f)
                close()
            }
        }
        .build()
        return _turnRight!!
    }

private var _turnRight: ImageVector? = null
