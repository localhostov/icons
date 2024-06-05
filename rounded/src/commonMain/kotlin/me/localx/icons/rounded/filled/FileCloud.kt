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

public val Icons.Filled.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) {
            return _fileCloud!!
        }
        _fileCloud = Builder(name = "FileCloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                lineTo(14.0f, 0.46f)
                curveToRelative(0.913f, 0.346f, 1.753f, 0.879f, 2.465f, 1.59f)
                lineToRelative(3.484f, 3.486f)
                curveToRelative(0.712f, 0.711f, 1.245f, 1.551f, 1.591f, 2.464f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
                moveTo(14.639f, 16.514f)
                curveToRelative(-0.55f, 0.077f, -1.089f, -0.288f, -1.174f, -0.827f)
                curveToRelative(-0.155f, -0.978f, -0.981f, -1.687f, -1.965f, -1.687f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                curveToRelative(0.0f, 0.209f, 0.04f, 0.412f, 0.129f, 0.659f)
                curveToRelative(0.119f, 0.327f, 0.059f, 0.692f, -0.158f, 0.965f)
                curveToRelative(-0.217f, 0.271f, -0.561f, 0.407f, -0.906f, 0.368f)
                curveToRelative(-0.341f, 0.008f, -0.565f, 0.232f, -0.565f, 0.508f)
                reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.25f)
                curveToRelative(0.689f, 0.0f, 1.25f, -0.561f, 1.25f, -1.25f)
                curveToRelative(0.0f, -0.727f, -0.638f, -1.336f, -1.361f, -1.236f)
                close()
                moveTo(21.977f, 10.0f)
                horizontalLineToRelative(-6.976f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                lineTo(12.001f, 0.024f)
                curveToRelative(-0.161f, -0.011f, -0.322f, -0.024f, -0.485f, -0.024f)
                lineTo(7.0f, 0.0f)
                curveTo(4.243f, 0.0f, 2.0f, 2.243f, 2.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(22.0f, 10.485f)
                curveToRelative(0.0f, -0.163f, -0.013f, -0.324f, -0.024f, -0.485f)
                close()
                moveTo(14.751f, 21.0f)
                horizontalLineToRelative(-6.25f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.121f, -2.5f, -2.5f)
                curveToRelative(0.0f, -1.025f, 0.621f, -1.908f, 1.506f, -2.294f)
                curveToRelative(-0.004f, -0.068f, -0.006f, -0.137f, -0.006f, -0.206f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                curveToRelative(1.678f, 0.0f, 3.126f, 1.025f, 3.713f, 2.533f)
                curveToRelative(1.573f, 0.226f, 2.787f, 1.582f, 2.787f, 3.217f)
                curveToRelative(0.0f, 1.792f, -1.458f, 3.25f, -3.25f, 3.25f)
                close()
            }
        }
        .build()
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
