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

public val Icons.Filled.Tablet: ImageVector
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
                    moveTo(13.0001f, 19.9994f)
                    curveTo(13.0001f, 20.2646f, 12.8948f, 20.519f, 12.7072f, 20.7065f)
                    curveTo(12.5197f, 20.894f, 12.2653f, 20.9994f, 12.0001f, 20.9994f)
                    curveTo(11.7349f, 20.9994f, 11.4806f, 20.894f, 11.293f, 20.7065f)
                    curveTo(11.1055f, 20.519f, 11.0001f, 20.2646f, 11.0001f, 19.9994f)
                    verticalLineTo(18.9994f)
                    horizontalLineTo(2.0001f)
                    curveTo(2.0017f, 20.325f, 2.529f, 21.5958f, 3.4663f, 22.5332f)
                    curveTo(4.4037f, 23.4705f, 5.6745f, 23.9978f, 7.0001f, 23.9994f)
                    horizontalLineTo(17.0001f)
                    curveTo(18.3257f, 23.9978f, 19.5966f, 23.4705f, 20.5339f, 22.5332f)
                    curveTo(21.4712f, 21.5958f, 21.9985f, 20.325f, 22.0001f, 18.9994f)
                    horizontalLineTo(13.0001f)
                    verticalLineTo(19.9994f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.0001f, 0.0f)
                    horizontalLineTo(7.0001f)
                    curveTo(5.6745f, 0.0016f, 4.4037f, 0.5289f, 3.4663f, 1.4662f)
                    curveTo(2.529f, 2.4036f, 2.0017f, 3.6744f, 2.0001f, 5.0f)
                    verticalLineTo(17.0f)
                    horizontalLineTo(22.0001f)
                    verticalLineTo(5.0f)
                    curveTo(21.9985f, 3.6744f, 21.4712f, 2.4036f, 20.5339f, 1.4662f)
                    curveTo(19.5966f, 0.5289f, 18.3257f, 0.0016f, 17.0001f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _tablet!!
    }

private var _tablet: ImageVector? = null
