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

public val Icons.Bold.ArrowSmallUp: ImageVector
    get() {
        if (_arrowSmallUp != null) {
            return _arrowSmallUp!!
        }
        _arrowSmallUp = Builder(name = "ArrowSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.061f, 9.5251f)
                lineTo(13.768f, 5.2321f)
                curveTo(13.5358f, 4.9999f, 13.2602f, 4.8157f, 12.9568f, 4.69f)
                curveTo(12.6535f, 4.5643f, 12.3283f, 4.4996f, 12.0f, 4.4996f)
                curveTo(11.6716f, 4.4996f, 11.3465f, 4.5643f, 11.0431f, 4.69f)
                curveTo(10.7397f, 4.8157f, 10.4641f, 4.9999f, 10.232f, 5.2321f)
                lineTo(5.939f, 9.5251f)
                lineTo(8.061f, 11.6461f)
                lineTo(10.5f, 9.2071f)
                verticalLineTo(19.0001f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.2071f)
                lineTo(15.939f, 11.6461f)
                lineTo(18.061f, 9.5251f)
                close()
            }
        }
        .build()
        return _arrowSmallUp!!
    }

private var _arrowSmallUp: ImageVector? = null
