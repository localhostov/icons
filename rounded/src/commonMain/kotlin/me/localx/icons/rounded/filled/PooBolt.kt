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

public val Icons.Filled.PooBolt: ImageVector
    get() {
        if (_pooBolt != null) {
            return _pooBolt!!
        }
        _pooBolt = Builder(name = "PooBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.113f, 14.484f)
                curveToRelative(0.547f, -0.684f, 0.887f, -1.54f, 0.887f, -2.484f)
                curveToRelative(0.0f, -1.617f, -0.964f, -3.002f, -2.344f, -3.632f)
                curveToRelative(0.305f, -0.591f, 0.443f, -1.281f, 0.266f, -2.032f)
                curveToRelative(-0.332f, -1.405f, -1.68f, -2.336f, -3.124f, -2.336f)
                horizontalLineToRelative(-0.942f)
                curveToRelative(-0.37f, -1.418f, -1.428f, -3.219f, -2.654f, -3.893f)
                curveToRelative(-0.532f, -0.293f, -1.183f, 0.043f, -1.266f, 0.645f)
                curveToRelative(-0.198f, 1.44f, -0.816f, 2.629f, -1.435f, 3.248f)
                horizontalLineToRelative(-3.297f)
                curveToRelative(-1.444f, 0.0f, -2.792f, 0.931f, -3.124f, 2.336f)
                curveToRelative(-0.177f, 0.751f, -0.039f, 1.441f, 0.266f, 2.032f)
                curveToRelative(-1.38f, 0.631f, -2.344f, 2.015f, -2.344f, 3.632f)
                curveToRelative(0.0f, 0.944f, 0.34f, 1.799f, 0.887f, 2.484f)
                curveTo(1.044f, 15.348f, -0.194f, 17.289f, 0.025f, 19.506f)
                curveToRelative(0.256f, 2.593f, 2.58f, 4.494f, 5.186f, 4.494f)
                horizontalLineToRelative(12.405f)
                curveToRelative(3.779f, 0.0f, 6.103f, -1.901f, 6.359f, -4.494f)
                curveToRelative(0.219f, -2.217f, -1.019f, -4.158f, -2.862f, -5.023f)
                close()
                moveTo(16.347f, 15.394f)
                lineToRelative(-4.254f, 6.225f)
                curveToRelative(-0.56f, 0.813f, -1.827f, 0.215f, -1.556f, -0.734f)
                lineToRelative(0.963f, -2.897f)
                horizontalLineToRelative(-3.077f)
                curveToRelative(-0.619f, 0.0f, -1.062f, -0.597f, -0.883f, -1.19f)
                lineToRelative(2.12f, -6.137f)
                curveToRelative(0.139f, -0.403f, 0.519f, -0.674f, 0.945f, -0.674f)
                horizontalLineToRelative(1.894f)
                curveToRelative(0.702f, 0.0f, 1.185f, 0.704f, 0.933f, 1.359f)
                lineToRelative(-0.933f, 2.641f)
                horizontalLineToRelative(3.093f)
                curveToRelative(0.722f, 0.0f, 1.153f, 0.804f, 0.754f, 1.406f)
                close()
            }
        }
        .build()
        return _pooBolt!!
    }

private var _pooBolt: ImageVector? = null
