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

public val Icons.Filled.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.276f, 2.4799f)
                    curveTo(20.1537f, 1.785f, 19.7904f, 1.1555f, 19.25f, 0.7019f)
                    curveTo(18.7096f, 0.2484f, 18.0266f, -2.0E-4f, 17.321f, -1.0E-4f)
                    horizontalLineTo(6.681f)
                    curveTo(5.9747f, -0.0013f, 5.2908f, 0.2473f, 4.75f, 0.7017f)
                    curveTo(4.2093f, 1.156f, 3.8466f, 1.7869f, 3.726f, 2.4829f)
                    lineTo(-0.039f, 23.9999f)
                    horizontalLineTo(24.061f)
                    lineTo(20.276f, 2.4799f)
                    close()
                    moveTo(13.0f, 20.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(16.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(20.9999f)
                    close()
                    moveTo(13.0f, 13.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(9.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(13.9999f)
                    close()
                    moveTo(13.0f, 6.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(2.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(6.9999f)
                    close()
                }
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
