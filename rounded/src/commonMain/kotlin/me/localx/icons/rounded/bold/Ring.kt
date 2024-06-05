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

public val Icons.Bold.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 3.0f)
                curveTo(5.159f, 3.0f, 0.0f, 5.794f, 0.0f, 9.5f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 3.706f, 5.159f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveToRelative(12.0f, -2.794f, 12.0f, -6.5f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.706f, -5.159f, -6.5f, -12.0f, -6.5f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(5.494f, 0.0f, 9.0f, 2.073f, 9.0f, 3.5f)
                curveToRelative(0.0f, 0.167f, -0.049f, 0.343f, -0.143f, 0.524f)
                curveToRelative(-2.217f, -1.282f, -5.407f, -2.024f, -8.857f, -2.024f)
                reflectiveCurveToRelative(-6.641f, 0.742f, -8.857f, 2.024f)
                curveToRelative(-0.094f, -0.181f, -0.143f, -0.357f, -0.143f, -0.524f)
                curveToRelative(0.0f, -1.427f, 3.506f, -3.5f, 9.0f, -3.5f)
                close()
                moveTo(18.033f, 12.003f)
                curveToRelative(-1.525f, 0.584f, -3.581f, 0.997f, -6.033f, 0.997f)
                reflectiveCurveToRelative(-4.508f, -0.413f, -6.033f, -0.997f)
                curveToRelative(1.662f, -0.631f, 3.813f, -1.003f, 6.033f, -1.003f)
                reflectiveCurveToRelative(4.371f, 0.371f, 6.033f, 1.003f)
                close()
                moveTo(12.0f, 18.0f)
                curveToRelative(-5.494f, 0.0f, -9.0f, -2.073f, -9.0f, -3.5f)
                verticalLineToRelative(-0.61f)
                curveToRelative(2.165f, 1.31f, 5.342f, 2.11f, 9.0f, 2.11f)
                reflectiveCurveToRelative(6.835f, -0.799f, 9.0f, -2.11f)
                verticalLineToRelative(0.61f)
                curveToRelative(0.0f, 1.427f, -3.506f, 3.5f, -9.0f, 3.5f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
