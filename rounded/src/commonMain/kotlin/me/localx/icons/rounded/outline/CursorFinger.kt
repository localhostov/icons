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

public val Icons.Outline.CursorFinger: ImageVector
    get() {
        if (_cursorFinger != null) {
            return _cursorFinger!!
        }
        _cursorFinger = Builder(name = "CursorFinger", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.98f, 9.376f)
                lineTo(12.0f, 8.18f)
                verticalLineTo(3.107f)
                arcTo(3.081f, 3.081f, 0.0f, false, false, 9.5f, 0.041f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 3.0f)
                verticalLineTo(9.661f)
                lineTo(3.211f, 13.3f)
                arcToRelative(5.021f, 5.021f, 0.0f, false, false, 0.249f, 6.794f)
                lineToRelative(2.4f, 2.425f)
                arcTo(5.036f, 5.036f, 0.0f, false, false, 9.414f, 24.0f)
                horizontalLineTo(17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(14.279f)
                arcTo(5.013f, 5.013f, 0.0f, false, false, 17.98f, 9.376f)
                close()
                moveTo(20.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineTo(9.414f)
                arcToRelative(3.022f, 3.022f, 0.0f, false, true, -2.134f, -0.891f)
                lineToRelative(-2.4f, -2.428f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, true, -0.116f, -4.123f)
                lineTo(6.0f, 12.945f)
                verticalLineTo(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.176f, -0.985f)
                arcTo(1.082f, 1.082f, 0.0f, false, true, 10.0f, 3.107f)
                verticalLineTo(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, 0.98f)
                lineToRelative(6.784f, 1.357f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 20.0f, 14.279f)
                close()
            }
        }
        .build()
        return _cursorFinger!!
    }

private var _cursorFinger: ImageVector? = null
