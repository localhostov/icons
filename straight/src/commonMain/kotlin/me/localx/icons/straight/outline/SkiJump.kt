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

public val Icons.Outline.SkiJump: ImageVector
    get() {
        if (_skiJump != null) {
            return _skiJump!!
        }
        _skiJump = Builder(name = "SkiJump", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.736f, 12.262f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, true, -2.067f, 2.258f)
                lineTo(0.826f, 23.926f)
                lineTo(0.0f, 22.1f)
                lineToRelative(4.973f, -2.244f)
                verticalLineTo(12.02f)
                arcTo(2.984f, 2.984f, 0.0f, false, true, 5.856f, 9.9f)
                lineTo(9.758f, 6.0f)
                horizontalLineTo(1.977f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(9.959f)
                lineTo(14.0f, 5.72f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.1f, 4.337f)
                lineToRelative(0.0f, -0.005f)
                curveToRelative(-0.008f, 0.008f, -0.01f, 0.019f, -0.018f, 0.026f)
                lineToRelative(-5.1f, 4.794f)
                verticalLineTo(12.127f)
                lineToRelative(3.708f, -3.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.018f, -1.429f)
                lineToRelative(-0.707f, -0.59f)
                lineTo(7.27f, 11.313f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, false, -0.293f, 0.707f)
                verticalLineToRelative(6.936f)
                lineTo(20.835f, 12.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.954f, -2.652f)
                lineTo(23.6f, 9.2f)
                arcTo(3.975f, 3.975f, 0.0f, false, true, 23.736f, 12.262f)
                close()
                moveTo(16.477f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -2.5f, -2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 16.477f, 5.0f)
                close()
            }
        }
        .build()
        return _skiJump!!
    }

private var _skiJump: ImageVector? = null
