package me.localx.icons.straight.outline

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

public val Icons.Outline.Skiing: ImageVector
    get() {
        if (_skiing != null) {
            return _skiing!!
        }
        _skiing = Builder(name = "Skiing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.982f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.982f, 2.5f)
                close()
                moveTo(22.161f, 20.864f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.672f, 0.937f)
                lineToRelative(-7.761f, -3.682f)
                lineToRelative(2.818f, -4.583f)
                lineTo(11.2f, 11.07f)
                curveToRelative(-0.458f, -0.481f, 0.0f, -1.043f, 0.117f, -1.174f)
                lineToRelative(0.35f, -0.341f)
                lineToRelative(2.311f, 1.1f)
                lineTo(13.978f, 8.441f)
                lineTo(13.2f, 8.067f)
                lineToRelative(0.769f, -0.75f)
                arcTo(0.973f, 0.973f, 0.0f, false, true, 14.729f, 7.0f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, true, 0.648f, 0.295f)
                lineToRelative(0.567f, 0.431f)
                verticalLineToRelative(3.887f)
                lineToRelative(4.493f, 2.064f)
                lineToRelative(0.834f, -1.818f)
                lineToRelative(-3.327f, -1.528f)
                verticalLineToRelative(-3.6f)
                lineToRelative(-1.3f, -0.984f)
                arcTo(2.911f, 2.911f, 0.0f, false, false, 14.794f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.256f, 0.915f)
                lineTo(11.274f, 7.15f)
                lineTo(5.938f, 4.607f)
                lineToRelative(0.758f, -1.6f)
                lineTo(4.889f, 2.152f)
                lineTo(4.132f, 3.747f)
                lineToRelative(-1.406f, -0.67f)
                lineTo(1.869f, 4.884f)
                lineToRelative(1.406f, 0.67f)
                lineToRelative(-0.758f, 1.6f)
                lineToRelative(1.807f, 0.857f)
                lineToRelative(0.757f, -1.6f)
                lineTo(9.772f, 8.65f)
                arcToRelative(2.762f, 2.762f, 0.0f, false, false, 0.093f, 3.908f)
                lineToRelative(2.015f, 1.5f)
                lineToRelative(-1.97f, 3.2f)
                lineToRelative(-9.053f, -4.3f)
                lineTo(0.0f, 14.769f)
                lineToRelative(18.628f, 8.837f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.337f, -1.876f)
                close()
            }
        }
        .build()
        return _skiing!!
    }

private var _skiing: ImageVector? = null
