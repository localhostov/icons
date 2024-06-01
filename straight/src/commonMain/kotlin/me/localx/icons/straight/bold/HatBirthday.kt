package me.localx.icons.straight.bold

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

public val Icons.Bold.HatBirthday: ImageVector
    get() {
        if (_hatBirthday != null) {
            return _hatBirthday!!
        }
        _hatBirthday = Builder(name = "HatBirthday", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.791f, 3.8357f)
                    curveTo(13.2138f, 3.6537f, 13.5608f, 3.3313f, 13.7736f, 2.9231f)
                    curveTo(13.9863f, 2.5149f, 14.0518f, 2.0458f, 13.9588f, 1.595f)
                    curveTo(13.8659f, 1.1441f, 13.6202f, 0.7391f, 13.2634f, 0.4484f)
                    curveTo(12.9066f, 0.1576f, 12.4603f, -0.0012f, 12.0f, -0.0012f)
                    curveTo(11.5397f, -0.0012f, 11.0934f, 0.1576f, 10.7366f, 0.4484f)
                    curveTo(10.3798f, 0.7391f, 10.1341f, 1.1441f, 10.0412f, 1.595f)
                    curveTo(9.9482f, 2.0458f, 10.0137f, 2.5149f, 10.2264f, 2.9231f)
                    curveTo(10.4392f, 3.3313f, 10.7862f, 3.6537f, 11.209f, 3.8357f)
                    lineTo(0.0f, 24.0147f)
                    horizontalLineTo(24.0f)
                    lineTo(12.791f, 3.8357f)
                    close()
                    moveTo(16.053f, 15.8837f)
                    lineTo(13.136f, 21.0147f)
                    horizontalLineTo(10.692f)
                    lineTo(14.8f, 13.6277f)
                    lineTo(16.053f, 15.8837f)
                    close()
                    moveTo(12.0f, 8.5887f)
                    lineTo(13.085f, 10.5407f)
                    lineTo(7.26f, 21.0147f)
                    horizontalLineTo(5.1f)
                    lineTo(12.0f, 8.5887f)
                    close()
                }
            }
        }
        .build()
        return _hatBirthday!!
    }

private var _hatBirthday: ImageVector? = null
