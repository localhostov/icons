package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Pig: ImageVector
    get() {
        if (_pig != null) {
            return _pig!!
        }
        _pig = Builder(name = "Pig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 10.0f)
                horizontalLineToRelative(-1.717f)
                curveToRelative(-0.305f, -1.372f, -0.925f, -2.616f, -1.819f, -3.616f)
                curveToRelative(-0.936f, -1.047f, -2.128f, -1.773f, -3.465f, -2.13f)
                lineTo(16.999f, 1.0f)
                curveToRelative(-1.867f, -0.106f, -3.434f, 1.246f, -3.876f, 3.0f)
                horizontalLineToRelative(-5.624f)
                curveToRelative(-1.995f, 0.0f, -3.822f, 0.734f, -5.225f, 1.947f)
                curveToRelative(-0.183f, -0.548f, -0.275f, -1.198f, -0.275f, -1.947f)
                lineTo(0.0f, 4.0f)
                curveToRelative(0.0f, 1.431f, 0.277f, 2.634f, 0.826f, 3.594f)
                curveTo(-0.011f, 8.859f, -0.5f, 10.373f, -0.5f, 12.0f)
                curveToRelative(0.0f, 2.85f, 1.551f, 5.5f, 4.0f, 6.92f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.586f)
                curveToRelative(2.02f, -0.82f, 3.599f, -2.44f, 4.407f, -4.414f)
                horizontalLineToRelative(2.093f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(16.5f, 12.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _pig!!
    }

private var _pig: ImageVector? = null
