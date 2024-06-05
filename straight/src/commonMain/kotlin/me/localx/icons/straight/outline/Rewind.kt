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

public val Icons.Outline.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.485f)
                lineTo(15.0f, 0.137f)
                lineTo(1.285f, 9.23f)
                lineToRelative(-0.029f, 0.02f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.883f)
                lineTo(15.0f, 23.943f)
                lineTo(15.0f, 17.515f)
                lineToRelative(9.0f, 6.428f)
                lineTo(24.0f, 0.057f)
                close()
                moveTo(22.0f, 20.057f)
                lineTo(13.0f, 13.628f)
                verticalLineToRelative(6.429f)
                lineTo(2.419f, 12.505f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.012f, -1.619f)
                lineTo(13.0f, 3.863f)
                verticalLineToRelative(6.509f)
                lineToRelative(9.0f, -6.429f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
