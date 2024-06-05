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

public val Icons.Bold.ShieldKeyhole: ImageVector
    get() {
        if (_shieldKeyhole != null) {
            return _shieldKeyhole!!
        }
        _shieldKeyhole = Builder(name = "ShieldKeyhole", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.679f, 2.59f)
                lineTo(12.0f, 0.045f)
                lineToRelative(-7.68f, 2.545f)
                curveToRelative(-1.388f, 0.461f, -2.32f, 1.752f, -2.32f, 3.212f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 6.516f, 6.852f, 10.449f, 8.95f, 11.499f)
                lineToRelative(0.985f, 0.494f)
                lineToRelative(1.021f, -0.412f)
                curveToRelative(2.122f, -0.854f, 9.044f, -4.21f, 9.044f, -11.581f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -1.46f, -0.933f, -2.751f, -2.321f, -3.212f)
                close()
                moveTo(19.0f, 11.964f)
                curveToRelative(0.0f, 5.258f, -5.029f, 7.895f, -6.932f, 8.702f)
                curveToRelative(-1.927f, -0.999f, -7.068f, -4.1f, -7.068f, -8.702f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -0.165f, 0.106f, -0.312f, 0.265f, -0.364f)
                lineToRelative(6.735f, -2.232f)
                lineToRelative(6.734f, 2.232f)
                curveToRelative(0.161f, 0.054f, 0.266f, 0.196f, 0.266f, 0.364f)
                verticalLineToRelative(6.162f)
                close()
                moveTo(14.5f, 9.5f)
                curveToRelative(0.0f, 0.818f, -0.393f, 1.544f, -1.0f, 2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(-0.607f, -0.456f, -1.0f, -1.182f, -1.0f, -2.0f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                close()
            }
        }
        .build()
        return _shieldKeyhole!!
    }

private var _shieldKeyhole: ImageVector? = null
