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

public val Icons.Filled.PostalAddress: ImageVector
    get() {
        if (_postalAddress != null) {
            return _postalAddress!!
        }
        _postalAddress = Builder(name = "PostalAddress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.622f, 15.038f)
                curveToRelative(0.123f, -0.023f, 0.248f, -0.038f, 0.378f, -0.038f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.129f, 0.0f, 0.255f, 0.015f, 0.377f, 0.038f)
                lineToRelative(-3.67f, 3.67f)
                curveToRelative(-0.378f, 0.377f, -1.036f, 0.377f, -1.414f, 0.0f)
                lineToRelative(-3.671f, -3.67f)
                close()
                moveTo(20.121f, 20.122f)
                curveToRelative(-0.585f, 0.585f, -1.353f, 0.877f, -2.121f, 0.877f)
                reflectiveCurveToRelative(-1.536f, -0.292f, -2.121f, -0.877f)
                lineToRelative(-3.764f, -3.764f)
                curveToRelative(-0.069f, 0.202f, -0.115f, 0.416f, -0.115f, 0.641f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.226f, -0.046f, -0.439f, -0.115f, -0.642f)
                lineToRelative(-3.764f, 3.764f)
                close()
                moveTo(17.071f, 2.929f)
                curveToRelative(-1.888f, -1.889f, -4.399f, -2.929f, -7.07f, -2.929f)
                reflectiveCurveTo(4.818f, 1.04f, 2.929f, 2.929f)
                curveTo(1.04f, 4.818f, 0.0f, 7.329f, 0.0f, 10.0f)
                reflectiveCurveToRelative(1.04f, 5.182f, 2.955f, 7.096f)
                lineToRelative(5.181f, 4.833f)
                curveToRelative(0.708f, 0.661f, 1.864f, 0.159f, 1.864f, -0.81f)
                verticalLineToRelative(-4.118f)
                curveToRelative(0.0f, -0.756f, 0.222f, -1.456f, 0.587f, -2.059f)
                curveToRelative(-0.195f, 0.023f, -0.386f, 0.059f, -0.587f, 0.059f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                curveToRelative(0.0f, 1.131f, -0.392f, 2.164f, -1.028f, 3.003f)
                curveToRelative(0.01f, 0.0f, 0.018f, -0.003f, 0.028f, -0.003f)
                horizontalLineToRelative(5.54f)
                curveToRelative(0.3f, -0.959f, 0.46f, -1.967f, 0.46f, -3.0f)
                curveToRelative(0.0f, -2.671f, -1.04f, -5.182f, -2.929f, -7.071f)
                close()
                moveTo(10.0f, 7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.346f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.346f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.346f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _postalAddress!!
    }

private var _postalAddress: ImageVector? = null
