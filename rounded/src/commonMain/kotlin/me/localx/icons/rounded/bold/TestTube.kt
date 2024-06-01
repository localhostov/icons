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

public val Icons.Bold.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(name = "TestTube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.4999f, 0.0f)
                    horizontalLineTo(6.4999f)
                    curveTo(6.1021f, 0.0f, 5.7206f, 0.158f, 5.4392f, 0.4393f)
                    curveTo(5.1579f, 0.7206f, 4.9999f, 1.1022f, 4.9999f, 1.5f)
                    curveTo(4.9999f, 1.8978f, 5.1579f, 2.2794f, 5.4392f, 2.5607f)
                    curveTo(5.7206f, 2.842f, 6.1021f, 3.0f, 6.4999f, 3.0f)
                    horizontalLineTo(6.9999f)
                    verticalLineTo(19.0f)
                    curveTo(6.9999f, 20.3261f, 7.5267f, 21.5979f, 8.4644f, 22.5355f)
                    curveTo(9.4021f, 23.4732f, 10.6738f, 24.0f, 11.9999f, 24.0f)
                    curveTo(13.326f, 24.0f, 14.5978f, 23.4732f, 15.5354f, 22.5355f)
                    curveTo(16.4731f, 21.5979f, 16.9999f, 20.3261f, 16.9999f, 19.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(17.4999f)
                    curveTo(17.8977f, 3.0f, 18.2793f, 2.842f, 18.5606f, 2.5607f)
                    curveTo(18.8419f, 2.2794f, 18.9999f, 1.8978f, 18.9999f, 1.5f)
                    curveTo(18.9999f, 1.1022f, 18.8419f, 0.7206f, 18.5606f, 0.4393f)
                    curveTo(18.2793f, 0.158f, 17.8977f, 0.0f, 17.4999f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(11.9999f, 21.0f)
                    curveTo(11.4695f, 21.0f, 10.9608f, 20.7893f, 10.5857f, 20.4142f)
                    curveTo(10.2106f, 20.0391f, 9.9999f, 19.5304f, 9.9999f, 19.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(13.9999f)
                    verticalLineTo(19.0f)
                    curveTo(13.9999f, 19.5304f, 13.7892f, 20.0391f, 13.4141f, 20.4142f)
                    curveTo(13.039f, 20.7893f, 12.5303f, 21.0f, 11.9999f, 21.0f)
                    close()
                    moveTo(13.9999f, 7.0f)
                    horizontalLineTo(9.9999f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(13.9999f)
                    verticalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
