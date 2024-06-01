package me.localx.icons.straight.outline

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

public val Icons.Outline.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = Builder(name = "ZoomIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 22.5888f)
                    lineTo(17.7501f, 16.339f)
                    curveTo(21.2448f, 12.0649f, 20.6129f, 5.7671f, 16.3389f, 2.2724f)
                    curveTo(12.0648f, -1.2222f, 5.767f, -0.5904f, 2.2724f, 3.6837f)
                    curveTo(-1.2223f, 7.9578f, -0.5905f, 14.2556f, 3.6836f, 17.7502f)
                    curveTo(7.365f, 20.7604f, 12.6574f, 20.7604f, 16.3388f, 17.7502f)
                    lineTo(22.5887f, 24.0f)
                    lineTo(23.9999f, 22.5888f)
                    close()
                    moveTo(10.0272f, 18.0117f)
                    curveTo(5.6175f, 18.0117f, 2.0428f, 14.437f, 2.0428f, 10.0273f)
                    curveTo(2.0428f, 5.6176f, 5.6175f, 2.0429f, 10.0272f, 2.0429f)
                    curveTo(14.4369f, 2.0429f, 18.0116f, 5.6176f, 18.0116f, 10.0273f)
                    curveTo(18.0066f, 14.4349f, 14.4348f, 18.0068f, 10.0272f, 18.0117f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0253f, 6.036f)
                    horizontalLineTo(9.0292f)
                    verticalLineTo(9.0302f)
                    horizontalLineTo(6.035f)
                    verticalLineTo(11.0263f)
                    horizontalLineTo(9.0292f)
                    verticalLineTo(14.0204f)
                    horizontalLineTo(11.0253f)
                    verticalLineTo(11.0263f)
                    horizontalLineTo(14.0194f)
                    verticalLineTo(9.0302f)
                    horizontalLineTo(11.0253f)
                    verticalLineTo(6.036f)
                    close()
                }
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
