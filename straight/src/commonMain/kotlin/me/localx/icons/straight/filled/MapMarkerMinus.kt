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

public val Icons.Filled.MapMarkerMinus: ImageVector
    get() {
        if (_mapMarkerMinus != null) {
            return _mapMarkerMinus!!
        }
        _mapMarkerMinus = Builder(name = "MapMarkerMinus", defaultWidth = 24.0.dp, defaultHeight =
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
                    curveTo(20.944f, 15.1944f, 21.996f, 12.6514f, 21.996f, 10.0f)
                    curveTo(21.996f, 7.3486f, 20.944f, 4.8055f, 19.0709f, 2.929f)
                    close()
                    moveTo(15.9999f, 11.0f)
                    horizontalLineTo(7.9999f)
                    verticalLineTo(9.0f)
                    horizontalLineTo(15.9999f)
                    verticalLineTo(11.0f)
                    close()
                }
            }
        }
        .build()
        return _mapMarkerMinus!!
    }

private var _mapMarkerMinus: ImageVector? = null
