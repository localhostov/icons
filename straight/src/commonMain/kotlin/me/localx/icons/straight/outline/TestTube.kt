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

public val Icons.Outline.TestTube: ImageVector
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
                    moveTo(19.0001f, 0.0f)
                    horizontalLineTo(5.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(7.0001f)
                    verticalLineTo(19.0f)
                    curveTo(7.0001f, 20.3261f, 7.5269f, 21.5979f, 8.4646f, 22.5355f)
                    curveTo(9.4023f, 23.4732f, 10.674f, 24.0f, 12.0001f, 24.0f)
                    curveTo(13.3262f, 24.0f, 14.598f, 23.4732f, 15.5357f, 22.5355f)
                    curveTo(16.4733f, 21.5979f, 17.0001f, 20.3261f, 17.0001f, 19.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0001f, 22.0f)
                    curveTo(11.2045f, 22.0f, 10.4414f, 21.6839f, 9.8788f, 21.1213f)
                    curveTo(9.3162f, 20.5587f, 9.0001f, 19.7956f, 9.0001f, 19.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(19.0f)
                    curveTo(15.0001f, 19.7956f, 14.6841f, 20.5587f, 14.1214f, 21.1213f)
                    curveTo(13.5588f, 21.6839f, 12.7958f, 22.0f, 12.0001f, 22.0f)
                    close()
                    moveTo(15.0001f, 7.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(15.0001f)
                    verticalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
