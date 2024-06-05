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

public val Icons.Outline.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.613f, 15.028f)
                lineToRelative(1.415f, -1.415f)
                lineToRelative(-13.609f, -13.608f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.131f, 1.131f)
                lineToRelative(-1.548f, 1.55f)
                lineToRelative(-2.848f, -2.884f)
                lineToRelative(-1.422f, 1.406f)
                lineToRelative(2.856f, 2.89f)
                lineToRelative(-6.295f, 6.3f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 4.242f)
                lineToRelative(7.07f, 7.071f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 4.243f, 0.0f)
                lineToRelative(9.258f, -9.257f)
                close()
                moveTo(10.778f, 21.707f)
                arcToRelative(1.022f, 1.022f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-7.071f, -7.071f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineToRelative(6.287f, -6.287f)
                lineToRelative(4.709f, 4.765f)
                lineToRelative(1.422f, -1.4f)
                lineToRelative(-4.718f, -4.778f)
                lineToRelative(1.557f, -1.558f)
                lineToRelative(8.486f, 8.486f)
                close()
                moveTo(21.5f, 17.0f)
                reflectiveCurveToRelative(2.5f, 3.119f, 2.5f, 4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                curveToRelative(0.0f, -1.25f, 2.5f, -4.5f, 2.5f, -4.5f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
