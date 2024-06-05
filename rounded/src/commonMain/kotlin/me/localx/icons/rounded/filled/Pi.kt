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

public val Icons.Filled.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.0f, 19.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.5f)
                curveTo(4.483f, 0.0f, 2.877f, 0.59f, 1.726f, 1.754f)
                curveTo(-0.007f, 3.507f, 0.0f, 5.91f, 0.0f, 6.011f)
                curveToRelative(0.006f, 0.548f, 0.452f, 0.986f, 1.0f, 0.986f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.55f, -0.003f, 0.995f, -0.453f, 0.995f, -1.003f)
                curveToRelative(0.0f, -0.409f, 0.126f, -3.994f, 4.5f, -3.994f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(13.612f)
                curveToRelative(0.0f, 4.083f, -2.656f, 6.632f, -2.68f, 6.655f)
                curveToRelative(-0.405f, 0.376f, -0.428f, 1.008f, -0.053f, 1.413f)
                curveToRelative(0.197f, 0.212f, 0.465f, 0.32f, 0.733f, 0.32f)
                curveToRelative(0.244f, 0.0f, 0.488f, -0.088f, 0.68f, -0.267f)
                curveToRelative(0.136f, -0.126f, 3.32f, -3.139f, 3.32f, -8.121f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
