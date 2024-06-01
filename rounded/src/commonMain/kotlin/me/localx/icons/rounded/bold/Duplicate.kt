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

public val Icons.Bold.Duplicate: ImageVector
    get() {
        if (_duplicate != null) {
            return _duplicate!!
        }
        _duplicate = Builder(name = "Duplicate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.521f, 1.729f)
                curveTo(19.4854f, 0.6279f, 18.0416f, 0.0024f, 16.53f, 0.0f)
                horizontalLineTo(13.5f)
                curveTo(10.6583f, 0.0045f, 8.2866f, 2.1704f, 8.025f, 5.0f)
                horizontalLineTo(7.5f)
                curveTo(4.4638f, 5.0033f, 2.0033f, 7.4638f, 2.0f, 10.5f)
                verticalLineTo(18.5f)
                curveTo(2.0033f, 21.5362f, 4.4638f, 23.9967f, 7.5f, 24.0f)
                horizontalLineTo(11.5f)
                curveTo(14.5362f, 23.9967f, 16.9967f, 21.5362f, 17.0f, 18.5f)
                verticalLineTo(17.975f)
                curveTo(19.8298f, 17.7138f, 21.996f, 15.3419f, 22.0f, 12.5f)
                verticalLineTo(5.47f)
                curveTo(22.002f, 4.08f, 21.4729f, 2.7418f, 20.521f, 1.729f)
                close()
                moveTo(14.0f, 18.5f)
                curveTo(14.0f, 19.8807f, 12.8807f, 21.0f, 11.5f, 21.0f)
                horizontalLineTo(7.5f)
                curveTo(6.1193f, 21.0f, 5.0f, 19.8807f, 5.0f, 18.5f)
                verticalLineTo(10.5f)
                curveTo(5.0f, 9.1193f, 6.1193f, 8.0f, 7.5f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.5f)
                curveTo(8.0033f, 15.5362f, 10.4638f, 17.9967f, 13.5f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.5f)
                close()
                moveTo(19.0f, 12.5f)
                curveTo(19.0f, 13.8807f, 17.8807f, 15.0f, 16.5f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(12.1193f, 15.0f, 11.0f, 13.8807f, 11.0f, 12.5f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 4.1193f, 12.1193f, 3.0f, 13.5f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 5.1045f, 16.8954f, 6.0f, 18.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.5f)
                close()
            }
        }
        .build()
        return _duplicate!!
    }

private var _duplicate: ImageVector? = null
