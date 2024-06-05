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

public val Icons.Filled.Banner5: ImageVector
    get() {
        if (_banner5 != null) {
            return _banner5!!
        }
        _banner5 = Builder(name = "Banner5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.0f, 6.0f)
                reflectiveCurveToRelative(2.308f, -1.0f, 6.0f, -1.0f)
                reflectiveCurveToRelative(6.0f, 1.0f, 6.0f, 1.0f)
                verticalLineToRelative(8.0f)
                reflectiveCurveToRelative(-2.769f, -1.0f, -6.0f, -1.0f)
                reflectiveCurveToRelative(-6.0f, 1.0f, -6.0f, 1.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(6.676f, 15.805f)
                lineToRelative(-2.672f, 0.953f)
                lineToRelative(-0.002f, -6.39f)
                curveToRelative(-2.408f, 0.576f, -4.002f, 1.632f, -4.002f, 1.632f)
                verticalLineToRelative(0.068f)
                curveToRelative(1.5f, 0.932f, 3.0f, 2.932f, 3.0f, 2.932f)
                curveToRelative(0.0f, 0.0f, -1.808f, 2.038f, -3.0f, 4.932f)
                verticalLineToRelative(0.068f)
                curveToRelative(2.5f, -1.0f, 5.184f, -1.822f, 7.0f, -2.0f)
                verticalLineToRelative(-2.299f)
                curveToRelative(-0.201f, 0.062f, -0.319f, 0.103f, -0.324f, 0.104f)
                close()
                moveTo(24.0f, 12.068f)
                verticalLineToRelative(-0.068f)
                reflectiveCurveToRelative(-1.593f, -1.055f, -4.0f, -1.632f)
                verticalLineToRelative(6.403f)
                lineToRelative(-2.68f, -0.967f)
                reflectiveCurveToRelative(-0.121f, -0.042f, -0.32f, -0.103f)
                verticalLineToRelative(2.299f)
                curveToRelative(1.816f, 0.178f, 4.5f, 1.0f, 7.0f, 2.0f)
                verticalLineToRelative(-0.068f)
                curveToRelative(-1.192f, -2.893f, -3.0f, -4.932f, -3.0f, -4.932f)
                curveToRelative(0.0f, 0.0f, 1.5f, -2.0f, 3.0f, -2.932f)
                close()
            }
        }
        .build()
        return _banner5!!
    }

private var _banner5: ImageVector? = null
