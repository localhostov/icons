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

public val Icons.Outline.RectabgleVertical: ImageVector
    get() {
        if (_rectabgleVertical != null) {
            return _rectabgleVertical!!
        }
        _rectabgleVertical = Builder(name = "RectabgleVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(5.0f, 22.0f)
                    horizontalLineTo(19.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(5.0f)
                    verticalLineTo(22.0f)
                    close()
                }
            }
        }
        .build()
        return _rectabgleVertical!!
    }

private var _rectabgleVertical: ImageVector? = null
