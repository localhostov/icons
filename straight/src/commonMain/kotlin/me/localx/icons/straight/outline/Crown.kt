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

public val Icons.Outline.Crown: ImageVector
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
                    moveTo(21.0f, 21.7068f)
                    horizontalLineTo(3.0f)
                    curveTo(2.2043f, 21.7068f, 1.4413f, 21.3908f, 0.8787f, 20.8282f)
                    curveTo(0.3161f, 20.2656f, 0.0f, 19.5025f, 0.0f, 18.7068f)
                    lineTo(0.0f, 2.2929f)
                    lineTo(6.0f, 8.2928f)
                    lineTo(12.0f, 2.2929f)
                    lineTo(18.0f, 8.2928f)
                    lineTo(24.0f, 2.2929f)
                    verticalLineTo(18.7068f)
                    curveTo(24.0f, 19.5025f, 23.6839f, 20.2656f, 23.1213f, 20.8282f)
                    curveTo(22.5587f, 21.3908f, 21.7956f, 21.7068f, 21.0f, 21.7068f)
                    close()
                    moveTo(2.0f, 7.1209f)
                    verticalLineTo(18.7068f)
                    curveTo(2.0f, 18.9721f, 2.1054f, 19.2264f, 2.2929f, 19.414f)
                    curveTo(2.4804f, 19.6015f, 2.7348f, 19.7068f, 3.0f, 19.7068f)
                    horizontalLineTo(21.0f)
                    curveTo(21.2652f, 19.7068f, 21.5196f, 19.6015f, 21.7071f, 19.414f)
                    curveTo(21.8946f, 19.2264f, 22.0f, 18.9721f, 22.0f, 18.7068f)
                    verticalLineTo(7.1209f)
                    lineTo(18.0f, 11.1208f)
                    lineTo(12.0f, 5.1209f)
                    lineTo(6.0f, 11.1208f)
                    lineTo(2.0f, 7.1209f)
                    close()
                }
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
