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

public val Icons.Bold.TurnLeftDown: ImageVector
    get() {
        if (_turnLeftDown != null) {
            return _turnLeftDown!!
        }
        _turnLeftDown = Builder(name = "TurnLeftDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 1.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(14.599f)
                lineToRelative(4.414f, -4.634f)
                curveToRelative(0.571f, -0.6f, 1.521f, -0.622f, 2.121f, -0.051f)
                curveToRelative(0.6f, 0.571f, 0.623f, 1.521f, 0.051f, 2.121f)
                lineToRelative(-4.879f, 5.12f)
                curveToRelative(-0.875f, 0.876f, -2.004f, 1.345f, -3.207f, 1.345f)
                reflectiveCurveToRelative(-2.333f, -0.469f, -3.182f, -1.318f)
                lineToRelative(-4.904f, -5.146f)
                curveToRelative(-0.571f, -0.601f, -0.548f, -1.55f, 0.051f, -2.121f)
                curveToRelative(0.6f, -0.57f, 1.549f, -0.548f, 2.121f, 0.051f)
                lineToRelative(4.414f, 4.633f)
                verticalLineTo(5.5f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _turnLeftDown!!
    }

private var _turnLeftDown: ImageVector? = null
