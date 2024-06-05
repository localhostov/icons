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

public val Icons.Bold.SkiJump: ImageVector
    get() {
        if (_skiJump != null) {
            return _skiJump!!
        }
        _skiJump = Builder(name = "SkiJump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.729f, 12.307f)
                arcToRelative(4.476f, 4.476f, 0.0f, false, true, -2.326f, 2.54f)
                lineTo(1.265f, 23.97f)
                lineTo(0.026f, 21.237f)
                lineTo(5.0f, 18.984f)
                verticalLineTo(12.8f)
                arcToRelative(3.485f, 3.485f, 0.0f, false, true, 0.955f, -2.4f)
                lineTo(9.161f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(8.486f)
                lineToRelative(1.427f, 1.05f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.062f, 5.011f)
                lineTo(8.0f, 15.062f)
                verticalLineToRelative(2.563f)
                lineToRelative(12.149f, -5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.709f, -1.986f)
                lineToRelative(2.719f, -1.27f)
                arcTo(4.469f, 4.469f, 0.0f, false, true, 23.729f, 12.307f)
                close()
                moveTo(16.5f, 5.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 14.0f, 2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.5f, 5.0f)
                close()
            }
        }
        .build()
        return _skiJump!!
    }

private var _skiJump: ImageVector? = null
