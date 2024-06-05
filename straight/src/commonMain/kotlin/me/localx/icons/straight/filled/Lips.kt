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

public val Icons.Filled.Lips: ImageVector
    get() {
        if (_lips != null) {
            return _lips!!
        }
        _lips = Builder(name = "Lips", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.876f, 11.518f)
                curveToRelative(-2.227f, -4.049f, -5.105f, -6.849f, -6.894f, -8.017f)
                curveToRelative(-1.216f, -0.793f, -2.844f, -0.622f, -3.875f, 0.408f)
                lineToRelative(-1.107f, 1.107f)
                lineToRelative(-1.107f, -1.108f)
                curveToRelative(-1.032f, -1.031f, -2.661f, -1.201f, -3.875f, -0.407f)
                curveTo(5.143f, 4.726f, 2.286f, 7.667f, 0.129f, 11.478f)
                lineToRelative(-0.129f, 0.27f)
                verticalLineToRelative(0.529f)
                lineToRelative(0.132f, 0.23f)
                curveToRelative(0.175f, 0.306f, 4.374f, 7.492f, 11.868f, 7.492f)
                reflectiveCurveToRelative(11.692f, -7.176f, 11.868f, -7.482f)
                lineToRelative(0.132f, -0.252f)
                verticalLineToRelative(-0.523f)
                lineToRelative(-0.124f, -0.225f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(-4.518f, 0.0f, -9.549f, -2.0f, -9.549f, -2.0f)
                curveToRelative(0.0f, 0.0f, 5.03f, -2.0f, 9.549f, -2.0f)
                reflectiveCurveToRelative(9.544f, 1.998f, 9.549f, 2.0f)
                curveToRelative(0.0f, 0.0f, -5.03f, 2.0f, -9.549f, 2.0f)
                close()
            }
        }
        .build()
        return _lips!!
    }

private var _lips: ImageVector? = null
