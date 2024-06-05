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

public val Icons.Bold.Stairs: ImageVector
    get() {
        if (_stairs != null) {
            return _stairs!!
        }
        _stairs = Builder(name = "Stairs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 24.0f)
                lineToRelative(-3.0f, 0.0f)
                lineToRelative(0.0f, -9.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(9.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-5.0f, 0.0f)
                lineToRelative(0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _stairs!!
    }

private var _stairs: ImageVector? = null
