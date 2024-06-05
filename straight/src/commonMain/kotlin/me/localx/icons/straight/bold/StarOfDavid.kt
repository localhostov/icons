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

public val Icons.Bold.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) {
            return _starOfDavid!!
        }
        _starOfDavid = Builder(name = "StarOfDavid", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.077f, 12.0f)
                lineToRelative(3.556f, -6.0f)
                horizontalLineToRelative(-7.111f)
                lineTo(11.999f, 0.056f)
                lineToRelative(-3.517f, 5.944f)
                lineTo(1.381f, 6.0f)
                lineToRelative(3.55f, 6.0f)
                lineToRelative(-3.55f, 6.0f)
                horizontalLineToRelative(7.101f)
                lineToRelative(3.517f, 5.944f)
                lineToRelative(3.522f, -5.944f)
                horizontalLineToRelative(7.111f)
                lineToRelative(-3.556f, -6.0f)
                close()
                moveTo(16.785f, 12.0f)
                lineToRelative(-2.37f, 4.0f)
                horizontalLineToRelative(-4.826f)
                lineToRelative(-2.367f, -4.0f)
                lineToRelative(2.367f, -4.0f)
                horizontalLineToRelative(4.826f)
                lineToRelative(2.37f, 4.0f)
                close()
            }
        }
        .build()
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
