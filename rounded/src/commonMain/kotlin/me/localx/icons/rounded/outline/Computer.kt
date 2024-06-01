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

public val Icons.Outline.Computer: ImageVector
    get() {
        if (_computer != null) {
            return _computer!!
        }
        _computer = Builder(name = "Computer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 1.0015f, 2.4036f, 1.5288f, 1.4662f, 2.4661f)
                    curveTo(0.5289f, 3.4034f, 0.0016f, 4.6743f, 0.0f, 5.9999f)
                    lineTo(0.0f, 13.9999f)
                    curveTo(0.0016f, 15.3255f, 0.5289f, 16.5963f, 1.4662f, 17.5337f)
                    curveTo(2.4036f, 18.471f, 3.6744f, 18.9983f, 5.0f, 18.9999f)
                    horizontalLineTo(11.0f)
                    verticalLineTo(20.9999f)
                    horizontalLineTo(7.0f)
                    curveTo(6.7348f, 20.9999f, 6.4804f, 21.1052f, 6.2929f, 21.2928f)
                    curveTo(6.1054f, 21.4803f, 6.0f, 21.7347f, 6.0f, 21.9999f)
                    curveTo(6.0f, 22.2651f, 6.1054f, 22.5194f, 6.2929f, 22.707f)
                    curveTo(6.4804f, 22.8945f, 6.7348f, 22.9999f, 7.0f, 22.9999f)
                    horizontalLineTo(17.0f)
                    curveTo(17.2652f, 22.9999f, 17.5196f, 22.8945f, 17.7071f, 22.707f)
                    curveTo(17.8946f, 22.5194f, 18.0f, 22.2651f, 18.0f, 21.9999f)
                    curveTo(18.0f, 21.7347f, 17.8946f, 21.4803f, 17.7071f, 21.2928f)
                    curveTo(17.5196f, 21.1052f, 17.2652f, 20.9999f, 17.0f, 20.9999f)
                    horizontalLineTo(13.0f)
                    verticalLineTo(18.9999f)
                    horizontalLineTo(19.0f)
                    curveTo(20.3256f, 18.9983f, 21.5964f, 18.471f, 22.5338f, 17.5337f)
                    curveTo(23.4711f, 16.5963f, 23.9984f, 15.3255f, 24.0f, 13.9999f)
                    verticalLineTo(5.9999f)
                    curveTo(23.9984f, 4.6743f, 23.4711f, 3.4034f, 22.5338f, 2.4661f)
                    curveTo(21.5964f, 1.5288f, 20.3256f, 1.0015f, 19.0f, 0.9999f)
                    close()
                    moveTo(5.0f, 2.9999f)
                    horizontalLineTo(19.0f)
                    curveTo(19.7956f, 2.9999f, 20.5587f, 3.3159f, 21.1213f, 3.8786f)
                    curveTo(21.6839f, 4.4412f, 22.0f, 5.2042f, 22.0f, 5.9999f)
                    verticalLineTo(12.9999f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(5.9999f)
                    curveTo(2.0f, 5.2042f, 2.3161f, 4.4412f, 2.8787f, 3.8786f)
                    curveTo(3.4413f, 3.3159f, 4.2043f, 2.9999f, 5.0f, 2.9999f)
                    close()
                    moveTo(19.0f, 16.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(4.3817f, 16.9973f, 3.7794f, 16.8038f, 3.2753f, 16.4458f)
                    curveTo(2.7712f, 16.0878f, 2.3901f, 15.5828f, 2.184f, 14.9999f)
                    horizontalLineTo(21.816f)
                    curveTo(21.6099f, 15.5828f, 21.2288f, 16.0878f, 20.7247f, 16.4458f)
                    curveTo(20.2206f, 16.8038f, 19.6183f, 16.9973f, 19.0f, 16.9999f)
                    close()
                }
            }
        }
        .build()
        return _computer!!
    }

private var _computer: ImageVector? = null
