package me.localx.icons.rounded.filled

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

public val Icons.Filled.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.044f, 1.02f)
                curveTo(24.2f, 0.761f, 25.71f, 9.091f, 21.5f, 12.932f)
                arcTo(6.708f, 6.708f, 0.0f, false, true, 16.8f, 15.0f)
                arcToRelative(9.816f, 9.816f, 0.0f, false, true, -3.8f, -0.7f)
                lineTo(13.0f, 5.38f)
                curveTo(15.018f, 3.134f, 17.512f, 1.02f, 20.044f, 1.02f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 4.0f)
                close()
                moveTo(16.791f, 17.0f)
                arcTo(11.685f, 11.685f, 0.0f, false, true, 12.0f, 16.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-2.1f, 1.11f, -7.2f, 1.783f, -10.213f, -1.025f)
                arcToRelative(6.606f, 6.606f, 0.0f, false, false, -0.454f, 5.136f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, false, 2.3f, 2.573f)
                arcToRelative(3.911f, 3.911f, 0.0f, false, false, 3.355f, -0.132f)
                arcTo(16.366f, 16.366f, 0.0f, false, false, 11.0f, 19.622f)
                lineTo(11.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(13.0f, 19.622f)
                arcToRelative(16.366f, 16.366f, 0.0f, false, false, 4.018f, 2.93f)
                arcToRelative(3.911f, 3.911f, 0.0f, false, false, 3.355f, 0.132f)
                arcToRelative(4.021f, 4.021f, 0.0f, false, false, 2.3f, -2.573f)
                arcToRelative(6.606f, 6.606f, 0.0f, false, false, -0.454f, -5.136f)
                arcTo(8.571f, 8.571f, 0.0f, false, true, 16.791f, 17.0f)
                close()
                moveTo(7.206f, 15.0f)
                arcTo(9.842f, 9.842f, 0.0f, false, false, 11.0f, 14.3f)
                lineTo(11.0f, 5.373f)
                curveTo(7.52f, 1.116f, 0.239f, -2.567f, 0.006f, 7.284f)
                arcToRelative(8.183f, 8.183f, 0.0f, false, false, 2.5f, 5.649f)
                arcTo(6.819f, 6.819f, 0.0f, false, false, 7.206f, 15.0f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
