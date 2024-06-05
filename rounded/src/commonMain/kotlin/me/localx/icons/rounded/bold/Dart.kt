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

public val Icons.Bold.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = Builder(name = "Dart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.227f, 0.0f)
                horizontalLineToRelative(-1.917f)
                arcToRelative(4.739f, 4.739f, 0.0f, false, false, -3.374f, 1.4f)
                lineToRelative(-3.536f, 3.535f)
                arcToRelative(4.809f, 4.809f, 0.0f, false, false, -1.4f, 3.376f)
                verticalLineToRelative(3.671f)
                curveToRelative(-2.635f, 1.953f, -5.642f, 4.206f, -6.077f, 4.641f)
                arcToRelative(3.063f, 3.063f, 0.0f, false, false, -0.781f, 3.114f)
                lineToRelative(-1.7f, 1.7f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.122f, 2.122f)
                lineToRelative(1.7f, -1.7f)
                arcToRelative(3.063f, 3.063f, 0.0f, false, false, 3.113f, -0.78f)
                curveToRelative(0.435f, -0.435f, 2.689f, -3.442f, 4.642f, -6.078f)
                horizontalLineToRelative(3.671f)
                arcToRelative(4.739f, 4.739f, 0.0f, false, false, 3.374f, -1.4f)
                lineToRelative(3.536f, -3.536f)
                arcToRelative(4.809f, 4.809f, 0.0f, false, false, 1.4f, -3.376f)
                verticalLineToRelative(-1.917f)
                arcToRelative(4.778f, 4.778f, 0.0f, false, false, -4.773f, -4.772f)
                close()
                moveTo(21.0f, 6.689f)
                arcToRelative(1.785f, 1.785f, 0.0f, false, true, -0.519f, 1.254f)
                lineToRelative(-3.538f, 3.537f)
                arcToRelative(1.761f, 1.761f, 0.0f, false, true, -1.253f, 0.52f)
                horizontalLineToRelative(-1.458f)
                lineToRelative(0.309f, -0.42f)
                lineToRelative(4.02f, -4.019f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.122f, -2.122f)
                lineToRelative(-4.021f, 4.022f)
                lineToRelative(-0.418f, 0.307f)
                verticalLineToRelative(-1.457f)
                arcToRelative(1.785f, 1.785f, 0.0f, false, true, 0.519f, -1.254f)
                lineToRelative(3.538f, -3.537f)
                arcToRelative(1.761f, 1.761f, 0.0f, false, true, 1.253f, -0.52f)
                horizontalLineToRelative(1.917f)
                arcToRelative(1.774f, 1.774f, 0.0f, false, true, 1.773f, 1.772f)
                close()
            }
        }
        .build()
        return _dart!!
    }

private var _dart: ImageVector? = null
