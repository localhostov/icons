package me.localx.icons.straight.filled

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
                    moveTo(7.0001f, 2.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(17.0001f)
                    verticalLineTo(7.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(2.0f)
                    close()
                    moveTo(7.0001f, 9.0f)
                    verticalLineTo(19.0f)
                    curveTo(7.0001f, 20.3261f, 7.5269f, 21.5979f, 8.4646f, 22.5355f)
                    curveTo(9.4023f, 23.4732f, 10.674f, 24.0f, 12.0001f, 24.0f)
                    curveTo(13.3262f, 24.0f, 14.598f, 23.4732f, 15.5357f, 22.5355f)
                    curveTo(16.4733f, 21.5979f, 17.0001f, 20.3261f, 17.0001f, 19.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(7.0001f)
                    close()
                }
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
