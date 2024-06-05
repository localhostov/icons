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

public val Icons.Filled.StarOctogram: ImageVector
    get() {
        if (_starOctogram != null) {
            return _starOctogram!!
        }
        _starOctogram = Builder(name = "StarOctogram", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineToRelative(3.515f, 3.515f)
                lineToRelative(4.97f, 0.0f)
                lineToRelative(0.0f, 4.97f)
                lineToRelative(3.515f, 3.515f)
                lineToRelative(-3.515f, 3.515f)
                lineToRelative(0.0f, 4.97f)
                lineToRelative(-4.97f, 0.0f)
                lineToRelative(-3.515f, 3.515f)
                lineToRelative(-3.515f, -3.515f)
                lineToRelative(-4.97f, 0.0f)
                lineToRelative(0.0f, -4.97f)
                lineToRelative(-3.515f, -3.515f)
                lineToRelative(3.515f, -3.515f)
                lineToRelative(0.0f, -4.97f)
                lineToRelative(4.97f, 0.0f)
                lineToRelative(3.515f, -3.515f)
                close()
            }
        }
        .build()
        return _starOctogram!!
    }

private var _starOctogram: ImageVector? = null
