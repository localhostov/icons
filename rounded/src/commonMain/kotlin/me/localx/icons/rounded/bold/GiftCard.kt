package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.GiftCard: ImageVector
    get() {
        if (_giftCard != null) {
            return _giftCard!!
        }
        _giftCard = Builder(name = "GiftCard", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 5.0f)
                horizontalLineToRelative(-0.559f)
                curveToRelative(1.197f, -1.176f, 1.427f, -2.655f, 0.51f, -3.878f)
                curveToRelative(-0.93f, -1.24f, -2.688f, -1.491f, -3.928f, -0.561f)
                curveToRelative(-1.652f, 1.239f, -2.327f, 3.389f, -2.523f, 4.439f)
                curveToRelative(-0.195f, -1.05f, -0.845f, -3.2f, -2.497f, -4.439f)
                curveToRelative(-1.24f, -0.93f, -2.998f, -0.678f, -3.928f, 0.561f)
                curveToRelative(-0.917f, 1.222f, -0.687f, 2.702f, 0.51f, 3.878f)
                horizontalLineToRelative(-0.585f)
                curveTo(2.467f, 5.0f, 0.0f, 7.468f, 0.0f, 10.5f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 3.032f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.468f, 5.5f, -5.5f)
                lineTo(24.0f, 10.5f)
                curveToRelative(0.0f, -3.032f, -2.467f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(18.5f, 21.0f)
                lineTo(5.5f, 21.0f)
                curveToRelative(-1.207f, 0.0f, -2.217f, -0.86f, -2.45f, -2.0f)
                lineTo(20.95f, 19.0f)
                curveToRelative(-0.232f, 1.14f, -1.242f, 2.0f, -2.45f, 2.0f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0.0f, -1.379f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.828f)
                curveToRelative(-0.619f, 1.659f, -2.716f, 1.975f, -3.001f, 2.01f)
                curveToRelative(-0.82f, 0.095f, -1.41f, 0.835f, -1.318f, 1.656f)
                curveToRelative(0.085f, 0.767f, 0.737f, 1.334f, 1.491f, 1.334f)
                curveToRelative(1.5f, 0.0f, 3.208f, -0.744f, 4.5f, -2.102f)
                curveToRelative(1.292f, 1.358f, 3.0f, 2.102f, 4.5f, 2.102f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.754f, 0.0f, 1.404f, -0.567f, 1.489f, -1.334f)
                curveToRelative(0.092f, -0.823f, -0.502f, -1.565f, -1.325f, -1.657f)
                curveToRelative(-0.11f, -0.012f, -2.351f, -0.283f, -2.994f, -2.009f)
                horizontalLineToRelative(4.828f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                close()
            }
        }
        .build()
        return _giftCard!!
    }

private var _giftCard: ImageVector? = null
