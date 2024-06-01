package me.localx.icons.rounded.outline

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

public val Icons.Outline.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.12f, 9.91f)
                    lineTo(19.25f, 6.0f)
                    curveTo(19.157f, 5.9063f, 19.0464f, 5.8319f, 18.9246f, 5.7811f)
                    curveTo(18.8027f, 5.7304f, 18.672f, 5.7042f, 18.54f, 5.7042f)
                    curveTo(18.408f, 5.7042f, 18.2773f, 5.7304f, 18.1554f, 5.7811f)
                    curveTo(18.0336f, 5.8319f, 17.923f, 5.9063f, 17.83f, 6.0f)
                    curveTo(17.6437f, 6.1874f, 17.5392f, 6.4408f, 17.5392f, 6.705f)
                    curveTo(17.5392f, 6.9692f, 17.6437f, 7.2227f, 17.83f, 7.41f)
                    lineTo(21.39f, 11.0f)
                    horizontalLineTo(1.0f)
                    curveTo(0.7348f, 11.0f, 0.4804f, 11.1054f, 0.2929f, 11.2929f)
                    curveTo(0.1054f, 11.4805f, 0.0f, 11.7348f, 0.0f, 12.0f)
                    horizontalLineTo(0.0f)
                    curveTo(0.0f, 12.2652f, 0.1054f, 12.5196f, 0.2929f, 12.7071f)
                    curveTo(0.4804f, 12.8947f, 0.7348f, 13.0f, 1.0f, 13.0f)
                    horizontalLineTo(21.45f)
                    lineTo(17.83f, 16.61f)
                    curveTo(17.7363f, 16.703f, 17.6619f, 16.8136f, 17.6111f, 16.9354f)
                    curveTo(17.5603f, 17.0573f, 17.5342f, 17.188f, 17.5342f, 17.32f)
                    curveTo(17.5342f, 17.452f, 17.5603f, 17.5827f, 17.6111f, 17.7046f)
                    curveTo(17.6619f, 17.8265f, 17.7363f, 17.9371f, 17.83f, 18.03f)
                    curveTo(17.923f, 18.1238f, 18.0336f, 18.1981f, 18.1554f, 18.2489f)
                    curveTo(18.2773f, 18.2997f, 18.408f, 18.3258f, 18.54f, 18.3258f)
                    curveTo(18.672f, 18.3258f, 18.8027f, 18.2997f, 18.9246f, 18.2489f)
                    curveTo(19.0464f, 18.1981f, 19.157f, 18.1238f, 19.25f, 18.03f)
                    lineTo(23.12f, 14.15f)
                    curveTo(23.6818f, 13.5875f, 23.9974f, 12.825f, 23.9974f, 12.03f)
                    curveTo(23.9974f, 11.235f, 23.6818f, 10.4725f, 23.12f, 9.91f)
                    close()
                }
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
