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

public val Icons.Filled.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.954f, 5.5419f)
                    lineTo(15.536f, 13.9599f)
                    curveTo(14.5974f, 14.8961f, 13.3257f, 15.4219f, 12.0f, 15.4219f)
                    curveTo(10.6743f, 15.4219f, 9.4026f, 14.8961f, 8.464f, 13.9599f)
                    lineTo(0.046f, 5.5419f)
                    curveTo(0.032f, 5.6999f, 0.0f, 5.8429f, 0.0f, 5.9999f)
                    verticalLineTo(17.9999f)
                    curveTo(0.0016f, 19.3255f, 0.5289f, 20.5963f, 1.4662f, 21.5337f)
                    curveTo(2.4036f, 22.471f, 3.6744f, 22.9983f, 5.0f, 22.9999f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 22.9983f, 21.5964f, 22.471f, 22.5338f, 21.5337f)
                    curveTo(23.4711f, 20.5963f, 23.9984f, 19.3255f, 24.0f, 17.9999f)
                    verticalLineTo(5.9999f)
                    curveTo(24.0f, 5.8429f, 23.968f, 5.6999f, 23.954f, 5.5419f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.122f, 12.5459f)
                    lineTo(23.256f, 3.4109f)
                    curveTo(22.8135f, 2.6772f, 22.1895f, 2.0699f, 21.444f, 1.6476f)
                    curveTo(20.6985f, 1.2253f, 19.8568f, 1.0022f, 19.0f, 0.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(4.1432f, 1.0022f, 3.3015f, 1.2253f, 2.5561f, 1.6476f)
                    curveTo(1.8106f, 2.0699f, 1.1865f, 2.6772f, 0.744f, 3.4109f)
                    lineTo(9.878f, 12.5459f)
                    curveTo(10.4416f, 13.1072f, 11.2046f, 13.4223f, 12.0f, 13.4223f)
                    curveTo(12.7954f, 13.4223f, 13.5584f, 13.1072f, 14.122f, 12.5459f)
                    close()
                }
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
