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

public val Icons.Outline.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.566f, 24.0f)
                lineTo(8.719f, 24.0f)
                lineToRelative(2.0f, -8.0f)
                lineTo(6.586f, 16.0f)
                arcToRelative(2.561f, 2.561f, 0.0f, false, true, -2.451f, -3.3f)
                lineTo(7.976f, 0.0f)
                horizontalLineToRelative(9.467f)
                lineToRelative(-3.0f, 8.0f)
                horizontalLineToRelative(4.023f)
                arcToRelative(2.533f, 2.533f, 0.0f, false, true, 2.11f, 3.932f)
                close()
                moveTo(11.281f, 22.0f)
                horizontalLineToRelative(0.212f)
                lineToRelative(7.416f, -11.174f)
                arcTo(0.532f, 0.532f, 0.0f, false, false, 18.466f, 10.0f)
                lineTo(11.557f, 10.0f)
                lineToRelative(3.0f, -8.0f)
                lineTo(9.46f, 2.0f)
                lineTo(6.049f, 13.276f)
                arcTo(0.561f, 0.561f, 0.0f, false, false, 6.586f, 14.0f)
                horizontalLineToRelative(6.7f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
