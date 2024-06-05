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

public val Icons.Filled.Democrat: ImageVector
    get() {
        if (_democrat != null) {
            return _democrat!!
        }
        _democrat = Builder(name = "Democrat", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 16.0f)
                lineTo(22.003f, 16.0f)
                lineToRelative(-0.002f, 3.005f)
                curveToRelative(-0.105f, 3.941f, -5.87f, 3.953f, -5.988f, 0.013f)
                lineToRelative(-4.025f, -0.018f)
                curveToRelative(0.009f, 0.796f, -0.302f, 1.551f, -0.868f, 2.119f)
                curveToRelative(-1.776f, 1.892f, -5.198f, 0.487f, -5.119f, -2.116f)
                verticalLineToRelative(-3.003f)
                close()
                moveTo(23.752f, 10.659f)
                curveToRelative(-0.365f, 0.417f, -0.997f, 0.456f, -1.411f, 0.093f)
                lineToRelative(-0.335f, -0.294f)
                lineToRelative(-0.002f, 3.542f)
                lineTo(5.735f, 14.0f)
                lineToRelative(-0.92f, -3.876f)
                curveToRelative(-1.772f, 0.81f, -2.783f, 1.332f, -4.132f, 0.173f)
                curveToRelative(-0.91f, -0.91f, -0.91f, -2.387f, 0.0f, -3.297f)
                lineTo(3.481f, 3.265f)
                curveToRelative(0.156f, -0.188f, 0.332f, -0.353f, 0.519f, -0.502f)
                verticalLineToRelative(-0.763f)
                curveToRelative(0.006f, -1.308f, 1.994f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(0.019f)
                curveToRelative(0.334f, -0.05f, 0.674f, 0.018f, 1.0f, 0.094f)
                verticalLineToRelative(-0.113f)
                curveToRelative(0.006f, -1.308f, 1.994f, -1.307f, 2.0f, 0.0f)
                verticalLineToRelative(1.25f)
                lineToRelative(2.333f, 1.75f)
                horizontalLineToRelative(5.672f)
                curveToRelative(1.472f, 0.0f, 2.784f, 0.652f, 3.7f, 1.669f)
                curveToRelative(0.01f, 0.008f, 0.022f, 0.01f, 0.031f, 0.018f)
                lineToRelative(2.922f, 2.561f)
                curveToRelative(0.416f, 0.364f, 0.457f, 0.996f, 0.093f, 1.411f)
                close()
                moveTo(8.956f, 3.217f)
                lineToRelative(0.005f, 0.003f)
                curveToRelative(-0.002f, -0.008f, -0.003f, -0.01f, -0.005f, -0.003f)
                close()
                moveTo(10.0f, 10.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                close()
                moveTo(18.0f, 10.0f)
                curveToRelative(-0.006f, -1.308f, -1.994f, -1.308f, -2.0f, 0.0f)
                curveToRelative(0.006f, 1.308f, 1.994f, 1.308f, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _democrat!!
    }

private var _democrat: ImageVector? = null
