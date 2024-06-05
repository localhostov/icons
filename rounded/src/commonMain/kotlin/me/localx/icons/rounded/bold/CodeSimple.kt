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

public val Icons.Bold.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) {
            return _codeSimple!!
        }
        _codeSimple = Builder(name = "CodeSimple", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveToRelative(-0.373f, 0.0f, -0.746f, -0.138f, -1.037f, -0.416f)
                lineTo(1.342f, 15.256f)
                curveToRelative(-1.779f, -1.778f, -1.779f, -4.633f, -0.024f, -6.388f)
                lineTo(7.955f, 2.424f)
                curveToRelative(0.594f, -0.576f, 1.544f, -0.563f, 2.121f, 0.031f)
                curveToRelative(0.577f, 0.594f, 0.563f, 1.544f, -0.031f, 2.121f)
                lineTo(3.424f, 11.005f)
                curveToRelative(-0.268f, 0.268f, -0.424f, 0.645f, -0.424f, 1.045f)
                reflectiveCurveToRelative(0.156f, 0.777f, 0.439f, 1.061f)
                lineToRelative(6.597f, 6.305f)
                curveToRelative(0.599f, 0.572f, 0.62f, 1.521f, 0.048f, 2.12f)
                curveToRelative(-0.295f, 0.309f, -0.689f, 0.464f, -1.084f, 0.464f)
                close()
                moveTo(16.046f, 21.574f)
                lineToRelative(6.618f, -6.445f)
                curveToRelative(1.754f, -1.755f, 1.754f, -4.609f, -0.023f, -6.387f)
                lineToRelative(-6.604f, -6.325f)
                curveToRelative(-0.599f, -0.575f, -1.548f, -0.554f, -2.121f, 0.045f)
                curveToRelative(-0.573f, 0.598f, -0.553f, 1.548f, 0.045f, 2.121f)
                lineToRelative(6.58f, 6.303f)
                curveToRelative(0.585f, 0.585f, 0.585f, 1.537f, 0.015f, 2.108f)
                lineToRelative(-6.604f, 6.432f)
                curveToRelative(-0.594f, 0.578f, -0.606f, 1.527f, -0.028f, 2.121f)
                curveToRelative(0.294f, 0.302f, 0.684f, 0.453f, 1.075f, 0.453f)
                curveToRelative(0.377f, 0.0f, 0.755f, -0.142f, 1.046f, -0.426f)
                close()
            }
        }
        .build()
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
