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

public val Icons.Filled.Snap: ImageVector
    get() {
        if (_snap != null) {
            return _snap!!
        }
        _snap = Builder(name = "Snap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.207f, 6.207f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-3.0f, 3.0f)
                close()
                moveTo(6.207f, 4.793f)
                lineTo(3.207f, 1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(1.414f, -1.414f)
                close()
                moveTo(10.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(10.0f, 0.0f)
                close()
                moveTo(17.926f, 24.0f)
                lineToRelative(3.651f, -3.5f)
                lineToRelative(-4.803f, -8.429f)
                lineToRelative(5.581f, -5.581f)
                curveToRelative(0.704f, -0.704f, 0.876f, -1.839f, 0.294f, -2.647f)
                curveToRelative(-0.742f, -1.03f, -2.188f, -1.116f, -3.047f, -0.257f)
                lineToRelative(-11.112f, 10.863f)
                lineToRelative(-0.067f, -3.241f)
                curveToRelative(0.0f, -0.137f, -0.03f, -0.344f, -0.084f, -0.604f)
                curveToRelative(-0.291f, -1.025f, -1.304f, -1.747f, -2.455f, -1.579f)
                curveToRelative(-1.103f, 0.161f, -1.875f, 1.193f, -1.876f, 2.307f)
                lineToRelative(-0.008f, 8.668f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(17.926f)
                close()
            }
        }
        .build()
        return _snap!!
    }

private var _snap: ImageVector? = null
