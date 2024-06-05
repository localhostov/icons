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

public val Icons.Bold.FilterSlash: ImageVector
    get() {
        if (_filterSlash != null) {
            return _filterSlash!!
        }
        _filterSlash = Builder(name = "FilterSlash", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 21.439f)
                lineToRelative(-6.135f, -6.135f)
                lineToRelative(2.861f, -2.933f)
                curveToRelative(1.105f, -1.147f, 1.713f, -2.656f, 1.713f, -4.249f)
                curveToRelative(0.0f, -3.376f, -2.747f, -6.123f, -6.123f, -6.123f)
                horizontalLineToRelative(-7.754f)
                curveToRelative(-1.115f, 0.0f, -2.19f, 0.309f, -3.131f, 0.871f)
                lineTo(2.561f, 0.439f)
                curveTo(1.975f, -0.146f, 1.025f, -0.146f, 0.439f, 0.439f)
                curveTo(-0.146f, 1.025f, -0.146f, 1.975f, 0.439f, 2.561f)
                lineTo(21.439f, 23.561f)
                curveToRelative(0.293f, 0.293f, 0.677f, 0.439f, 1.061f, 0.439f)
                reflectiveCurveToRelative(0.768f, -0.146f, 1.061f, -0.439f)
                curveToRelative(0.586f, -0.585f, 0.586f, -1.536f, 0.0f, -2.121f)
                close()
                moveTo(8.123f, 5.0f)
                horizontalLineToRelative(7.754f)
                curveToRelative(1.722f, 0.0f, 3.123f, 1.401f, 3.123f, 3.123f)
                curveToRelative(0.0f, 0.812f, -0.311f, 1.582f, -0.868f, 2.161f)
                lineToRelative(-2.829f, 2.899f)
                lineTo(7.257f, 5.136f)
                curveToRelative(0.28f, -0.081f, 0.569f, -0.136f, 0.866f, -0.136f)
                close()
                moveTo(16.0f, 21.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.545f, -0.296f, 1.048f, -0.773f, 1.312f)
                curveToRelative(-0.227f, 0.125f, -0.477f, 0.188f, -0.727f, 0.188f)
                curveToRelative(-0.276f, 0.0f, -0.552f, -0.076f, -0.795f, -0.228f)
                lineToRelative(-4.0f, -2.5f)
                curveToRelative(-0.438f, -0.274f, -0.705f, -0.755f, -0.705f, -1.272f)
                verticalLineToRelative(-2.194f)
                lineTo(3.529f, 12.397f)
                curveToRelative(-0.683f, -0.709f, -1.179f, -1.547f, -1.461f, -2.45f)
                curveToRelative(-0.247f, -0.791f, 0.194f, -1.632f, 0.984f, -1.879f)
                curveToRelative(0.79f, -0.25f, 1.632f, 0.194f, 1.879f, 0.984f)
                curveToRelative(0.144f, 0.461f, 0.397f, 0.889f, 0.733f, 1.238f)
                lineToRelative(5.89f, 5.822f)
                curveToRelative(0.285f, 0.282f, 0.445f, 0.666f, 0.445f, 1.067f)
                verticalLineToRelative(1.989f)
                lineToRelative(1.7f, 1.062f)
                curveToRelative(0.232f, -0.146f, 0.506f, -0.231f, 0.8f, -0.231f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _filterSlash!!
    }

private var _filterSlash: ImageVector? = null
