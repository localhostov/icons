package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Brush: ImageVector
    get() {
        if (_brush != null) {
            return _brush!!
        }
        _brush = Builder(name = "Brush", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 10.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(5.0f)
                    curveTo(0.0016f, 3.6744f, 0.5289f, 2.4036f, 1.4662f, 1.4662f)
                    curveTo(2.4036f, 0.5289f, 3.6744f, 0.0016f, 5.0f, 0.0f)
                    lineTo(10.0f, 0.0f)
                    verticalLineTo(3.0f)
                    curveTo(10.0f, 3.2652f, 10.1054f, 3.5196f, 10.2929f, 3.7071f)
                    curveTo(10.4804f, 3.8946f, 10.7348f, 4.0f, 11.0f, 4.0f)
                    curveTo(11.2652f, 4.0f, 11.5196f, 3.8946f, 11.7071f, 3.7071f)
                    curveTo(11.8946f, 3.5196f, 12.0f, 3.2652f, 12.0f, 3.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(5.0f)
                    curveTo(14.0f, 5.2652f, 14.1054f, 5.5196f, 14.2929f, 5.7071f)
                    curveTo(14.4804f, 5.8946f, 14.7348f, 6.0f, 15.0f, 6.0f)
                    curveTo(15.2652f, 6.0f, 15.5196f, 5.8946f, 15.7071f, 5.7071f)
                    curveTo(15.8946f, 5.5196f, 16.0f, 5.2652f, 16.0f, 5.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(7.0f)
                    curveTo(18.0f, 7.2652f, 18.1054f, 7.5196f, 18.2929f, 7.7071f)
                    curveTo(18.4804f, 7.8946f, 18.7348f, 8.0f, 19.0f, 8.0f)
                    curveTo(19.2652f, 8.0f, 19.5196f, 7.8946f, 19.7071f, 7.7071f)
                    curveTo(19.8946f, 7.5196f, 20.0f, 7.2652f, 20.0f, 7.0f)
                    verticalLineTo(0.1f)
                    curveTo(21.1286f, 0.3321f, 22.1427f, 0.9462f, 22.8713f, 1.8388f)
                    curveTo(23.5999f, 2.7313f, 23.9985f, 3.8478f, 24.0f, 5.0f)
                    verticalLineTo(10.0f)
                    close()
                    moveTo(0.3f, 12.0f)
                    curveTo(0.7319f, 13.4424f, 1.6166f, 14.7074f, 2.8232f, 15.6079f)
                    curveTo(4.0299f, 16.5084f, 5.4944f, 16.9965f, 7.0f, 17.0f)
                    horizontalLineTo(9.0f)
                    verticalLineTo(21.0f)
                    curveTo(9.0f, 21.7956f, 9.3161f, 22.5587f, 9.8787f, 23.1213f)
                    curveTo(10.4413f, 23.6839f, 11.2044f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.7956f, 24.0f, 13.5587f, 23.6839f, 14.1213f, 23.1213f)
                    curveTo(14.6839f, 22.5587f, 15.0f, 21.7956f, 15.0f, 21.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(17.0f)
                    curveTo(18.5056f, 16.9965f, 19.9701f, 16.5084f, 21.1768f, 15.6079f)
                    curveTo(22.3834f, 14.7074f, 23.2681f, 13.4424f, 23.7f, 12.0f)
                    horizontalLineTo(0.3f)
                    close()
                }
            }
        }
        .build()
        return _brush!!
    }

private var _brush: ImageVector? = null
