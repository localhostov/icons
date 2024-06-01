package me.localx.icons.rounded.filled

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

public val Icons.Filled.File: ImageVector
    get() {
        if (_file != null) {
            return _file!!
        }
        _file = Builder(name = "File", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0001f)
                horizontalLineTo(21.54f)
                curveTo(21.1909f, 7.0749f, 20.6485f, 6.2349f, 19.949f, 5.5361f)
                lineTo(16.465f, 2.0501f)
                curveTo(15.7653f, 1.3514f, 14.9251f, 0.8094f, 14.0f, 0.4601f)
                verticalLineTo(7.0001f)
                curveTo(14.0f, 7.5523f, 14.4477f, 8.0001f, 15.0f, 8.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.976f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(13.3431f, 10.0f, 12.0f, 8.6568f, 12.0f, 7.0f)
                verticalLineTo(0.024f)
                curveTo(11.839f, 0.013f, 11.678f, 0.0f, 11.515f, 0.0f)
                horizontalLineTo(7.0f)
                curveTo(4.2399f, 0.0033f, 2.0033f, 2.24f, 2.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(2.0033f, 21.76f, 4.2399f, 23.9967f, 7.0f, 24.0f)
                horizontalLineTo(17.0f)
                curveTo(19.76f, 23.9967f, 21.9966f, 21.76f, 22.0f, 19.0f)
                verticalLineTo(10.485f)
                curveTo(22.0f, 10.322f, 21.987f, 10.161f, 21.976f, 10.0f)
                close()
            }
        }
        .build()
        return _file!!
    }

private var _file: ImageVector? = null
