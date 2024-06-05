package me.localx.icons.rounded.outline

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

public val Icons.Outline.CreditCardEye: ImageVector
    get() {
        if (_creditCardEye != null) {
            return _creditCardEye!!
        }
        _creditCardEye = Builder(name = "CreditCardEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 13.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.609f, 20.738f)
                curveToRelative(-0.848f, 1.218f, -2.769f, 3.262f, -6.109f, 3.262f)
                reflectiveCurveToRelative(-5.262f, -2.044f, -6.11f, -3.262f)
                curveToRelative(-0.523f, -0.752f, -0.523f, -1.724f, 0.0f, -2.476f)
                curveToRelative(0.848f, -1.218f, 2.769f, -3.262f, 6.11f, -3.262f)
                reflectiveCurveToRelative(5.263f, 2.043f, 6.11f, 3.262f)
                curveToRelative(0.523f, 0.752f, 0.522f, 1.725f, 0.0f, 2.476f)
                close()
                moveTo(21.967f, 19.405f)
                curveToRelative(-0.763f, -1.097f, -2.157f, -2.404f, -4.468f, -2.404f)
                reflectiveCurveToRelative(-3.705f, 1.308f, -4.468f, 2.405f)
                curveToRelative(-0.043f, 0.061f, -0.043f, 0.13f, 0.0f, 0.19f)
                curveToRelative(0.764f, 1.098f, 2.158f, 2.405f, 4.469f, 2.405f)
                reflectiveCurveToRelative(3.705f, -1.308f, 4.468f, -2.405f)
                curveToRelative(0.043f, -0.061f, 0.043f, -0.13f, 0.0f, -0.191f)
                close()
                moveTo(8.999f, 19.001f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(-0.001f, 7.0f)
                curveTo(0.0f, 4.243f, 2.243f, 2.0f, 5.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                close()
                moveTo(2.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(5.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(17.5f, 18.0f)
                curveToRelative(-0.829f, 0.0f, -1.5f, 0.671f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.671f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.671f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.671f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _creditCardEye!!
    }

private var _creditCardEye: ImageVector? = null
