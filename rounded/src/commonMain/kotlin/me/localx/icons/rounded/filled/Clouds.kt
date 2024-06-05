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

public val Icons.Filled.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4f, 24.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.832f, -0.146f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.451f, -6.589f)
                arcToRelative(6.38f, 6.38f, 0.0f, false, true, 0.057f, -2.732f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.367f, -0.856f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.766f, 0.471f)
                arcToRelative(5.012f, 5.012f, 0.0f, false, true, 3.557f, 6.0f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, true, -3.7f, 3.7f)
                arcTo(5.322f, 5.322f, 0.0f, false, true, 19.1f, 24.0f)
                close()
                moveTo(6.0f, 16.23f)
                arcToRelative(8.262f, 8.262f, 0.0f, false, true, 0.23f, -2.169f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 21.106f, 12.3f)
                arcTo(7.043f, 7.043f, 0.0f, false, true, 24.0f, 14.081f)
                arcTo(7.954f, 7.954f, 0.0f, false, false, 18.356f, 6.36f)
                arcToRelative(1.087f, 1.087f, 0.0f, false, true, -0.722f, -0.733f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 0.842f)
                arcToRelative(7.648f, 7.648f, 0.0f, false, false, 0.8f, 5.179f)
                arcTo(5.448f, 5.448f, 0.0f, false, false, 0.056f, 17.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.1f, 4.472f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 6.0f, 16.23f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
