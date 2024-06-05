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

public val Icons.Filled.Flute: ImageVector
    get() {
        if (_flute != null) {
            return _flute!!
        }
        _flute = Builder(name = "Flute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.551f, 4.215f)
                lineTo(0.0f, 17.765f)
                lineToRelative(6.235f, 6.236f)
                lineToRelative(13.551f, -13.55f)
                lineToRelative(-6.236f, -6.236f)
                close()
                moveTo(6.1f, 19.315f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(8.6f, 16.815f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(11.1f, 14.315f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                close()
                moveTo(12.186f, 10.401f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(14.999f, 2.836f)
                lineToRelative(0.314f, 0.01f)
                curveToRelative(1.868f, 0.081f, 4.161f, -2.058f, 4.176f, -2.073f)
                lineToRelative(0.622f, -0.564f)
                lineToRelative(3.688f, 3.683f)
                lineToRelative(-0.572f, 0.623f)
                curveToRelative(-0.012f, 0.014f, -2.128f, 2.3f, -2.071f, 4.175f)
                lineToRelative(0.009f, 0.313f)
                lineToRelative(-6.166f, -6.166f)
                close()
            }
        }
        .build()
        return _flute!!
    }

private var _flute: ImageVector? = null
