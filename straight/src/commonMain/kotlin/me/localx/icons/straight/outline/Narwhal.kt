package me.localx.icons.straight.outline

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

public val Icons.Outline.Narwhal: ImageVector
    get() {
        if (_narwhal != null) {
            return _narwhal!!
        }
        _narwhal = Builder(name = "Narwhal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 16.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 16.001f)
                curveToRelative(0.0f, 4.411f, -3.588f, 7.999f, -7.999f, 7.999f)
                lineTo(6.0f, 24.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                verticalLineToRelative(-2.727f)
                curveToRelative(0.0f, -3.367f, 0.987f, -6.628f, 2.855f, -9.431f)
                lineToRelative(0.502f, -0.754f)
                curveTo(1.384f, 4.246f, 0.0f, 2.278f, 0.0f, 0.0f)
                curveToRelative(4.122f, 0.0f, 5.5f, 2.776f, 5.5f, 2.776f)
                curveToRelative(0.0f, 0.0f, 1.327f, -2.776f, 5.5f, -2.776f)
                curveToRelative(0.0f, 2.565f, -1.755f, 4.738f, -4.13f, 5.352f)
                lineToRelative(-0.466f, 2.765f)
                curveToRelative(-0.183f, 1.081f, -0.304f, 2.179f, -0.362f, 3.279f)
                curveToRelative(2.332f, -1.741f, 5.363f, -3.396f, 8.459f, -3.396f)
                curveToRelative(0.627f, 0.0f, 1.864f, 0.0f, 1.864f, 0.0f)
                verticalLineToRelative(0.009f)
                curveToRelative(0.634f, 0.028f, 1.249f, 0.132f, 1.837f, 0.3f)
                lineTo(23.096f, 0.0f)
                lineToRelative(0.904f, 0.53f)
                lineToRelative(-2.615f, 9.562f)
                curveToRelative(1.606f, 1.464f, 2.615f, 3.572f, 2.615f, 5.91f)
                close()
                moveTo(22.0f, 16.001f)
                curveToRelative(0.0f, -3.305f, -2.688f, -5.996f, -5.993f, -5.999f)
                verticalLineToRelative(-0.002f)
                horizontalLineToRelative(-1.507f)
                curveToRelative(-4.307f, 0.0f, -8.774f, 4.093f, -10.5f, 5.857f)
                verticalLineToRelative(-2.916f)
                curveToRelative(0.0f, -1.725f, 0.146f, -3.459f, 0.432f, -5.156f)
                lineToRelative(0.159f, -0.941f)
                curveToRelative(-1.648f, 2.473f, -2.591f, 5.458f, -2.591f, 8.429f)
                verticalLineToRelative(2.727f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(10.001f)
                curveToRelative(3.308f, 0.0f, 5.999f, -2.691f, 5.999f, -5.999f)
                close()
            }
        }
        .build()
        return _narwhal!!
    }

private var _narwhal: ImageVector? = null
