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

public val Icons.Outline.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.948f, 24.0f)
                horizontalLineTo(4.052f)
                arcTo(4.03f, 4.03f, 0.0f, false, true, 0.6f, 22.088f)
                arcToRelative(3.947f, 3.947f, 0.0f, false, true, -0.182f, -3.86f)
                lineTo(8.38f, 4.212f)
                arcToRelative(4.068f, 4.068f, 0.0f, false, true, 7.253f, 0.026f)
                lineToRelative(7.922f, 13.941f)
                arcToRelative(3.967f, 3.967f, 0.0f, false, true, -0.156f, 3.909f)
                arcTo(4.03f, 4.03f, 0.0f, false, true, 19.948f, 24.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(2.013f, 2.013f, 0.0f, false, false, -1.842f, 1.129f)
                lineToRelative(-0.026f, 0.049f)
                lineTo(2.184f, 19.167f)
                arcTo(1.919f, 1.919f, 0.0f, false, false, 2.3f, 21.034f)
                arcTo(2.044f, 2.044f, 0.0f, false, false, 4.052f, 22.0f)
                horizontalLineToRelative(15.9f)
                arcToRelative(2.044f, 2.044f, 0.0f, false, false, 1.752f, -0.966f)
                arcToRelative(1.937f, 1.937f, 0.0f, false, false, 0.09f, -1.916f)
                lineTo(13.868f, 5.178f)
                arcTo(2.039f, 2.039f, 0.0f, false, false, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null
