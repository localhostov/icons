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

public val Icons.Outline.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.9998f, 2.4268f)
                    verticalLineTo(4.5268f)
                    curveTo(17.0014f, 5.2344f, 18.6884f, 6.627f, 19.7627f, 8.4582f)
                    curveTo(20.8369f, 10.2894f, 21.2292f, 12.4415f, 20.8702f, 14.534f)
                    curveTo(20.5112f, 16.6264f, 19.424f, 18.5246f, 17.8008f, 19.8931f)
                    curveTo(16.1776f, 21.2615f, 14.1228f, 22.012f, 11.9998f, 22.012f)
                    curveTo(9.8767f, 22.012f, 7.822f, 21.2615f, 6.1988f, 19.8931f)
                    curveTo(4.5756f, 18.5246f, 3.4884f, 16.6264f, 3.1294f, 14.534f)
                    curveTo(2.7704f, 12.4415f, 3.1627f, 10.2894f, 4.2369f, 8.4582f)
                    curveTo(5.3111f, 6.627f, 6.9981f, 5.2344f, 8.9998f, 4.5268f)
                    verticalLineTo(2.4268f)
                    curveTo(6.4454f, 3.1509f, 4.2391f, 4.7744f, 2.788f, 6.9978f)
                    curveTo(1.3369f, 9.2212f, 0.739f, 11.8944f, 1.1045f, 14.5242f)
                    curveTo(1.4701f, 17.1539f, 2.7744f, 19.5627f, 4.7769f, 21.3061f)
                    curveTo(6.7793f, 23.0495f, 9.3448f, 24.0098f, 11.9998f, 24.0098f)
                    curveTo(14.6548f, 24.0098f, 17.2203f, 23.0495f, 19.2227f, 21.3061f)
                    curveTo(21.2252f, 19.5627f, 22.5295f, 17.1539f, 22.895f, 14.5242f)
                    curveTo(23.2606f, 11.8944f, 22.6626f, 9.2212f, 21.2115f, 6.9978f)
                    curveTo(19.7605f, 4.7744f, 17.5542f, 3.1509f, 14.9998f, 2.4268f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.9998f, 0.0f)
                    horizontalLineTo(10.9998f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(12.9998f)
                    verticalLineTo(0.0f)
                    close()
                }
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
