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

public val Icons.Filled.Scarf: ImageVector
    get() {
        if (_scarf != null) {
            return _scarf!!
        }
        _scarf = Builder(name = "Scarf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.774f, 23.144f)
                lineToRelative(-0.23f, 0.23f)
                curveToRelative(-0.781f, 0.781f, -2.047f, 0.781f, -2.828f, 0.0f)
                lineToRelative(-1.102f, -1.102f)
                curveToRelative(-0.783f, -0.783f, -0.781f, -2.053f, 0.005f, -2.833f)
                lineToRelative(0.173f, -0.172f)
                lineToRelative(3.983f, 3.877f)
                close()
                moveTo(6.703f, 15.375f)
                lineToRelative(-2.492f, 2.482f)
                lineToRelative(3.978f, 3.873f)
                lineToRelative(2.434f, -2.434f)
                lineToRelative(-3.92f, -3.92f)
                close()
                moveTo(10.662f, 8.855f)
                lineToRelative(-3.67f, -3.863f)
                curveToRelative(-0.298f, -0.314f, -0.354f, -0.784f, -0.14f, -1.16f)
                curveToRelative(0.004f, -0.007f, 0.008f, -0.014f, 0.012f, -0.021f)
                curveToRelative(0.325f, -0.568f, 1.11f, -0.661f, 1.56f, -0.186f)
                lineToRelative(3.576f, 3.779f)
                lineToRelative(3.645f, -3.771f)
                curveToRelative(0.451f, -0.467f, 1.224f, -0.353f, 1.534f, 0.217f)
                curveToRelative(0.004f, 0.007f, 0.007f, 0.014f, 0.011f, 0.02f)
                curveToRelative(0.193f, 0.358f, 0.136f, 0.792f, -0.14f, 1.091f)
                curveToRelative(-0.934f, 1.013f, -3.087f, 3.334f, -3.676f, 3.846f)
                lineToRelative(3.887f, 3.784f)
                lineToRelative(-0.006f, 0.033f)
                lineToRelative(0.689f, -0.689f)
                curveToRelative(0.732f, -0.732f, 1.552f, -1.66f, 2.158f, -2.368f)
                curveToRelative(0.591f, -0.69f, 0.792f, -1.625f, 0.542f, -2.499f)
                curveToRelative(-0.426f, -1.488f, -1.262f, -3.839f, -2.644f, -5.57f)
                curveTo(16.974f, 0.769f, 15.14f, 0.008f, 12.0f, 0.0f)
                curveToRelative(-3.14f, 0.008f, -4.974f, 0.769f, -6.0f, 1.5f)
                curveToRelative(-1.382f, 1.732f, -2.218f, 4.082f, -2.644f, 5.57f)
                curveToRelative(-0.25f, 0.874f, -0.05f, 1.809f, 0.542f, 2.499f)
                curveToRelative(0.606f, 0.707f, 1.426f, 1.635f, 2.158f, 2.368f)
                lineToRelative(9.784f, 9.801f)
                lineToRelative(3.909f, -3.805f)
                lineToRelative(-9.085f, -9.077f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(21.168f, 19.342f)
                lineToRelative(-3.911f, 3.807f)
                lineToRelative(0.268f, 0.267f)
                curveToRelative(0.773f, 0.771f, 2.022f, 0.779f, 2.806f, 0.018f)
                lineToRelative(1.046f, -1.016f)
                curveToRelative(0.802f, -0.779f, 0.809f, -2.065f, 0.016f, -2.853f)
                lineToRelative(-0.224f, -0.223f)
                close()
            }
        }
        .build()
        return _scarf!!
    }

private var _scarf: ImageVector? = null
