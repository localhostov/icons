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

public val Icons.Bold.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.141f, 18.021f)
                curveToRelative(1.234f, -1.825f, 1.859f, -3.857f, 1.859f, -6.057f)
                verticalLineToRelative(-6.162f)
                curveToRelative(0.0f, -1.46f, -0.933f, -2.751f, -2.321f, -3.212f)
                lineTo(12.0f, 0.045f)
                lineToRelative(-7.386f, 2.448f)
                lineTo(2.161f, 0.039f)
                lineTo(0.04f, 2.16f)
                lineToRelative(21.8f, 21.801f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.819f, -3.819f)
                close()
                moveTo(12.0f, 3.205f)
                lineToRelative(6.734f, 2.232f)
                curveToRelative(0.161f, 0.054f, 0.266f, 0.196f, 0.266f, 0.364f)
                verticalLineToRelative(6.162f)
                curveToRelative(0.0f, 1.387f, -0.348f, 2.687f, -1.035f, 3.88f)
                lineTo(6.988f, 4.867f)
                lineToRelative(5.012f, -1.661f)
                close()
                moveTo(14.445f, 19.394f)
                lineToRelative(2.154f, 2.154f)
                curveToRelative(-1.492f, 1.054f, -2.908f, 1.7f, -3.644f, 1.996f)
                lineToRelative(-1.021f, 0.412f)
                lineToRelative(-0.985f, -0.494f)
                curveToRelative(-2.099f, -1.05f, -8.95f, -4.983f, -8.95f, -11.499f)
                verticalLineToRelative(-5.015f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(2.015f)
                curveToRelative(0.0f, 4.603f, 5.142f, 7.703f, 7.068f, 8.702f)
                curveToRelative(0.569f, -0.242f, 1.441f, -0.659f, 2.377f, -1.272f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
