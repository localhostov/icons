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

public val Icons.Outline.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.943f, 9.376f)
                lineToRelative(-1.943f, -0.391f)
                lineTo(16.0f, 3.0f)
                curveToRelative(0.0f, -1.517f, -1.076f, -2.835f, -2.503f, -3.066f)
                curveToRelative(-0.88f, -0.145f, -1.768f, 0.102f, -2.439f, 0.673f)
                reflectiveCurveToRelative(-1.058f, 1.405f, -1.058f, 2.288f)
                lineToRelative(0.011f, 4.962f)
                horizontalLineToRelative(-0.021f)
                curveToRelative(-1.471f, 0.0f, -2.844f, 0.818f, -3.537f, 2.122f)
                lineToRelative(-4.417f, 4.214f)
                curveToRelative(-0.691f, 0.687f, -1.073f, 1.602f, -1.074f, 2.576f)
                curveToRelative(-0.002f, 0.975f, 0.376f, 1.891f, 1.065f, 2.58f)
                lineToRelative(2.308f, 2.308f)
                curveToRelative(1.512f, 1.511f, 3.521f, 2.343f, 5.657f, 2.343f)
                horizontalLineToRelative(6.97f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                verticalLineToRelative(-4.721f)
                curveToRelative(0.0f, -2.375f, -1.69f, -4.437f, -4.019f, -4.903f)
                close()
                moveTo(19.962f, 19.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.97f)
                curveToRelative(-1.603f, 0.0f, -3.109f, -0.624f, -4.243f, -1.757f)
                lineToRelative(-2.308f, -2.308f)
                curveToRelative(-0.311f, -0.311f, -0.48f, -0.723f, -0.48f, -1.162f)
                curveToRelative(0.0f, -0.439f, 0.173f, -0.851f, 0.471f, -1.146f)
                lineToRelative(2.568f, -2.451f)
                verticalLineToRelative(3.824f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.597f)
                curveToRelative(0.038f, -0.062f, 0.07f, -0.128f, 0.095f, -0.199f)
                curveToRelative(0.325f, -0.942f, 1.303f, -1.503f, 2.286f, -1.307f)
                lineToRelative(0.436f, 0.087f)
                curveToRelative(0.291f, 0.059f, 0.599f, -0.018f, 0.831f, -0.208f)
                curveToRelative(0.231f, -0.19f, 0.366f, -0.475f, 0.365f, -0.775f)
                lineToRelative(-0.013f, -6.108f)
                curveToRelative(0.0f, -0.294f, 0.129f, -0.572f, 0.353f, -0.763f)
                curveToRelative(0.229f, -0.194f, 0.521f, -0.272f, 0.823f, -0.223f)
                curveToRelative(0.462f, 0.075f, 0.824f, 0.555f, 0.824f, 1.092f)
                verticalLineToRelative(6.805f)
                curveToRelative(0.0f, 0.476f, 0.336f, 0.886f, 0.803f, 0.98f)
                lineToRelative(2.747f, 0.552f)
                curveToRelative(1.397f, 0.28f, 2.412f, 1.517f, 2.412f, 2.942f)
                verticalLineToRelative(4.721f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
