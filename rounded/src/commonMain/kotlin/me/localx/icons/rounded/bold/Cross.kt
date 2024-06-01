package me.localx.icons.rounded.bold

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

public val Icons.Bold.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.1211f, 12.0002f)
                    lineTo(23.5608f, 2.5616f)
                    curveTo(24.1467f, 1.9756f, 24.1467f, 1.0256f, 23.5608f, 0.4397f)
                    curveTo(22.9748f, -0.1462f, 22.0248f, -0.1462f, 21.4389f, 0.4397f)
                    lineTo(12.0002f, 9.8793f)
                    lineTo(2.5616f, 0.4397f)
                    curveTo(1.9756f, -0.1462f, 1.0256f, -0.1462f, 0.4397f, 0.4397f)
                    curveTo(-0.1462f, 1.0257f, -0.1462f, 1.9757f, 0.4397f, 2.5616f)
                    lineTo(9.8793f, 12.0002f)
                    lineTo(0.4397f, 21.4389f)
                    curveTo(-0.1462f, 22.0248f, -0.1462f, 22.9748f, 0.4397f, 23.5608f)
                    curveTo(1.0257f, 24.1467f, 1.9757f, 24.1467f, 2.5616f, 23.5608f)
                    lineTo(12.0002f, 14.1211f)
                    lineTo(21.4388f, 23.5608f)
                    curveTo(22.0248f, 24.1467f, 22.9748f, 24.1467f, 23.5607f, 23.5608f)
                    curveTo(24.1467f, 22.9748f, 24.1467f, 22.0248f, 23.5607f, 21.4389f)
                    lineTo(14.1211f, 12.0002f)
                    close()
                }
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
