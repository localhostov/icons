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

public val Icons.Outline.Exclamation: ImageVector
    get() {
        if (_exclamation != null) {
            return _exclamation!!
        }
        _exclamation = Builder(name = "Exclamation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 24.0f)
                    curveTo(9.6266f, 24.0f, 7.3066f, 23.2962f, 5.3332f, 21.9776f)
                    curveTo(3.3598f, 20.6591f, 1.8217f, 18.7849f, 0.9135f, 16.5922f)
                    curveTo(0.0052f, 14.3995f, -0.2324f, 11.9867f, 0.2306f, 9.6589f)
                    curveTo(0.6936f, 7.3312f, 1.8365f, 5.1929f, 3.5147f, 3.5147f)
                    curveTo(5.1929f, 1.8365f, 7.3312f, 0.6936f, 9.6589f, 0.2306f)
                    curveTo(11.9867f, -0.2324f, 14.3995f, 0.0052f, 16.5922f, 0.9135f)
                    curveTo(18.7849f, 1.8217f, 20.6591f, 3.3598f, 21.9776f, 5.3332f)
                    curveTo(23.2962f, 7.3066f, 24.0f, 9.6266f, 24.0f, 12.0f)
                    curveTo(23.9966f, 15.1815f, 22.7312f, 18.2318f, 20.4815f, 20.4815f)
                    curveTo(18.2318f, 22.7312f, 15.1815f, 23.9966f, 12.0f, 24.0f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(10.0222f, 2.0f, 8.0888f, 2.5865f, 6.4443f, 3.6853f)
                    curveTo(4.7998f, 4.7841f, 3.5181f, 6.3459f, 2.7612f, 8.1732f)
                    curveTo(2.0043f, 10.0004f, 1.8063f, 12.0111f, 2.1922f, 13.9509f)
                    curveTo(2.578f, 15.8907f, 3.5304f, 17.6725f, 4.9289f, 19.0711f)
                    curveTo(6.3275f, 20.4696f, 8.1093f, 21.422f, 10.0491f, 21.8079f)
                    curveTo(11.9889f, 22.1937f, 13.9996f, 21.9957f, 15.8268f, 21.2388f)
                    curveTo(17.6541f, 20.4819f, 19.2159f, 19.2002f, 20.3147f, 17.5557f)
                    curveTo(21.4135f, 15.9112f, 22.0f, 13.9778f, 22.0f, 12.0f)
                    curveTo(21.9971f, 9.3487f, 20.9426f, 6.8069f, 19.0679f, 4.9321f)
                    curveTo(17.1931f, 3.0574f, 14.6513f, 2.0029f, 12.0f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0002f, 4.9996f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(14.9996f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(4.9996f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.0002f, 16.9996f)
                    horizontalLineTo(11.0002f)
                    verticalLineTo(18.9996f)
                    horizontalLineTo(13.0002f)
                    verticalLineTo(16.9996f)
                    close()
                }
            }
        }
        .build()
        return _exclamation!!
    }

private var _exclamation: ImageVector? = null
