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

public val Icons.Outline.RectanglePanoramic: ImageVector
    get() {
        if (_rectanglePanoramic != null) {
            return _rectanglePanoramic!!
        }
        _rectanglePanoramic = Builder(name = "RectanglePanoramic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 19.0006f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.0006f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(19.0006f)
                    close()
                    moveTo(2.0f, 17.0006f)
                    horizontalLineTo(22.0f)
                    verticalLineTo(7.0006f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(17.0006f)
                    close()
                }
            }
        }
        .build()
        return _rectanglePanoramic!!
    }

private var _rectanglePanoramic: ImageVector? = null
