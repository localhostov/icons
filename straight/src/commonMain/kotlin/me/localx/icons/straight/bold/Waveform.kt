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

public val Icons.Bold.Waveform: ImageVector
    get() {
        if (_waveform != null) {
            return _waveform!!
        }
        _waveform = Builder(name = "Waveform", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.88f, 23.933f)
                lineToRelative(-2.88f, -11.572f)
                lineToRelative(-2.88f, 11.572f)
                lineToRelative(-3.164f, -10.764f)
                lineToRelative(-2.211f, 7.076f)
                lineToRelative(-3.22f, -7.245f)
                lineToRelative(-0.525f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(2.475f, 0.0f)
                lineToRelative(0.78f, 1.755f)
                lineToRelative(2.789f, -8.924f)
                lineToRelative(2.836f, 9.647f)
                lineToRelative(3.12f, -12.539f)
                lineToRelative(3.12f, 12.539f)
                lineToRelative(2.836f, -9.647f)
                lineToRelative(2.789f, 8.924f)
                lineToRelative(0.78f, -1.755f)
                lineToRelative(2.475f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-0.525f, 0.0f)
                lineToRelative(-3.22f, 7.245f)
                lineToRelative(-2.211f, -7.076f)
                lineToRelative(-3.164f, 10.764f)
                close()
            }
        }
        .build()
        return _waveform!!
    }

private var _waveform: ImageVector? = null
