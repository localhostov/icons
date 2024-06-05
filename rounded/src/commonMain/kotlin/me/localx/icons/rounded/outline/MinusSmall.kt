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
        _minusSmall = Builder(name = "MinusSmall", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 12.0f)
                lineTo(6.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 11.0f)
                close()
            }
        }
        .build()
        return _minusSmall!!
    }

private var _minusSmall: ImageVector? = null
