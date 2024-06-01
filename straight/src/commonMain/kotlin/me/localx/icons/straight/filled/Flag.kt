package me.localx.icons.straight.filled

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

public val Icons.Filled.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 4.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(13.0f)
                    curveTo(12.3817f, 16.9974f, 11.7794f, 16.8039f, 11.2753f, 16.4459f)
                    curveTo(10.7712f, 16.0879f, 10.3901f, 15.5829f, 10.184f, 15.0f)
                    horizontalLineTo(14.0f)
                    curveTo(14.5304f, 15.0f, 15.0391f, 14.7893f, 15.4142f, 14.4142f)
                    curveTo(15.7893f, 14.0391f, 16.0f, 13.5304f, 16.0f, 13.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(2.0f, 13.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(3.0f)
                    curveTo(14.0f, 2.2043f, 13.6839f, 1.4413f, 13.1213f, 0.8787f)
                    curveTo(12.5587f, 0.3161f, 11.7956f, 0.0f, 11.0f, 0.0f)
                    lineTo(0.0f, 0.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(13.0f)
                    close()
                }
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
