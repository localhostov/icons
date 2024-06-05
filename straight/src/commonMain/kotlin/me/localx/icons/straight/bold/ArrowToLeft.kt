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

public val Icons.Bold.ArrowToLeft: ImageVector
    get() {
        if (_arrowToLeft != null) {
            return _arrowToLeft!!
        }
        _arrowToLeft = Builder(name = "ArrowToLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.003f, 10.5f)
                lineToRelative(3.45f, -3.45f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-4.332f, 4.332f)
                lineToRelative(0.0f, -4.261f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, 14.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, -4.261f)
                lineToRelative(4.332f, 4.332f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-3.45f, -3.45f)
                lineToRelative(17.997f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-17.997f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowToLeft!!
    }

private var _arrowToLeft: ImageVector? = null
