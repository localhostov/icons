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

public val Icons.Filled.Pie: ImageVector
    get() {
        if (_pie != null) {
            return _pie!!
        }
        _pie = Builder(name = "Pie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.414f, 19.928f)
                lineToRelative(-0.349f, 1.681f)
                arcTo(3.01f, 3.01f, 0.0f, false, true, 18.128f, 24.0f)
                lineTo(5.873f, 24.0f)
                arcToRelative(3.01f, 3.01f, 0.0f, false, true, -2.937f, -2.391f)
                lineToRelative(-0.35f, -1.681f)
                arcTo(5.961f, 5.961f, 0.0f, false, false, 9.0f, 20.188f)
                arcToRelative(5.948f, 5.948f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(5.961f, 5.961f, 0.0f, false, false, 6.414f, -0.26f)
                close()
                moveTo(13.0f, 0.0f)
                lineTo(11.0f, 0.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(15.0f, 0.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                lineTo(7.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(12.0f, 6.0f)
                curveTo(5.353f, 6.0f, 0.0f, 10.376f, 0.0f, 14.0f)
                arcToRelative(2.917f, 2.917f, 0.0f, false, false, 2.53f, 2.951f)
                arcTo(3.956f, 3.956f, 0.0f, false, false, 9.0f, 17.618f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, false, 6.0f, 0.0f)
                arcToRelative(3.956f, 3.956f, 0.0f, false, false, 6.47f, -0.667f)
                arcTo(2.917f, 2.917f, 0.0f, false, false, 24.0f, 14.0f)
                curveTo(24.0f, 10.376f, 18.647f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(10.121f, 11.636f)
                arcTo(1.242f, 1.242f, 0.0f, true, true, 8.364f, 9.879f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 11.0f, 9.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 10.121f, 11.636f)
                close()
                moveTo(15.636f, 11.636f)
                arcToRelative(1.243f, 1.243f, 0.0f, false, true, -1.757f, 0.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 13.0f, 9.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 2.636f, 0.879f)
                arcTo(1.243f, 1.243f, 0.0f, false, true, 15.636f, 11.636f)
                close()
            }
        }
        .build()
        return _pie!!
    }

private var _pie: ImageVector? = null
