package me.localx.icons.rounded.outline

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

public val Icons.Outline.GrinStars: ImageVector
    get() {
        if (_grinStars != null) {
            return _grinStars!!
        }
        _grinStars = Builder(name = "GrinStars", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.6f, 15.9f, 23.4f, 15.893f, 24.0f, 0.0f)
                arcTo(12.013f, 12.013f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 2.0f, 12.0f)
                curveTo(2.5f, -1.248f, 21.5f, -1.245f, 22.0f, 12.0f)
                arcTo(10.011f, 10.011f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(17.842f, 15.542f)
                arcTo(6.827f, 6.827f, 0.0f, false, true, 12.0f, 19.0f)
                arcToRelative(6.836f, 6.836f, 0.0f, false, true, -5.848f, -3.458f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.2f, 14.024f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 12.0f, 15.0f)
                arcToRelative(15.4f, 15.4f, 0.0f, false, false, 4.792f, -0.976f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.842f, 15.542f)
                close()
                moveTo(5.736f, 12.754f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, true, -0.27f, -0.822f)
                lineToRelative(0.519f, -1.606f)
                lineToRelative(-1.366f, -1.0f)
                arcTo(0.734f, 0.734f, 0.0f, false, true, 5.052f, 8.0f)
                lineTo(6.733f, 8.0f)
                lineToRelative(0.511f, -1.593f)
                arcToRelative(0.738f, 0.738f, 0.0f, false, true, 1.4f, 0.0f)
                lineTo(9.154f, 8.0f)
                horizontalLineToRelative(1.681f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 0.433f, 1.327f)
                lineToRelative(-1.366f, 1.0f)
                lineToRelative(0.519f, 1.606f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, true, -1.134f, 0.818f)
                lineToRelative(-1.343f, -0.988f)
                lineTo(6.6f, 12.75f)
                arcTo(0.728f, 0.728f, 0.0f, false, true, 5.736f, 12.754f)
                close()
                moveTo(19.287f, 9.327f)
                lineToRelative(-1.366f, 1.0f)
                lineToRelative(0.519f, 1.606f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, true, -1.134f, 0.818f)
                lineToRelative(-1.343f, -0.988f)
                lineToRelative(-1.344f, 0.988f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, -0.864f, 0.0f)
                arcToRelative(0.715f, 0.715f, 0.0f, false, true, -0.27f, -0.822f)
                lineToRelative(0.52f, -1.606f)
                lineToRelative(-1.367f, -1.0f)
                arcTo(0.734f, 0.734f, 0.0f, false, true, 13.071f, 8.0f)
                horizontalLineToRelative(1.682f)
                lineToRelative(0.511f, -1.593f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, true, 1.4f, 0.0f)
                lineTo(17.173f, 8.0f)
                horizontalLineToRelative(1.681f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, 0.433f, 1.327f)
                close()
            }
        }
        .build()
        return _grinStars!!
    }

private var _grinStars: ImageVector? = null
