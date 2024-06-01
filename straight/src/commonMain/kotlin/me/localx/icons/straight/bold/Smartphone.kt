package me.localx.icons.straight.bold

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

public val Icons.Bold.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(4.0001f, 0.0f)
                    verticalLineTo(21.0f)
                    curveTo(4.0001f, 21.7956f, 4.3162f, 22.5587f, 4.8788f, 23.1213f)
                    curveTo(5.4414f, 23.6839f, 6.2044f, 24.0f, 7.0001f, 24.0f)
                    horizontalLineTo(17.0001f)
                    curveTo(17.7957f, 24.0f, 18.5588f, 23.6839f, 19.1214f, 23.1213f)
                    curveTo(19.684f, 22.5587f, 20.0001f, 21.7956f, 20.0001f, 21.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(4.0001f)
                    close()
                    moveTo(13.0051f, 22.015f)
                    horizontalLineTo(10.9931f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(13.0051f)
                    verticalLineTo(22.015f)
                    close()
                    moveTo(7.0001f, 18.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(17.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(7.0001f)
                    close()
                }
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
