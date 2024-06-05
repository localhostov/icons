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

public val Icons.Bold.TachometerAltSlowest: ImageVector
    get() {
        if (_tachometerAltSlowest != null) {
            return _tachometerAltSlowest!!
        }
        _tachometerAltSlowest = Builder(name = "TachometerAltSlowest", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, true, -0.422f, -0.045f)
                lineToRelative(-4.49f, 2.371f)
                lineToRelative(-1.4f, -2.652f)
                lineToRelative(4.426f, -2.338f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(16.949f, 8.051f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 12.773f)
                lineToRelative(3.611f, -1.907f)
                arcToRelative(4.085f, 4.085f, 0.0f, false, true, 0.557f, -0.694f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.127f, 6.1f)
                lineToRelative(1.728f, 2.452f)
                arcToRelative(7.064f, 7.064f, 0.0f, false, false, 0.924f, -0.779f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, -9.9f)
                close()
                moveTo(24.0f, 13.0f)
                arcToRelative(12.037f, 12.037f, 0.0f, false, true, -4.967f, 9.714f)
                lineTo(18.64f, 23.0f)
                lineTo(5.36f, 23.0f)
                lineToRelative(-0.393f, -0.286f)
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
        return _tachometerAltSlowest!!
    }

private var _tachometerAltSlowest: ImageVector? = null
