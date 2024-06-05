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

public val Icons.Bold.CoffeeBean: ImageVector
    get() {
        if (_coffeeBean != null) {
            return _coffeeBean!!
        }
        _coffeeBean = Builder(name = "CoffeeBean", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.992f, 3.656f)
                curveToRelative(0.001f, -0.014f, -0.502f, -0.609f, -0.771f, -0.877f)
                curveTo(16.993f, -1.45f, 9.417f, -0.753f, 4.333f, 4.333f)
                curveTo(-0.417f, 9.083f, -1.338f, 16.007f, 2.008f, 20.344f)
                curveToRelative(0.0f, 0.0f, 0.502f, 0.609f, 0.771f, 0.877f)
                curveToRelative(1.859f, 1.859f, 4.365f, 2.766f, 7.023f, 2.766f)
                curveToRelative(3.386f, 0.0f, 7.017f, -1.472f, 9.865f, -4.32f)
                curveToRelative(4.75f, -4.75f, 5.671f, -11.674f, 2.325f, -16.011f)
                close()
                moveTo(3.05f, 13.256f)
                curveToRelative(0.258f, -2.448f, 1.467f, -4.864f, 3.404f, -6.802f)
                reflectiveCurveToRelative(4.354f, -3.146f, 6.802f, -3.404f)
                curveToRelative(0.32f, -0.034f, 0.635f, -0.051f, 0.944f, -0.051f)
                curveToRelative(1.747f, 0.0f, 3.308f, 0.533f, 4.507f, 1.54f)
                curveToRelative(-0.587f, 1.623f, -2.289f, 4.508f, -7.154f, 6.029f)
                curveToRelative(-4.552f, 1.422f, -6.94f, 3.896f, -8.19f, 6.003f)
                curveToRelative(-0.328f, -1.005f, -0.438f, -2.127f, -0.313f, -3.316f)
                close()
                moveTo(17.546f, 17.546f)
                curveToRelative(-1.938f, 1.938f, -4.354f, 3.146f, -6.802f, 3.404f)
                curveToRelative(-2.128f, 0.226f, -4.04f, -0.304f, -5.451f, -1.49f)
                curveToRelative(0.586f, -1.623f, 2.289f, -4.509f, 7.154f, -6.029f)
                curveToRelative(4.552f, -1.422f, 6.94f, -3.896f, 8.19f, -6.003f)
                curveToRelative(0.328f, 1.005f, 0.438f, 2.127f, 0.313f, 3.316f)
                curveToRelative(-0.258f, 2.448f, -1.467f, 4.864f, -3.404f, 6.802f)
                close()
            }
        }
        .build()
        return _coffeeBean!!
    }

private var _coffeeBean: ImageVector? = null
