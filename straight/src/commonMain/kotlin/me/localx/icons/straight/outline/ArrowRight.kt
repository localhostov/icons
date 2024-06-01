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

public val Icons.Outline.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.124f, 9.879f)
                    lineTo(18.538f, 5.293f)
                    lineTo(17.124f, 6.707f)
                    lineTo(21.386f, 10.97f)
                    lineTo(0.0f, 11.0f)
                    verticalLineTo(13.0f)
                    lineTo(21.446f, 12.97f)
                    lineTo(17.123f, 17.293f)
                    lineTo(18.537f, 18.707f)
                    lineTo(23.124f, 14.121f)
                    curveTo(23.6847f, 13.5575f, 23.9995f, 12.7949f, 23.9995f, 12.0f)
                    curveTo(23.9995f, 11.205f, 23.6847f, 10.4425f, 23.124f, 9.879f)
                    close()
                }
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
