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

public val Icons.Bold.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 0.0f, 12.0f)
                curveTo(0.6f, -3.9f, 23.4f, -3.893f, 24.0f, 12.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 3.0f)
                arcToRelative(9.011f, 9.011f, 0.0f, false, false, -9.0f, 9.0f)
                curveToRelative(0.453f, 11.923f, 17.549f, 11.92f, 18.0f, 0.0f)
                arcTo(9.011f, 9.011f, 0.0f, false, false, 12.0f, 3.0f)
                close()
                moveTo(16.789f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 12.0f, 15.0f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 7.2f, 14.024f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.052f, 1.518f)
                arcTo(6.836f, 6.836f, 0.0f, false, false, 12.0f, 19.0f)
                arcToRelative(6.827f, 6.827f, 0.0f, false, false, 5.842f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.789f, 14.024f)
                close()
                moveTo(7.944f, 11.762f)
                lineToRelative(1.343f, 0.988f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, false, 1.134f, -0.818f)
                lineTo(9.9f, 10.326f)
                lineToRelative(1.366f, -1.0f)
                arcTo(0.734f, 0.734f, 0.0f, false, false, 10.835f, 8.0f)
                lineTo(9.154f, 8.0f)
                lineTo(8.643f, 6.407f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, false, -1.4f, 0.0f)
                lineTo(6.733f, 8.0f)
                lineTo(5.052f, 8.0f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, false, -0.433f, 1.327f)
                lineToRelative(1.366f, 1.0f)
                lineToRelative(-0.519f, 1.606f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, 0.27f, 0.822f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, false, 0.864f, 0.0f)
                close()
                moveTo(15.963f, 11.762f)
                lineTo(17.306f, 12.75f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, false, 1.134f, -0.818f)
                lineToRelative(-0.519f, -1.606f)
                lineToRelative(1.366f, -1.0f)
                arcTo(0.734f, 0.734f, 0.0f, false, false, 18.854f, 8.0f)
                lineTo(17.173f, 8.0f)
                lineToRelative(-0.511f, -1.593f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, false, -1.4f, 0.0f)
                lineTo(14.753f, 8.0f)
                lineTo(13.072f, 8.0f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, false, -0.434f, 1.327f)
                lineToRelative(1.367f, 1.0f)
                lineToRelative(-0.52f, 1.606f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, false, 0.27f, 0.822f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, false, 0.864f, 0.0f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
