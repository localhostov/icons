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

public val Icons.Bold.Auction: ImageVector
    get() {
        if (_auction != null) {
            return _auction!!
        }
        _auction = Builder(name = "Auction", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.142f, 14.864f)
                lineToRelative(-0.702f, 0.702f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(8.021f, -8.021f)
                lineToRelative(-2.121f, -2.121f)
                lineToRelative(-0.742f, 0.742f)
                lineToRelative(-5.397f, -5.384f)
                lineToRelative(0.738f, -0.738f)
                lineTo(12.939f, 0.043f)
                lineTo(4.937f, 8.045f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(0.685f, -0.685f)
                lineToRelative(1.632f, 1.628f)
                lineTo(0.045f, 20.439f)
                lineToRelative(2.121f, 2.121f)
                lineToRelative(9.334f, -9.333f)
                lineToRelative(1.641f, 1.637f)
                close()
                moveTo(13.434f, 6.253f)
                lineToRelative(2.933f, 2.926f)
                lineToRelative(-2.335f, 2.335f)
                lineToRelative(-2.933f, -2.926f)
                lineToRelative(2.335f, -2.335f)
                close()
                moveTo(24.001f, 21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _auction!!
    }

private var _auction: ImageVector? = null
