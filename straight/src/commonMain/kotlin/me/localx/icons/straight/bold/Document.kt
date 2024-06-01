package me.localx.icons.straight.bold

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

public val Icons.Bold.Document: ImageVector
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
                    moveTo(7.0001f, 10.0f)
                    horizontalLineTo(17.0001f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(7.0001f, 18.0f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(18.0f)
                    close()
                    moveTo(22.0001f, 5.879f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0001f)
                    verticalLineTo(3.0f)
                    curveTo(2.0001f, 2.2043f, 2.3162f, 1.4413f, 2.8788f, 0.8787f)
                    curveTo(3.4414f, 0.3161f, 4.2045f, 0.0f, 5.0001f, 0.0f)
                    lineTo(16.1211f, 0.0f)
                    lineTo(22.0001f, 5.879f)
                    close()
                    moveTo(19.0001f, 21.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(19.0001f)
                    close()
                }
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
