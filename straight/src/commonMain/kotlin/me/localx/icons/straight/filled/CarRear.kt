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

public val Icons.Filled.CarRear: ImageVector
    get() {
        if (_carRear != null) {
            return _carRear!!
        }
        _carRear = Builder(name = "CarRear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.755f, 8.0f)
                lineToRelative(1.828f, -5.025f)
                curveToRelative(0.429f, -1.181f, 1.562f, -1.975f, 2.818f, -1.975f)
                horizontalLineToRelative(11.199f)
                curveToRelative(1.257f, 0.0f, 2.39f, 0.793f, 2.818f, 1.975f)
                lineToRelative(1.828f, 5.025f)
                lineTo(1.755f, 8.0f)
                close()
                moveTo(24.0f, 17.032f)
                verticalLineToRelative(1.968f)
                lineTo(0.0f, 19.0f)
                verticalLineToRelative(-1.968f)
                curveToRelative(0.0f, -1.019f, 0.082f, -2.03f, 0.215f, -3.032f)
                horizontalLineToRelative(3.785f)
                verticalLineToRelative(-2.0f)
                lineTo(0.562f, 12.0f)
                curveToRelative(0.148f, -0.672f, 0.316f, -1.34f, 0.52f, -2.0f)
                horizontalLineToRelative(21.837f)
                curveToRelative(0.204f, 0.66f, 0.372f, 1.328f, 0.52f, 2.0f)
                horizontalLineToRelative(-3.438f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.785f)
                curveToRelative(0.133f, 1.002f, 0.215f, 2.012f, 0.215f, 3.032f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 21.0f)
                close()
                moveTo(21.0f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _carRear!!
    }

private var _carRear: ImageVector? = null
