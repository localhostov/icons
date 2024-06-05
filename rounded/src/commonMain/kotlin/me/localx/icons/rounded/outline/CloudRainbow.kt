package me.localx.icons.rounded.outline

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

public val Icons.Outline.CloudRainbow: ImageVector
    get() {
        if (_cloudRainbow != null) {
            return _cloudRainbow!!
        }
        _cloudRainbow = Builder(name = "CloudRainbow", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.236f, 6.4f)
                arcTo(17.974f, 17.974f, 0.0f, false, true, 23.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                arcTo(15.979f, 15.979f, 0.0f, false, false, 10.764f, 7.689f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 9.236f, 6.4f)
                close()
                moveTo(23.0f, 8.0f)
                arcToRelative(10.012f, 10.012f, 0.0f, false, false, -7.453f, 3.333f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.49f, 1.334f)
                arcTo(8.012f, 8.012f, 0.0f, false, true, 23.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 8.0f)
                close()
                moveTo(23.0f, 4.0f)
                arcTo(13.883f, 13.883f, 0.0f, false, false, 12.9f, 8.308f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.444f, 1.384f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 23.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 4.0f)
                close()
                moveTo(17.865f, 20.172f)
                arcToRelative(4.951f, 4.951f, 0.0f, false, true, -3.7f, 3.7f)
                arcTo(5.2f, 5.2f, 0.0f, false, true, 13.1f, 24.0f)
                curveToRelative(-0.865f, 0.017f, -3.08f, 0.026f, -5.2f, 0.026f)
                curveToRelative(-3.695f, -0.111f, -6.571f, 0.708f, -7.773f, -2.592f)
                arcToRelative(3.625f, 3.625f, 0.0f, false, true, 2.0f, -4.258f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 13.542f, 13.7f)
                curveToRelative(0.137f, 0.326f, 0.287f, 0.359f, 0.588f, 0.427f)
                lineToRelative(0.176f, 0.042f)
                arcTo(5.013f, 5.013f, 0.0f, false, true, 17.865f, 20.172f)
                close()
                moveTo(13.784f, 16.1f)
                arcTo(2.722f, 2.722f, 0.0f, false, true, 11.7f, 14.471f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.609f, 2.352f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, true, -1.181f, 2.19f)
                arcTo(1.566f, 1.566f, 0.0f, false, false, 3.532f, 22.0f)
                curveToRelative(1.5f, 0.036f, 7.9f, 0.029f, 9.526f, 0.0f)
                arcToRelative(3.126f, 3.126f, 0.0f, false, false, 0.658f, -0.082f)
                arcToRelative(2.974f, 2.974f, 0.0f, false, false, 2.2f, -2.192f)
                arcTo(3.023f, 3.023f, 0.0f, false, false, 13.784f, 16.1f)
                close()
                moveTo(23.0f, 12.0f)
                arcToRelative(5.957f, 5.957f, 0.0f, false, false, -4.8f, 2.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.6f, 1.2f)
                arcTo(3.966f, 3.966f, 0.0f, false, true, 23.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cloudRainbow!!
    }

private var _cloudRainbow: ImageVector? = null
