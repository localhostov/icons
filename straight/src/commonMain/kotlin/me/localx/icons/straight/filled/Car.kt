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

public val Icons.Filled.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 24.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(17.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                lineTo(21.0f, 21.0f)
                close()
                moveTo(23.221f, 11.0f)
                curveToRelative(-0.188f, -0.718f, -0.4f, -1.429f, -0.659f, -2.131f)
                lineTo(20.418f, 2.975f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 17.6f, 1.0f)
                lineTo(6.4f, 1.0f)
                arcTo(3.007f, 3.007f, 0.0f, false, false, 3.582f, 2.975f)
                lineTo(1.438f, 8.869f)
                curveTo(1.183f, 9.571f, 0.967f, 10.282f, 0.779f, 11.0f)
                close()
                moveTo(24.0f, 17.032f)
                lineTo(24.0f, 19.0f)
                lineTo(0.0f, 19.0f)
                lineTo(0.0f, 17.032f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 0.346f, 13.0f)
                lineTo(23.654f, 13.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 24.0f, 17.032f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineTo(4.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineTo(5.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(6.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 15.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
