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

public val Icons.Filled.PlugConnection: ImageVector
    get() {
        if (_plugConnection != null) {
            return _plugConnection!!
        }
        _plugConnection = Builder(name = "PlugConnection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(14.828f, 13.414f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(2.379f, 2.379f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.852f, -0.852f)
                lineToRelative(-1.439f, 1.439f)
                curveToRelative(-0.804f, 0.803f, -1.858f, 1.204f, -2.913f, 1.204f)
                reflectiveCurveToRelative(-2.109f, -0.401f, -2.912f, -1.204f)
                lineToRelative(-0.028f, -0.028f)
                lineToRelative(-3.185f, 3.185f)
                lineTo(0.05f, 22.536f)
                lineToRelative(3.185f, -3.185f)
                lineToRelative(-0.028f, -0.028f)
                curveToRelative(-1.605f, -1.605f, -1.605f, -4.219f, 0.0f, -5.825f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(-0.852f, -0.852f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.379f, 2.379f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(20.766f, 4.648f)
                lineToRelative(3.191f, -3.191f)
                lineTo(22.543f, 0.043f)
                lineToRelative(-3.191f, 3.191f)
                lineToRelative(-0.028f, -0.028f)
                curveToRelative(-1.605f, -1.605f, -4.218f, -1.605f, -5.825f, 0.0f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-0.852f, -0.852f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(9.0f, 9.0f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-0.852f, -0.852f)
                lineToRelative(1.439f, -1.439f)
                curveToRelative(1.605f, -1.606f, 1.605f, -4.22f, 0.0f, -5.825f)
                lineToRelative(-0.028f, -0.028f)
                close()
            }
        }
        .build()
        return _plugConnection!!
    }

private var _plugConnection: ImageVector? = null
