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

public val Icons.Filled.GrinTongueWink: ImageVector
    get() {
        if (_grinTongueWink != null) {
            return _grinTongueWink!!
        }
        _grinTongueWink = Builder(name = "GrinTongueWink", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(-0.062f, 1.839f, -1.939f, 1.837f, -2.0f, 0.0f)
                close()
                moveTo(24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                curveTo(-3.9f, 23.4f, -3.893f, 0.6f, 12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 24.0f, 12.0f)
                close()
                moveTo(6.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                lineTo(10.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(17.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(0.6f)
                curveToRelative(0.133f, 4.495f, 5.87f, 4.49f, 6.0f, 0.0f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _grinTongueWink!!
    }

private var _grinTongueWink: ImageVector? = null
