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
                moveTo(17.0f, 15.0f)
                curveToRelative(-3.98f, 0.0f, -5.896f, 3.092f, -6.388f, 4.04f)
                lineToRelative(-0.239f, 0.46f)
                lineToRelative(0.239f, 0.461f)
                curveToRelative(0.492f, 0.947f, 2.406f, 4.039f, 6.388f, 4.039f)
                reflectiveCurveToRelative(5.896f, -3.092f, 6.387f, -4.039f)
                lineToRelative(0.24f, -0.461f)
                lineToRelative(-0.24f, -0.461f)
                curveToRelative(-0.492f, -0.947f, -2.407f, -4.039f, -6.387f, -4.039f)
                close()
                moveTo(17.0f, 21.5f)
                curveToRelative(-1.105f, 0.0f, -2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(0.0f, 7.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                lineTo(21.0f, 2.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 7.0f)
                close()
                moveTo(0.0f, 9.0f)
                verticalLineToRelative(11.0f)
                lineTo(7.998f, 20.0f)
                lineToRelative(0.839f, -1.882f)
                curveToRelative(0.621f, -1.199f, 3.049f, -5.118f, 8.163f, -5.118f)
                curveToRelative(3.492f, 0.0f, 5.732f, 1.83f, 7.0f, 3.372f)
                verticalLineToRelative(-7.372f)
                lineTo(0.0f, 9.0f)
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
