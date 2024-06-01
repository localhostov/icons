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

public val Icons.Filled.MapMarkerCross: ImageVector
    get() {
        if (_mapMarkerCross != null) {
            return _mapMarkerCross!!
        }
        _mapMarkerCross = Builder(name = "MapMarkerCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0709f, 2.929f)
                    curveTo(18.1432f, 1.9943f, 17.0401f, 1.252f, 15.8248f, 0.7448f)
                    curveTo(14.6096f, 0.2376f, 13.3061f, -0.0246f, 11.9892f, -0.0267f)
                    curveTo(10.6723f, -0.0288f, 9.368f, 0.2292f, 8.1511f, 0.7325f)
                    curveTo(6.9342f, 1.2358f, 5.8287f, 1.9745f, 4.8981f, 2.9062f)
                    curveTo(3.9674f, 3.8379f, 3.23f, 4.9442f, 2.728f, 6.1617f)
                    curveTo(2.2261f, 7.3792f, 1.9696f, 8.6838f, 1.9732f, 10.0006f)
                    curveTo(1.9768f, 11.3175f, 2.2404f, 12.6207f, 2.749f, 13.8354f)
                    curveTo(3.2576f, 15.0501f, 4.0011f, 16.1524f, 4.9369f, 17.079f)
                    lineTo(11.9999f, 23.987f)
                    lineTo(19.0709f, 17.071f)
                    curveTo(20.9462f, 15.1956f, 21.9997f, 12.6521f, 21.9997f, 10.0f)
                    curveTo(21.9997f, 7.3478f, 20.9462f, 4.8043f, 19.0709f, 2.929f)
                    close()
                    moveTo(15.9709f, 12.553f)
                    lineTo(14.5569f, 13.967f)
                    lineTo(11.9999f, 11.414f)
                    lineTo(9.4469f, 13.967f)
                    lineTo(8.0329f, 12.553f)
                    lineTo(10.5859f, 10.0f)
                    lineTo(8.0329f, 7.447f)
                    lineTo(9.4469f, 6.033f)
                    lineTo(11.9999f, 8.586f)
                    lineTo(14.5529f, 6.033f)
                    lineTo(15.9669f, 7.447f)
                    lineTo(13.4139f, 10.0f)
                    lineTo(15.9709f, 12.553f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerCross!!
    }

private var _mapMarkerCross: ImageVector? = null
