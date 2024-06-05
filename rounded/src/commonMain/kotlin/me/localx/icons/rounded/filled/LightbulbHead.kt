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

public val Icons.Filled.LightbulbHead: ImageVector
    get() {
        if (_lightbulbHead != null) {
            return _lightbulbHead!!
        }
        _lightbulbHead = Builder(name = "LightbulbHead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.954f, 9.984f)
                curveToRelative(0.25f, 2.768f, -0.537f, 5.5f, -2.215f, 7.692f)
                curveToRelative(-0.477f, 0.623f, -0.739f, 1.458f, -0.739f, 2.354f)
                verticalLineToRelative(0.971f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                horizontalLineToRelative(-0.494f)
                curveToRelative(-2.498f, 0.0f, -4.629f, -1.868f, -4.957f, -4.344f)
                lineToRelative(-0.219f, -1.656f)
                horizontalLineToRelative(-0.33f)
                curveToRelative(-1.299f, 0.0f, -2.0f, -1.03f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.419f, 2.932f, -7.014f, 4.199f, -8.582f)
                curveTo(6.53f, 1.308f, 10.173f, -0.278f, 14.014f, 0.069f)
                curveToRelative(-0.889f, 0.899f, -1.537f, 2.038f, -1.829f, 3.306f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.629f, 2.739f, 0.418f, 5.578f, 2.669f, 7.233f)
                lineToRelative(0.146f, 0.107f)
                verticalLineToRelative(0.782f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.505f)
                lineToRelative(-0.002f, -0.772f)
                lineToRelative(0.153f, -0.113f)
                curveToRelative(0.286f, -0.21f, 0.546f, -0.447f, 0.793f, -0.695f)
                curveToRelative(0.002f, 0.024f, 0.007f, 0.047f, 0.01f, 0.071f)
                close()
                moveTo(16.039f, 8.998f)
                horizontalLineToRelative(5.927f)
                curveToRelative(1.274f, -0.939f, 2.034f, -2.414f, 2.034f, -4.0f)
                curveToRelative(0.0f, -1.533f, -0.688f, -2.96f, -1.89f, -3.915f)
                curveToRelative(-1.201f, -0.955f, -2.763f, -1.299f, -4.288f, -0.949f)
                curveToRelative(-1.821f, 0.42f, -3.269f, 1.869f, -3.688f, 3.69f)
                curveToRelative(-0.457f, 1.989f, 0.293f, 3.989f, 1.904f, 5.174f)
                close()
                moveTo(17.0f, 10.998f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.829f, 0.0f, 1.501f, -0.672f, 1.5f, -1.501f)
                verticalLineToRelative(-0.499f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _lightbulbHead!!
    }

private var _lightbulbHead: ImageVector? = null
