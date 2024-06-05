package me.localx.icons.straight.bold

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

public val Icons.Bold.PostalAddress: ImageVector
    get() {
        if (_postalAddress != null) {
            return _postalAddress!!
        }
        _postalAddress = Builder(name = "PostalAddress", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.048f, 14.948f)
                lineToRelative(4.952f, 4.843f)
                verticalLineToRelative(4.195f)
                lineToRelative(-7.059f, -6.903f)
                reflectiveCurveToRelative(-0.005f, -0.01f, -0.009f, -0.014f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-1.889f, -1.889f, -2.929f, -4.4f, -2.929f, -7.071f)
                reflectiveCurveTo(1.04f, 4.817f, 2.929f, 2.929f)
                reflectiveCurveTo(7.33f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(5.181f, 1.04f, 7.07f, 2.929f)
                reflectiveCurveToRelative(2.929f, 4.399f, 2.929f, 7.071f)
                curveToRelative(0.0f, 1.033f, -0.16f, 2.041f, -0.46f, 3.0f)
                horizontalLineToRelative(-3.22f)
                curveToRelative(0.439f, -0.925f, 0.679f, -1.943f, 0.679f, -3.0f)
                curveToRelative(0.0f, -1.87f, -0.728f, -3.628f, -2.05f, -4.95f)
                curveToRelative(-1.322f, -1.321f, -3.08f, -2.05f, -4.949f, -2.05f)
                reflectiveCurveToRelative(-3.628f, 0.729f, -4.95f, 2.05f)
                curveToRelative(-1.322f, 1.322f, -2.05f, 3.08f, -2.05f, 4.95f)
                reflectiveCurveToRelative(0.727f, 3.626f, 2.048f, 4.948f)
                close()
                moveTo(20.121f, 20.123f)
                curveToRelative(-0.585f, 0.585f, -1.353f, 0.877f, -2.121f, 0.877f)
                reflectiveCurveToRelative(-1.536f, -0.292f, -2.121f, -0.877f)
                lineToRelative(-3.879f, -3.879f)
                verticalLineToRelative(7.756f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-7.756f)
                lineToRelative(-3.879f, 3.879f)
                close()
                moveTo(17.293f, 18.709f)
                curveToRelative(0.378f, 0.377f, 1.036f, 0.377f, 1.414f, 0.0f)
                lineToRelative(3.708f, -3.708f)
                horizontalLineToRelative(-8.831f)
                lineToRelative(3.709f, 3.708f)
                close()
                moveTo(13.062f, 9.981f)
                curveToRelative(0.0f, -1.655f, -1.342f, -2.997f, -2.997f, -2.997f)
                curveToRelative(-0.225f, 0.0f, -0.443f, 0.029f, -0.654f, 0.076f)
                curveToRelative(-1.374f, 0.274f, -2.41f, 1.486f, -2.41f, 2.941f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.418f, 0.0f, 0.816f, -0.087f, 1.178f, -0.241f)
                curveToRelative(1.103f, -0.443f, 1.884f, -1.517f, 1.884f, -2.778f)
                close()
            }
        }
        .build()
        return _postalAddress!!
    }

private var _postalAddress: ImageVector? = null
