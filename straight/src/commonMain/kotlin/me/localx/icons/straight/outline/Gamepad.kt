package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.4f, 3.0f)
                    horizontalLineTo(3.6f)
                    lineTo(3.3f, 3.3f)
                    curveTo(1.2f, 5.7f, 0.0f, 8.8f, 0.0f, 12.0f)
                    curveTo(0.0f, 17.5f, 2.2f, 22.0f, 5.0f, 22.0f)
                    curveTo(7.2f, 22.0f, 8.3f, 18.8f, 8.8f, 17.0f)
                    horizontalLineTo(15.2f)
                    curveTo(15.7f, 18.8f, 16.8f, 22.0f, 19.0f, 22.0f)
                    curveTo(21.8f, 22.0f, 24.0f, 17.5f, 24.0f, 12.0f)
                    curveTo(24.0f, 8.8f, 22.8f, 5.7f, 20.7f, 3.3f)
                    lineTo(20.4f, 3.0f)
                    close()
                    moveTo(19.0f, 20.0f)
                    curveTo(18.4f, 20.0f, 17.4f, 17.9f, 17.0f, 15.8f)
                    lineTo(16.8f, 15.0f)
                    horizontalLineTo(7.2f)
                    lineTo(7.0f, 15.8f)
                    curveTo(6.6f, 17.9f, 5.6f, 20.0f, 5.0f, 20.0f)
                    curveTo(4.0f, 20.0f, 2.0f, 16.9f, 2.0f, 12.0f)
                    curveTo(2.0f, 9.5f, 2.9f, 7.0f, 4.5f, 5.0f)
                    horizontalLineTo(19.6f)
                    curveTo(21.2f, 7.0f, 22.0f, 9.5f, 22.0f, 12.0f)
                    curveTo(22.0f, 16.9f, 20.0f, 20.0f, 19.0f, 20.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.0003f, 7.0002f)
                    horizontalLineTo(6.0003f)
                    verticalLineTo(9.0002f)
                    horizontalLineTo(4.0003f)
                    verticalLineTo(11.0002f)
                    horizontalLineTo(6.0003f)
                    verticalLineTo(13.0002f)
                    horizontalLineTo(8.0003f)
                    verticalLineTo(11.0002f)
                    horizontalLineTo(10.0003f)
                    verticalLineTo(9.0002f)
                    horizontalLineTo(8.0003f)
                    verticalLineTo(7.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.4997f, 10.0002f)
                    curveTo(19.3281f, 10.0002f, 19.9997f, 9.3287f, 19.9997f, 8.5002f)
                    curveTo(19.9997f, 7.6718f, 19.3281f, 7.0002f, 18.4997f, 7.0002f)
                    curveTo(17.6713f, 7.0002f, 16.9997f, 7.6718f, 16.9997f, 8.5002f)
                    curveTo(16.9997f, 9.3287f, 17.6713f, 10.0002f, 18.4997f, 10.0002f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(15.4997f, 13.0002f)
                    curveTo(16.3281f, 13.0002f, 16.9997f, 12.3287f, 16.9997f, 11.5002f)
                    curveTo(16.9997f, 10.6718f, 16.3281f, 10.0002f, 15.4997f, 10.0002f)
                    curveTo(14.6713f, 10.0002f, 13.9997f, 10.6718f, 13.9997f, 11.5002f)
                    curveTo(13.9997f, 12.3287f, 14.6713f, 13.0002f, 15.4997f, 13.0002f)
                    close()
                }
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
