package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Edit: ImageVector
    get() {
        if (_edit != null) {
            return _edit!!
        }
        _edit = Builder(name = "Edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(5.0002f, 18.9998f)
                    horizontalLineTo(9.4142f)
                    lineTo(23.0572f, 5.3568f)
                    curveTo(23.6415f, 4.7709f, 23.9697f, 3.9772f, 23.9697f, 3.1498f)
                    curveTo(23.9697f, 2.3223f, 23.6415f, 1.5286f, 23.0572f, 0.9428f)
                    curveTo(22.4628f, 0.3747f, 21.6723f, 0.0576f, 20.8502f, 0.0576f)
                    curveTo(20.028f, 0.0576f, 19.2375f, 0.3747f, 18.6432f, 0.9428f)
                    lineTo(5.0002f, 14.5858f)
                    verticalLineTo(18.9998f)
                    close()
                    moveTo(7.0002f, 15.4138f)
                    lineTo(20.0572f, 2.3568f)
                    curveTo(20.2707f, 2.1527f, 20.5548f, 2.0389f, 20.8502f, 2.0389f)
                    curveTo(21.1455f, 2.0389f, 21.4296f, 2.1527f, 21.6432f, 2.3568f)
                    curveTo(21.8531f, 2.5673f, 21.971f, 2.8525f, 21.971f, 3.1498f)
                    curveTo(21.971f, 3.4471f, 21.8531f, 3.7322f, 21.6432f, 3.9428f)
                    lineTo(8.5862f, 16.9998f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(15.4138f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.621f, 7.622f)
                    lineTo(22.0f, 9.243f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(22.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(3.0f)
                    curveTo(2.0f, 2.7348f, 2.1054f, 2.4804f, 2.2929f, 2.2929f)
                    curveTo(2.4804f, 2.1054f, 2.7348f, 2.0f, 3.0f, 2.0f)
                    horizontalLineTo(14.758f)
                    lineTo(16.379f, 0.379f)
                    curveTo(16.525f, 0.2436f, 16.6789f, 0.1171f, 16.84f, 0.0f)
                    lineTo(3.0f, 0.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(18.414f)
                    lineTo(24.0f, 18.414f)
                    verticalLineTo(7.161f)
                    curveTo(23.8827f, 7.3219f, 23.7561f, 7.4758f, 23.621f, 7.622f)
                    close()
                    moveTo(18.0f, 21.586f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(21.586f)
                    lineTo(18.0f, 21.586f)
                    close()
                }
            }
        }
        .build()
        return _edit!!
    }

private var _edit: ImageVector? = null
