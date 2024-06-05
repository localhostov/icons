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

public val Icons.Bold.Telescope: ImageVector
    get() {
        if (_telescope != null) {
            return _telescope!!
        }
        _telescope = Builder(name = "Telescope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.885f, 9.925f)
                lineTo(20.148f, 0.925f)
                curveToRelative(-0.318f, -0.766f, -1.196f, -1.128f, -1.96f, -0.811f)
                curveToRelative(-0.765f, 0.318f, -1.128f, 1.196f, -0.81f, 1.961f)
                lineToRelative(0.289f, 0.695f)
                lineTo(5.528f, 7.837f)
                curveToRelative(-1.546f, 0.66f, -2.464f, 2.191f, -2.427f, 3.781f)
                lineToRelative(-2.208f, 1.021f)
                curveToRelative(-0.752f, 0.348f, -1.08f, 1.239f, -0.732f, 1.991f)
                curveToRelative(0.253f, 0.548f, 0.795f, 0.87f, 1.362f, 0.87f)
                curveToRelative(0.21f, 0.0f, 0.425f, -0.044f, 0.628f, -0.139f)
                lineToRelative(2.143f, -0.991f)
                curveToRelative(0.37f, 0.363f, 0.811f, 0.653f, 1.306f, 0.853f)
                curveToRelative(0.486f, 0.196f, 0.995f, 0.295f, 1.502f, 0.295f)
                curveToRelative(0.53f, 0.0f, 1.058f, -0.107f, 1.555f, -0.319f)
                lineToRelative(2.069f, -0.863f)
                lineToRelative(-3.581f, 7.52f)
                curveToRelative(-0.356f, 0.748f, -0.039f, 1.643f, 0.709f, 1.999f)
                curveToRelative(0.749f, 0.354f, 1.643f, 0.039f, 2.0f, -0.71f)
                lineToRelative(3.646f, -7.655f)
                lineToRelative(3.646f, 7.655f)
                curveToRelative(0.257f, 0.54f, 0.795f, 0.855f, 1.355f, 0.855f)
                curveToRelative(0.216f, 0.0f, 0.436f, -0.047f, 0.644f, -0.146f)
                curveToRelative(0.748f, -0.356f, 1.065f, -1.251f, 0.709f, -1.999f)
                lineToRelative(-4.5f, -9.451f)
                lineToRelative(5.38f, -2.245f)
                lineToRelative(0.38f, 0.916f)
                curveToRelative(0.24f, 0.577f, 0.798f, 0.925f, 1.386f, 0.925f)
                curveToRelative(0.192f, 0.0f, 0.387f, -0.036f, 0.575f, -0.114f)
                curveToRelative(0.765f, -0.318f, 1.128f, -1.196f, 0.81f, -1.961f)
                close()
                moveTo(7.49f, 12.435f)
                curveToRelative(-0.246f, 0.106f, -0.518f, 0.108f, -0.767f, 0.008f)
                curveToRelative(-0.249f, -0.101f, -0.442f, -0.291f, -0.546f, -0.538f)
                curveToRelative(-0.213f, -0.506f, 0.024f, -1.093f, 0.518f, -1.304f)
                lineToRelative(12.122f, -5.059f)
                lineToRelative(0.767f, 1.847f)
                lineToRelative(-12.094f, 5.046f)
                close()
            }
        }
        .build()
        return _telescope!!
    }

private var _telescope: ImageVector? = null
