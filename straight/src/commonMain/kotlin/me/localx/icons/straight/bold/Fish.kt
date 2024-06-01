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

public val Icons.Bold.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.143f, 3.857f)
                    curveTo(20.1375f, 2.8358f, 19.7294f, 1.8579f, 19.0072f, 1.1358f)
                    curveTo(18.2851f, 0.4136f, 17.3072f, 0.0055f, 16.286f, 0.0f)
                    curveTo(15.515f, 0.0f, 15.0f, 0.384f, 15.0f, 1.155f)
                    verticalLineTo(7.02f)
                    lineTo(14.03f, 7.03f)
                    curveTo(12.938f, 7.061f, 11.943f, 7.14f, 11.0f, 7.248f)
                    verticalLineTo(4.848f)
                    curveTo(8.5926f, 4.8565f, 6.222f, 5.4393f, 4.085f, 6.548f)
                    curveTo(3.7593f, 6.7163f, 3.486f, 6.9707f, 3.2947f, 7.2834f)
                    curveTo(3.1034f, 7.5962f, 3.0015f, 7.9554f, 3.0f, 8.322f)
                    verticalLineTo(10.622f)
                    curveTo(0.833f, 13.033f, 0.0f, 16.821f, 0.0f, 22.5f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(1.5f)
                    curveTo(9.845f, 24.0f, 14.1f, 22.188f, 15.9f, 17.0f)
                    horizontalLineTo(17.014f)
                    curveTo(17.4839f, 17.0001f, 17.9385f, 16.8329f, 18.2963f, 16.5284f)
                    curveTo(18.6542f, 16.2238f, 18.8919f, 15.8019f, 18.967f, 15.338f)
                    lineTo(19.343f, 13.0f)
                    horizontalLineTo(16.752f)
                    curveTo(16.86f, 12.057f, 16.939f, 11.062f, 16.97f, 9.97f)
                    lineTo(16.98f, 9.0f)
                    horizontalLineTo(22.845f)
                    curveTo(23.616f, 9.0f, 24.0f, 8.485f, 24.0f, 7.714f)
                    curveTo(23.9945f, 6.6928f, 23.5864f, 5.7149f, 22.8642f, 4.9928f)
                    curveTo(22.1421f, 4.2706f, 21.1642f, 3.8625f, 20.143f, 3.857f)
                    close()
                    moveTo(4.5f, 21.0f)
                    curveTo(4.1022f, 21.0f, 3.7206f, 20.842f, 3.4393f, 20.5607f)
                    curveTo(3.158f, 20.2794f, 3.0f, 19.8978f, 3.0f, 19.5f)
                    curveTo(3.0f, 19.1022f, 3.158f, 18.7206f, 3.4393f, 18.4393f)
                    curveTo(3.7206f, 18.158f, 4.1022f, 18.0f, 4.5f, 18.0f)
                    curveTo(4.8978f, 18.0f, 5.2794f, 18.158f, 5.5607f, 18.4393f)
                    curveTo(5.842f, 18.7206f, 6.0f, 19.1022f, 6.0f, 19.5f)
                    curveTo(6.0f, 19.8978f, 5.842f, 20.2794f, 5.5607f, 20.5607f)
                    curveTo(5.2794f, 20.842f, 4.8978f, 21.0f, 4.5f, 21.0f)
                    close()
                    moveTo(9.675f, 19.826f)
                    curveTo(9.2117f, 18.5665f, 8.4775f, 17.4242f, 7.5242f, 16.4797f)
                    curveTo(6.5708f, 15.5352f, 5.4217f, 14.8116f, 4.158f, 14.36f)
                    curveTo(5.558f, 11.251f, 8.45f, 10.171f, 13.98f, 10.02f)
                    curveTo(13.829f, 15.529f, 12.757f, 18.419f, 9.675f, 19.826f)
                    close()
                }
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
