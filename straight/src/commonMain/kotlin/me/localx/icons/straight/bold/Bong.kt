package me.localx.icons.straight.bold

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

public val Icons.Bold.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.211f, 9.111f)
                lineToRelative(0.877f, 0.718f)
                lineToRelative(1.9f, -2.321f)
                lineToRelative(-4.076f, -3.336f)
                lineToRelative(-1.9f, 2.321f)
                lineToRelative(0.878f, 0.718f)
                lineToRelative(-1.031f, 1.26f)
                curveToRelative(-0.584f, -0.392f, -1.205f, -0.733f, -1.858f, -1.013f)
                lineTo(16.001f, 3.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.001f, 0.0f)
                lineTo(7.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.458f)
                curveToRelative(-4.114f, 1.767f, -7.0f, 5.931f, -7.0f, 10.292f)
                curveToRelative(0.0f, 1.128f, 0.173f, 2.243f, 0.514f, 3.313f)
                curveToRelative(0.56f, 1.756f, 2.212f, 2.937f, 4.114f, 2.937f)
                horizontalLineToRelative(12.744f)
                curveToRelative(1.902f, 0.0f, 3.555f, -1.18f, 4.114f, -2.936f)
                curveToRelative(0.341f, -1.071f, 0.514f, -2.186f, 0.514f, -3.314f)
                curveToRelative(0.0f, -2.679f, -1.089f, -5.283f, -2.883f, -7.303f)
                lineToRelative(1.094f, -1.336f)
                close()
                moveTo(19.627f, 20.154f)
                curveToRelative(-0.158f, 0.498f, -0.674f, 0.846f, -1.255f, 0.846f)
                lineTo(5.628f, 21.0f)
                curveToRelative(-0.581f, 0.0f, -1.097f, -0.348f, -1.255f, -0.846f)
                curveToRelative(-0.248f, -0.776f, -0.373f, -1.585f, -0.373f, -2.404f)
                curveToRelative(0.0f, -0.588f, 0.077f, -1.175f, 0.222f, -1.75f)
                horizontalLineToRelative(13.46f)
                curveToRelative(-0.4f, -1.146f, -1.165f, -2.202f, -2.144f, -3.0f)
                lineTo(5.679f, 13.0f)
                curveToRelative(1.065f, -1.412f, 2.562f, -2.532f, 4.27f, -3.069f)
                lineToRelative(1.051f, -0.33f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.601f)
                lineToRelative(1.051f, 0.33f)
                curveToRelative(3.392f, 1.066f, 5.949f, 4.427f, 5.949f, 7.819f)
                curveToRelative(0.0f, 0.819f, -0.125f, 1.627f, -0.373f, 2.404f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
