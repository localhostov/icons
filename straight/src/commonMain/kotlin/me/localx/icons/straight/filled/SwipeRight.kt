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

public val Icons.Filled.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.494f, 5.291f)
                lineToRelative(-2.762f, 2.762f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.638f, -1.639f)
                horizontalLineToRelative(-7.956f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(7.892f)
                lineToRelative(-1.574f, -1.574f)
                lineTo(20.732f, 0.012f)
                lineToRelative(2.761f, 2.762f)
                curveToRelative(0.693f, 0.693f, 0.694f, 1.822f, 0.0f, 2.518f)
                close()
                moveTo(10.0f, 2.107f)
                curveToRelative(0.0f, -0.996f, -0.681f, -1.92f, -1.664f, -2.08f)
                curveToRelative(-1.253f, -0.204f, -2.336f, 0.758f, -2.336f, 1.973f)
                verticalLineToRelative(14.899f)
                lineToRelative(-2.252f, -2.292f)
                curveToRelative(-0.097f, -0.097f, -0.265f, -0.222f, -0.487f, -0.367f)
                curveToRelative(-0.931f, -0.519f, -2.157f, -0.313f, -2.853f, 0.619f)
                curveToRelative(-0.667f, 0.894f, -0.482f, 2.169f, 0.305f, 2.958f)
                lineToRelative(6.037f, 6.182f)
                horizontalLineToRelative(15.25f)
                verticalLineToRelative(-10.808f)
                lineToRelative(-12.0f, -3.192f)
                lineTo(10.0f, 2.107f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
