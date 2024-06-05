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

public val Icons.Filled.Waveform: ImageVector
    get() {
        if (_waveform != null) {
            return _waveform!!
        }
        _waveform = Builder(name = "Waveform", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.914f, 24.021f)
                lineToRelative(-2.914f, -14.085f)
                lineToRelative(-2.914f, 14.085f)
                lineToRelative(-3.095f, -12.534f)
                lineToRelative(-2.299f, 9.146f)
                lineTo(0.809f, 13.0f)
                horizontalLineToRelative(-0.809f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.191f)
                lineToRelative(1.116f, 2.957f)
                lineTo(6.009f, 3.213f)
                lineToRelative(2.905f, 11.767f)
                lineTo(12.0f, 0.064f)
                lineToRelative(3.086f, 14.915f)
                lineToRelative(2.905f, -11.767f)
                lineToRelative(2.701f, 10.744f)
                lineToRelative(1.116f, -2.957f)
                horizontalLineToRelative(2.191f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.809f)
                lineToRelative(-2.884f, 7.633f)
                lineToRelative(-2.299f, -9.146f)
                lineToRelative(-3.095f, 12.534f)
                close()
            }
        }
        .build()
        return _waveform!!
    }

private var _waveform: ImageVector? = null
