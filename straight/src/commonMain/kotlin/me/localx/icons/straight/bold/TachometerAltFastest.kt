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

public val Icons.Bold.TachometerAltFastest: ImageVector
    get() {
        if (_tachometerAltFastest != null) {
            return _tachometerAltFastest!!
        }
        _tachometerAltFastest = Builder(name = "TachometerAltFastest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.887f, 12.337f)
                lineToRelative(4.425f, 2.337f)
                lineToRelative(-1.4f, 2.652f)
                lineToRelative(-4.49f, -2.371f)
                arcTo(2.021f, 2.021f, 0.0f, false, true, 12.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 1.887f, -2.663f)
                close()
                moveTo(16.949f, 8.051f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -9.9f, 9.9f)
                arcToRelative(7.064f, 7.064f, 0.0f, false, false, 0.924f, 0.779f)
                lineTo(9.7f, 16.274f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.127f, -6.1f)
                arcToRelative(4.085f, 4.085f, 0.0f, false, true, 0.557f, 0.694f)
                lineTo(19.0f, 12.773f)
                arcTo(6.941f, 6.941f, 0.0f, false, false, 16.949f, 8.051f)
                close()
                moveTo(24.0f, 13.0f)
                arcToRelative(12.039f, 12.039f, 0.0f, false, true, -4.966f, 9.714f)
                lineTo(18.64f, 23.0f)
                lineTo(5.36f, 23.0f)
                lineToRelative(-0.394f, -0.286f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 13.0f)
                close()
                moveTo(21.0f, 13.0f)
                arcTo(9.0f, 9.0f, 0.0f, true, false, 6.354f, 20.0f)
                lineTo(17.646f, 20.0f)
                arcTo(9.032f, 9.032f, 0.0f, false, false, 21.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltFastest!!
    }

private var _tachometerAltFastest: ImageVector? = null
