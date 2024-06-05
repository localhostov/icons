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

public val Icons.Bold.Elephant: ImageVector
    get() {
        if (_elephant != null) {
            return _elephant!!
        }
        _elephant = Builder(name = "Elephant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.505f, 17.0f)
                curveToRelative(-0.813f, -0.006f, -1.507f, 0.657f, -1.515f, 1.485f)
                lineToRelative(-0.01f, 1.018f)
                curveToRelative(0.0f, 0.275f, -0.224f, 0.499f, -0.499f, 0.499f)
                curveToRelative(-0.165f, 0.0f, -0.274f, -0.076f, -0.338f, -0.14f)
                curveToRelative(-0.054f, -0.055f, -0.144f, -0.174f, -0.144f, -0.361f)
                verticalLineToRelative(-9.998f)
                curveToRelative(0.002f, -2.127f, -1.049f, -4.122f, -2.776f, -5.332f)
                curveToRelative(-0.873f, -1.854f, -2.819f, -3.172f, -4.733f, -3.172f)
                curveToRelative(-1.821f, 0.0f, -3.356f, 0.755f, -4.338f, 1.998f)
                horizontalLineToRelative(-1.652f)
                curveTo(2.916f, 2.998f, 0.0f, 5.914f, 0.0f, 9.498f)
                verticalLineToRelative(11.007f)
                curveToRelative(0.0f, 0.667f, 0.26f, 1.295f, 0.732f, 1.767f)
                curveToRelative(0.472f, 0.471f, 1.099f, 0.73f, 1.766f, 0.73f)
                horizontalLineToRelative(0.003f)
                curveToRelative(1.369f, -0.002f, 2.487f, -1.119f, 2.492f, -2.491f)
                lineToRelative(0.003f, -1.508f)
                horizontalLineToRelative(4.994f)
                verticalLineToRelative(1.502f)
                curveToRelative(0.0f, 1.374f, 1.118f, 2.494f, 2.511f, 2.497f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.666f, 0.0f, 1.293f, -0.259f, 1.765f, -0.73f)
                curveToRelative(0.473f, -0.472f, 0.732f, -1.099f, 0.732f, -1.767f)
                verticalLineToRelative(-1.502f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.498f)
                curveToRelative(0.0f, 0.933f, 0.357f, 1.81f, 1.009f, 2.47f)
                curveToRelative(0.657f, 0.666f, 1.535f, 1.032f, 2.473f, 1.032f)
                curveToRelative(1.93f, 0.0f, 3.499f, -1.57f, 3.499f, -3.484f)
                lineToRelative(0.01f, -1.003f)
                curveToRelative(0.008f, -0.829f, -0.657f, -1.506f, -1.485f, -1.515f)
                close()
                moveTo(3.0f, 16.002f)
                verticalLineToRelative(-6.505f)
                curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.51f)
                curveToRelative(-0.013f, 0.165f, -0.02f, 0.332f, -0.02f, 0.502f)
                curveToRelative(0.0f, 2.771f, 1.796f, 5.061f, 4.271f, 5.444f)
                curveToRelative(0.815f, 0.125f, 1.585f, -0.434f, 1.712f, -1.252f)
                reflectiveCurveToRelative(-0.434f, -1.585f, -1.253f, -1.712f)
                curveToRelative(-1.002f, -0.155f, -1.729f, -1.198f, -1.729f, -2.479f)
                curveToRelative(0.0f, -1.153f, 0.654f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.767f, 0.0f, 1.66f, 0.656f, 2.033f, 1.479f)
                lineToRelative(0.012f, 0.049f)
                curveToRelative(0.1f, 0.395f, 0.354f, 0.731f, 0.707f, 0.934f)
                curveToRelative(1.085f, 0.625f, 1.759f, 1.79f, 1.758f, 3.04f)
                verticalLineToRelative(6.5f)
                lineTo(3.0f, 16.002f)
                close()
            }
        }
        .build()
        return _elephant!!
    }

private var _elephant: ImageVector? = null
