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

public val Icons.Filled.Sleigh: ImageVector
    get() {
        if (_sleigh != null) {
            return _sleigh!!
        }
        _sleigh = Builder(name = "Sleigh", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 17.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                lineTo(24.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(11.685f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.971f, -0.757f)
                lineTo(9.851f, 4.787f)
                arcTo(4.993f, 4.993f, 0.0f, false, false, 5.0f, 1.0f)
                lineTo(0.0f, 1.0f)
                lineTo(0.0f, 12.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, 5.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(4.0f)
                lineTo(0.0f, 21.0f)
                verticalLineToRelative(2.0f)
                lineTo(20.0f, 23.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(22.0f, 19.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 17.0f)
                close()
                moveTo(16.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 17.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
