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

public val Icons.Outline.Yen: ImageVector
    get() {
        if (_yen != null) {
            return _yen!!
        }
        _yen = Builder(name = "Yen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2081f, 0.3897f)
                lineTo(12.0001f, 12.3597f)
                lineTo(2.7921f, 0.3897f)
                lineTo(1.2081f, 1.6097f)
                lineTo(10.7381f, 13.9997f)
                horizontalLineTo(5.0001f)
                verticalLineTo(15.9997f)
                horizontalLineTo(11.0001f)
                verticalLineTo(17.9997f)
                horizontalLineTo(5.0001f)
                verticalLineTo(19.9997f)
                horizontalLineTo(11.0001f)
                verticalLineTo(23.9997f)
                horizontalLineTo(13.0001f)
                verticalLineTo(19.9997f)
                horizontalLineTo(19.0001f)
                verticalLineTo(17.9997f)
                horizontalLineTo(13.0001f)
                verticalLineTo(15.9997f)
                horizontalLineTo(19.0001f)
                verticalLineTo(13.9997f)
                horizontalLineTo(13.2621f)
                lineTo(22.7921f, 1.6097f)
                lineTo(21.2081f, 0.3897f)
                close()
            }
        }
        .build()
        return _yen!!
    }

private var _yen: ImageVector? = null
