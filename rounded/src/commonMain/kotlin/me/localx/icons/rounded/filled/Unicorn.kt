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

public val Icons.Filled.Unicorn: ImageVector
    get() {
        if (_unicorn != null) {
            return _unicorn!!
        }
        _unicorn = Builder(name = "Unicorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.138f, 6.909f)
                curveToRelative(-1.517f, -0.609f, -2.747f, -1.611f, -3.497f, -2.838f)
                lineToRelative(4.092f, -3.377f)
                curveToRelative(0.349f, -0.33f, 0.006f, -0.904f, -0.45f, -0.752f)
                lineToRelative(-4.283f, 1.564f)
                verticalLineToRelative(-0.81f)
                curveToRelative(0.0f, -0.461f, -0.447f, -0.805f, -0.888f, -0.669f)
                curveToRelative(-1.014f, 0.312f, -1.796f, 1.267f, -2.033f, 2.315f)
                curveToRelative(-2.895f, 0.953f, -3.907f, 3.756f, -4.058f, 5.659f)
                curveToRelative(-0.014f, 0.176f, -0.021f, 1.0f, -1.021f, 1.0f)
                reflectiveCurveToRelative(-3.006f, 0.003f, -3.006f, 0.003f)
                curveToRelative(-1.254f, 0.0f, -2.578f, 0.645f, -3.312f, 1.552f)
                curveToRelative(-2.136f, 0.717f, -4.682f, 2.765f, -4.682f, 8.448f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                curveToRelative(0.0f, -2.792f, 0.68f, -4.73f, 2.003f, -5.812f)
                curveToRelative(0.046f, 1.593f, 0.644f, 3.32f, 1.133f, 4.72f)
                curveToRelative(0.146f, 0.417f, 0.284f, 0.812f, 0.396f, 1.172f)
                lineToRelative(-0.366f, 2.646f)
                curveToRelative(-0.166f, 1.202f, 0.582f, 2.267f, 1.795f, 2.267f)
                curveToRelative(1.371f, 0.0f, 2.131f, -0.746f, 2.255f, -1.748f)
                lineToRelative(0.401f, -3.245f)
                horizontalLineToRelative(4.383f)
                verticalLineToRelative(2.893f)
                curveToRelative(0.0f, 0.996f, 0.681f, 1.92f, 1.664f, 2.08f)
                curveToRelative(1.253f, 0.204f, 2.336f, -0.758f, 2.336f, -1.973f)
                verticalLineToRelative(-3.395f)
                lineToRelative(0.385f, -1.811f)
                curveToRelative(0.417f, -1.46f, 0.615f, -2.416f, 0.615f, -3.896f)
                verticalLineToRelative(-1.994f)
                curveToRelative(0.0f, -0.514f, 0.389f, -0.944f, 0.901f, -0.995f)
                lineToRelative(2.816f, -0.282f)
                curveToRelative(0.729f, -0.073f, 1.283f, -0.686f, 1.283f, -1.418f)
                curveToRelative(0.0f, -0.568f, -0.335f, -1.093f, -0.862f, -1.305f)
                close()
            }
        }
        .build()
        return _unicorn!!
    }

private var _unicorn: ImageVector? = null
