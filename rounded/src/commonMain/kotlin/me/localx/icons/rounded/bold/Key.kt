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

public val Icons.Bold.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                close()
                moveTo(9.5f, 23.861f)
                arcToRelative(7.939f, 7.939f, 0.0f, false, false, 6.065f, -5.261f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.32f, -3.85f)
                lineToRelative(0.681f, -0.689f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.434f, -1.061f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1.251f)
                arcToRelative(2.512f, 2.512f, 0.0f, false, false, 2.307f, -1.52f)
                arcToRelative(5.323f, 5.323f, 0.0f, false, false, 0.416f, -2.635f)
                arcToRelative(4.317f, 4.317f, 0.0f, false, false, -4.345f, -3.845f)
                arcToRelative(5.467f, 5.467f, 0.0f, false, false, -3.891f, 1.612f)
                lineToRelative(-6.5f, 6.5f)
                arcToRelative(7.776f, 7.776f, 0.0f, false, false, -3.84f, 0.326f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.627f, 15.562f)
                arcToRelative(8.131f, 8.131f, 0.0f, false, false, 1.475f, -0.139f)
                close()
                moveTo(9.315f, 11.2f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.463f, -0.385f)
                lineToRelative(7.081f, -7.08f)
                arcToRelative(2.487f, 2.487f, 0.0f, false, true, 1.77f, -0.735f)
                arcToRelative(1.342f, 1.342f, 0.0f, false, true, 1.36f, 1.149f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.08f, 0.851f)
                horizontalLineToRelative(-1.409f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(1.884f)
                lineToRelative(-0.822f, 0.831f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.378f, 1.459f)
                arcToRelative(4.923f, 4.923f, 0.0f, false, true, -0.074f, 2.955f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -6.36f, -6.352f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, 1.592f, -0.268f)
                arcToRelative(5.053f, 5.053f, 0.0f, false, true, 1.357f, 0.191f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
