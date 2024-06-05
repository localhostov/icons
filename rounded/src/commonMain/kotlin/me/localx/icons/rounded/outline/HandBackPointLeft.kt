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

public val Icons.Outline.HandBackPointLeft: ImageVector
    get() {
        if (_handBackPointLeft != null) {
            return _handBackPointLeft!!
        }
        _handBackPointLeft = Builder(name = "HandBackPointLeft", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                horizontalLineToRelative(-4.721f)
                curveToRelative(-2.375f, 0.0f, -4.437f, -1.69f, -4.903f, -4.019f)
                lineToRelative(-1.196f, -5.981f)
                horizontalLineTo(3.107f)
                curveTo(1.591f, 12.0f, 0.273f, 10.924f, 0.041f, 9.497f)
                curveToRelative(-0.143f, -0.879f, 0.103f, -1.768f, 0.674f, -2.439f)
                curveToRelative(0.571f, -0.672f, 1.404f, -1.057f, 2.286f, -1.057f)
                lineToRelative(7.274f, 0.02f)
                lineToRelative(3.919f, -3.945f)
                curveToRelative(0.687f, -0.691f, 1.602f, -1.073f, 2.576f, -1.075f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.972f, 0.0f, 1.886f, 0.378f, 2.573f, 1.066f)
                lineToRelative(2.308f, 2.308f)
                curveToRelative(1.511f, 1.51f, 2.343f, 3.52f, 2.343f, 5.657f)
                verticalLineToRelative(6.969f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(2.997f, 8.0f)
                curveToRelative(-0.291f, 0.0f, -0.569f, 0.128f, -0.759f, 0.353f)
                curveToRelative(-0.193f, 0.228f, -0.272f, 0.52f, -0.224f, 0.823f)
                curveToRelative(0.076f, 0.462f, 0.556f, 0.825f, 1.093f, 0.825f)
                horizontalLineToRelative(5.893f)
                curveToRelative(0.477f, 0.0f, 0.887f, 0.336f, 0.98f, 0.804f)
                lineToRelative(1.357f, 6.785f)
                curveToRelative(0.28f, 1.397f, 1.517f, 2.412f, 2.942f, 2.412f)
                horizontalLineToRelative(4.721f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-6.969f)
                curveToRelative(0.0f, -1.603f, -0.624f, -3.11f, -1.757f, -4.243f)
                lineToRelative(-2.308f, -2.308f)
                curveToRelative(-0.31f, -0.31f, -0.728f, -0.52f, -1.162f, -0.48f)
                curveToRelative(-0.439f, 0.0f, -0.851f, 0.172f, -1.161f, 0.484f)
                lineToRelative(-2.527f, 2.544f)
                lineToRelative(3.917f, 0.011f)
                curveToRelative(0.552f, 0.001f, 0.999f, 0.451f, 0.997f, 1.003f)
                curveToRelative(-0.001f, 0.551f, -0.449f, 0.997f, -1.0f, 0.997f)
                horizontalLineToRelative(-0.003f)
                lineToRelative(-14.0f, -0.039f)
                close()
            }
        }
        .build()
        return _handBackPointLeft!!
    }

private var _handBackPointLeft: ImageVector? = null
