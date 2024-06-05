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

public val Icons.Outline.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.867f, 1.612f)
                lineTo(17.515f, 0.155f)
                arcTo(2.956f, 2.956f, 0.0f, false, false, 15.724f, 0.12f)
                lineTo(8.538f, 2.092f)
                lineTo(4.155f, 0.233f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 0.0f, 3.0f)
                lineTo(0.0f, 21.754f)
                lineToRelative(7.982f, 2.281f)
                lineToRelative(8.021f, -2.0f)
                lineToRelative(8.0f, 1.948f)
                lineTo(24.003f, 4.483f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.867f, 1.612f)
                close()
                moveTo(15.0f, 2.384f)
                lineTo(15.0f, 20.219f)
                lineToRelative(-6.0f, 1.5f)
                lineTo(9.0f, 3.972f)
                close()
                moveTo(2.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.387f, 2.08f)
                lineTo(7.0f, 3.581f)
                lineTo(7.0f, 21.674f)
                lineTo(2.0f, 20.246f)
                close()
                moveTo(22.0f, 21.43f)
                lineTo(17.0f, 20.212f)
                lineTo(17.0f, 2.092f)
                lineToRelative(4.275f, 1.43f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 4.483f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
