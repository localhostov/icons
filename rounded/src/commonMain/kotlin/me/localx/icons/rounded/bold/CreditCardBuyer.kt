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

public val Icons.Bold.CreditCardBuyer: ImageVector
    get() {
        if (_creditCardBuyer != null) {
            return _creditCardBuyer!!
        }
        _creditCardBuyer = Builder(name = "CreditCardBuyer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 10.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 5.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-3.032f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                verticalLineToRelative(-7.0f)
                curveTo(0.0f, 2.467f, 2.468f, 0.0f, 5.5f, 0.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(3.051f, 5.0f)
                horizontalLineToRelative(17.899f)
                curveToRelative(-0.232f, -1.14f, -1.242f, -2.0f, -2.449f, -2.0f)
                lineTo(5.5f, 3.0f)
                curveToRelative(-1.208f, 0.0f, -2.217f, 0.86f, -2.449f, 2.0f)
                close()
                moveTo(19.0f, 19.0f)
                curveToRelative(-2.28f, 0.0f, -4.218f, 1.403f, -4.927f, 3.358f)
                curveToRelative(-0.29f, 0.801f, 0.316f, 1.642f, 1.2f, 1.642f)
                horizontalLineToRelative(7.453f)
                curveToRelative(0.884f, 0.0f, 1.49f, -0.841f, 1.2f, -1.642f)
                curveToRelative(-0.708f, -1.955f, -2.647f, -3.358f, -4.927f, -3.358f)
                close()
                moveTo(22.0f, 15.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _creditCardBuyer!!
    }

private var _creditCardBuyer: ImageVector? = null
