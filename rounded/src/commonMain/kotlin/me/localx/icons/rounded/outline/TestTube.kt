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
                    moveTo(18.0002f, 0.0f)
                    horizontalLineTo(6.0002f)
                    curveTo(5.7349f, 0.0f, 5.4806f, 0.1054f, 5.293f, 0.2929f)
                    curveTo(5.1055f, 0.4804f, 5.0002f, 0.7348f, 5.0002f, 1.0f)
                    curveTo(5.0002f, 1.2652f, 5.1055f, 1.5196f, 5.293f, 1.7071f)
                    curveTo(5.4806f, 1.8946f, 5.7349f, 2.0f, 6.0002f, 2.0f)
                    horizontalLineTo(7.0002f)
                    verticalLineTo(19.0f)
                    curveTo(7.0002f, 20.3261f, 7.5269f, 21.5979f, 8.4646f, 22.5355f)
                    curveTo(9.4023f, 23.4732f, 10.6741f, 24.0f, 12.0002f, 24.0f)
                    curveTo(13.3262f, 24.0f, 14.598f, 23.4732f, 15.5357f, 22.5355f)
                    curveTo(16.4734f, 21.5979f, 17.0002f, 20.3261f, 17.0002f, 19.0f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(18.0002f)
                    curveTo(18.2654f, 2.0f, 18.5197f, 1.8946f, 18.7073f, 1.7071f)
                    curveTo(18.8948f, 1.5196f, 19.0002f, 1.2652f, 19.0002f, 1.0f)
                    curveTo(19.0002f, 0.7348f, 18.8948f, 0.4804f, 18.7073f, 0.2929f)
                    curveTo(18.5197f, 0.1054f, 18.2654f, 0.0f, 18.0002f, 0.0f)
                    verticalLineTo(0.0f)
                    close()
                    moveTo(12.0002f, 22.0f)
                    curveTo(11.2045f, 22.0f, 10.4414f, 21.6839f, 9.8788f, 21.1213f)
                    curveTo(9.3162f, 20.5587f, 9.0001f, 19.7956f, 9.0001f, 19.0f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(19.0f)
                    curveTo(15.0002f, 19.7956f, 14.6841f, 20.5587f, 14.1215f, 21.1213f)
                    curveTo(13.5589f, 21.6839f, 12.7958f, 22.0f, 12.0002f, 22.0f)
                    close()
                    moveTo(15.0002f, 7.0f)
                    horizontalLineTo(9.0001f)
                    verticalLineTo(2.0f)
                    horizontalLineTo(15.0002f)
                    verticalLineTo(7.0f)
                    close()
                }
            }
        }
        .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
