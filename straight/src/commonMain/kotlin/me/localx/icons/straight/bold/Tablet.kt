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

public val Icons.Bold.Tablet: ImageVector
    get() {
        if (_tablet != null) {
            return _tablet!!
        }
        _tablet = Builder(name = "Tablet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0001f, 0.0f)
                    verticalLineTo(21.0f)
                    curveTo(2.0001f, 21.7956f, 2.3162f, 22.5587f, 2.8788f, 23.1213f)
                    curveTo(3.4414f, 23.6839f, 4.2045f, 24.0f, 5.0001f, 24.0f)
                    horizontalLineTo(19.0001f)
                    curveTo(19.7958f, 24.0f, 20.5588f, 23.6839f, 21.1214f, 23.1213f)
                    curveTo(21.6841f, 22.5587f, 22.0001f, 21.7956f, 22.0001f, 21.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(2.0001f)
                    close()
                    moveTo(13.0001f, 18.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(11.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(13.0001f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
