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

public val Icons.Filled.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = Builder(name = "WaveTriangle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.652f, 23.04f)
                lineToRelative(-9.396f, -17.947f)
                lineToRelative(-5.546f, 9.522f)
                lineToRelative(-1.728f, -1.007f)
                lineToRelative(7.368f, -12.649f)
                lineToRelative(9.397f, 17.949f)
                lineToRelative(5.543f, -9.503f)
                lineToRelative(1.728f, 1.008f)
                lineToRelative(-7.366f, 12.627f)
                close()
            }
        }
        .build()
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
