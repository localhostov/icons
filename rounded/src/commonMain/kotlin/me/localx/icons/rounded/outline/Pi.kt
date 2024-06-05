package me.localx.icons.rounded.outline

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

public val Icons.Outline.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 20.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(13.612f)
                curveToRelative(0.0f, 4.981f, -3.184f, 7.995f, -3.32f, 8.121f)
                curveToRelative(-0.192f, 0.179f, -0.437f, 0.267f, -0.68f, 0.267f)
                curveToRelative(-0.268f, 0.0f, -0.536f, -0.107f, -0.733f, -0.32f)
                curveToRelative(-0.375f, -0.405f, -0.352f, -1.037f, 0.053f, -1.413f)
                curveToRelative(0.024f, -0.023f, 2.68f, -2.572f, 2.68f, -6.655f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-4.374f, 0.0f, -4.5f, 3.585f, -4.5f, 3.994f)
                curveToRelative(0.0f, 0.55f, -0.444f, 1.0f, -0.995f, 1.003f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-0.548f, 0.0f, -0.994f, -0.438f, -1.0f, -0.986f)
                curveToRelative(0.0f, -0.102f, -0.007f, -2.504f, 1.726f, -4.257f)
                curveTo(2.877f, 0.59f, 4.483f, 0.0f, 6.5f, 0.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
