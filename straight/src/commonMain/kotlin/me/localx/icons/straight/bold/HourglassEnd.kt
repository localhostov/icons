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

public val Icons.Bold.HourglassEnd: ImageVector
    get() {
        if (_hourglassEnd != null) {
            return _hourglassEnd!!
        }
        _hourglassEnd = Builder(name = "HourglassEnd", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(21.0f, 24.0f)
                    horizontalLineTo(3.0f)
                    verticalLineTo(20.591f)
                    curveTo(3.0438f, 18.9629f, 3.42f, 17.3608f, 4.1057f, 15.8835f)
                    curveTo(4.7913f, 14.4061f, 5.7718f, 13.0845f, 6.987f, 12.0f)
                    curveTo(5.7715f, 10.9158f, 4.7908f, 9.5942f, 4.1051f, 8.1168f)
                    curveTo(3.4194f, 6.6394f, 3.0433f, 5.0372f, 3.0f, 3.409f)
                    curveTo(3.0008f, 2.5051f, 3.3602f, 1.6385f, 3.9994f, 0.9994f)
                    curveTo(4.6385f, 0.3602f, 5.5051f, 8.0E-4f, 6.409f, 0.0f)
                    lineTo(17.591f, 0.0f)
                    curveTo(18.4948f, 0.0011f, 19.3613f, 0.3606f, 20.0004f, 0.9996f)
                    curveTo(20.6394f, 1.6387f, 20.9989f, 2.5052f, 21.0f, 3.409f)
                    curveTo(20.9571f, 5.0359f, 20.5827f, 6.6368f, 19.8997f, 8.114f)
                    curveTo(19.2168f, 9.5912f, 18.2396f, 10.9135f, 17.028f, 12.0f)
                    curveTo(18.2396f, 13.0865f, 19.2168f, 14.4088f, 19.8997f, 15.886f)
                    curveTo(20.5827f, 17.3632f, 20.9571f, 18.9641f, 21.0f, 20.591f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(6.0f, 21.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(20.591f)
                    curveTo(18.0f, 17.207f, 15.729f, 14.691f, 13.823f, 13.174f)
                    lineTo(12.347f, 12.0f)
                    lineTo(13.823f, 10.826f)
                    curveTo(15.729f, 9.311f, 18.0f, 6.793f, 18.0f, 3.409f)
                    curveTo(17.9997f, 3.3006f, 17.9566f, 3.1967f, 17.8799f, 3.1201f)
                    curveTo(17.8033f, 3.0434f, 17.6994f, 3.0003f, 17.591f, 3.0f)
                    horizontalLineTo(6.409f)
                    curveTo(6.3006f, 3.0003f, 6.1967f, 3.0434f, 6.1201f, 3.1201f)
                    curveTo(6.0434f, 3.1967f, 6.0003f, 3.3006f, 6.0f, 3.409f)
                    curveTo(6.0f, 6.795f, 8.281f, 9.309f, 10.2f, 10.823f)
                    lineTo(11.682f, 12.0f)
                    lineTo(10.2f, 13.176f)
                    curveTo(8.282f, 14.691f, 6.0f, 17.207f, 6.0f, 20.591f)
                    verticalLineTo(21.0f)
                    close()
                    moveTo(12.012f, 14.289f)
                    lineTo(12.578f, 14.739f)
                    curveTo(14.0385f, 15.8122f, 15.1471f, 17.2954f, 15.763f, 19.0f)
                    horizontalLineTo(8.239f)
                    curveTo(8.8599f, 17.2956f, 9.9738f, 15.8144f, 11.439f, 14.745f)
                    lineTo(12.015f, 14.289f)
                }
            }
        }
        .build()
        return _hourglassEnd!!
    }

private var _hourglassEnd: ImageVector? = null
