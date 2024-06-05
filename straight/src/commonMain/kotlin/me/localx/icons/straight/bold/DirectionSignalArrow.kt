package me.localx.icons.straight.bold

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

public val Icons.Bold.DirectionSignalArrow: ImageVector
    get() {
        if (_directionSignalArrow != null) {
            return _directionSignalArrow!!
        }
        _directionSignalArrow = Builder(name = "DirectionSignalArrow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.543f)
                curveToRelative(0.0f, 0.667f, -0.26f, 1.295f, -0.732f, 1.768f)
                lineToRelative(-3.75f, 3.75f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(1.896f, -1.896f)
                horizontalLineToRelative(-3.293f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(7.457f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.378f, -1.122f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.293f)
                lineToRelative(1.896f, 1.896f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-3.75f, -3.75f)
                curveToRelative(-0.975f, -0.975f, -0.975f, -2.561f, 0.0f, -3.535f)
                lineToRelative(3.75f, -3.75f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(-1.896f, 1.896f)
                horizontalLineToRelative(3.293f)
                curveToRelative(0.9f, 0.0f, 1.75f, 0.217f, 2.5f, 0.602f)
                verticalLineTo(4.707f)
                lineToRelative(-1.896f, 1.896f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(3.75f, -3.75f)
                curveToRelative(0.975f, -0.975f, 2.561f, -0.975f, 3.535f, 0.0f)
                lineToRelative(3.75f, 3.75f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.896f, -1.896f)
                verticalLineToRelative(6.938f)
                curveToRelative(0.75f, -0.385f, 1.6f, -0.602f, 2.5f, -0.602f)
                horizontalLineToRelative(3.293f)
                lineToRelative(-1.896f, -1.896f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(3.75f, 3.75f)
                curveToRelative(0.472f, 0.471f, 0.732f, 1.099f, 0.732f, 1.768f)
                close()
            }
        }
        .build()
        return _directionSignalArrow!!
    }

private var _directionSignalArrow: ImageVector? = null
