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

public val Icons.Outline.AngleDoubleRight: ImageVector
    get() {
        if (_angleDoubleRight != null) {
            return _angleDoubleRight!!
        }
        _angleDoubleRight = Builder(name = "AngleDoubleRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.1207f, 9.879f)
                    lineTo(12.2457f, 0.0f)
                    lineTo(10.8317f, 1.418f)
                    lineTo(20.7067f, 11.293f)
                    curveTo(20.8941f, 11.4805f, 20.9995f, 11.7348f, 20.9995f, 12.0f)
                    curveTo(20.9995f, 12.2652f, 20.8941f, 12.5195f, 20.7067f, 12.707f)
                    lineTo(10.8187f, 22.6f)
                    lineTo(12.2327f, 24.014f)
                    lineTo(22.1207f, 14.126f)
                    curveTo(22.6831f, 13.5634f, 22.999f, 12.8005f, 22.999f, 12.005f)
                    curveTo(22.999f, 11.2095f, 22.6831f, 10.4466f, 22.1207f, 9.884f)
                    verticalLineTo(9.879f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(13.5347f, 11.293f)
                    lineTo(2.2617f, 0.019f)
                    lineTo(0.8467f, 1.433f)
                    lineTo(11.4137f, 12.0f)
                    lineTo(0.8357f, 22.578f)
                    lineTo(2.2497f, 23.993f)
                    lineTo(13.5347f, 12.707f)
                    curveTo(13.7222f, 12.5195f, 13.8275f, 12.2652f, 13.8275f, 12.0f)
                    curveTo(13.8275f, 11.7349f, 13.7222f, 11.4806f, 13.5347f, 11.293f)
                    close()
                }
            }
        }
        .build()
        return _angleDoubleRight!!
    }

private var _angleDoubleRight: ImageVector? = null
