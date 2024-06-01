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

public val Icons.Filled.Checkbox: ImageVector
    get() {
        if (_checkbox != null) {
            return _checkbox!!
        }
        _checkbox = Builder(name = "Checkbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 0.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(10.748f, 17.333f)
                    curveTo(10.5623f, 17.5188f, 10.3418f, 17.6662f, 10.0991f, 17.7668f)
                    curveTo(9.8563f, 17.8673f, 9.5962f, 17.9191f, 9.3335f, 17.9191f)
                    curveTo(9.0708f, 17.9191f, 8.8106f, 17.8673f, 8.568f, 17.7668f)
                    curveTo(8.3252f, 17.6662f, 8.1047f, 17.5188f, 7.919f, 17.333f)
                    lineTo(3.293f, 12.707f)
                    lineTo(4.707f, 11.293f)
                    lineTo(9.333f, 15.919f)
                    lineTo(19.293f, 5.96f)
                    lineTo(20.707f, 7.374f)
                    lineTo(10.748f, 17.333f)
                    close()
                }
            }
        }
        .build()
        return _checkbox!!
    }

private var _checkbox: ImageVector? = null
