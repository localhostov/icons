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

public val Icons.Outline.MinusSmall: ImageVector
    get() {
        if (_minusSmall != null) {
            return _minusSmall!!
        }
        _minusSmall = Builder(name = "MinusSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.9997f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 10.9997f, 6.0f, 11.4474f, 6.0f, 11.9997f)
                curveTo(6.0f, 12.552f, 6.4477f, 12.9997f, 7.0f, 12.9997f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 12.9997f, 18.0f, 12.552f, 18.0f, 11.9997f)
                curveTo(18.0f, 11.4474f, 17.5523f, 10.9997f, 17.0f, 10.9997f)
                close()
            }
        }
        .build()
        return _minusSmall!!
    }

private var _minusSmall: ImageVector? = null
