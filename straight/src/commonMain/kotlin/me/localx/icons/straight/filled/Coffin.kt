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

public val Icons.Filled.Coffin: ImageVector
    get() {
        if (_coffin != null) {
            return _coffin!!
        }
        _coffin = Builder(name = "Coffin", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.314f, 24.0f)
                horizontalLineTo(5.686f)
                lineToRelative(-3.226f, -15.592f)
                lineTo(5.068f, 1.886f)
                curveToRelative(0.459f, -1.146f, 1.552f, -1.886f, 2.786f, -1.886f)
                horizontalLineToRelative(8.291f)
                curveToRelative(1.234f, 0.0f, 2.327f, 0.74f, 2.786f, 1.886f)
                lineToRelative(2.608f, 6.522f)
                lineToRelative(-3.226f, 15.592f)
                close()
            }
        }
        .build()
        return _coffin!!
    }

private var _coffin: ImageVector? = null
