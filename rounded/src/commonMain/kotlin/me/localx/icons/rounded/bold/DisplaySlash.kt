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

public val Icons.Bold.DisplaySlash: ImageVector
    get() {
        if (_displaySlash != null) {
            return _displaySlash!!
        }
        _displaySlash = Builder(name = "DisplaySlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.494f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -3.033f, -2.467f, -5.5f, -5.505f, -5.5f)
                lineToRelative(-12.995f, 0.045f)
                curveToRelative(-0.676f, 0.0f, -1.347f, 0.126f, -1.974f, 0.366f)
                lineToRelative(-0.966f, -0.966f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineToRelative(21.0f, 21.0f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                lineToRelative(-3.639f, -3.639f)
                curveToRelative(2.345f, -0.629f, 4.078f, -2.767f, 4.078f, -5.307f)
                close()
                moveTo(21.0f, 12.494f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.54f, 2.5f)
                lineToRelative(-1.31f, 0.035f)
                lineTo(6.157f, 4.036f)
                lineToRelative(12.343f, -0.043f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(15.949f, 21.548f)
                curveToRelative(-0.005f, 0.826f, -0.676f, 1.491f, -1.5f, 1.491f)
                horizontalLineToRelative(-0.009f)
                lineToRelative(-2.352f, -0.014f)
                curveToRelative(-0.047f, 0.004f, -0.092f, 0.014f, -0.139f, 0.014f)
                horizontalLineToRelative(-0.016f)
                curveToRelative(-0.053f, 0.0f, -0.104f, -0.01f, -0.156f, -0.016f)
                lineToRelative(-3.786f, -0.023f)
                curveToRelative(-0.829f, -0.005f, -1.496f, -0.681f, -1.491f, -1.509f)
                curveToRelative(0.005f, -0.826f, 0.676f, -1.491f, 1.5f, -1.491f)
                horizontalLineToRelative(0.009f)
                lineToRelative(2.455f, 0.015f)
                lineToRelative(0.021f, -2.015f)
                horizontalLineToRelative(-4.985f)
                curveTo(2.467f, 18.0f, 0.0f, 15.55f, 0.0f, 12.538f)
                verticalLineToRelative(-4.039f)
                curveTo(0.0f, 7.671f, 0.671f, 7.0f, 1.5f, 7.0f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                verticalLineToRelative(4.039f)
                curveToRelative(0.0f, 1.38f, 1.098f, 2.461f, 2.5f, 2.461f)
                horizontalLineToRelative(3.308f)
                curveToRelative(0.796f, 0.0f, 1.559f, 0.316f, 2.121f, 0.879f)
                lineToRelative(1.659f, 1.659f)
                curveToRelative(0.57f, 0.57f, 0.887f, 1.346f, 0.879f, 2.152f)
                lineToRelative(-0.004f, 0.343f)
                lineToRelative(0.994f, 0.006f)
                curveToRelative(0.829f, 0.005f, 1.496f, 0.681f, 1.491f, 1.509f)
                close()
            }
        }
        .build()
        return _displaySlash!!
    }

private var _displaySlash: ImageVector? = null
