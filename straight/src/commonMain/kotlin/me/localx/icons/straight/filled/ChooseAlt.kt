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

public val Icons.Filled.ChooseAlt: ImageVector
    get() {
        if (_chooseAlt != null) {
            return _chooseAlt!!
        }
        _chooseAlt = Builder(name = "ChooseAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0.0f, -1.381f, 1.119f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.119f, 2.5f, 2.5f)
                curveToRelative(0.0f, 1.025f, -0.617f, 1.906f, -1.5f, 2.291f)
                verticalLineToRelative(2.327f)
                curveToRelative(-0.322f, -0.073f, -0.655f, -0.118f, -1.0f, -0.118f)
                reflectiveCurveToRelative(-0.678f, 0.045f, -1.0f, 0.118f)
                verticalLineToRelative(-2.327f)
                curveToRelative(-0.883f, -0.386f, -1.5f, -1.266f, -1.5f, -2.291f)
                close()
                moveTo(5.742f, 8.669f)
                lineToRelative(2.303f, 1.733f)
                curveToRelative(0.106f, -0.706f, 0.396f, -1.351f, 0.82f, -1.886f)
                lineToRelative(-1.929f, -1.452f)
                curveToRelative(0.042f, -0.182f, 0.065f, -0.37f, 0.065f, -0.565f)
                curveToRelative(0.0f, -1.381f, -1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.452f, 0.0f, 0.876f, -0.121f, 1.242f, -0.331f)
                close()
                moveTo(14.0f, 16.461f)
                verticalLineToRelative(-5.355f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(9.817f)
                curveToRelative(-1.076f, -0.886f, -2.111f, -1.752f, -2.145f, -1.784f)
                curveToRelative(-0.922f, -0.861f, -2.373f, -0.813f, -3.235f, 0.109f)
                curveToRelative(-0.863f, 0.923f, -0.819f, 2.372f, 0.098f, 3.23f)
                lineToRelative(1.821f, 1.628f)
                horizontalLineToRelative(16.462f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-9.0f, -3.538f)
                close()
                moveTo(15.927f, 10.236f)
                lineToRelative(2.236f, -1.625f)
                curveToRelative(0.387f, 0.245f, 0.845f, 0.388f, 1.337f, 0.388f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.156f, 0.015f, 0.307f, 0.042f, 0.455f)
                lineToRelative(-1.997f, 1.451f)
                curveToRelative(0.439f, 0.514f, 0.749f, 1.141f, 0.882f, 1.831f)
                close()
            }
        }
        .build()
        return _chooseAlt!!
    }

private var _chooseAlt: ImageVector? = null
