package me.localx.icons.straight.bold

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

public val Icons.Bold.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.5f, 11.379f)
                lineToRelative(2.561f, 2.561f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.439f, -3.439f)
                verticalLineToRelative(-5.621f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.379f)
                close()
                moveTo(18.0f, 19.995f)
                verticalLineToRelative(4.005f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.46f)
                curveToRelative(-0.947f, 0.299f, -1.955f, 0.46f, -3.0f, 0.46f)
                reflectiveCurveToRelative(-2.053f, -0.161f, -3.0f, -0.46f)
                verticalLineToRelative(2.46f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.005f)
                curveToRelative(-2.427f, -1.826f, -4.0f, -4.73f, -4.0f, -7.995f)
                reflectiveCurveToRelative(1.573f, -6.169f, 4.0f, -7.995f)
                lineTo(6.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.46f)
                curveToRelative(0.947f, -0.299f, 1.955f, -0.46f, 3.0f, -0.46f)
                reflectiveCurveToRelative(2.053f, 0.161f, 3.0f, 0.46f)
                lineTo(15.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.005f)
                curveToRelative(2.427f, 1.826f, 4.0f, 4.73f, 4.0f, 7.995f)
                reflectiveCurveToRelative(-1.573f, 6.169f, -4.0f, 7.995f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveToRelative(-7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.141f, 7.0f, -7.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
