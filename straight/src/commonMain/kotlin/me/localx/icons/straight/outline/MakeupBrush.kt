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

public val Icons.Outline.MakeupBrush: ImageVector
    get() {
        if (_makeupBrush != null) {
            return _makeupBrush!!
        }
        _makeupBrush = Builder(name = "MakeupBrush", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 3.475f)
                    lineTo(20.525f, 0.0f)
                    lineTo(5.434f, 13.167f)
                    lineTo(0.0f, 15.968f)
                    verticalLineTo(17.6f)
                    curveTo(0.0019f, 19.2968f, 0.6767f, 20.9236f, 1.8766f, 22.1234f)
                    curveTo(3.0764f, 23.3233f, 4.7032f, 23.9981f, 6.4f, 24.0f)
                    horizontalLineTo(8.046f)
                    lineTo(10.834f, 18.564f)
                    lineTo(24.0f, 3.475f)
                    close()
                    moveTo(9.95f, 16.536f)
                    lineTo(7.464f, 14.05f)
                    lineTo(9.264f, 12.476f)
                    lineTo(11.52f, 14.732f)
                    lineTo(9.95f, 16.536f)
                    close()
                    moveTo(21.265f, 3.568f)
                    lineTo(12.842f, 13.222f)
                    lineTo(10.778f, 11.158f)
                    lineTo(20.432f, 2.735f)
                    lineTo(21.265f, 3.568f)
                    close()
                    moveTo(6.824f, 22.0f)
                    horizontalLineTo(6.4f)
                    curveTo(5.2334f, 21.9987f, 4.1151f, 21.5347f, 3.2902f, 20.7098f)
                    curveTo(2.4653f, 19.8849f, 2.0013f, 18.7665f, 2.0f, 17.6f)
                    verticalLineTo(17.187f)
                    lineTo(5.809f, 15.224f)
                    lineTo(8.778f, 18.191f)
                    lineTo(6.824f, 22.0f)
                    close()
                }
            }
        }
        .build()
        return _makeupBrush!!
    }

private var _makeupBrush: ImageVector? = null
