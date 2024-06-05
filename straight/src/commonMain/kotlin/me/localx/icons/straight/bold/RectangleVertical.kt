package me.localx.icons.straight.bold

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

public val Icons.Bold.RectangleVertical: ImageVector
    get() {
        if (_rectangleVertical != null) {
            return _rectangleVertical!!
        }
        _rectangleVertical = Builder(name = "RectangleVertical", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 24.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 0.0f)
                lineTo(21.0f, 0.0f)
                lineTo(21.0f, 24.0f)
                close()
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 21.0f)
                close()
            }
        }
        .build()
        return _rectangleVertical!!
    }

private var _rectangleVertical: ImageVector? = null
