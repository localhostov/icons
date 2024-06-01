package me.localx.icons.rounded.filled

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

public val Icons.Filled.TestTube: ImageVector
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
                    moveTo(4.9999f, 1.0f)
                    curveTo(4.9999f, 0.7348f, 5.1053f, 0.4804f, 5.2928f, 0.2929f)
                    curveTo(5.4803f, 0.1054f, 5.7347f, 0.0f, 5.9999f, 0.0f)
                    lineTo(17.9999f, 0.0f)
                    curveTo(18.2651f, 0.0f, 18.5195f, 0.1054f, 18.707f, 0.2929f)
                    curveTo(18.8946f, 0.4804f, 18.9999f, 0.7348f, 18.9999f, 1.0f)
                    curveTo(18.9999f, 1.2652f, 18.8946f, 1.5196f, 18.707f, 1.7071f)
                    curveTo(18.5195f, 1.8946f, 18.2651f, 2.0f, 17.9999f, 2.0f)
                    horizontalLineTo(16.9999f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(6.9999f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(5.9999f)
                    curveTo(5.7347f, 2.0f, 5.4803f, 1.8946f, 5.2928f, 1.7071f)
                    curveTo(5.1053f, 1.5196f, 4.9999f, 1.2652f, 4.9999f, 1.0f)
                    close()
                    moveTo(6.9999f, 9.0f)
                    verticalLineTo(19.0f)
                    curveTo(6.9999f, 20.3261f, 7.5267f, 21.5979f, 8.4644f, 22.5355f)
                    curveTo(9.4021f, 23.4732f, 10.6738f, 24.0f, 11.9999f, 24.0f)
                    curveTo(13.326f, 24.0f, 14.5978f, 23.4732f, 15.5354f, 22.5355f)
                    curveTo(16.4731f, 21.5979f, 16.9999f, 20.3261f, 16.9999f, 19.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(6.9999f)
                    close()
                }
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
