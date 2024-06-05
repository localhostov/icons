package me.localx.icons.straight.outline

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

public val Icons.Outline.HandshakeTrust: ImageVector
    get() {
        if (_handshakeTrust != null) {
            return _handshakeTrust!!
        }
        _handshakeTrust = Builder(name = "HandshakeTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.375f, 12.208f)
                lineToRelative(0.582f, 0.291f)
                lineToRelative(0.603f, -0.243f)
                curveToRelative(1.042f, -0.419f, 4.44f, -2.07f, 4.44f, -5.723f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0.0f, -1.08f, -0.688f, -2.033f, -1.714f, -2.373f)
                lineTo(12.0f, 0.037f)
                lineToRelative(-3.287f, 1.09f)
                curveToRelative(-1.024f, 0.34f, -1.713f, 1.293f, -1.713f, 2.373f)
                verticalLineToRelative(3.033f)
                curveToRelative(0.0f, 3.237f, 3.349f, 5.162f, 4.375f, 5.675f)
                close()
                moveTo(9.0f, 3.5f)
                curveToRelative(0.0f, -0.216f, 0.138f, -0.407f, 0.342f, -0.475f)
                lineToRelative(2.658f, -0.881f)
                lineToRelative(2.657f, 0.881f)
                curveToRelative(0.205f, 0.068f, 0.343f, 0.259f, 0.343f, 0.475f)
                verticalLineToRelative(3.033f)
                curveToRelative(0.0f, 2.189f, -2.032f, 3.353f, -2.955f, 3.769f)
                curveToRelative(-0.839f, -0.457f, -3.045f, -1.84f, -3.045f, -3.769f)
                verticalLineToRelative(-3.033f)
                close()
                moveTo(17.99f, 18.0f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.531f)
                lineToRelative(-5.125f, 4.0f)
                horizontalLineToRelative(-2.688f)
                lineToRelative(-5.125f, -4.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.219f)
                lineToRelative(5.125f, 4.0f)
                horizontalLineToRelative(1.312f)
                lineToRelative(3.635f, -2.837f)
                lineToRelative(-4.027f, -3.589f)
                lineToRelative(-1.604f, 1.494f)
                curveToRelative(-0.274f, 0.274f, -0.744f, 0.432f, -1.16f, 0.432f)
                curveToRelative(-0.461f, -0.037f, -0.938f, -0.275f, -1.21f, -0.652f)
                curveToRelative(-0.452f, -0.63f, -0.372f, -1.493f, 0.189f, -2.055f)
                lineToRelative(1.287f, -1.187f)
                curveToRelative(0.283f, 0.166f, 0.531f, 0.299f, 0.715f, 0.391f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.881f, 0.441f, 1.91f, 0.482f, 2.824f, 0.114f)
                curveToRelative(0.064f, -0.026f, 0.141f, -0.059f, 0.219f, -0.092f)
                lineToRelative(4.466f, 3.981f)
                close()
                moveTo(6.235f, 13.0f)
                lineTo(0.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.769f)
                curveToRelative(0.166f, -0.079f, 0.397f, -0.186f, 0.664f, -0.299f)
                curveToRelative(0.449f, 0.606f, 0.96f, 1.127f, 1.473f, 1.572f)
                curveToRelative(-0.514f, 0.184f, -1.671f, 0.727f, -1.671f, 0.727f)
                close()
                moveTo(23.999f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.235f)
                reflectiveCurveToRelative(-1.081f, -0.509f, -1.517f, -0.673f)
                curveToRelative(0.51f, -0.437f, 1.005f, -0.962f, 1.435f, -1.577f)
                curveToRelative(0.216f, 0.094f, 0.408f, 0.182f, 0.548f, 0.249f)
                horizontalLineToRelative(5.77f)
                close()
            }
        }
        .build()
        return _handshakeTrust!!
    }

private var _handshakeTrust: ImageVector? = null
