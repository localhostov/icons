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

public val Icons.Bold.CreditCardEye: ImageVector
    get() {
        if (_creditCardEye != null) {
            return _creditCardEye!!
        }
        _creditCardEye = Builder(name = "CreditCardEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 11.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(24.0f, 6.5f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.829f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 1.378f, 1.122f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.671f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-3.033f, 0.0f, -5.5f, -2.467f, -5.5f, -5.5f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 3.467f, 2.467f, 1.0f, 5.5f, 1.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.467f, 5.5f, 5.5f)
                close()
                moveTo(3.051f, 6.0f)
                lineTo(20.949f, 6.0f)
                curveToRelative(-0.232f, -1.14f, -1.242f, -2.0f, -2.449f, -2.0f)
                lineTo(5.5f, 4.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, 0.86f, -2.449f, 2.0f)
                close()
                moveTo(23.337f, 18.759f)
                curveToRelative(0.282f, 0.455f, 0.282f, 1.027f, 0.0f, 1.482f)
                curveToRelative(-0.897f, 1.446f, -2.874f, 3.759f, -6.337f, 3.759f)
                reflectiveCurveToRelative(-5.439f, -2.314f, -6.336f, -3.759f)
                curveToRelative(-0.282f, -0.455f, -0.282f, -1.027f, 0.0f, -1.482f)
                curveToRelative(0.898f, -1.446f, 2.874f, -3.759f, 6.336f, -3.759f)
                reflectiveCurveToRelative(5.439f, 2.312f, 6.337f, 3.759f)
                close()
                moveTo(19.0f, 19.5f)
                curveToRelative(0.0f, -1.105f, -0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.895f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _creditCardEye!!
    }

private var _creditCardEye: ImageVector? = null
