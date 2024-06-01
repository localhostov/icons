package me.localx.icons.straight.bold

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
                    moveTo(18.9999f, 0.0f)
                    horizontalLineTo(4.9999f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(6.9999f)
                    verticalLineTo(19.0f)
                    curveTo(6.9999f, 20.3261f, 7.5267f, 21.5979f, 8.4644f, 22.5355f)
                    curveTo(9.4021f, 23.4732f, 10.6739f, 24.0f, 11.9999f, 24.0f)
                    curveTo(13.326f, 24.0f, 14.5978f, 23.4732f, 15.5355f, 22.5355f)
                    curveTo(16.4732f, 21.5979f, 16.9999f, 20.3261f, 16.9999f, 19.0f)
                    verticalLineTo(3.0f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(11.9999f, 21.0f)
                    curveTo(11.4695f, 21.0f, 10.9608f, 20.7893f, 10.5857f, 20.4142f)
                    curveTo(10.2107f, 20.0391f, 9.9999f, 19.5304f, 9.9999f, 19.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(13.9999f)
                    verticalLineTo(19.0f)
                    curveTo(13.9999f, 19.5304f, 13.7892f, 20.0391f, 13.4142f, 20.4142f)
                    curveTo(13.0391f, 20.7893f, 12.5304f, 21.0f, 11.9999f, 21.0f)
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
