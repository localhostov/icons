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

public val Icons.Outline.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.0f, 6.2099f)
                    curveTo(6.1874f, 6.3962f, 6.4408f, 6.5007f, 6.705f, 6.5007f)
                    curveTo(6.9692f, 6.5007f, 7.2227f, 6.3962f, 7.41f, 6.2099f)
                    lineTo(11.0f, 2.5799f)
                    verticalLineTo(23.0f)
                    curveTo(11.0f, 23.2652f, 11.1054f, 23.5195f, 11.2929f, 23.7071f)
                    curveTo(11.4805f, 23.8946f, 11.7348f, 24.0f, 12.0f, 24.0f)
                    curveTo(12.2652f, 24.0f, 12.5196f, 23.8946f, 12.7071f, 23.7071f)
                    curveTo(12.8947f, 23.5195f, 13.0f, 23.2652f, 13.0f, 23.0f)
                    verticalLineTo(2.5899f)
                    lineTo(16.62f, 6.2099f)
                    curveTo(16.713f, 6.3037f, 16.8236f, 6.378f, 16.9454f, 6.4288f)
                    curveTo(17.0673f, 6.4796f, 17.198f, 6.5057f, 17.33f, 6.5057f)
                    curveTo(17.462f, 6.5057f, 17.5927f, 6.4796f, 17.7146f, 6.4288f)
                    curveTo(17.8365f, 6.378f, 17.9471f, 6.3037f, 18.04f, 6.2099f)
                    curveTo(18.2263f, 6.0226f, 18.3308f, 5.7691f, 18.3308f, 5.5049f)
                    curveTo(18.3308f, 5.2407f, 18.2263f, 4.9873f, 18.04f, 4.7999f)
                    lineTo(14.13f, 0.8799f)
                    curveTo(13.5675f, 0.3181f, 12.805f, 0.0026f, 12.01f, 0.0026f)
                    curveTo(11.215f, 0.0026f, 10.4525f, 0.3181f, 9.89f, 0.8799f)
                    lineTo(6.0f, 4.7999f)
                    curveTo(5.8138f, 4.9873f, 5.7092f, 5.2407f, 5.7092f, 5.5049f)
                    curveTo(5.7092f, 5.7691f, 5.8138f, 6.0226f, 6.0f, 6.2099f)
                    close()
                }
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
