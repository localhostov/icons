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

public val Icons.Outline.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 5.0f)
                    horizontalLineTo(20.414f)
                    lineTo(23.707f, 1.707f)
                    lineTo(22.293f, 0.293f)
                    lineTo(19.0f, 3.586f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(17.0f)
                    verticalLineTo(5.456f)
                    curveTo(16.1815f, 4.5846f, 15.2152f, 3.8649f, 14.146f, 3.33f)
                    curveTo(13.3953f, 2.9989f, 12.5569f, 2.922f, 11.7585f, 3.1112f)
                    curveTo(10.9601f, 3.3004f, 10.2453f, 3.7452f, 9.723f, 4.378f)
                    curveTo(7.31f, 6.791f, 1.708f, 20.1f, 1.077f, 21.615f)
                    lineTo(0.139f, 23.861f)
                    lineTo(2.386f, 22.923f)
                    curveTo(3.896f, 22.292f, 17.21f, 16.69f, 19.622f, 14.277f)
                    curveTo(20.2546f, 13.7548f, 20.6994f, 13.0402f, 20.8887f, 12.2421f)
                    curveTo(21.0781f, 11.4439f, 21.0016f, 10.6057f, 20.671f, 9.855f)
                    curveTo(20.1354f, 8.7856f, 19.4154f, 7.8192f, 18.544f, 7.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(5.0f)
                    close()
                    moveTo(18.208f, 12.863f)
                    curveTo(17.4819f, 13.473f, 16.6892f, 13.999f, 15.845f, 14.431f)
                    lineTo(13.457f, 12.043f)
                    lineTo(12.043f, 13.457f)
                    lineTo(14.0f, 15.416f)
                    curveTo(11.084f, 16.916f, 7.216f, 18.675f, 3.887f, 20.116f)
                    curveTo(4.724f, 18.175f, 5.673f, 16.051f, 6.615f, 14.036f)
                    lineTo(8.605f, 16.02f)
                    lineTo(10.02f, 14.605f)
                    lineTo(7.529f, 12.115f)
                    curveTo(8.429f, 10.253f, 9.289f, 8.598f, 9.998f, 7.415f)
                    lineTo(12.543f, 9.96f)
                    lineTo(13.957f, 8.546f)
                    lineTo(11.174f, 5.76f)
                    curveTo(12.021f, 4.971f, 12.54f, 4.838f, 13.357f, 5.168f)
                    curveTo(14.4911f, 5.8152f, 15.508f, 6.6489f, 16.365f, 7.634f)
                    curveTo(17.3505f, 8.4913f, 18.1845f, 9.5086f, 18.832f, 10.643f)
                    curveTo(19.081f, 11.223f, 19.178f, 11.894f, 18.208f, 12.863f)
                    close()
                }
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
