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

public val Icons.Filled.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.327f, 12.4f)
                lineTo(4.887f, 15.0f)
                lineTo(3.535f, 19.187f)
                arcTo(3.178f, 3.178f, 0.0f, false, false, 4.719f, 22.8f)
                arcToRelative(3.177f, 3.177f, 0.0f, false, false, 3.8f, -0.019f)
                lineTo(12.0f, 20.219f)
                lineToRelative(3.482f, 2.559f)
                arcToRelative(3.227f, 3.227f, 0.0f, false, false, 4.983f, -3.591f)
                lineTo(19.113f, 15.0f)
                lineToRelative(3.56f, -2.6f)
                arcToRelative(3.227f, 3.227f, 0.0f, false, false, -1.9f, -5.832f)
                horizontalLineTo(16.4f)
                lineTo(15.073f, 2.432f)
                arcToRelative(3.227f, 3.227f, 0.0f, false, false, -6.146f, 0.0f)
                lineTo(7.6f, 6.568f)
                horizontalLineTo(3.231f)
                arcToRelative(3.227f, 3.227f, 0.0f, false, false, -1.9f, 5.832f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
