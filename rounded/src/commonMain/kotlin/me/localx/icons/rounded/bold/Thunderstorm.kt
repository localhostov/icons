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

public val Icons.Bold.Thunderstorm: ImageVector
    get() {
        if (_thunderstorm != null) {
            return _thunderstorm!!
        }
        _thunderstorm = Builder(name = "Thunderstorm", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.988f)
                lineTo(7.923f, 19.988f)
                arcTo(0.923f, 0.923f, 0.0f, false, true, 7.04f, 18.8f)
                lineToRelative(2.12f, -6.137f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.945f, -0.673f)
                lineTo(12.0f, 11.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.934f, 1.358f)
                lineTo(12.0f, 15.988f)
                horizontalLineToRelative(3.093f)
                arcToRelative(0.905f, 0.905f, 0.0f, false, true, 0.755f, 1.405f)
                lineToRelative(-4.255f, 6.225f)
                arcToRelative(0.872f, 0.872f, 0.0f, false, true, -1.556f, -0.734f)
                close()
                moveTo(20.26f, 19.255f)
                curveToRelative(5.874f, -3.732f, 4.476f, -12.977f, -2.451f, -14.333f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, true, -0.322f, -0.242f)
                arcTo(8.246f, 8.246f, 0.0f, false, false, 8.558f, 0.14f)
                arcTo(8.131f, 8.131f, 0.0f, false, false, 2.024f, 6.794f)
                arcToRelative(8.325f, 8.325f, 0.0f, false, false, 0.035f, 2.95f)
                arcTo(0.427f, 0.427f, 0.0f, false, true, 1.9f, 10.1f)
                arcToRelative(5.825f, 5.825f, 0.0f, false, false, 0.77f, 9.149f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.668f, -2.494f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.419f, -4.436f)
                arcTo(3.412f, 3.412f, 0.0f, false, false, 5.0f, 9.174f)
                arcToRelative(5.347f, 5.347f, 0.0f, false, true, -0.021f, -1.889f)
                arcToRelative(5.184f, 5.184f, 0.0f, false, true, 9.792f, -1.322f)
                arcToRelative(3.417f, 3.417f, 0.0f, false, false, 2.448f, 1.9f)
                curveToRelative(4.329f, 0.872f, 5.029f, 6.569f, 1.394f, 8.881f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.643f, 2.51f)
                close()
            }
        }
        .build()
        return _thunderstorm!!
    }

private var _thunderstorm: ImageVector? = null
