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

public val Icons.Bold.Banner3: ImageVector
    get() {
        if (_banner3 != null) {
            return _banner3!!
        }
        _banner3 = Builder(name = "Banner3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.757f, 1.102f)
                curveTo(21.966f, 0.35f, 20.882f, -0.053f, 19.8f, 0.005f)
                lineTo(4.806f, 0.755f)
                curveTo(2.583f, 0.866f, 0.786f, 2.551f, 0.533f, 4.77f)
                lineTo(0.009f, 9.542f)
                curveToRelative(-0.045f, 0.412f, 0.083f, 0.825f, 0.352f, 1.14f)
                curveToRelative(0.056f, 0.065f, 9.608f, 6.054f, 9.608f, 6.054f)
                curveToRelative(0.885f, 0.551f, 2.031f, -0.086f, 2.031f, -1.128f)
                verticalLineToRelative(-3.934f)
                lineToRelative(7.271f, 0.323f)
                curveToRelative(0.069f, 0.003f, 0.138f, 0.004f, 0.207f, 0.004f)
                curveToRelative(1.17f, 0.0f, 2.273f, -0.442f, 3.125f, -1.256f)
                curveToRelative(0.901f, -0.862f, 1.397f, -2.024f, 1.397f, -3.271f)
                verticalLineToRelative(-3.472f)
                curveToRelative(0.0f, -1.09f, -0.453f, -2.147f, -1.243f, -2.898f)
                close()
                moveTo(21.0f, 7.473f)
                curveToRelative(0.0f, 0.421f, -0.167f, 0.813f, -0.472f, 1.104f)
                reflectiveCurveToRelative(-0.709f, 0.434f, -1.124f, 0.422f)
                lineToRelative(-16.239f, -0.721f)
                lineToRelative(0.349f, -3.174f)
                curveToRelative(0.085f, -0.746f, 0.691f, -1.315f, 1.441f, -1.353f)
                lineToRelative(14.995f, -0.75f)
                curveToRelative(0.281f, -0.021f, 0.539f, 0.083f, 0.739f, 0.274f)
                curveToRelative(0.201f, 0.19f, 0.311f, 0.448f, 0.311f, 0.725f)
                verticalLineToRelative(3.472f)
                close()
                moveTo(9.645f, 18.943f)
                lineToRelative(-3.837f, 1.535f)
                lineToRelative(3.339f, 2.172f)
                curveToRelative(0.654f, 0.49f, 0.162f, 1.524f, -0.631f, 1.326f)
                lineToRelative(-4.386f, -1.33f)
                curveToRelative(-1.265f, -0.383f, -2.13f, -1.549f, -2.13f, -2.871f)
                curveToRelative(0.0f, -1.157f, 0.343f, -2.288f, 0.984f, -3.251f)
                lineToRelative(0.868f, -1.302f)
                lineToRelative(5.793f, 3.72f)
                close()
            }
        }
        .build()
        return _banner3!!
    }

private var _banner3: ImageVector? = null
