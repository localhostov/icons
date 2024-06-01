package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Lipstick: ImageVector
    get() {
        if (_lipstick != null) {
            return _lipstick!!
        }
        _lipstick = Builder(name = "Lipstick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0002f, 13.0004f)
                    verticalLineTo(9.0004f)
                    horizontalLineTo(16.0002f)
                    verticalLineTo(2.0004f)
                    curveTo(16.0001f, 1.6595f, 15.9128f, 1.3242f, 15.7467f, 1.0265f)
                    curveTo(15.5806f, 0.7288f, 15.3412f, 0.4785f, 15.0511f, 0.2994f)
                    curveTo(14.761f, 0.1202f, 14.43f, 0.0182f, 14.0894f, 0.003f)
                    curveTo(13.7488f, -0.0122f, 13.41f, 0.0598f, 13.1052f, 0.2124f)
                    lineTo(9.6581f, 1.9364f)
                    curveTo(9.1587f, 2.184f, 8.7386f, 2.5666f, 8.4456f, 3.0409f)
                    curveTo(8.1525f, 3.5151f, 7.9982f, 4.0619f, 8.0001f, 4.6194f)
                    verticalLineTo(9.0004f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(13.0004f)
                    horizontalLineTo(5.0002f)
                    verticalLineTo(24.0004f)
                    horizontalLineTo(19.0002f)
                    verticalLineTo(13.0004f)
                    horizontalLineTo(17.0002f)
                    close()
                    moveTo(10.0002f, 4.6194f)
                    curveTo(10.0003f, 4.4338f, 10.052f, 4.2518f, 10.1497f, 4.0939f)
                    curveTo(10.2474f, 3.936f, 10.3871f, 3.8084f, 10.5532f, 3.7254f)
                    lineTo(14.0002f, 2.0004f)
                    verticalLineTo(9.0004f)
                    horizontalLineTo(10.0002f)
                    verticalLineTo(4.6194f)
                    close()
                    moveTo(9.0001f, 11.0004f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(13.0004f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(11.0004f)
                    close()
                    moveTo(17.0002f, 22.0004f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(15.0004f)
                    horizontalLineTo(17.0002f)
                    verticalLineTo(22.0004f)
                    close()
                }
            }
        }
        .build()
        return _lipstick!!
    }

private var _lipstick: ImageVector? = null
