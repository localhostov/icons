package me.localx.icons.straight.filled

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

public val Icons.Filled.Receipt: ImageVector
    get() {
        if (_receipt != null) {
            return _receipt!!
        }
        _receipt = Builder(name = "Receipt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(3.0f, 23.9f)
                lineToRelative(3.67f, -2.51f)
                lineToRelative(2.671f, 1.826f)
                lineToRelative(2.666f, -1.826f)
                lineToRelative(2.666f, 1.826f)
                lineToRelative(2.664f, -1.825f)
                lineTo(21.0f, 23.9f)
                lineTo(21.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 0.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(17.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                close()
            }
        }
        .build()
        return _receipt!!
    }

private var _receipt: ImageVector? = null
