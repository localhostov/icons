package me.localx.icons.straight.bold

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

public val Icons.Bold.TimeCheck: ImageVector
    get() {
        if (_timeCheck != null) {
            return _timeCheck!!
        }
        _timeCheck = Builder(name = "TimeCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.4849f, 23.3f)
                    lineTo(23.9999f, 16.785f)
                    lineTo(21.8789f, 14.664f)
                    lineTo(15.7999f, 20.741f)
                    lineTo(12.6999f, 17.551f)
                    lineTo(10.5419f, 19.63f)
                    lineTo(14.0539f, 23.246f)
                    curveTo(14.2733f, 23.4806f, 14.5379f, 23.6684f, 14.8318f, 23.7979f)
                    curveTo(15.1257f, 23.9275f, 15.4428f, 23.9963f, 15.7639f, 24.0f)
                    horizontalLineTo(15.7999f)
                    curveTo(16.1131f, 24.0002f, 16.4232f, 23.9385f, 16.7124f, 23.8183f)
                    curveTo(17.0015f, 23.6982f, 17.2641f, 23.522f, 17.4849f, 23.3f)
                    close()
                    moveTo(9.9999f, 6.0f)
                    verticalLineTo(11.379f)
                    lineTo(7.4389f, 13.939f)
                    lineTo(9.5609f, 16.061f)
                    lineTo(12.9999f, 12.621f)
                    verticalLineTo(6.0f)
                    horizontalLineTo(9.9999f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, -1.0E-4f)
                    curveTo(9.0798f, -0.0022f, 6.2592f, 1.0612f, 4.0673f, 2.9907f)
                    curveTo(1.8754f, 4.9202f, 0.4629f, 7.5831f, 0.0947f, 10.48f)
                    curveTo(-0.2735f, 13.3769f, 0.428f, 16.3085f, 2.0676f, 18.725f)
                    curveTo(3.7072f, 21.1414f, 6.1721f, 22.8766f, 9.0f, 23.6049f)
                    verticalLineTo(20.4749f)
                    curveTo(7.3986f, 19.9127f, 5.9885f, 18.9098f, 4.9318f, 17.5815f)
                    curveTo(3.8752f, 16.2533f, 3.2151f, 14.6537f, 3.0273f, 12.9669f)
                    curveTo(2.8396f, 11.2801f, 3.1319f, 9.5745f, 3.8707f, 8.0465f)
                    curveTo(4.6094f, 6.5184f, 5.7646f, 5.23f, 7.2032f, 4.3295f)
                    curveTo(8.6418f, 3.4289f, 10.3054f, 2.9528f, 12.0027f, 2.9559f)
                    curveTo(13.6999f, 2.959f, 15.3618f, 3.4413f, 16.7971f, 4.3471f)
                    curveTo(18.2323f, 5.253f, 19.3827f, 6.5457f, 20.1158f, 8.0764f)
                    curveTo(20.8489f, 9.6072f, 21.1349f, 11.3138f, 20.941f, 12.9999f)
                    horizontalLineTo(23.949f)
                    curveTo(23.977f, 12.6689f, 24.0f, 12.3379f, 24.0f, 11.9999f)
                    curveTo(23.9966f, 8.8184f, 22.7312f, 5.7681f, 20.4815f, 3.5185f)
                    curveTo(18.2318f, 1.2688f, 15.1815f, 0.0034f, 12.0f, -1.0E-4f)
                    close()
                }
            }
        }
        .build()
        return _timeCheck!!
    }

private var _timeCheck: ImageVector? = null
