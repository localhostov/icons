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

public val Icons.Outline.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.0001f, 12.0f)
                    horizontalLineTo(17.0001f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(12.0f)
                    close()
                    moveTo(7.0001f, 18.0f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(22.0001f, 7.586f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(3.0f)
                    curveTo(2.0001f, 2.2043f, 2.3162f, 1.4413f, 2.8788f, 0.8787f)
                    curveTo(3.4414f, 0.3161f, 4.2045f, 0.0f, 5.0001f, 0.0f)
                    lineTo(14.4141f, 0.0f)
                    lineTo(22.0001f, 7.586f)
                    close()
                    moveTo(15.0001f, 7.0f)
                    horizontalLineTo(18.5861f)
                    lineTo(15.0001f, 3.414f)
                    verticalLineTo(7.0f)
                    close()
                    moveTo(20.0001f, 22.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(5.0001f)
                    curveTo(4.7349f, 2.0f, 4.4805f, 2.1054f, 4.293f, 2.2929f)
                    curveTo(4.1055f, 2.4804f, 4.0001f, 2.7348f, 4.0001f, 3.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(20.0001f)
                    close()
                }
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
