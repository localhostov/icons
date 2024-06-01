package me.localx.icons.rounded.bold

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

public val Icons.Bold.ChartPyramid: ImageVector
    get() {
        if (_chartPyramid != null) {
            return _chartPyramid!!
        }
        _chartPyramid = Builder(name = "ChartPyramid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.4991f, 17.6724f)
                    lineTo(15.9229f, 2.4302f)
                    curveTo(14.847f, 0.2639f, 12.2188f, -0.62f, 10.0525f, 0.4559f)
                    curveTo(9.1966f, 0.8809f, 8.5033f, 1.5743f, 8.0782f, 2.4302f)
                    lineTo(0.502f, 17.6724f)
                    curveTo(-0.5745f, 19.839f, 0.3092f, 22.468f, 2.4757f, 23.5445f)
                    curveTo(3.0815f, 23.8455f, 3.7489f, 24.0021f, 4.4254f, 24.002f)
                    horizontalLineTo(19.5758f)
                    curveTo(21.995f, 24.0023f, 23.9564f, 22.0413f, 23.9567f, 19.622f)
                    curveTo(23.9568f, 18.9456f, 23.8001f, 18.2783f, 23.4991f, 17.6724f)
                    close()
                    moveTo(18.5877f, 14.5206f)
                    horizontalLineTo(5.4134f)
                    lineTo(7.3976f, 10.5284f)
                    horizontalLineTo(16.6055f)
                    lineTo(18.5877f, 14.5206f)
                    close()
                    moveTo(12.0005f, 2.9931f)
                    curveTo(12.5285f, 2.9873f, 13.0124f, 3.2871f, 13.2421f, 3.7626f)
                    lineTo(15.1165f, 7.5342f)
                    horizontalLineTo(8.8846f)
                    lineTo(10.759f, 3.7626f)
                    curveTo(10.9891f, 3.2875f, 11.4727f, 2.9878f, 12.0005f, 2.9931f)
                    close()
                    moveTo(20.7544f, 20.3512f)
                    curveTo(20.5043f, 20.762f, 20.0568f, 21.0114f, 19.5757f, 21.0079f)
                    horizontalLineTo(4.4254f)
                    curveTo(3.6597f, 21.0079f, 3.039f, 20.3873f, 3.039f, 19.6217f)
                    curveTo(3.039f, 19.4076f, 3.0886f, 19.1965f, 3.1838f, 19.0048f)
                    lineTo(3.9243f, 17.5147f)
                    horizontalLineTo(20.0768f)
                    lineTo(20.8173f, 19.0048f)
                    curveTo(21.0352f, 19.4333f, 21.0113f, 19.9449f, 20.7544f, 20.3512f)
                    close()
                }
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null
