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

public val Icons.Bold.StarChristmas: ImageVector
    get() {
        if (_starChristmas != null) {
            return _starChristmas!!
        }
        _starChristmas = Builder(name = "StarChristmas", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.913f, 14.893f)
                lineToRelative(7.026f, -2.893f)
                lineToRelative(-7.026f, -2.893f)
                lineToRelative(3.587f, -5.607f)
                lineToRelative(-5.607f, 3.587f)
                lineTo(12.0f, 0.06f)
                lineToRelative(-2.893f, 7.027f)
                lineTo(3.5f, 3.5f)
                lineToRelative(3.587f, 5.607f)
                lineTo(0.061f, 12.0f)
                lineToRelative(7.026f, 2.893f)
                lineToRelative(-3.587f, 5.607f)
                lineToRelative(5.607f, -3.587f)
                lineToRelative(2.893f, 7.027f)
                lineToRelative(2.893f, -7.027f)
                lineToRelative(5.607f, 3.587f)
                lineToRelative(-3.587f, -5.607f)
                close()
                moveTo(12.0f, 16.06f)
                lineToRelative(-1.184f, -2.875f)
                lineToRelative(-2.877f, -1.185f)
                lineToRelative(2.877f, -1.185f)
                lineToRelative(1.184f, -2.875f)
                lineToRelative(1.184f, 2.875f)
                lineToRelative(2.877f, 1.185f)
                lineToRelative(-2.877f, 1.185f)
                lineToRelative(-1.184f, 2.875f)
                close()
            }
        }
        .build()
        return _starChristmas!!
    }

private var _starChristmas: ImageVector? = null
