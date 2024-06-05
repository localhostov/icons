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
                lineTo(2.136f, 23.859f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.864f, 21.141f)
                lineToRelative(4.123f, -1.928f)
                verticalLineToRelative(-6.02f)
                arcTo(4.483f, 4.483f, 0.0f, false, true, 6.216f, 10.1f)
                lineTo(9.148f, 7.0f)
                horizontalLineTo(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineTo(9.9f)
                arcToRelative(4.813f, 4.813f, 0.0f, false, true, 2.845f, 0.923f)
                lineToRelative(0.154f, 0.128f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.062f, 5.01f)
                lineToRelative(-4.975f, 5.0f)
                verticalLineToRelative(2.747f)
                lineToRelative(12.146f, -5.681f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.725f, -1.993f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.719f, -1.27f)
                arcTo(4.469f, 4.469f, 0.0f, false, true, 23.729f, 12.307f)
                close()
                moveTo(16.487f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.487f, 5.0f)
                close()
            }
        }
        .build()
        return _skiJump!!
    }

private var _skiJump: ImageVector? = null
