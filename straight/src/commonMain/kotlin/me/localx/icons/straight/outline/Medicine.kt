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

public val Icons.Outline.Medicine: ImageVector
    get() {
        if (_medicine != null) {
            return _medicine!!
        }
        _medicine = Builder(name = "Medicine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 8.0f)
                    horizontalLineTo(15.99f)
                    lineTo(15.971f, 6.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(6.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(6.0f)
                    curveTo(5.2043f, 8.0f, 4.4413f, 8.3161f, 3.8787f, 8.8787f)
                    curveTo(3.3161f, 9.4413f, 3.0f, 10.2044f, 3.0f, 11.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(11.0f)
                    curveTo(21.0f, 10.2044f, 20.6839f, 9.4413f, 20.1213f, 8.8787f)
                    curveTo(19.5587f, 8.3161f, 18.7956f, 8.0f, 18.0f, 8.0f)
                    close()
                    moveTo(8.0f, 2.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(8.0f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(19.0f, 22.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(11.0f)
                    curveTo(5.0f, 10.7348f, 5.1054f, 10.4804f, 5.2929f, 10.2929f)
                    curveTo(5.4804f, 10.1054f, 5.7348f, 10.0f, 6.0f, 10.0f)
                    horizontalLineTo(10.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(13.97f)
                    lineTo(14.01f, 10.0f)
                    horizontalLineTo(18.0f)
                    curveTo(18.2652f, 10.0f, 18.5196f, 10.1054f, 18.7071f, 10.2929f)
                    curveTo(18.8946f, 10.4804f, 19.0f, 10.7348f, 19.0f, 11.0f)
                    verticalLineTo(22.0f)
                    close()
                    moveTo(13.0f, 15.0f)
                    horizontalLineTo(15.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(19.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(15.0f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(15.0f)
                    close()
                }
            }
        }
        .build()
        return _medicine!!
    }

private var _medicine: ImageVector? = null
