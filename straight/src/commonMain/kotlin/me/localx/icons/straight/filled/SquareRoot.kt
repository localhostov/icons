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

public val Icons.Filled.SquareRoot: ImageVector
    get() {
        if (_squareRoot != null) {
            return _squareRoot!!
        }
        _squareRoot = Builder(name = "SquareRoot", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.76f, 22.0f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(-3.761f, -10.342f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.939f, -0.658f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.6f)
                arcToRelative(3.007f, 3.007f, 0.0f, false, true, 2.819f, 1.975f)
                lineToRelative(3.021f, 8.307f)
                lineToRelative(4.19f, -15.082f)
                arcToRelative(3.009f, 3.009f, 0.0f, false, true, 2.891f, -2.2f)
                horizontalLineToRelative(9.479f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.479f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.964f, 0.732f)
                close()
                moveTo(20.693f, 17.0f)
                lineTo(24.0f, 12.0f)
                horizontalLineToRelative(-2.385f)
                lineToRelative(-2.115f, 3.2f)
                lineToRelative(-2.115f, -3.2f)
                horizontalLineToRelative(-2.385f)
                lineToRelative(3.307f, 5.0f)
                lineToRelative(-3.307f, 5.0f)
                horizontalLineToRelative(2.385f)
                lineToRelative(2.115f, -3.2f)
                lineToRelative(2.115f, 3.2f)
                horizontalLineToRelative(2.385f)
                close()
            }
        }
        .build()
        return _squareRoot!!
    }

private var _squareRoot: ImageVector? = null
