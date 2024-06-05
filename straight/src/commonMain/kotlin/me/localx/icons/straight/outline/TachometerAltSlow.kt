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

public val Icons.Outline.TachometerAltSlow: ImageVector
    get() {
        if (_tachometerAltSlow != null) {
            return _tachometerAltSlow!!
        }
        _tachometerAltSlow = Builder(name = "TachometerAltSlow", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(0.373f, 0.981f, -4.414f, 16.17f, 5.112f, 22.818f)
                lineTo(5.371f, 23.0f)
                lineTo(18.629f, 23.0f)
                lineToRelative(0.259f, -0.182f)
                curveTo(28.418f, 16.167f, 23.621f, 0.98f, 12.0f, 1.0f)
                close()
                moveTo(17.988f, 21.0f)
                lineTo(6.012f, 21.0f)
                curveTo(-1.633f, 15.32f, 2.47f, 2.976f, 12.0f, 3.0f)
                curveTo(21.53f, 2.976f, 25.633f, 15.322f, 17.988f, 21.0f)
                close()
                moveTo(6.0f, 13.0f)
                arcToRelative(5.951f, 5.951f, 0.0f, false, false, 1.8f, 4.285f)
                lineToRelative(-1.4f, 1.43f)
                arcTo(8.019f, 8.019f, 0.0f, false, true, 4.635f, 9.877f)
                lineTo(6.21f, 11.452f)
                arcTo(5.95f, 5.95f, 0.0f, false, false, 6.0f, 13.0f)
                close()
                moveTo(20.0f, 13.0f)
                arcToRelative(7.939f, 7.939f, 0.0f, false, true, -2.406f, 5.715f)
                lineToRelative(-1.4f, -1.43f)
                curveToRelative(4.39f, -4.222f, 0.123f, -11.7f, -5.743f, -10.075f)
                lineTo(8.877f, 5.635f)
                arcTo(8.045f, 8.045f, 0.0f, false, true, 20.0f, 13.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.932f, -0.518f)
                lineTo(5.793f, 8.207f)
                lineTo(7.207f, 6.793f)
                lineToRelative(4.275f, 4.275f)
                arcTo(2.008f, 2.008f, 0.0f, false, true, 14.0f, 13.0f)
                close()
            }
        }
        .build()
        return _tachometerAltSlow!!
    }

private var _tachometerAltSlow: ImageVector? = null
