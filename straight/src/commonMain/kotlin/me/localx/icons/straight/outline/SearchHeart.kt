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

public val Icons.Outline.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 22.5888f)
                    lineTo(17.7501f, 16.339f)
                    curveTo(21.2448f, 12.065f, 20.6129f, 5.7672f, 16.3389f, 2.2725f)
                    curveTo(12.0648f, -1.2222f, 5.767f, -0.5904f, 2.2724f, 3.6837f)
                    curveTo(-1.2223f, 7.9579f, -0.5905f, 14.2556f, 3.6836f, 17.7503f)
                    curveTo(7.365f, 20.7604f, 12.6574f, 20.7604f, 16.3388f, 17.7503f)
                    lineTo(22.5887f, 24.0f)
                    lineTo(23.9999f, 22.5888f)
                    close()
                    moveTo(10.0272f, 18.0117f)
                    curveTo(5.6175f, 18.0117f, 2.0428f, 14.437f, 2.0428f, 10.0273f)
                    curveTo(2.0428f, 5.6177f, 5.6175f, 2.0429f, 10.0272f, 2.0429f)
                    curveTo(14.4369f, 2.0429f, 18.0116f, 5.6177f, 18.0116f, 10.0273f)
                    curveTo(18.0066f, 14.435f, 14.4348f, 18.0068f, 10.0272f, 18.0117f)
                    close()
                    moveTo(11.9984f, 6.0351f)
                    curveTo(11.2717f, 6.0263f, 10.5671f, 6.2845f, 10.0182f, 6.7607f)
                    curveTo(9.4576f, 6.283f, 8.7426f, 6.0252f, 8.0062f, 6.0351f)
                    curveTo(6.299f, 6.0937f, 4.9605f, 7.5215f, 5.012f, 9.2289f)
                    curveTo(5.012f, 11.9656f, 8.9733f, 14.8469f, 9.4254f, 15.1663f)
                    lineTo(10.0023f, 15.5745f)
                    lineTo(10.5781f, 15.1663f)
                    curveTo(11.0302f, 14.8469f, 14.9925f, 11.9655f, 14.9925f, 9.2289f)
                    curveTo(15.0435f, 7.5217f, 13.7053f, 6.0943f, 11.9984f, 6.0351f)
                    close()
                    moveTo(10.0023f, 13.1023f)
                    curveTo(8.605f, 11.9925f, 7.0081f, 10.3008f, 7.0081f, 9.2289f)
                    curveTo(6.9583f, 8.6243f, 7.4025f, 8.0913f, 8.0062f, 8.0313f)
                    curveTo(8.5353f, 7.9961f, 8.9927f, 8.3965f, 9.0279f, 8.9256f)
                    curveTo(9.0302f, 8.9601f, 9.0307f, 8.9947f, 9.0292f, 9.0293f)
                    horizontalLineTo(11.0253f)
                    curveTo(10.9784f, 8.526f, 11.3483f, 8.08f, 11.8516f, 8.0331f)
                    curveTo(11.9004f, 8.0286f, 11.9495f, 8.0279f, 11.9984f, 8.0312f)
                    curveTo(12.6018f, 8.0918f, 13.0457f, 8.6244f, 12.9964f, 9.2289f)
                    curveTo(12.9964f, 10.3008f, 11.3955f, 11.9925f, 10.0023f, 13.1023f)
                    close()
                }
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
