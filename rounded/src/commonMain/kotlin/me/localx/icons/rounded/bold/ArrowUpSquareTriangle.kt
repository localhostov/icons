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

public val Icons.Bold.ArrowUpSquareTriangle: ImageVector
    get() {
        if (_arrowUpSquareTriangle != null) {
            return _arrowUpSquareTriangle!!
        }
        _arrowUpSquareTriangle = Builder(name = "ArrowUpSquareTriangle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                lineTo(14.0f, 3.0f)
                curveToRelative(0.0f, -1.105f, 0.895f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, -0.895f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                close()
                moveTo(23.441f, 20.563f)
                lineToRelative(-3.49f, -5.7f)
                curveToRelative(-0.624f, -1.152f, -2.277f, -1.152f, -2.901f, 0.0f)
                lineToRelative(-3.49f, 5.7f)
                curveToRelative(-0.596f, 1.099f, 0.2f, 2.437f, 1.451f, 2.437f)
                horizontalLineToRelative(6.981f)
                curveToRelative(1.251f, 0.0f, 2.047f, -1.337f, 1.451f, -2.437f)
                close()
                moveTo(8.268f, 0.744f)
                curveToRelative(-0.974f, -0.975f, -2.56f, -0.975f, -3.529f, -0.006f)
                lineTo(0.945f, 4.489f)
                curveToRelative(-0.589f, 0.582f, -0.594f, 1.532f, -0.012f, 2.121f)
                curveToRelative(0.583f, 0.589f, 1.532f, 0.595f, 2.122f, 0.012f)
                lineToRelative(1.945f, -1.923f)
                lineTo(5.0f, 22.555f)
                curveToRelative(0.0f, 0.828f, 0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                lineTo(8.0f, 4.698f)
                lineToRelative(1.945f, 1.923f)
                curveToRelative(0.292f, 0.289f, 0.674f, 0.434f, 1.055f, 0.434f)
                curveToRelative(0.504f, 0.0f, 1.006f, -0.251f, 1.305f, -0.754f)
                curveToRelative(0.357f, -0.6f, 0.187f, -1.379f, -0.309f, -1.87f)
                lineTo(8.268f, 0.744f)
                close()
            }
        }
        .build()
        return _arrowUpSquareTriangle!!
    }

private var _arrowUpSquareTriangle: ImageVector? = null
