package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.TachometerAltSlow: ImageVector
    get() {
        if (_tachometerAltSlow != null) {
            return _tachometerAltSlow!!
        }
        _tachometerAltSlow = Builder(name = "TachometerAltSlow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.017f, 4.059f)
                arcTo(12.015f, 12.015f, 0.0f, false, false, 0.1f, 11.4f)
                arcTo(11.865f, 11.865f, 0.0f, false, false, 3.614f, 21.488f)
                arcTo(5.317f, 5.317f, 0.0f, false, false, 7.342f, 23.0f)
                horizontalLineToRelative(9.322f)
                arcToRelative(5.175f, 5.175f, 0.0f, false, false, 3.574f, -1.371f)
                arcTo(11.969f, 11.969f, 0.0f, false, false, 20.017f, 4.059f)
                close()
                moveTo(18.183f, 19.444f)
                arcTo(2.225f, 2.225f, 0.0f, false, true, 16.664f, 20.0f)
                lineTo(7.342f, 20.0f)
                arcToRelative(2.333f, 2.333f, 0.0f, false, true, -1.636f, -0.662f)
                arcToRelative(8.894f, 8.894f, 0.0f, false, true, -2.631f, -7.564f)
                arcTo(9.008f, 9.008f, 0.0f, false, true, 10.952f, 4.06f)
                curveTo(19.411f, 3.0f, 24.471f, 13.614f, 18.183f, 19.444f)
                close()
                moveTo(19.0f, 12.786f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -1.844f, 4.729f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.209f, -2.03f)
                arcToRelative(3.844f, 3.844f, 0.0f, false, false, -2.57f, -6.469f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.246f, -2.991f)
                arcTo(6.818f, 6.818f, 0.0f, false, true, 19.0f, 12.786f)
                close()
                moveTo(9.053f, 15.486f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.209f, 2.032f)
                curveToRelative(-1.147f, -1.26f, -3.126f, -4.863f, -0.491f, -5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.68f, 1.294f)
                arcTo(3.951f, 3.951f, 0.0f, false, false, 9.053f, 15.484f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.125f)
                lineTo(7.439f, 10.561f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.561f, 8.439f)
                lineTo(12.125f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltSlow!!
    }

private var _tachometerAltSlow: ImageVector? = null
