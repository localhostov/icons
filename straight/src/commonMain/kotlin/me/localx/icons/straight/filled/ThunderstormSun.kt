package me.localx.icons.straight.filled

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

public val Icons.Filled.ThunderstormSun: ImageVector
    get() {
        if (_thunderstormSun != null) {
            return _thunderstormSun!!
        }
        _thunderstormSun = Builder(name = "ThunderstormSun", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.0f)
                arcToRelative(4.788f, 4.788f, 0.0f, false, true, -4.774f, 4.992f)
                lineToRelative(-2.733f, 0.0f)
                lineToRelative(1.279f, -2.568f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 16.4f, 19.0f)
                horizontalLineTo(14.274f)
                lineToRelative(1.779f, -3.295f)
                lineToRelative(-1.76f, -0.949f)
                lineToRelative(-2.147f, 3.976f)
                lineToRelative(-0.077f, 0.186f)
                arcTo(1.614f, 1.614f, 0.0f, false, false, 13.615f, 21.0f)
                horizontalLineTo(15.75f)
                lineToRelative(-1.492f, 3.0f)
                lineTo(9.5f, 24.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.45f, -8.74f)
                curveToRelative(0.785f, -6.279f, 9.605f, -7.146f, 11.625f, -1.2f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 24.0f, 19.0f)
                close()
                moveTo(6.318f, 13.789f)
                arcToRelative(7.961f, 7.961f, 0.0f, false, true, 8.1f, -5.759f)
                lineToRelative(0.0f, -0.03f)
                arcToRelative(5.469f, 5.469f, 0.0f, false, false, -0.235f, -0.859f)
                lineToRelative(3.106f, -1.808f)
                lineTo(16.283f, 3.6f)
                lineToRelative(-3.109f, 1.81f)
                arcToRelative(5.416f, 5.416f, 0.0f, false, false, -0.592f, -0.591f)
                lineToRelative(1.8f, -3.1f)
                lineTo(12.657f, 0.716f)
                lineTo(10.85f, 3.822f)
                arcToRelative(5.449f, 5.449f, 0.0f, false, false, -0.836f, -0.226f)
                verticalLineTo(0.0f)
                horizontalLineTo(7.986f)
                verticalLineTo(3.6f)
                arcToRelative(5.449f, 5.449f, 0.0f, false, false, -0.836f, 0.226f)
                lineTo(5.343f, 0.716f)
                lineTo(3.615f, 1.722f)
                lineToRelative(1.8f, 3.1f)
                arcToRelative(5.416f, 5.416f, 0.0f, false, false, -0.592f, 0.591f)
                lineTo(1.717f, 3.6f)
                lineTo(0.711f, 5.333f)
                lineTo(3.817f, 7.141f)
                arcTo(5.469f, 5.469f, 0.0f, false, false, 3.582f, 8.0f)
                horizontalLineToRelative(-3.6f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.6f)
                arcToRelative(5.469f, 5.469f, 0.0f, false, false, 0.235f, 0.859f)
                lineTo(0.711f, 12.667f)
                lineTo(1.717f, 14.4f)
                lineToRelative(3.109f, -1.81f)
                arcTo(5.343f, 5.343f, 0.0f, false, false, 6.318f, 13.789f)
                close()
            }
        }
        .build()
        return _thunderstormSun!!
    }

private var _thunderstormSun: ImageVector? = null
