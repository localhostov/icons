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

public val Icons.Filled.Dungeon: ImageVector
    get() {
        if (_dungeon != null) {
            return _dungeon!!
        }
        _dungeon = Builder(name = "Dungeon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.139f, 5.725f)
                lineToRelative(-3.604f, -3.604f)
                curveTo(7.098f, 0.979f, 8.967f, 0.235f, 11.0f, 0.051f)
                lineTo(11.0f, 5.09f)
                curveToRelative(-0.663f, 0.111f, -1.291f, 0.325f, -1.861f, 0.635f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(1.0f, 11.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.651f, 9.0f)
                horizontalLineToRelative(5.158f)
                curveToRelative(-0.394f, -2.132f, -1.403f, -4.045f, -2.837f, -5.558f)
                lineToRelative(-3.532f, 3.532f)
                curveToRelative(0.529f, 0.583f, 0.943f, 1.269f, 1.211f, 2.026f)
                close()
                moveTo(14.861f, 5.725f)
                lineToRelative(3.604f, -3.604f)
                curveTo(16.902f, 0.979f, 15.033f, 0.235f, 13.0f, 0.051f)
                lineTo(13.0f, 5.09f)
                curveToRelative(0.663f, 0.111f, 1.291f, 0.325f, 1.861f, 0.635f)
                close()
                moveTo(7.56f, 6.974f)
                lineToRelative(-3.532f, -3.532f)
                curveToRelative(-1.434f, 1.512f, -2.444f, 3.426f, -2.837f, 5.558f)
                lineTo(6.349f, 9.0f)
                curveToRelative(0.268f, -0.757f, 0.683f, -1.443f, 1.211f, -2.026f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(1.0f, 16.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(6.0f, 21.0f)
                lineTo(1.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 24.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 24.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 7.141f)
                lineTo(13.0f, 24.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 11.0f)
                curveToRelative(0.0f, -1.862f, -1.278f, -3.413f, -3.0f, -3.859f)
                close()
                moveTo(11.0f, 7.141f)
                curveToRelative(-1.722f, 0.446f, -3.0f, 1.997f, -3.0f, 3.859f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 7.141f)
                close()
            }
        }
        .build()
        return _dungeon!!
    }

private var _dungeon: ImageVector? = null
