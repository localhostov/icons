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

public val Icons.Filled.Snowflakes: ImageVector
    get() {
        if (_snowflakes != null) {
            return _snowflakes!!
        }
        _snowflakes = Builder(name = "Snowflakes", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.288f, 13.126f)
                lineTo(17.414f, 15.0f)
                lineToRelative(1.874f, 1.874f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(15.586f, 16.0f)
                horizontalLineToRelative(-2.77f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, -0.5f, 0.887f)
                lineToRelative(1.438f, 2.371f)
                lineToRelative(3.142f, 0.771f)
                lineToRelative(-0.476f, 1.942f)
                lineToRelative(-2.574f, -0.631f)
                lineToRelative(-0.631f, 2.574f)
                lineToRelative(-1.942f, -0.477f)
                lineToRelative(0.771f, -3.142f)
                lineToRelative(-1.43f, -2.358f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, -1.222f, 0.0f)
                lineTo(7.959f, 20.3f)
                lineToRelative(0.771f, 3.142f)
                lineToRelative(-1.942f, 0.477f)
                lineTo(6.157f, 21.34f)
                lineToRelative(-2.574f, 0.631f)
                lineToRelative(-0.476f, -1.942f)
                lineToRelative(3.142f, -0.771f)
                lineToRelative(1.438f, -2.371f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, -0.5f, -0.887f)
                horizontalLineTo(4.414f)
                lineTo(2.126f, 18.288f)
                lineTo(0.712f, 16.874f)
                lineTo(2.586f, 15.0f)
                lineTo(0.712f, 13.126f)
                lineToRelative(1.414f, -1.414f)
                lineTo(4.414f, 14.0f)
                horizontalLineToRelative(2.77f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, 0.5f, -0.887f)
                lineTo(6.249f, 10.742f)
                lineTo(3.107f, 9.971f)
                lineToRelative(0.476f, -1.942f)
                lineToRelative(2.574f, 0.631f)
                lineToRelative(0.631f, -2.574f)
                lineToRelative(1.942f, 0.477f)
                lineTo(7.959f, 9.705f)
                lineToRelative(1.43f, 2.358f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 1.222f, 0.0f)
                lineToRelative(1.43f, -2.358f)
                lineTo(11.27f, 6.563f)
                lineToRelative(1.942f, -0.477f)
                lineToRelative(0.631f, 2.574f)
                lineToRelative(2.574f, -0.631f)
                lineToRelative(0.476f, 1.942f)
                lineToRelative(-3.142f, 0.771f)
                lineToRelative(-1.438f, 2.371f)
                arcToRelative(2.979f, 2.979f, 0.0f, false, true, 0.5f, 0.887f)
                horizontalLineToRelative(2.77f)
                lineToRelative(2.288f, -2.288f)
                close()
                moveTo(24.0f, 3.0f)
                horizontalLineTo(21.726f)
                lineToRelative(1.131f, -1.973f)
                lineTo(21.122f, 0.032f)
                lineTo(20.0f, 1.989f)
                lineTo(18.878f, 0.032f)
                lineToRelative(-1.735f, 0.995f)
                lineTo(18.274f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.274f)
                lineTo(17.143f, 6.973f)
                lineToRelative(1.735f, 1.0f)
                lineTo(20.0f, 6.011f)
                lineToRelative(1.122f, 1.957f)
                lineToRelative(1.735f, -1.0f)
                lineTo(21.726f, 5.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _snowflakes!!
    }

private var _snowflakes: ImageVector? = null
