package me.localx.icons.straight.outline

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

public val Icons.Outline.MagicWand: ImageVector
    get() {
        if (_magicWand != null) {
            return _magicWand!!
        }
        _magicWand = Builder(name = "MagicWand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0811f, 5.586f)
                    lineTo(0.9001f, 18.769f)
                    curveTo(0.3586f, 19.3497f, 0.0636f, 20.118f, 0.0774f, 20.912f)
                    curveTo(0.0912f, 21.7059f, 0.4127f, 22.4635f, 0.9741f, 23.0251f)
                    curveTo(1.5355f, 23.5866f, 2.293f, 23.9083f, 3.087f, 23.9223f)
                    curveTo(3.8809f, 23.9362f, 4.6493f, 23.6415f, 5.2301f, 23.1f)
                    lineTo(18.4141f, 9.919f)
                    lineTo(14.0811f, 5.586f)
                    close()
                    moveTo(15.5861f, 9.919f)
                    lineTo(13.0001f, 12.505f)
                    lineTo(11.5001f, 11.0f)
                    lineTo(14.0861f, 8.414f)
                    lineTo(15.5861f, 9.919f)
                    close()
                    moveTo(3.8161f, 21.688f)
                    curveTo(3.614f, 21.8807f, 3.3454f, 21.9882f, 3.0661f, 21.9882f)
                    curveTo(2.7868f, 21.9882f, 2.5183f, 21.8807f, 2.3161f, 21.688f)
                    curveTo(2.1175f, 21.4889f, 2.006f, 21.2192f, 2.006f, 20.938f)
                    curveTo(2.006f, 20.6568f, 2.1175f, 20.3871f, 2.3161f, 20.188f)
                    lineTo(10.0851f, 12.418f)
                    lineTo(11.5901f, 13.923f)
                    lineTo(3.8161f, 21.688f)
                    close()
                    moveTo(21.3331f, 14.628f)
                    lineTo(24.0001f, 15.962f)
                    lineTo(21.3331f, 17.3f)
                    lineTo(20.0001f, 19.962f)
                    lineTo(18.6671f, 17.3f)
                    lineTo(16.0001f, 15.962f)
                    lineTo(18.6671f, 14.628f)
                    lineTo(20.0001f, 11.962f)
                    lineTo(21.3331f, 14.628f)
                    close()
                    moveTo(6.6671f, 5.333f)
                    lineTo(4.0001f, 4.0f)
                    lineTo(6.6671f, 2.667f)
                    lineTo(8.0001f, 0.0f)
                    lineTo(9.3331f, 2.667f)
                    lineTo(12.0001f, 4.0f)
                    lineTo(9.3331f, 5.333f)
                    lineTo(8.0001f, 8.0f)
                    lineTo(6.6671f, 5.333f)
                    close()
                    moveTo(19.3331f, 4.667f)
                    lineTo(17.0001f, 3.5f)
                    lineTo(19.3331f, 2.333f)
                    lineTo(20.5001f, 0.0f)
                    lineTo(21.6671f, 2.333f)
                    lineTo(24.0001f, 3.5f)
                    lineTo(21.6671f, 4.667f)
                    lineTo(20.5001f, 7.0f)
                    lineTo(19.3331f, 4.667f)
                    close()
                }
            }
        }
        .build()
        return _magicWand!!
    }

private var _magicWand: ImageVector? = null
