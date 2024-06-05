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

public val Icons.Bold.ShieldCat: ImageVector
    get() {
        if (_shieldCat != null) {
            return _shieldCat!!
        }
        _shieldCat = Builder(name = "ShieldCat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.679f, 2.59f)
                lineTo(12.0f, 0.044f)
                lineToRelative(-7.679f, 2.546f)
                curveToRelative(-1.389f, 0.46f, -2.321f, 1.75f, -2.321f, 3.211f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 6.518f, 6.852f, 10.45f, 8.951f, 11.5f)
                lineToRelative(0.984f, 0.492f)
                lineToRelative(1.021f, -0.411f)
                curveToRelative(2.122f, -0.853f, 9.044f, -4.21f, 9.044f, -11.581f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -1.461f, -0.933f, -2.751f, -2.321f, -3.211f)
                close()
                moveTo(19.0f, 11.964f)
                curveToRelative(0.0f, 5.259f, -5.031f, 7.896f, -6.932f, 8.702f)
                curveToRelative(-1.927f, -0.998f, -7.068f, -4.098f, -7.068f, -8.702f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -0.167f, 0.104f, -0.311f, 0.265f, -0.364f)
                lineToRelative(6.735f, -2.233f)
                lineToRelative(6.735f, 2.233f)
                curveToRelative(0.161f, 0.053f, 0.265f, 0.196f, 0.265f, 0.364f)
                verticalLineToRelative(6.162f)
                close()
                moveTo(12.0f, 8.0f)
                curveToRelative(-0.358f, 0.0f, -0.699f, 0.062f, -1.029f, 0.15f)
                lineToRelative(-2.971f, -1.65f)
                verticalLineToRelative(5.93f)
                curveToRelative(0.217f, 2.004f, 1.938f, 3.57f, 4.0f, 3.57f)
                reflectiveCurveToRelative(3.786f, -1.569f, 4.0f, -3.576f)
                verticalLineToRelative(-5.924f)
                lineToRelative(-2.971f, 1.65f)
                curveToRelative(-0.33f, -0.088f, -0.671f, -0.15f, -1.029f, -0.15f)
                close()
            }
        }
        .build()
        return _shieldCat!!
    }

private var _shieldCat: ImageVector? = null
