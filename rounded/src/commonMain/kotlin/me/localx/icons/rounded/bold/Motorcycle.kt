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

public val Icons.Bold.Motorcycle: ImageVector
    get() {
        if (_motorcycle != null) {
            return _motorcycle!!
        }
        _motorcycle = Builder(name = "Motorcycle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.237f, 234.667f)
                lineToRelative(-13.675f, -41.024f)
                curveToRelative(12.715f, -1.045f, 25.515f, -1.643f, 33.28f, -1.643f)
                curveToRelative(12.501f, 20.373f, 61.141f, 35.157f, 64.0f, 0.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(-2.859f, -35.157f, -51.499f, -20.373f, -64.0f, 0.0f)
                curveToRelative(-12.523f, 0.0f, -34.645f, 1.152f, -54.037f, 3.371f)
                lineToRelative(-7.701f, -23.061f)
                curveToRelative(-13.025f, -39.222f, -49.723f, -65.679f, -91.051f, -65.643f)
                horizontalLineToRelative(-28.544f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(28.544f)
                curveToRelative(13.77f, -0.002f, 25.997f, 8.805f, 30.357f, 21.867f)
                lineToRelative(6.976f, 20.928f)
                curveToRelative(-10.317f, 5.849f, -19.857f, 12.973f, -28.395f, 21.205f)
                horizontalLineToRelative(-98.133f)
                curveToRelative(-12.705f, -25.697f, -38.687f, -42.157f, -67.349f, -42.667f)
                horizontalLineTo(75.842f)
                curveToRelative(-17.673f, 0.0f, -32.0f, 14.327f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.327f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(42.667f)
                curveToRelative(4.067f, -0.111f, 7.813f, 2.202f, 9.536f, 5.888f)
                curveToRelative(1.982f, 4.054f, 1.289f, 8.908f, -1.749f, 12.245f)
                lineToRelative(-16.981f, 24.533f)
                horizontalLineToRelative(-1.472f)
                curveTo(48.961f, 234.737f, 1.246f, 282.452f, 1.176f, 341.333f)
                curveToRelative(1.515f, 123.733f, 175.488f, 146.133f, 209.387f, 28.8f)
                curveToRelative(10.956f, -6.645f, 20.531f, -15.337f, 28.203f, -25.6f)
                lineToRelative(81.237f, -118.4f)
                curveToRelative(3.852f, -5.132f, 8.323f, -9.768f, 13.312f, -13.803f)
                lineToRelative(13.547f, 40.661f)
                curveToRelative(-48.594f, 33.656f, -60.703f, 100.333f, -27.047f, 148.926f)
                curveToRelative(19.733f, 28.491f, 52.04f, 45.663f, 86.695f, 46.082f)
                curveTo(546.434f, 443.733f, 547.928f, 241.195f, 408.237f, 234.667f)
                close()
                moveTo(186.776f, 307.2f)
                curveToRelative(-6.065f, 8.031f, -15.536f, 12.767f, -25.6f, 12.8f)
                horizontalLineToRelative(-32.939f)
                lineToRelative(50.005f, -72.533f)
                curveToRelative(2.97f, -4.007f, 5.542f, -8.294f, 7.68f, -12.8f)
                horizontalLineToRelative(50.624f)
                lineTo(186.776f, 307.2f)
                close()
                moveTo(406.509f, 384.0f)
                curveToRelative(-23.564f, 0.0f, -42.667f, -19.102f, -42.667f, -42.667f)
                curveToRelative(0.0f, -23.564f, 19.102f, -42.667f, 42.667f, -42.667f)
                reflectiveCurveToRelative(42.667f, 19.103f, 42.667f, 42.667f)
                curveTo(449.176f, 364.898f, 430.073f, 384.0f, 406.509f, 384.0f)
                close()
            }
        }
        .build()
        return _motorcycle!!
    }

private var _motorcycle: ImageVector? = null
