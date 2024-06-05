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

public val Icons.Bold.Picking: ImageVector
    get() {
        if (_picking != null) {
            return _picking!!
        }
        _picking = Builder(name = "Picking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 6.5f)
                verticalLineToRelative(3.171f)
                curveToRelative(0.0f, 1.878f, -0.697f, 3.675f, -1.964f, 5.06f)
                curveToRelative(0.0f, 0.0f, -4.897f, 5.322f, -5.007f, 5.392f)
                curveToRelative(-0.9f, 0.91f, -1.81f, 1.479f, -2.003f, 1.594f)
                curveToRelative(-0.321f, 0.192f, -0.675f, 0.283f, -1.023f, 0.283f)
                curveToRelative(-0.681f, 0.0f, -1.345f, -0.348f, -1.719f, -0.975f)
                curveToRelative(-0.565f, -0.947f, -0.258f, -2.172f, 0.687f, -2.739f)
                curveToRelative(0.848f, -0.516f, 2.03f, -1.635f, 2.03f, -2.286f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -3.032f, 2.468f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.781f, 0.0f, 5.081f, 2.078f, 5.444f, 4.761f)
                lineToRelative(1.877f, -2.054f)
                curveToRelative(0.76f, -0.831f, 1.179f, -1.909f, 1.179f, -3.036f)
                verticalLineToRelative(-3.171f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                lineTo(3.5f, 4.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.0f)
                curveToRelative(3.032f, 0.0f, 5.5f, 2.468f, 5.5f, 5.5f)
                close()
                moveTo(10.026f, 6.904f)
                curveToRelative(0.776f, -0.291f, 1.169f, -1.155f, 0.878f, -1.931f)
                reflectiveCurveToRelative(-1.157f, -1.17f, -1.931f, -0.878f)
                lineTo(0.974f, 7.096f)
                curveToRelative(-0.776f, 0.291f, -1.169f, 1.155f, -0.878f, 1.931f)
                curveToRelative(0.226f, 0.603f, 0.797f, 0.974f, 1.404f, 0.974f)
                curveToRelative(0.175f, 0.0f, 0.354f, -0.03f, 0.526f, -0.096f)
                lineToRelative(8.0f, -3.0f)
                close()
                moveTo(10.449f, 9.966f)
                curveToRelative(0.646f, -0.517f, 0.753f, -1.461f, 0.235f, -2.108f)
                curveToRelative(-0.517f, -0.646f, -1.46f, -0.752f, -2.108f, -0.235f)
                lineToRelative(-3.25f, 2.596f)
                curveToRelative(-0.686f, 0.548f, -1.236f, 1.262f, -1.594f, 2.063f)
                lineToRelative(-1.604f, 3.608f)
                curveToRelative(-0.336f, 0.757f, 0.005f, 1.644f, 0.762f, 1.98f)
                curveToRelative(0.198f, 0.088f, 0.405f, 0.129f, 0.608f, 0.129f)
                curveToRelative(0.575f, 0.0f, 1.123f, -0.332f, 1.372f, -0.891f)
                lineToRelative(1.603f, -3.608f)
                curveToRelative(0.163f, -0.364f, 0.413f, -0.689f, 0.726f, -0.938f)
                lineToRelative(3.25f, -2.596f)
                close()
            }
        }
        .build()
        return _picking!!
    }

private var _picking: ImageVector? = null
