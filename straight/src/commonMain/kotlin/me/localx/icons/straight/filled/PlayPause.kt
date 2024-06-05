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

public val Icons.Filled.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(22.0f, 21.0f)
                close()
                moveTo(18.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 21.0f)
                close()
                moveTo(2.0f, 20.998f)
                lineTo(2.0f, 3.002f)
                lineToRelative(10.88f, 6.946f)
                curveToRelative(0.699f, 0.439f, 1.12f, 1.203f, 1.12f, 2.039f)
                reflectiveCurveToRelative(-0.424f, 1.601f, -1.135f, 2.047f)
                lineTo(2.0f, 20.998f)
                close()
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
