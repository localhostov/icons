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

public val Icons.Bold.Candy: ImageVector
    get() {
        if (_candy != null) {
            return _candy!!
        }
        _candy = Builder(name = "Candy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.0f)
                arcToRelative(6.854f, 6.854f, 0.0f, false, false, -6.984f, -7.0f)
                lineTo(17.016f, 3.9f)
                arcToRelative(8.969f, 8.969f, 0.0f, false, false, -4.008f, -0.887f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 6.064f, 6.065f)
                arcTo(9.994f, 9.994f, 0.0f, false, false, 3.0f, 13.0f)
                arcToRelative(8.973f, 8.973f, 0.0f, false, false, 0.888f, 4.012f)
                lineTo(0.0f, 17.0f)
                arcToRelative(6.835f, 6.835f, 0.0f, false, false, 7.0f, 7.0f)
                lineTo(7.0f, 20.115f)
                arcTo(8.977f, 8.977f, 0.0f, false, false, 11.0f, 21.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 6.943f, -3.055f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 3.063f, -6.935f)
                arcTo(8.977f, 8.977f, 0.0f, false, false, 20.119f, 7.0f)
                close()
                moveTo(15.822f, 15.823f)
                arcTo(6.992f, 6.992f, 0.0f, false, true, 11.0f, 18.0f)
                arcToRelative(5.233f, 5.233f, 0.0f, false, true, -3.453f, -1.071f)
                lineToRelative(-0.469f, -0.47f)
                arcTo(5.2f, 5.2f, 0.0f, false, true, 6.0f, 13.0f)
                arcTo(6.987f, 6.987f, 0.0f, false, true, 8.185f, 8.186f)
                arcToRelative(6.994f, 6.994f, 0.0f, false, true, 4.823f, -2.177f)
                arcTo(5.22f, 5.22f, 0.0f, false, true, 16.449f, 7.07f)
                lineToRelative(0.48f, 0.478f)
                arcToRelative(5.206f, 5.206f, 0.0f, false, true, 1.077f, 3.46f)
                arcTo(6.988f, 6.988f, 0.0f, false, true, 15.822f, 15.821f)
                close()
                moveTo(11.938f, 12.528f)
                lineTo(14.061f, 14.649f)
                arcToRelative(4.584f, 4.584f, 0.0f, false, true, -2.511f, 1.308f)
                arcToRelative(3.784f, 3.784f, 0.0f, false, true, -0.576f, 0.045f)
                arcToRelative(3.063f, 3.063f, 0.0f, false, true, -2.194f, -0.865f)
                lineTo(10.9f, 13.014f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.036f, -0.027f)
                arcTo(1.3f, 1.3f, 0.0f, false, false, 11.938f, 12.526f)
                close()
            }
        }
        .build()
        return _candy!!
    }

private var _candy: ImageVector? = null
