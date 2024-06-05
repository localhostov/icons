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
                moveToRelative(24.0f, 2.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.842f, 0.0f, -3.348f, 0.578f, -4.478f, 1.718f)
                curveTo(-0.006f, 3.765f, 0.0f, 6.878f, 0.0f, 7.009f)
                lineToRelative(2.0f, -0.016f)
                curveToRelative(0.0f, -0.024f, 0.01f, -2.431f, 1.451f, -3.876f)
                curveToRelative(0.75f, -0.752f, 1.748f, -1.118f, 3.049f, -1.118f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(13.869f)
                curveToRelative(0.0f, 4.083f, -2.656f, 6.632f, -2.68f, 6.655f)
                lineToRelative(1.36f, 1.466f)
                curveToRelative(0.136f, -0.126f, 3.32f, -3.139f, 3.32f, -8.121f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
