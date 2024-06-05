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

public val Icons.Filled.Cars: ImageVector
    get() {
        if (_cars != null) {
            return _cars!!
        }
        _cars = Builder(name = "Cars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.348f, 14.0f)
                lineTo(7.652f, 14.0f)
                lineTo(9.084f, 9.991f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 11.91f, 8.0f)
                horizontalLineToRelative(7.18f)
                arcToRelative(3.006f, 3.006f, 0.0f, false, true, 2.826f, 1.991f)
                close()
                moveTo(24.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                lineTo(7.0f, 17.732f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 7.142f, 16.0f)
                lineTo(23.858f, 16.0f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 24.0f, 17.732f)
                close()
                moveTo(11.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 18.0f)
                close()
                moveTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 20.0f)
                close()
                moveTo(2.0f, 16.0f)
                lineTo(2.0f, 14.0f)
                lineTo(0.0f, 14.0f)
                lineTo(0.0f, 9.732f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 0.142f, 8.0f)
                lineTo(7.915f, 8.0f)
                arcTo(4.964f, 4.964f, 0.0f, false, false, 7.2f, 9.318f)
                lineToRelative(-1.432f, 4.01f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, -0.6f, 2.357f)
                curveToRelative(-0.017f, 0.1f, -0.024f, 0.21f, -0.038f, 0.315f)
                close()
                moveTo(4.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 12.0f)
                close()
                moveTo(16.348f, 6.0f)
                lineTo(14.916f, 1.991f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 12.09f, 0.0f)
                lineTo(4.91f, 0.0f)
                arcTo(3.006f, 3.006f, 0.0f, false, false, 2.084f, 1.991f)
                lineTo(0.652f, 6.0f)
                close()
            }
        }
        .build()
        return _cars!!
    }

private var _cars: ImageVector? = null
