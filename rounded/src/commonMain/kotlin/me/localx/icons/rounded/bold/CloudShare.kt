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

public val Icons.Bold.CloudShare: ImageVector
    get() {
        if (_cloudShare != null) {
            return _cloudShare!!
        }
        _cloudShare = Builder(name = "CloudShare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.014f)
                lineToRelative(-2.5f, -1.43f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, -1.5f, 0.416f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, 1.5f, 0.416f)
                lineToRelative(2.5f, -1.43f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 3.0f, 3.014f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, -1.5f, -0.416f)
                lineToRelative(-2.477f, 1.416f)
                lineToRelative(2.477f, 1.416f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, true, 1.5f, -0.416f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                close()
                moveTo(9.308f, 3.057f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, 3.909f, 0.989f)
                arcToRelative(5.109f, 5.109f, 0.0f, false, true, 2.0f, 3.418f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.29f, 1.288f)
                arcToRelative(5.191f, 5.191f, 0.0f, false, true, 1.0f, 0.237f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.976f, -2.837f)
                quadToRelative(-0.254f, -0.087f, -0.515f, -0.158f)
                arcToRelative(8.176f, 8.176f, 0.0f, false, false, -9.086f, -5.907f)
                arcToRelative(8.053f, 8.053f, 0.0f, false, false, -6.736f, 6.5f)
                arcToRelative(8.111f, 8.111f, 0.0f, false, false, 0.541f, 4.825f)
                arcToRelative(5.763f, 5.763f, 0.0f, false, false, -2.5f, 6.3f)
                arcToRelative(5.884f, 5.884f, 0.0f, false, false, 5.781f, 4.288f)
                horizontalLineToRelative(2.532f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                horizontalLineToRelative(-2.532f)
                arcToRelative(2.926f, 2.926f, 0.0f, false, true, -2.875f, -2.038f)
                arcToRelative(2.765f, 2.765f, 0.0f, false, true, 1.444f, -3.157f)
                arcToRelative(2.482f, 2.482f, 0.0f, false, false, 1.012f, -3.355f)
                arcToRelative(5.117f, 5.117f, 0.0f, false, true, -0.456f, -3.3f)
                arcToRelative(5.052f, 5.052f, 0.0f, false, true, 4.215f, -4.093f)
                close()
            }
        }
        .build()
        return _cloudShare!!
    }

private var _cloudShare: ImageVector? = null
