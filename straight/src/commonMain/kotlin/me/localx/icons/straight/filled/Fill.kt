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

public val Icons.Filled.Fill: ImageVector
    get() {
        if (_fill != null) {
            return _fill!!
        }
        _fill = Builder(name = "Fill", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.45f, 13.864f)
                lineToRelative(-9.258f, 9.257f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -4.243f, 0.0f)
                lineToRelative(-7.07f, -7.071f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -4.242f)
                lineToRelative(6.3f, -6.3f)
                lineToRelative(-2.861f, -2.886f)
                lineToRelative(1.422f, -1.406f)
                lineToRelative(8.969f, 9.08f)
                lineToRelative(1.537f, -1.526f)
                lineToRelative(-6.125f, -6.2f)
                lineToRelative(0.015f, -0.016f)
                lineToRelative(-1.1f, -1.1f)
                lineToRelative(1.415f, -1.417f)
                lineToRelative(13.577f, 13.576f)
                lineToRelative(-1.415f, 1.415f)
                close()
                moveTo(19.0f, 21.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                curveToRelative(0.0f, -1.381f, -2.5f, -4.5f, -2.5f, -4.5f)
                reflectiveCurveToRelative(-2.5f, 3.25f, -2.5f, 4.5f)
                close()
            }
        }
        .build()
        return _fill!!
    }

private var _fill: ImageVector? = null
