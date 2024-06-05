package me.localx.icons.rounded.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.06f, viewportHeight = 512.06f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(295.407f, 368.363f)
                lineToRelative(-69.589f, 69.589f)
                curveToRelative(-42.453f, 41.318f, -110.362f, 40.398f, -151.68f, -2.054f)
                curveToRelative(-40.521f, -41.633f, -40.53f, -107.959f, -0.021f, -149.604f)
                lineToRelative(69.589f, -69.653f)
                curveToRelative(8.33f, -8.336f, 8.325f, -21.846f, -0.011f, -30.176f)
                curveToRelative(-8.336f, -8.33f, -21.846f, -8.325f, -30.176f, 0.011f)
                lineToRelative(-69.568f, 69.653f)
                curveToRelative(-58.539f, 58.569f, -58.515f, 153.503f, 0.053f, 212.043f)
                reflectiveCurveToRelative(153.503f, 58.515f, 212.043f, -0.053f)
                lineToRelative(69.589f, -69.589f)
                curveToRelative(8.185f, -8.475f, 7.95f, -21.98f, -0.524f, -30.165f)
                curveToRelative(-8.267f, -7.985f, -21.374f, -7.985f, -29.641f, 0.0f)
                horizontalLineTo(295.407f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(468.186f, 43.969f)
                curveTo(440.146f, 15.736f, 401.971f, -0.098f, 362.18f, 0.001f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-39.769f, -0.106f, -77.93f, 15.695f, -105.984f, 43.883f)
                lineTo(186.5f, 113.494f)
                curveToRelative(-8.336f, 8.33f, -8.341f, 21.84f, -0.011f, 30.176f)
                curveToRelative(8.33f, 8.336f, 21.84f, 8.341f, 30.176f, 0.011f)
                lineToRelative(69.653f, -69.589f)
                curveToRelative(20.061f, -20.182f, 47.363f, -31.497f, 75.819f, -31.424f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(59.24f, 0.02f, 107.248f, 48.059f, 107.228f, 107.299f)
                curveToRelative(-0.009f, 28.432f, -11.307f, 55.698f, -31.41f, 75.805f)
                lineToRelative(-69.589f, 69.589f)
                curveToRelative(-8.336f, 8.336f, -8.336f, 21.851f, 0.0f, 30.187f)
                curveToRelative(8.336f, 8.336f, 21.851f, 8.336f, 30.187f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(69.589f, -69.547f)
                curveTo(526.599f, 197.417f, 526.618f, 102.575f, 468.186f, 43.969f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.964f, 176.918f)
                lineToRelative(-128.0f, 128.0f)
                curveToRelative(-8.475f, 8.185f, -8.709f, 21.691f, -0.524f, 30.165f)
                reflectiveCurveToRelative(21.691f, 8.709f, 30.165f, 0.524f)
                curveToRelative(0.178f, -0.172f, 0.352f, -0.346f, 0.524f, -0.524f)
                lineToRelative(128.0f, -128.0f)
                curveToRelative(8.185f, -8.475f, 7.95f, -21.98f, -0.525f, -30.165f)
                curveTo(326.338f, 168.934f, 313.232f, 168.934f, 304.964f, 176.918f)
                lineTo(304.964f, 176.918f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
