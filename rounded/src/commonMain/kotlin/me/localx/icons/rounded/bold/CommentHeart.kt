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

public val Icons.Bold.CommentHeart: ImageVector
    get() {
        if (_commentHeart != null) {
            return _commentHeart!!
        }
        _commentHeart = Builder(name = "CommentHeart", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 24.0f)
                horizontalLineTo(13.034f)
                curveTo(5.711f, 24.143f, -0.746f, 18.255f, 0.056f, 10.885f)
                arcTo(12.024f, 12.024f, 0.0f, false, true, 9.908f, 0.188f)
                arcToRelative(11.646f, 11.646f, 0.0f, false, true, 9.654f, 2.569f)
                arcTo(12.451f, 12.451f, 0.0f, false, true, 24.0f, 12.324f)
                verticalLineTo(18.5f)
                arcTo(5.506f, 5.506f, 0.0f, false, true, 18.5f, 24.0f)
                close()
                moveTo(12.03f, 3.0f)
                arcToRelative(9.021f, 9.021f, 0.0f, false, false, -8.988f, 8.164f)
                arcToRelative(8.512f, 8.512f, 0.0f, false, false, 2.179f, 6.605f)
                arcTo(10.5f, 10.5f, 0.0f, false, false, 13.034f, 21.0f)
                horizontalLineTo(18.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 18.5f)
                verticalLineTo(12.324f)
                arcToRelative(9.46f, 9.46f, 0.0f, false, false, -3.367f, -7.27f)
                arcTo(8.63f, 8.63f, 0.0f, false, false, 12.03f, 3.0f)
                close()
                moveTo(14.5f, 8.0f)
                arcTo(2.634f, 2.634f, 0.0f, false, false, 12.0f, 10.75f)
                arcToRelative(2.509f, 2.509f, 0.0f, true, false, -5.0f, 0.0f)
                curveToRelative(0.0f, 2.163f, 2.82f, 4.851f, 4.225f, 5.978f)
                arcToRelative(1.239f, 1.239f, 0.0f, false, false, 1.55f, 0.0f)
                curveTo(14.18f, 15.6f, 17.0f, 12.913f, 17.0f, 10.75f)
                arcTo(2.634f, 2.634f, 0.0f, false, false, 14.5f, 8.0f)
                close()
            }
        }
        .build()
        return _commentHeart!!
    }

private var _commentHeart: ImageVector? = null
