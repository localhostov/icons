package me.localx.icons.straight.filled

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

public val Icons.Filled.ChartPyramid: ImageVector
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
                    moveTo(17.3459f, 9.0001f)
                    lineTo(13.9049f, 1.2431f)
                    curveTo(13.74f, 0.8757f, 13.4725f, 0.5639f, 13.1345f, 0.3451f)
                    curveTo(12.7965f, 0.1263f, 12.4025f, 0.0099f, 11.9999f, 0.0099f)
                    curveTo(11.5972f, 0.0099f, 11.2032f, 0.1263f, 10.8652f, 0.3451f)
                    curveTo(10.5272f, 0.5639f, 10.2597f, 0.8757f, 10.0949f, 1.2431f)
                    lineTo(6.6539f, 9.0001f)
                    horizontalLineTo(17.3459f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(20.4511f, 16.0001f)
                    lineTo(18.2331f, 11.0001f)
                    horizontalLineTo(5.7671f)
                    lineTo(3.5491f, 16.0001f)
                    horizontalLineTo(20.4511f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.339f, 18.0f)
                    horizontalLineTo(2.661f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(24.0f)
                    lineTo(21.339f, 18.0f)
                    close()
                }
            }
        }
        .build()
        return _chartPyramid!!
    }

private var _chartPyramid: ImageVector? = null
