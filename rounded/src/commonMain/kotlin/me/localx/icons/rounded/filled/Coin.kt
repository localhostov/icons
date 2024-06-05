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

public val Icons.Filled.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(5.271f, 15.0f, 0.0f, 12.145f, 0.0f, 8.5f)
                reflectiveCurveTo(5.271f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(12.0f, 2.855f, 12.0f, 6.5f)
                reflectiveCurveToRelative(-5.271f, 6.5f, -12.0f, 6.5f)
                close()
                moveTo(16.0f, 21.636f)
                curveToRelative(1.083f, -0.201f, 2.09f, -0.481f, 3.0f, -0.831f)
                verticalLineToRelative(-4.88f)
                curveToRelative(-0.93f, 0.314f, -1.938f, 0.559f, -3.0f, 0.739f)
                verticalLineToRelative(4.971f)
                close()
                moveTo(5.0f, 20.805f)
                curveToRelative(0.91f, 0.349f, 1.917f, 0.629f, 3.0f, 0.831f)
                verticalLineToRelative(-4.971f)
                curveToRelative(-1.062f, -0.18f, -2.07f, -0.425f, -3.0f, -0.739f)
                verticalLineToRelative(4.88f)
                close()
                moveTo(14.0f, 16.918f)
                curveToRelative(-0.651f, 0.052f, -1.317f, 0.082f, -2.0f, 0.082f)
                reflectiveCurveToRelative(-1.349f, -0.03f, -2.0f, -0.082f)
                verticalLineToRelative(4.988f)
                curveToRelative(0.651f, 0.057f, 1.315f, 0.094f, 2.0f, 0.094f)
                reflectiveCurveToRelative(1.349f, -0.037f, 2.0f, -0.094f)
                verticalLineToRelative(-4.988f)
                close()
                moveTo(21.0f, 15.082f)
                verticalLineToRelative(4.75f)
                curveToRelative(1.869f, -1.143f, 3.0f, -2.651f, 3.0f, -4.332f)
                verticalLineToRelative(-2.513f)
                curveToRelative(-0.794f, 0.806f, -1.818f, 1.505f, -3.0f, 2.096f)
                close()
                moveTo(3.0f, 15.082f)
                curveToRelative(-1.182f, -0.591f, -2.206f, -1.29f, -3.0f, -2.096f)
                verticalLineToRelative(2.513f)
                curveToRelative(0.0f, 1.681f, 1.131f, 3.19f, 3.0f, 4.332f)
                verticalLineToRelative(-4.75f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
