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

public val Icons.Bold.ArrowTurnLeftUp: ImageVector
    get() {
        if (_arrowTurnLeftUp != null) {
            return _arrowTurnLeftUp!!
        }
        _arrowTurnLeftUp = Builder(name = "ArrowTurnLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineTo(3.901f)
                lineTo(3.586f, 8.535f)
                curveToRelative(-0.572f, 0.6f, -1.521f, 0.622f, -2.121f, 0.051f)
                curveToRelative(-0.6f, -0.571f, -0.623f, -1.521f, -0.051f, -2.121f)
                lineTo(6.293f, 1.344f)
                curveToRelative(0.875f, -0.876f, 2.004f, -1.344f, 3.207f, -1.344f)
                reflectiveCurveToRelative(2.333f, 0.468f, 3.182f, 1.319f)
                lineToRelative(4.904f, 5.146f)
                curveToRelative(0.571f, 0.6f, 0.548f, 1.549f, -0.051f, 2.121f)
                curveToRelative(-0.291f, 0.277f, -0.663f, 0.414f, -1.035f, 0.414f)
                curveToRelative(-0.396f, 0.0f, -0.791f, -0.156f, -1.086f, -0.465f)
                lineTo(11.0f, 3.901f)
                verticalLineToRelative(14.599f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _arrowTurnLeftUp!!
    }

private var _arrowTurnLeftUp: ImageVector? = null
