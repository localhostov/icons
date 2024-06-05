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

public val Icons.Bold.Watermelon: ImageVector
    get() {
        if (_watermelon != null) {
            return _watermelon!!
        }
        _watermelon = Builder(name = "Watermelon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.229f, 24.007f)
                arcToRelative(14.749f, 14.749f, 0.0f, false, true, -6.712f, -1.619f)
                arcTo(4.56f, 4.56f, 0.0f, false, true, 0.063f, 19.0f)
                arcToRelative(4.7f, 4.7f, 0.0f, false, true, 1.312f, -4.045f)
                lineTo(14.953f, 1.375f)
                arcTo(4.707f, 4.707f, 0.0f, false, true, 19.0f, 0.063f)
                arcToRelative(4.56f, 4.56f, 0.0f, false, true, 3.39f, 2.454f)
                arcTo(14.788f, 14.788f, 0.0f, false, true, 9.229f, 24.007f)
                close()
                moveTo(18.257f, 3.0f)
                arcToRelative(1.659f, 1.659f, 0.0f, false, false, -1.184f, 0.492f)
                horizontalLineToRelative(0.0f)
                lineTo(3.5f, 17.073f)
                arcToRelative(1.673f, 1.673f, 0.0f, false, false, -0.47f, 1.457f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.854f, 1.188f)
                arcTo(11.778f, 11.778f, 0.0f, false, false, 19.717f, 3.879f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -1.188f, -0.854f)
                arcTo(1.79f, 1.79f, 0.0f, false, false, 18.257f, 3.0f)
                close()
                moveTo(18.614f, 7.764f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, false, -1.966f, -0.751f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, false, -0.635f, 0.635f)
                arcToRelative(5.393f, 5.393f, 0.0f, false, false, 0.752f, 1.966f)
                arcToRelative(1.308f, 1.308f, 0.0f, true, false, 1.849f, -1.85f)
                close()
                moveTo(13.614f, 15.764f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -1.966f, -0.751f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, false, -0.635f, 0.634f)
                arcToRelative(5.391f, 5.391f, 0.0f, false, false, 0.752f, 1.967f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, false, 1.849f, -1.85f)
                close()
                moveTo(16.614f, 12.764f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, false, -1.966f, -0.751f)
                arcToRelative(0.526f, 0.526f, 0.0f, false, false, -0.635f, 0.635f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, false, 0.751f, 1.966f)
                arcToRelative(1.308f, 1.308f, 0.0f, false, false, 1.85f, -1.85f)
                close()
                moveTo(8.614f, 16.764f)
                arcToRelative(5.386f, 5.386f, 0.0f, false, false, -1.966f, -0.752f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, false, -0.635f, 0.635f)
                arcToRelative(5.386f, 5.386f, 0.0f, false, false, 0.752f, 1.966f)
                arcToRelative(1.307f, 1.307f, 0.0f, true, false, 1.849f, -1.849f)
                close()
            }
        }
        .build()
        return _watermelon!!
    }

private var _watermelon: ImageVector? = null
