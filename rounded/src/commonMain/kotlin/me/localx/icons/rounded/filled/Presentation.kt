package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.Presentation: ImageVector
    get() {
        if (_presentation != null) {
            return _presentation!!
        }
        _presentation = Builder(name = "Presentation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.0002f, 12.0f)
                    verticalLineTo(5.0f)
                    curveTo(21.9986f, 3.6744f, 21.4713f, 2.4036f, 20.5339f, 1.4662f)
                    curveTo(19.5966f, 0.5289f, 18.3257f, 0.0016f, 17.0002f, 0.0f)
                    lineTo(7.0002f, 0.0f)
                    curveTo(5.6746f, 0.0016f, 4.4037f, 0.5289f, 3.4664f, 1.4662f)
                    curveTo(2.529f, 2.4036f, 2.0017f, 3.6744f, 2.0001f, 5.0f)
                    verticalLineTo(12.0f)
                    horizontalLineTo(22.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 13.9997f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 13.9997f, 0.4804f, 14.1051f, 0.2929f, 14.2926f)
                    curveTo(0.1054f, 14.4801f, 0.0f, 14.7345f, 0.0f, 14.9997f)
                    curveTo(0.0f, 15.2649f, 0.1054f, 15.5193f, 0.2929f, 15.7068f)
                    curveTo(0.4804f, 15.8943f, 0.7348f, 15.9997f, 1.0f, 15.9997f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(19.9997f)
                    horizontalLineTo(9.0f)
                    curveTo(8.2044f, 19.9997f, 7.4413f, 20.3157f, 6.8787f, 20.8784f)
                    curveTo(6.3161f, 21.441f, 6.0f, 22.204f, 6.0f, 22.9997f)
                    curveTo(6.0f, 23.2649f, 6.1054f, 23.5192f, 6.2929f, 23.7068f)
                    curveTo(6.4804f, 23.8943f, 6.7348f, 23.9997f, 7.0f, 23.9997f)
                    curveTo(7.2652f, 23.9997f, 7.5196f, 23.8943f, 7.7071f, 23.7068f)
                    curveTo(7.8946f, 23.5192f, 8.0f, 23.2649f, 8.0f, 22.9997f)
                    curveTo(8.0f, 22.7345f, 8.1054f, 22.4801f, 8.2929f, 22.2926f)
                    curveTo(8.4804f, 22.105f, 8.7348f, 21.9997f, 9.0f, 21.9997f)
                    horizontalLineTo(15.0f)
                    curveTo(15.2652f, 21.9997f, 15.5196f, 22.105f, 15.7071f, 22.2926f)
                    curveTo(15.8946f, 22.4801f, 16.0f, 22.7345f, 16.0f, 22.9997f)
                    curveTo(16.0f, 23.2649f, 16.1054f, 23.5192f, 16.2929f, 23.7068f)
                    curveTo(16.4804f, 23.8943f, 16.7348f, 23.9997f, 17.0f, 23.9997f)
                    curveTo(17.2652f, 23.9997f, 17.5196f, 23.8943f, 17.7071f, 23.7068f)
                    curveTo(17.8946f, 23.5192f, 18.0f, 23.2649f, 18.0f, 22.9997f)
                    curveTo(18.0f, 22.204f, 17.6839f, 21.441f, 17.1213f, 20.8784f)
                    curveTo(16.5587f, 20.3157f, 15.7956f, 19.9997f, 15.0f, 19.9997f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(15.9997f)
                    horizontalLineTo(23.0f)
                    curveTo(23.2652f, 15.9997f, 23.5196f, 15.8943f, 23.7071f, 15.7068f)
                    curveTo(23.8946f, 15.5193f, 24.0f, 15.2649f, 24.0f, 14.9997f)
                    curveTo(24.0f, 14.7345f, 23.8946f, 14.4801f, 23.7071f, 14.2926f)
                    curveTo(23.5196f, 14.1051f, 23.2652f, 13.9997f, 23.0f, 13.9997f)
                    close()
                }
            }
        }
        .build()
        return _presentation!!
    }

private var _presentation: ImageVector? = null
