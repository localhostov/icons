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

public val Icons.Outline.Stamp: ImageVector
    get() {
        if (_stamp != null) {
            return _stamp!!
        }
        _stamp = Builder(name = "Stamp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                lineTo(21.0f, 22.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.404f, 0.0f, -0.653f, -0.223f, -0.766f, -0.356f)
                curveToRelative(-0.111f, -0.133f, -0.289f, -0.416f, -0.22f, -0.813f)
                curveToRelative(0.58f, -3.334f, 0.985f, -6.555f, 0.985f, -7.831f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.278f, 0.405f, 4.498f, 0.985f, 7.831f)
                curveToRelative(0.069f, 0.397f, -0.107f, 0.68f, -0.219f, 0.812f)
                curveToRelative(-0.112f, 0.133f, -0.36f, 0.357f, -0.766f, 0.357f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                curveToRelative(0.0f, 0.97f, 0.701f, 2.0f, 2.0f, 2.0f)
                lineTo(22.0f, 20.0f)
                curveToRelative(1.299f, 0.0f, 2.0f, -1.03f, 2.0f, -2.0f)
                close()
                moveTo(8.0f, 15.0f)
                curveToRelative(0.888f, 0.0f, 1.725f, -0.39f, 2.296f, -1.07f)
                curveToRelative(0.571f, -0.679f, 0.811f, -1.569f, 0.659f, -2.442f)
                curveToRelative(-0.554f, -3.181f, -0.956f, -6.331f, -0.956f, -7.488f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.897f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.156f, -0.402f, 4.305f, -0.956f, 7.488f)
                curveToRelative(-0.151f, 0.874f, 0.089f, 1.764f, 0.66f, 2.443f)
                curveToRelative(0.572f, 0.679f, 1.408f, 1.069f, 2.296f, 1.069f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _stamp!!
    }

private var _stamp: ImageVector? = null
