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

public val Icons.Filled.FlyInsect: ImageVector
    get() {
        if (_flyInsect != null) {
            return _flyInsect!!
        }
        _flyInsect = Builder(name = "FlyInsect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.025f, 11.814f)
                lineToRelative(0.318f, 0.607f)
                curveToRelative(0.53f, 1.013f, 0.984f, 1.863f, 1.374f, 2.579f)
                horizontalLineToRelative(-3.382f)
                curveToRelative(0.389f, -0.716f, 0.843f, -1.567f, 1.373f, -2.58f)
                lineToRelative(0.317f, -0.606f)
                close()
                moveTo(6.433f, 8.33f)
                curveToRelative(-2.71f, 1.602f, -4.88f, 3.745f, -5.625f, 4.669f)
                curveToRelative(-1.263f, 1.565f, -1.019f, 3.859f, 0.547f, 5.122f)
                curveToRelative(1.565f, 1.263f, 3.859f, 1.019f, 5.122f, -0.547f)
                curveToRelative(0.623f, -0.772f, 2.111f, -3.506f, 3.459f, -6.081f)
                curveToRelative(-1.486f, -0.675f, -2.86f, -1.732f, -3.503f, -3.163f)
                close()
                moveTo(12.05f, 24.0f)
                curveToRelative(1.117f, 0.0f, 1.942f, -1.257f, 2.565f, -3.0f)
                horizontalLineToRelative(-5.13f)
                curveToRelative(0.624f, 1.743f, 1.448f, 3.0f, 2.565f, 3.0f)
                close()
                moveTo(23.242f, 12.999f)
                curveToRelative(-0.746f, -0.924f, -2.916f, -3.067f, -5.625f, -4.669f)
                curveToRelative(-0.643f, 1.431f, -2.016f, 2.489f, -3.503f, 3.163f)
                curveToRelative(1.348f, 2.575f, 2.836f, 5.309f, 3.459f, 6.081f)
                curveToRelative(1.263f, 1.565f, 3.557f, 1.81f, 5.122f, 0.547f)
                curveToRelative(1.565f, -1.263f, 1.81f, -3.557f, 0.547f, -5.122f)
                close()
                moveTo(9.215f, 17.0f)
                curveToRelative(-0.224f, 0.384f, -0.409f, 0.691f, -0.565f, 0.939f)
                curveToRelative(0.076f, 0.358f, 0.158f, 0.713f, 0.244f, 1.061f)
                horizontalLineToRelative(6.312f)
                curveToRelative(0.081f, -0.329f, 0.158f, -0.664f, 0.231f, -1.002f)
                curveToRelative(-0.163f, -0.257f, -0.361f, -0.582f, -0.602f, -0.998f)
                horizontalLineToRelative(-5.62f)
                close()
                moveTo(14.511f, 2.943f)
                curveToRelative(0.026f, -0.144f, 0.04f, -0.291f, 0.04f, -0.443f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.122f, -2.5f, 2.5f)
                curveToRelative(0.0f, 0.148f, 0.013f, 0.293f, 0.038f, 0.434f)
                curveToRelative(0.115f, 0.492f, 0.58f, 1.066f, 2.462f, 1.066f)
                curveToRelative(1.871f, 0.0f, 2.342f, -0.568f, 2.46f, -1.057f)
                close()
                moveTo(12.051f, 6.0f)
                curveToRelative(-1.775f, 0.0f, -2.866f, -0.451f, -3.528f, -1.065f)
                curveToRelative(-0.3f, 0.492f, -0.472f, 1.046f, -0.472f, 1.621f)
                curveToRelative(0.0f, 2.31f, 3.358f, 3.4f, 3.741f, 3.517f)
                lineToRelative(0.259f, 0.079f)
                lineToRelative(0.259f, -0.079f)
                curveToRelative(0.383f, -0.117f, 3.741f, -1.207f, 3.741f, -3.517f)
                curveToRelative(0.0f, -0.575f, -0.173f, -1.129f, -0.472f, -1.621f)
                curveToRelative(-0.662f, 0.615f, -1.752f, 1.065f, -3.528f, 1.065f)
                close()
            }
        }
        .build()
        return _flyInsect!!
    }

private var _flyInsect: ImageVector? = null
