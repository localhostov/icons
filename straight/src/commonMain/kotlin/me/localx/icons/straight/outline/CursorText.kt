package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.CursorText: ImageVector
    get() {
        if (_cursorText != null) {
            return _cursorText!!
        }
        _cursorText = Builder(name = "CursorText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(16.0002f, 2.0f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(16.0002f)
                    curveTo(15.221f, 0.0022f, 14.4533f, 0.1871f, 13.7586f, 0.5398f)
                    curveTo(13.0639f, 0.8925f, 12.4616f, 1.4033f, 12.0002f, 2.031f)
                    curveTo(11.5387f, 1.4033f, 10.9364f, 0.8925f, 10.2417f, 0.5398f)
                    curveTo(9.547f, 0.1871f, 8.7793f, 0.0022f, 8.0001f, 0.0f)
                    lineTo(5.0002f, 0.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(8.0001f)
                    curveTo(8.7958f, 2.0f, 9.5589f, 2.3161f, 10.1215f, 2.8787f)
                    curveTo(10.6841f, 3.4413f, 11.0002f, 4.2043f, 11.0002f, 5.0f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(19.0f)
                    curveTo(11.0002f, 19.7956f, 10.6841f, 20.5587f, 10.1215f, 21.1213f)
                    curveTo(9.5589f, 21.6839f, 8.7958f, 22.0f, 8.0001f, 22.0f)
                    horizontalLineTo(5.0002f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(8.0001f)
                    curveTo(8.7793f, 23.9978f, 9.547f, 23.8129f, 10.2417f, 23.4602f)
                    curveTo(10.9364f, 23.1075f, 11.5387f, 22.5967f, 12.0002f, 21.969f)
                    curveTo(12.4616f, 22.5967f, 13.0639f, 23.1075f, 13.7586f, 23.4602f)
                    curveTo(14.4533f, 23.8129f, 15.221f, 23.9978f, 16.0002f, 24.0f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(16.0002f)
                    curveTo(15.2045f, 22.0f, 14.4414f, 21.6839f, 13.8788f, 21.1213f)
                    curveTo(13.3162f, 20.5587f, 13.0002f, 19.7956f, 13.0002f, 19.0f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(5.0f)
                    curveTo(13.0002f, 4.2043f, 13.3162f, 3.4413f, 13.8788f, 2.8787f)
                    curveTo(14.4414f, 2.3161f, 15.2045f, 2.0f, 16.0002f, 2.0f)
                    close()
                }
            }
        }
        .build()
        return _cursorText!!
    }

private var _cursorText: ImageVector? = null
