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

public val Icons.Bold.EndlessLoop: ImageVector
    get() {
        if (_endlessLoop != null) {
            return _endlessLoop!!
        }
        _endlessLoop = Builder(name = "EndlessLoop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 14.5f)
                curveToRelative(0.0f, 4.136f, -3.364f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.136f, 0.0f, -7.5f, -3.364f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.364f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(4.599f)
                lineToRelative(-3.584f, -3.414f)
                curveToRelative(-0.6f, -0.571f, -0.623f, -1.521f, -0.051f, -2.121f)
                curveToRelative(0.572f, -0.602f, 1.521f, -0.624f, 2.121f, -0.051f)
                lineToRelative(4.071f, 3.879f)
                curveToRelative(0.876f, 0.875f, 1.344f, 2.004f, 1.344f, 3.207f)
                reflectiveCurveToRelative(-0.468f, 2.333f, -1.319f, 3.182f)
                lineToRelative(-4.146f, 3.951f)
                curveToRelative(-0.291f, 0.277f, -0.663f, 0.414f, -1.035f, 0.414f)
                curveToRelative(-0.396f, 0.0f, -0.791f, -0.156f, -1.086f, -0.465f)
                curveToRelative(-0.571f, -0.6f, -0.548f, -1.549f, 0.051f, -2.121f)
                lineToRelative(3.633f, -3.461f)
                horizontalLineToRelative(-4.599f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.019f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(2.481f, 0.0f, 4.5f, -2.019f, 4.5f, -4.5f)
                curveToRelative(0.0f, -1.602f, -0.863f, -3.096f, -2.251f, -3.899f)
                curveToRelative(-0.717f, -0.415f, -0.962f, -1.333f, -0.547f, -2.049f)
                curveToRelative(0.415f, -0.716f, 1.333f, -0.962f, 2.049f, -0.547f)
                curveToRelative(2.312f, 1.338f, 3.749f, 3.827f, 3.749f, 6.496f)
                close()
            }
        }
        .build()
        return _endlessLoop!!
    }

private var _endlessLoop: ImageVector? = null
