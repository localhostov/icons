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
                moveTo(12.0f, 1.0f)
                arcTo(11.945f, 11.945f, 0.0f, false, false, 5.141f, 22.728f)
                lineTo(5.528f, 23.0f)
                lineTo(18.472f, 23.0f)
                lineToRelative(0.387f, -0.272f)
                arcTo(11.945f, 11.945f, 0.0f, false, false, 12.0f, 1.0f)
                close()
                moveTo(17.5f, 20.0f)
                lineTo(6.5f, 20.0f)
                arcTo(8.95f, 8.95f, 0.0f, true, true, 17.5f, 20.0f)
                close()
                moveTo(14.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.073f)
                lineTo(6.465f, 9.535f)
                lineTo(8.586f, 7.414f)
                lineToRelative(3.594f, 3.594f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 13.0f)
                close()
                moveTo(19.0f, 13.0f)
                arcToRelative(7.013f, 7.013f, 0.0f, false, true, -2.981f, 5.728f)
                lineToRelative(-1.725f, -2.456f)
                arcToRelative(3.965f, 3.965f, 0.0f, false, false, 0.7f, -5.9f)
                lineTo(10.816f, 6.108f)
                arcTo(6.962f, 6.962f, 0.0f, false, true, 19.0f, 13.0f)
                close()
                moveTo(9.706f, 16.272f)
                lineTo(7.981f, 18.728f)
                arcTo(7.013f, 7.013f, 0.0f, false, true, 5.0f, 13.0f)
                arcToRelative(6.926f, 6.926f, 0.0f, false, true, 0.122f, -1.272f)
                reflectiveCurveTo(9.39f, 16.05f, 9.706f, 16.272f)
                close()
            }
        }
        .build()
        return _tachometerAltSlow!!
    }

private var _tachometerAltSlow: ImageVector? = null
