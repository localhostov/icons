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

public val Icons.Filled.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(7.9999f, 3.0f)
                    curveTo(7.9999f, 2.4066f, 8.1758f, 1.8266f, 8.5055f, 1.3333f)
                    curveTo(8.8351f, 0.8399f, 9.3037f, 0.4554f, 9.8518f, 0.2283f)
                    curveTo(10.4f, 0.0013f, 11.0032f, -0.0581f, 11.5852f, 0.0576f)
                    curveTo(12.1671f, 0.1734f, 12.7017f, 0.4591f, 13.1212f, 0.8787f)
                    curveTo(13.5408f, 1.2982f, 13.8265f, 1.8328f, 13.9422f, 2.4147f)
                    curveTo(14.058f, 2.9966f, 13.9986f, 3.5998f, 13.7715f, 4.148f)
                    curveTo(13.5445f, 4.6962f, 13.1599f, 5.1647f, 12.6666f, 5.4944f)
                    curveTo(12.1733f, 5.824f, 11.5932f, 6.0f, 10.9999f, 6.0f)
                    curveTo(10.2042f, 6.0f, 9.4412f, 5.6839f, 8.8786f, 5.1213f)
                    curveTo(8.316f, 4.5587f, 7.9999f, 3.7956f, 7.9999f, 3.0f)
                    close()
                    moveTo(21.7209f, 21.0f)
                    lineTo(19.7209f, 15.0f)
                    horizontalLineTo(12.9999f)
                    curveTo(12.7347f, 15.0f, 12.4803f, 14.8946f, 12.2928f, 14.7071f)
                    curveTo(12.1052f, 14.5195f, 11.9999f, 14.2652f, 11.9999f, 14.0f)
                    verticalLineTo(13.0f)
                    horizontalLineTo(18.9999f)
                    verticalLineTo(11.0f)
                    horizontalLineTo(11.9999f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(9.9999f)
                    verticalLineTo(14.0f)
                    curveTo(9.9999f, 14.7956f, 10.316f, 15.5587f, 10.8786f, 16.1213f)
                    curveTo(11.4412f, 16.6839f, 12.2042f, 17.0f, 12.9999f, 17.0f)
                    horizontalLineTo(18.2799f)
                    lineTo(20.2799f, 23.0f)
                    horizontalLineTo(23.9999f)
                    verticalLineTo(21.0f)
                    horizontalLineTo(21.7209f)
                    close()
                    moveTo(7.9999f, 14.0f)
                    verticalLineTo(8.0f)
                    curveTo(6.5481f, 7.999f, 5.1235f, 8.3931f, 3.8786f, 9.1401f)
                    curveTo(2.6338f, 9.887f, 1.6157f, 10.9586f, 0.9333f, 12.24f)
                    curveTo(0.251f, 13.5214f, -0.0697f, 14.9643f, 0.0054f, 16.4141f)
                    curveTo(0.0806f, 17.8639f, 0.5488f, 19.266f, 1.36f, 20.47f)
                    curveTo(2.1711f, 21.6739f, 3.2946f, 22.6345f, 4.6101f, 23.2487f)
                    curveTo(5.9255f, 23.8629f, 7.3832f, 24.1076f, 8.8271f, 23.9565f)
                    curveTo(10.271f, 23.8055f, 11.6465f, 23.2644f, 12.8063f, 22.3912f)
                    curveTo(13.9661f, 21.5181f, 14.8665f, 20.3458f, 15.4109f, 19.0f)
                    horizontalLineTo(12.9999f)
                    curveTo(11.6743f, 18.9984f, 10.4034f, 18.4711f, 9.4661f, 17.5338f)
                    curveTo(8.5288f, 16.5964f, 8.0015f, 15.3256f, 7.9999f, 14.0f)
                    close()
                }
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
