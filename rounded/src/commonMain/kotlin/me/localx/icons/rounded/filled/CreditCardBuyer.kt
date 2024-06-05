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

public val Icons.Filled.CreditCardBuyer: ImageVector
    get() {
        if (_creditCardBuyer != null) {
            return _creditCardBuyer!!
        }
        _creditCardBuyer = Builder(name = "CreditCardBuyer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                curveTo(0.0f, 2.243f, 2.243f, 0.0f, 5.0f, 0.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(21.5f, 15.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.121f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.121f, 2.5f, -2.5f)
                close()
                moveTo(23.793f, 23.609f)
                curveToRelative(0.189f, -0.247f, 0.254f, -0.567f, 0.173f, -0.868f)
                curveToRelative(-0.591f, -2.203f, -2.633f, -3.741f, -4.966f, -3.741f)
                reflectiveCurveToRelative(-4.375f, 1.538f, -4.966f, 3.741f)
                curveToRelative(-0.081f, 0.301f, -0.017f, 0.621f, 0.173f, 0.868f)
                curveToRelative(0.188f, 0.247f, 0.482f, 0.391f, 0.793f, 0.391f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.311f, 0.0f, 0.604f, -0.145f, 0.793f, -0.391f)
                close()
                moveTo(24.0f, 7.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.792f, -0.202f, 1.531f, -0.531f, 2.197f)
                curveToRelative(-0.159f, -2.338f, -2.092f, -4.197f, -4.469f, -4.197f)
                curveToRelative(-2.481f, 0.0f, -4.5f, 2.019f, -4.5f, 4.5f)
                curveToRelative(0.0f, 0.925f, 0.282f, 1.784f, 0.762f, 2.5f)
                lineTo(5.0f, 18.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(6.0f, 13.5f)
                curveToRelative(0.0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _creditCardBuyer!!
    }

private var _creditCardBuyer: ImageVector? = null
