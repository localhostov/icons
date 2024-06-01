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

public val Icons.Bold.PlayAlt: ImageVector
    get() {
        if (_playAlt != null) {
            return _playAlt!!
        }
        _playAlt = Builder(name = "PlayAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 24.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 23.9984f, 2.6438f, 23.4184f, 1.6127f, 22.3873f)
                    curveTo(0.5816f, 21.3562f, 0.0016f, 19.9582f, 0.0f, 18.5f)
                    lineTo(0.0f, 5.5f)
                    curveTo(0.0016f, 4.0418f, 0.5816f, 2.6438f, 1.6127f, 1.6127f)
                    curveTo(2.6438f, 0.5816f, 4.0418f, 0.0016f, 5.5f, 0.0f)
                    lineTo(18.5f, 0.0f)
                    curveTo(19.9582f, 0.0016f, 21.3562f, 0.5816f, 22.3873f, 1.6127f)
                    curveTo(23.4184f, 2.6438f, 23.9984f, 4.0418f, 24.0f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(23.9984f, 19.9582f, 23.4184f, 21.3562f, 22.3873f, 22.3873f)
                    curveTo(21.3562f, 23.4184f, 19.9582f, 23.9984f, 18.5f, 24.0f)
                    close()
                    moveTo(5.5f, 3.0f)
                    curveTo(4.837f, 3.0f, 4.2011f, 3.2634f, 3.7322f, 3.7322f)
                    curveTo(3.2634f, 4.2011f, 3.0f, 4.837f, 3.0f, 5.5f)
                    verticalLineTo(18.5f)
                    curveTo(3.0f, 19.163f, 3.2634f, 19.7989f, 3.7322f, 20.2678f)
                    curveTo(4.2011f, 20.7366f, 4.837f, 21.0f, 5.5f, 21.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 21.0f, 19.7989f, 20.7366f, 20.2678f, 20.2678f)
                    curveTo(20.7366f, 19.7989f, 21.0f, 19.163f, 21.0f, 18.5f)
                    verticalLineTo(5.5f)
                    curveTo(21.0f, 4.837f, 20.7366f, 4.2011f, 20.2678f, 3.7322f)
                    curveTo(19.7989f, 3.2634f, 19.163f, 3.0f, 18.5f, 3.0f)
                    horizontalLineTo(5.5f)
                    close()
                    moveTo(7.992f, 9.339f)
                    verticalLineTo(14.661f)
                    curveTo(7.992f, 14.8952f, 8.0535f, 15.1252f, 8.1703f, 15.3281f)
                    curveTo(8.2872f, 15.531f, 8.4553f, 15.6997f, 8.6578f, 15.8173f)
                    curveTo(8.8603f, 15.9348f, 9.0901f, 15.9971f, 9.3243f, 15.998f)
                    curveTo(9.5584f, 15.9988f, 9.7887f, 15.9381f, 9.992f, 15.822f)
                    lineTo(15.319f, 13.161f)
                    curveTo(15.5237f, 13.0441f, 15.6939f, 12.8751f, 15.8122f, 12.6712f)
                    curveTo(15.9306f, 12.4673f, 15.9929f, 12.2358f, 15.9929f, 12.0f)
                    curveTo(15.9929f, 11.7642f, 15.9306f, 11.5327f, 15.8122f, 11.3288f)
                    curveTo(15.6939f, 11.1249f, 15.5237f, 10.9559f, 15.319f, 10.839f)
                    lineTo(9.992f, 8.178f)
                    curveTo(9.7887f, 8.0619f, 9.5584f, 8.0012f, 9.3243f, 8.002f)
                    curveTo(9.0901f, 8.0029f, 8.8603f, 8.0652f, 8.6578f, 8.1827f)
                    curveTo(8.4553f, 8.3003f, 8.2872f, 8.469f, 8.1703f, 8.6719f)
                    curveTo(8.0535f, 8.8748f, 7.992f, 9.1048f, 7.992f, 9.339f)
                    close()
                }
            }
        }
        .build()
        return _playAlt!!
    }

private var _playAlt: ImageVector? = null
