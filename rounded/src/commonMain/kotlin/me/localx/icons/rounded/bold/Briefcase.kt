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

public val Icons.Bold.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.5f, 3.0f)
                    horizontalLineTo(17.858f)
                    curveTo(17.637f, 2.1439f, 17.1385f, 1.3851f, 16.4404f, 0.8423f)
                    curveTo(15.7424f, 0.2995f, 14.8842f, 0.0033f, 14.0f, 0.0f)
                    lineTo(10.0f, 0.0f)
                    curveTo(9.1158f, 0.0033f, 8.2576f, 0.2995f, 7.5596f, 0.8423f)
                    curveTo(6.8615f, 1.3851f, 6.363f, 2.1439f, 6.142f, 3.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.0418f, 3.0016f, 2.6438f, 3.5816f, 1.6127f, 4.6127f)
                    curveTo(0.5816f, 5.6438f, 0.0016f, 7.0418f, 0.0f, 8.5f)
                    lineTo(0.0f, 18.5f)
                    curveTo(0.0016f, 19.9582f, 0.5816f, 21.3562f, 1.6127f, 22.3873f)
                    curveTo(2.6438f, 23.4184f, 4.0418f, 23.9984f, 5.5f, 24.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.9581f, 23.9981f, 21.356f, 23.4181f, 22.387f, 22.387f)
                    curveTo(23.4181f, 21.356f, 23.9981f, 19.9581f, 24.0f, 18.5f)
                    verticalLineTo(8.5f)
                    curveTo(23.9981f, 7.0419f, 23.4181f, 5.644f, 22.387f, 4.613f)
                    curveTo(21.356f, 3.5819f, 19.9581f, 3.0018f, 18.5f, 3.0f)
                    close()
                    moveTo(5.5f, 6.0f)
                    horizontalLineTo(18.5f)
                    curveTo(19.163f, 6.0f, 19.7989f, 6.2634f, 20.2678f, 6.7322f)
                    curveTo(20.7366f, 7.2011f, 21.0f, 7.837f, 21.0f, 8.5f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(8.5f)
                    curveTo(3.0f, 7.837f, 3.2634f, 7.2011f, 3.7322f, 6.7322f)
                    curveTo(4.2011f, 6.2634f, 4.837f, 6.0f, 5.5f, 6.0f)
                    close()
                    moveTo(18.5f, 21.0f)
                    horizontalLineTo(5.5f)
                    curveTo(4.837f, 21.0f, 4.2011f, 20.7366f, 3.7322f, 20.2678f)
                    curveTo(3.2634f, 19.7989f, 3.0f, 19.163f, 3.0f, 18.5f)
                    verticalLineTo(14.0f)
                    horizontalLineTo(10.0f)
                    curveTo(10.0f, 14.5304f, 10.2107f, 15.0391f, 10.5858f, 15.4142f)
                    curveTo(10.9609f, 15.7893f, 11.4696f, 16.0f, 12.0f, 16.0f)
                    curveTo(12.5304f, 16.0f, 13.0391f, 15.7893f, 13.4142f, 15.4142f)
                    curveTo(13.7893f, 15.0391f, 14.0f, 14.5304f, 14.0f, 14.0f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(18.5f)
                    curveTo(21.0f, 19.163f, 20.7366f, 19.7989f, 20.2678f, 20.2678f)
                    curveTo(19.7989f, 20.7366f, 19.163f, 21.0f, 18.5f, 21.0f)
                    close()
                }
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
