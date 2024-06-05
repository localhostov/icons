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

public val Icons.Filled.Donut: ImageVector
    get() {
        if (_donut != null) {
            return _donut!!
        }
        _donut = Builder(name = "Donut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.975f, 20.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.943f)
                curveToRelative(-2.123f, 1.9f, -4.926f, 3.057f, -8.0f, 3.057f)
                curveTo(5.814f, 24.0f, 0.739f, 19.357f, 0.054f, 13.38f)
                curveToRelative(0.346f, 0.155f, 0.675f, 0.352f, 0.982f, 0.59f)
                curveToRelative(0.822f, 0.638f, 1.865f, 0.99f, 2.938f, 0.991f)
                curveToRelative(1.074f, 0.0f, 2.119f, -0.353f, 2.94f, -0.991f)
                curveToRelative(0.399f, -0.309f, 0.816f, -0.538f, 1.269f, -0.692f)
                curveToRelative(0.533f, 1.582f, 2.029f, 2.721f, 3.791f, 2.721f)
                curveToRelative(1.47f, 0.0f, 2.754f, -0.793f, 3.449f, -1.974f)
                curveToRelative(0.317f, 0.085f, 0.551f, 0.374f, 0.551f, 0.717f)
                verticalLineToRelative(2.256f)
                curveToRelative(0.0f, 1.657f, 1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(12.486f, 0.011f)
                curveTo(5.886f, -0.263f, 0.406f, 4.796f, 0.0f, 11.233f)
                curveToRelative(0.812f, 0.236f, 1.576f, 0.625f, 2.261f, 1.157f)
                curveToRelative(0.955f, 0.741f, 2.452f, 0.765f, 3.404f, 0.02f)
                curveToRelative(0.729f, -0.571f, 1.518f, -0.96f, 2.383f, -1.175f)
                curveToRelative(0.357f, -1.843f, 1.979f, -3.235f, 3.927f, -3.235f)
                curveToRelative(2.209f, 0.0f, 4.0f, 1.791f, 4.0f, 4.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-4.002f)
                curveToRelative(0.02f, -0.56f, 0.459f, -0.998f, 1.0f, -0.998f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-7.628f)
                curveToRelative(0.0f, -6.494f, -5.001f, -12.093f, -11.489f, -12.362f)
                close()
            }
        }
        .build()
        return _donut!!
    }

private var _donut: ImageVector? = null
