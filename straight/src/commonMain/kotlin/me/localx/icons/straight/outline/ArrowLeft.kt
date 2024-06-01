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

public val Icons.Outline.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0003f, 13.0f)
                    verticalLineTo(11.0f)
                    lineTo(2.5553f, 11.031f)
                    lineTo(6.8773f, 6.707f)
                    lineTo(5.4633f, 5.293f)
                    lineTo(0.8773f, 9.879f)
                    curveTo(0.3148f, 10.4416f, -0.0011f, 11.2045f, -0.0011f, 12.0f)
                    curveTo(-0.0011f, 12.7955f, 0.3148f, 13.5584f, 0.8773f, 14.121f)
                    lineTo(5.4633f, 18.707f)
                    lineTo(6.8773f, 17.293f)
                    lineTo(2.6153f, 13.031f)
                    lineTo(24.0003f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
