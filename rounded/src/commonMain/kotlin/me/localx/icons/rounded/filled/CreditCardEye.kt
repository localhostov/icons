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

public val Icons.Filled.CreditCardEye: ImageVector
    get() {
        if (_creditCardEye != null) {
            return _creditCardEye!!
        }
        _creditCardEye = Builder(name = "CreditCardEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.61f, 18.262f)
                curveToRelative(-0.848f, -1.218f, -2.769f, -3.262f, -6.11f, -3.262f)
                reflectiveCurveToRelative(-5.262f, 2.044f, -6.11f, 3.262f)
                curveToRelative(-0.523f, 0.752f, -0.523f, 1.724f, 0.0f, 2.476f)
                curveToRelative(0.848f, 1.218f, 2.768f, 3.262f, 6.11f, 3.262f)
                reflectiveCurveToRelative(5.262f, -2.044f, 6.109f, -3.262f)
                curveToRelative(0.523f, -0.751f, 0.524f, -1.724f, 0.0f, -2.476f)
                close()
                moveTo(17.5f, 21.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(24.0f, 7.0f)
                lineTo(0.0f, 7.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(9.749f, 17.12f)
                curveToRelative(1.07f, -1.539f, 3.501f, -4.12f, 7.751f, -4.12f)
                curveToRelative(3.002f, 0.0f, 5.092f, 1.287f, 6.441f, 2.585f)
                curveToRelative(0.023f, -0.194f, 0.059f, -0.385f, 0.059f, -0.585f)
                verticalLineToRelative(-6.0f)
                lineTo(0.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(4.032f)
                curveToRelative(-0.122f, -0.991f, 0.112f, -2.012f, 0.717f, -2.88f)
                close()
                moveTo(5.5f, 16.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _creditCardEye!!
    }

private var _creditCardEye: ImageVector? = null
