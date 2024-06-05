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

public val Icons.Outline.HandBackPointRight: ImageVector
    get() {
        if (_handBackPointRight != null) {
            return _handBackPointRight!!
        }
        _handBackPointRight = Builder(name = "HandBackPointRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.721f, 22.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                verticalLineToRelative(-6.969f)
                curveToRelative(0.0f, -2.137f, 0.832f, -4.146f, 2.343f, -5.657f)
                lineToRelative(2.308f, -2.308f)
                curveToRelative(0.688f, -0.688f, 1.601f, -1.066f, 2.573f, -1.066f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.975f, 0.001f, 1.889f, 0.383f, 2.576f, 1.075f)
                lineToRelative(3.919f, 3.945f)
                lineToRelative(7.271f, -0.02f)
                curveToRelative(0.884f, 0.0f, 1.717f, 0.385f, 2.289f, 1.057f)
                curveToRelative(0.571f, 0.671f, 0.817f, 1.561f, 0.674f, 2.439f)
                curveToRelative(-0.232f, 1.427f, -1.551f, 2.503f, -3.066f, 2.503f)
                horizontalLineToRelative(-5.073f)
                lineToRelative(-1.196f, 5.981f)
                curveToRelative(-0.466f, 2.329f, -2.528f, 4.019f, -4.903f, 4.019f)
                close()
                moveTo(7.225f, 3.0f)
                curveToRelative(-0.438f, 0.0f, -0.85f, 0.17f, -1.159f, 0.48f)
                lineToRelative(-2.308f, 2.308f)
                curveToRelative(-1.133f, 1.133f, -1.757f, 2.64f, -1.757f, 4.243f)
                verticalLineToRelative(6.969f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.721f)
                curveToRelative(1.425f, 0.0f, 2.662f, -1.014f, 2.942f, -2.412f)
                lineToRelative(1.357f, -6.785f)
                curveToRelative(0.093f, -0.467f, 0.504f, -0.804f, 0.98f, -0.804f)
                horizontalLineToRelative(5.893f)
                curveToRelative(0.537f, 0.0f, 1.017f, -0.362f, 1.093f, -0.825f)
                curveToRelative(0.049f, -0.303f, -0.03f, -0.595f, -0.224f, -0.823f)
                curveToRelative(-0.19f, -0.224f, -0.468f, -0.353f, -0.762f, -0.353f)
                lineToRelative(-13.997f, 0.039f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.551f, 0.0f, -0.999f, -0.446f, -1.0f, -0.997f)
                curveToRelative(-0.001f, -0.552f, 0.445f, -1.001f, 0.997f, -1.003f)
                lineToRelative(3.917f, -0.011f)
                lineToRelative(-2.527f, -2.544f)
                curveToRelative(-0.31f, -0.312f, -0.722f, -0.483f, -1.161f, -0.484f)
                horizontalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _handBackPointRight!!
    }

private var _handBackPointRight: ImageVector? = null
