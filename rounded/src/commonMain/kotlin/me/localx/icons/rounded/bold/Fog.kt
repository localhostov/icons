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

public val Icons.Bold.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 24.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 24.0f)
                close()
                moveTo(19.0f, 22.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 21.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 22.5f)
                close()
                moveTo(19.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 16.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.0f, 17.5f)
                close()
                moveTo(9.0f, 17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 16.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 17.5f)
                close()
                moveTo(2.849f, 17.794f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.535f, -2.053f)
                arcToRelative(2.731f, 2.731f, 0.0f, false, true, 0.53f, -3.424f)
                arcTo(3.411f, 3.411f, 0.0f, false, false, 5.0f, 9.174f)
                arcToRelative(5.347f, 5.347f, 0.0f, false, true, -0.021f, -1.889f)
                arcToRelative(5.184f, 5.184f, 0.0f, false, true, 9.792f, -1.32f)
                arcToRelative(3.42f, 3.42f, 0.0f, false, false, 2.448f, 1.9f)
                arcToRelative(4.723f, 4.723f, 0.0f, false, true, 3.164f, 6.924f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 2.64f, 1.424f)
                arcTo(7.741f, 7.741f, 0.0f, false, false, 17.812f, 4.923f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.325f, -0.242f)
                arcTo(8.239f, 8.239f, 0.0f, false, false, 8.559f, 0.141f)
                arcTo(8.13f, 8.13f, 0.0f, false, false, 2.024f, 6.794f)
                arcToRelative(8.325f, 8.325f, 0.0f, false, false, 0.035f, 2.95f)
                arcTo(0.431f, 0.431f, 0.0f, false, true, 1.9f, 10.1f)
                arcTo(5.753f, 5.753f, 0.0f, false, false, 0.8f, 17.259f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.053f, 0.535f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
