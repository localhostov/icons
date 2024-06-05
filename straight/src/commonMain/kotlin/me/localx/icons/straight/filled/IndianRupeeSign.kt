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

public val Icons.Filled.IndianRupeeSign: ImageVector
    get() {
        if (_indianRupeeSign != null) {
            return _indianRupeeSign!!
        }
        _indianRupeeSign = Builder(name = "IndianRupeeSign", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 2.0f)
                curveToRelative(1.13f, 1.05f, 1.93f, 2.44f, 2.25f, 4.0f)
                horizontalLineToRelative(4.15f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.03f)
                curveToRelative(-0.26f, 3.9f, -3.51f, 7.0f, -7.47f, 7.0f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(10.76f, 9.0f)
                horizontalLineToRelative(-3.13f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(2.86f, 0.0f, 5.22f, -2.2f, 5.47f, -5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(14.79f)
                curveToRelative(-0.66f, -2.3f, -2.77f, -4.0f, -5.29f, -4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-6.41f)
                close()
            }
        }
        .build()
        return _indianRupeeSign!!
    }

private var _indianRupeeSign: ImageVector? = null
