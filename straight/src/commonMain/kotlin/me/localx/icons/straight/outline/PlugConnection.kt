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

public val Icons.Outline.PlugConnection: ImageVector
    get() {
        if (_plugConnection != null) {
            return _plugConnection!!
        }
        _plugConnection = Builder(name = "PlugConnection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.414f, 12.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(-2.379f, -2.379f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(0.852f, 0.852f)
                lineToRelative(-1.439f, 1.439f)
                curveToRelative(-1.605f, 1.606f, -1.605f, 4.22f, 0.0f, 5.825f)
                lineToRelative(0.028f, 0.028f)
                lineTo(0.05f, 22.536f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(3.185f, -3.185f)
                lineToRelative(0.028f, 0.028f)
                curveToRelative(0.803f, 0.803f, 1.857f, 1.204f, 2.912f, 1.204f)
                reflectiveCurveToRelative(2.109f, -0.401f, 2.913f, -1.204f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(0.852f, 0.852f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-2.379f, -2.379f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(9.088f, 19.38f)
                curveToRelative(-0.824f, 0.826f, -2.169f, 0.827f, -2.997f, 0.0f)
                lineToRelative(-1.471f, -1.471f)
                curveToRelative(-0.826f, -0.826f, -0.826f, -2.171f, 0.0f, -2.997f)
                lineToRelative(1.439f, -1.439f)
                lineToRelative(4.467f, 4.467f)
                lineToRelative(-1.439f, 1.439f)
                close()
                moveTo(20.766f, 4.649f)
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
                moveTo(19.38f, 9.088f)
                lineToRelative(-1.439f, 1.439f)
                lineToRelative(-4.467f, -4.467f)
                lineToRelative(1.439f, -1.439f)
                curveToRelative(0.826f, -0.825f, 2.171f, -0.826f, 2.997f, 0.0f)
                lineToRelative(1.471f, 1.471f)
                curveToRelative(0.826f, 0.826f, 0.826f, 2.171f, 0.0f, 2.997f)
                close()
            }
        }
        .build()
        return _plugConnection!!
    }

private var _plugConnection: ImageVector? = null
