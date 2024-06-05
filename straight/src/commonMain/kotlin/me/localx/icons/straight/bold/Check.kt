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

public val Icons.Bold.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8f, 21.425f)
                arcTo(2.542f, 2.542f, 0.0f, false, true, 6.0f, 20.679f)
                lineTo(0.439f, 15.121f)
                lineTo(2.561f, 13.0f)
                lineTo(7.8f, 18.239f)
                lineTo(21.439f, 4.6f)
                lineToRelative(2.122f, 2.121f)
                lineTo(9.6f, 20.679f)
                arcTo(2.542f, 2.542f, 0.0f, false, true, 7.8f, 21.425f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
