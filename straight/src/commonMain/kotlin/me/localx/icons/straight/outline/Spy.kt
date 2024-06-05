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

public val Icons.Outline.Spy: ImageVector
    get() {
        if (_spy != null) {
            return _spy!!
        }
        _spy = Builder(name = "Spy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.414f, 14.228f)
                lineToRelative(2.086f, -2.728f)
                reflectiveCurveToRelative(-0.659f, -0.633f, -1.937f, -1.263f)
                curveToRelative(0.279f, -0.692f, 0.437f, -1.446f, 0.437f, -2.237f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.406f, -1.491f, -6.0f, -3.5f, -6.0f)
                curveToRelative(-0.978f, 0.0f, -1.857f, 0.578f, -2.5f, 1.128f)
                curveToRelative(-0.643f, -0.55f, -1.522f, -1.128f, -2.5f, -1.128f)
                curveToRelative(-2.009f, 0.0f, -3.5f, 4.594f, -3.5f, 6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.791f, 0.158f, 1.545f, 0.437f, 2.237f)
                curveToRelative(-1.278f, 0.629f, -1.937f, 1.263f, -1.937f, 1.263f)
                lineToRelative(2.086f, 2.728f)
                curveToRelative(-2.066f, 0.614f, -3.586f, 2.509f, -3.586f, 4.772f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.636f, 1.317f, -2.965f, 2.945f, -2.995f)
                lineToRelative(3.055f, 3.995f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                lineToRelative(3.055f, -3.995f)
                curveToRelative(1.629f, 0.03f, 2.945f, 1.359f, 2.945f, 2.995f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.263f, -1.521f, -4.157f, -3.586f, -4.772f)
                close()
                moveTo(10.343f, 16.0f)
                lineToRelative(-0.962f, -2.61f)
                curveToRelative(0.793f, 0.387f, 1.68f, 0.61f, 2.62f, 0.61f)
                reflectiveCurveToRelative(1.827f, -0.223f, 2.62f, -0.61f)
                lineToRelative(-0.962f, 2.61f)
                horizontalLineToRelative(-3.316f)
                close()
                moveTo(9.622f, 2.012f)
                curveToRelative(0.579f, 0.103f, 1.363f, 0.888f, 1.672f, 1.195f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.707f, -0.707f)
                curveToRelative(0.309f, -0.308f, 1.093f, -1.093f, 1.672f, -1.195f)
                curveToRelative(0.562f, 0.48f, 1.621f, 2.906f, 1.621f, 3.988f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(0.0f, -1.082f, 1.059f, -3.508f, 1.621f, -3.988f)
                close()
                moveTo(16.001f, 8.0f)
                curveToRelative(0.0f, 2.206f, -1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _spy!!
    }

private var _spy: ImageVector? = null
