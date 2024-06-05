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

public val Icons.Filled.BarsStaggered: ImageVector
    get() {
        if (_barsStaggered != null) {
            return _barsStaggered!!
        }
        _barsStaggered = Builder(name = "BarsStaggered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 5.0f)
                lineTo(0.0f, 5.0f)
                lineTo(0.0f, 3.0f)
                lineTo(19.0f, 3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(19.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(24.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _barsStaggered!!
    }

private var _barsStaggered: ImageVector? = null
