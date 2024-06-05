package me.localx.icons.rounded.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Outline.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 11.0f)
                close()
                moveTo(8.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.589f, 6.7f)
                lineTo(13.751f, 0.849f)
                arcTo(4.959f, 4.959f, 0.0f, false, false, 8.043f, 0.96f)
                arcTo(19.887f, 19.887f, 0.0f, false, false, 1.1f, 10.569f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, false, -0.032f, 0.156f)
                arcToRelative(5.083f, 5.083f, 0.0f, false, false, -0.283f, 0.669f)
                arcToRelative(13.86f, 13.86f, 0.0f, false, false, 0.0f, 9.213f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.525f, 24.0f)
                horizontalLineTo(9.149f)
                arcToRelative(2.039f, 2.039f, 0.0f, false, false, 1.922f, -1.457f)
                arcToRelative(1.509f, 1.509f, 0.0f, false, true, 2.858f, 0.0f)
                arcTo(2.039f, 2.039f, 0.0f, false, false, 15.851f, 24.0f)
                horizontalLineTo(19.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineTo(11.507f)
                arcTo(6.026f, 6.026f, 0.0f, false, false, 21.589f, 6.7f)
                close()
                moveTo(9.24f, 2.562f)
                arcToRelative(2.941f, 2.941f, 0.0f, false, true, 3.359f, -0.08f)
                lineTo(19.989f, 8.0f)
                horizontalLineTo(5.526f)
                arcToRelative(4.975f, 4.975f, 0.0f, false, false, -1.156f, 0.135f)
                arcTo(18.189f, 18.189f, 0.0f, false, true, 9.24f, 2.562f)
                close()
                moveTo(22.0f, 19.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                lineToRelative(-3.166f, -0.066f)
                arcTo(3.511f, 3.511f, 0.0f, false, false, 9.149f, 22.0f)
                horizontalLineTo(5.525f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.843f, -2.038f)
                arcToRelative(11.869f, 11.869f, 0.0f, false, true, 0.0f, -7.923f)
                arcTo(3.006f, 3.006f, 0.0f, false, true, 5.526f, 10.0f)
                horizontalLineTo(21.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.3f, 1.507f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
