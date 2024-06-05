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

public val Icons.Bold.HouseLock: ImageVector
    get() {
        if (_houseLock != null) {
            return _houseLock!!
        }
        _houseLock = Builder(name = "HouseLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 10.164f)
                verticalLineToRelative(10.836f)
                lineToRelative(8.0f, -0.013f)
                verticalLineToRelative(0.013f)
                curveToRelative(0.0f, 1.124f, 0.387f, 2.151f, 1.015f, 2.987f)
                lineTo(0.0f, 23.987f)
                verticalLineToRelative(-13.823f)
                curveToRelative(0.0f, -1.084f, 0.49f, -2.089f, 1.343f, -2.757f)
                lineTo(9.843f, 0.756f)
                curveToRelative(1.27f, -0.992f, 3.043f, -0.992f, 4.313f, 0.0f)
                lineToRelative(7.843f, 6.244f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.377f, 0.0f, -0.744f, 0.039f, -1.103f, 0.101f)
                lineToRelative(-5.088f, -3.982f)
                curveToRelative(-0.182f, -0.143f, -0.435f, -0.143f, -0.616f, 0.0f)
                lineTo(3.192f, 9.771f)
                curveToRelative(-0.122f, 0.095f, -0.192f, 0.238f, -0.192f, 0.394f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -2.481f, 2.019f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.019f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 15.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.827f, -0.673f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.673f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _houseLock!!
    }

private var _houseLock: ImageVector? = null
