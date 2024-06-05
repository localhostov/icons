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

public val Icons.Bold.ShieldDog: ImageVector
    get() {
        if (_shieldDog != null) {
            return _shieldDog!!
        }
        _shieldDog = Builder(name = "ShieldDog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.679f, 2.59f)
                lineTo(12.0f, 0.044f)
                lineToRelative(-7.678f, 2.546f)
                curveToRelative(-1.389f, 0.46f, -2.322f, 1.751f, -2.322f, 3.211f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 6.518f, 6.852f, 10.45f, 8.952f, 11.5f)
                lineToRelative(0.984f, 0.492f)
                lineToRelative(1.021f, -0.411f)
                curveToRelative(2.122f, -0.854f, 9.043f, -4.21f, 9.043f, -11.581f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -1.461f, -0.933f, -2.751f, -2.321f, -3.211f)
                close()
                moveTo(19.0f, 11.964f)
                curveToRelative(0.0f, 5.259f, -5.031f, 7.896f, -6.932f, 8.702f)
                curveToRelative(-1.926f, -0.998f, -7.068f, -4.098f, -7.068f, -8.702f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -0.165f, 0.106f, -0.311f, 0.266f, -0.364f)
                lineToRelative(6.734f, -2.233f)
                lineToRelative(6.735f, 2.233f)
                curveToRelative(0.161f, 0.053f, 0.265f, 0.196f, 0.265f, 0.364f)
                verticalLineToRelative(6.162f)
                close()
                moveTo(13.895f, 9.315f)
                curveToRelative(-0.575f, -0.868f, -1.612f, -1.315f, -2.653f, -1.315f)
                horizontalLineToRelative(-0.244f)
                lineToRelative(0.002f, -2.0f)
                curveToRelative(-1.381f, 0.0f, -2.501f, 1.12f, -2.501f, 2.501f)
                lineToRelative(-0.003f, 0.833f)
                lineToRelative(-1.004f, 2.678f)
                curveToRelative(0.0f, 1.873f, 1.568f, 3.861f, 3.493f, 5.313f)
                lineToRelative(1.015f, -3.325f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                lineToRelative(-0.003f, -1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.749f, 0.0f, -1.61f, -0.444f, -2.102f, -1.185f)
                close()
            }
        }
        .build()
        return _shieldDog!!
    }

private var _shieldDog: ImageVector? = null
