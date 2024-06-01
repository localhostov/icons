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

public val Icons.Filled.EnvelopePlus: ImageVector
    get() {
        if (_envelopePlus != null) {
            return _envelopePlus!!
        }
        _envelopePlus = Builder(name = "EnvelopePlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 4.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(14.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(20.0f)
                    verticalLineTo(4.0f)
                    horizontalLineTo(24.0f)
                    close()
                    moveTo(12.0f, 15.422f)
                    curveTo(12.7955f, 15.4229f, 13.5588f, 15.1078f, 14.122f, 14.546f)
                    lineTo(16.969f, 11.7f)
                    curveTo(15.1965f, 11.1646f, 13.7088f, 9.9479f, 12.8323f, 8.3168f)
                    curveTo(11.9559f, 6.6858f, 11.7623f, 4.7736f, 12.294f, 3.0f)
                    horizontalLineTo(3.0f)
                    curveTo(2.4012f, 3.0009f, 1.8163f, 3.181f, 1.3207f, 3.5171f)
                    curveTo(0.8251f, 3.8532f, 0.4414f, 4.33f, 0.219f, 4.886f)
                    lineTo(9.878f, 14.546f)
                    curveTo(10.4412f, 15.1078f, 11.2045f, 15.4229f, 12.0f, 15.422f)
                    close()
                    moveTo(15.536f, 15.96f)
                    curveTo(14.5974f, 16.8963f, 13.3257f, 17.422f, 12.0f, 17.422f)
                    curveTo(10.6743f, 17.422f, 9.4026f, 16.8963f, 8.464f, 15.96f)
                    lineTo(0.0f, 7.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(9.894f)
                    curveTo(22.811f, 11.1104f, 21.2184f, 11.8501f, 19.522f, 11.974f)
                    lineTo(15.536f, 15.96f)
                    close()
                }
            }
        }
        .build()
        return _envelopePlus!!
    }

private var _envelopePlus: ImageVector? = null
