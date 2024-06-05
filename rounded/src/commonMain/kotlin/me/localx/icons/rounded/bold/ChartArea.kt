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

public val Icons.Bold.ChartArea: ImageVector
    get() {
        if (_chartArea != null) {
            return _chartArea!!
        }
        _chartArea = Builder(name = "ChartArea", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 22.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 24.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0.0f, 1.5f)
                curveTo(0.033f, -0.472f, 2.967f, -0.471f, 3.0f, 1.5f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                lineTo(22.5f, 21.0f)
                curveToRelative(0.829f, 0.0f, 1.5f, 0.671f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 10.879f)
                verticalLineToRelative(4.627f)
                curveToRelative(-0.006f, 1.929f, -1.576f, 3.494f, -3.5f, 3.494f)
                lineTo(8.5f, 19.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0.0f, -0.935f, 0.364f, -1.813f, 1.025f, -2.475f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(1.316f, -1.318f, 3.613f, -1.324f, 4.938f, -0.012f)
                lineToRelative(3.576f, 3.442f)
                lineToRelative(0.549f, -0.489f)
                curveToRelative(1.236f, -1.291f, 3.636f, -1.279f, 4.887f, 0.059f)
                lineToRelative(1.392f, 1.275f)
                curveToRelative(0.72f, 0.661f, 1.133f, 1.601f, 1.133f, 2.579f)
                close()
                moveTo(21.0f, 10.879f)
                curveToRelative(0.0f, -0.14f, -0.059f, -0.273f, -0.161f, -0.368f)
                lineToRelative(-1.439f, -1.32f)
                curveToRelative(-0.313f, -0.258f, -0.461f, -0.261f, -0.753f, -0.045f)
                lineToRelative(-1.649f, 1.473f)
                curveToRelative(-0.584f, 0.521f, -1.473f, 0.505f, -2.038f, -0.039f)
                lineToRelative(-4.586f, -4.414f)
                lineToRelative(-0.021f, -0.02f)
                curveToRelative(-0.27f, -0.207f, -0.436f, -0.207f, -0.706f, 0.0f)
                lineToRelative(-1.5f, 1.5f)
                curveToRelative(-0.093f, 0.093f, -0.146f, 0.222f, -0.146f, 0.354f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(12.0f)
                curveToRelative(0.275f, 0.0f, 0.499f, -0.224f, 0.5f, -0.499f)
                verticalLineToRelative(-4.622f)
                close()
            }
        }
        .build()
        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
