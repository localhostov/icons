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

public val Icons.Bold.Staff: ImageVector
    get() {
        if (_staff != null) {
            return _staff!!
        }
        _staff = Builder(name = "Staff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.436f)
                curveToRelative(-0.998f, 0.0f, -1.851f, 0.747f, -1.983f, 1.736f)
                lineToRelative(-0.546f, 4.102f)
                curveToRelative(-0.224f, 1.673f, -1.004f, 3.251f, -2.197f, 4.445f)
                lineTo(2.561f, 23.561f)
                curveToRelative(-0.293f, 0.293f, -0.677f, 0.439f, -1.061f, 0.439f)
                reflectiveCurveToRelative(-0.768f, -0.146f, -1.061f, -0.439f)
                curveToRelative(-0.586f, -0.585f, -0.586f, -1.535f, 0.0f, -2.121f)
                lineToRelative(10.277f, -10.278f)
                curveToRelative(0.73f, -0.73f, 1.208f, -1.696f, 1.344f, -2.72f)
                lineToRelative(0.547f, -4.103f)
                curveToRelative(0.331f, -2.474f, 2.462f, -4.339f, 4.957f, -4.339f)
                horizontalLineToRelative(1.436f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _staff!!
    }

private var _staff: ImageVector? = null
