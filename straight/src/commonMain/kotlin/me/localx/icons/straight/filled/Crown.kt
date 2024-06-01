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

public val Icons.Filled.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0f, 8.2928f)
                    lineTo(12.0f, 2.2929f)
                    lineTo(6.0f, 8.2928f)
                    lineTo(0.0f, 2.2929f)
                    verticalLineTo(18.7068f)
                    curveTo(0.0f, 19.5025f, 0.3161f, 20.2656f, 0.8787f, 20.8282f)
                    curveTo(1.4413f, 21.3908f, 2.2043f, 21.7068f, 3.0f, 21.7068f)
                    horizontalLineTo(21.0f)
                    curveTo(21.7956f, 21.7068f, 22.5587f, 21.3908f, 23.1213f, 20.8282f)
                    curveTo(23.6839f, 20.2656f, 24.0f, 19.5025f, 24.0f, 18.7068f)
                    verticalLineTo(2.2929f)
                    lineTo(18.0f, 8.2928f)
                    close()
                }
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
