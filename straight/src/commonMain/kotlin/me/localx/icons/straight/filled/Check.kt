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

public val Icons.Filled.Check: ImageVector
    get() {
        if (_check != null) {
            return _check!!
        }
        _check = Builder(name = "Check", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.77f, 20.589f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, true, -2.137f, -0.883f)
                lineTo(0.0f, 14.073f)
                lineToRelative(1.424f, -1.425f)
                lineToRelative(5.633f, 5.633f)
                arcToRelative(1.008f, 1.008f, 0.0f, false, false, 1.425f, 0.0f)
                lineTo(22.576f, 4.187f)
                lineTo(24.0f, 5.612f)
                lineTo(9.906f, 19.706f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 7.77f, 20.589f)
                close()
            }
        }
        .build()
        return _check!!
    }

private var _check: ImageVector? = null
