package me.localx.icons.straight.bold

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

public val Icons.Bold.Comment: ImageVector
    get() {
        if (_comment != null) {
            return _comment!!
        }
        _comment = Builder(name = "Comment", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.9999f, 24.0f)
                    horizontalLineTo(12.0169f)
                    curveTo(9.6759f, 23.9987f, 7.3864f, 23.3127f, 5.4304f, 22.0265f)
                    curveTo(3.4745f, 20.7403f, 1.9374f, 18.9101f, 1.0086f, 16.7613f)
                    curveTo(0.0797f, 14.6125f, -0.2003f, 12.2389f, 0.2029f, 9.9329f)
                    curveTo(0.6062f, 7.6269f, 1.6751f, 5.4893f, 3.2781f, 3.7832f)
                    curveTo(4.881f, 2.0771f, 6.948f, 0.8771f, 9.2243f, 0.3311f)
                    curveTo(11.5007f, -0.215f, 13.8871f, -0.0833f, 16.0896f, 0.7099f)
                    curveTo(18.2921f, 1.5031f, 20.2145f, 2.9232f, 21.62f, 4.7953f)
                    curveTo(23.0255f, 6.6673f, 23.8528f, 8.9097f, 23.9999f, 11.246f)
                    verticalLineTo(11.34f)
                    verticalLineTo(24.0f)
                    close()
                    moveTo(12.0169f, 3.0f)
                    curveTo(10.835f, 3.0f, 9.6646f, 3.2328f, 8.5727f, 3.6851f)
                    curveTo(7.4808f, 4.1374f, 6.4886f, 4.8003f, 5.6529f, 5.636f)
                    curveTo(4.8172f, 6.4718f, 4.1542f, 7.4639f, 3.7019f, 8.5559f)
                    curveTo(3.2497f, 9.6478f, 3.0168f, 10.8181f, 3.0168f, 12.0f)
                    curveTo(3.0168f, 13.1819f, 3.2497f, 14.3522f, 3.7019f, 15.4442f)
                    curveTo(4.1542f, 16.5361f, 4.8172f, 17.5282f, 5.6529f, 18.364f)
                    curveTo(6.4886f, 19.1997f, 7.4808f, 19.8626f, 8.5727f, 20.3149f)
                    curveTo(9.6646f, 20.7672f, 10.835f, 21.0f, 12.0169f, 21.0f)
                    horizontalLineTo(20.9999f)
                    verticalLineTo(11.389f)
                    curveTo(20.8415f, 9.1137f, 19.8266f, 6.983f, 18.1596f, 5.4263f)
                    curveTo(16.4927f, 3.8696f, 14.2976f, 3.0026f, 12.0169f, 3.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(14.0001f, 8.0001f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(11.0001f)
                    horizontalLineTo(14.0001f)
                    verticalLineTo(8.0001f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(18.0001f, 14.0001f)
                    horizontalLineTo(8.0001f)
                    verticalLineTo(17.0001f)
                    horizontalLineTo(18.0001f)
                    verticalLineTo(14.0001f)
                    close()
                }
            }
        }
        .build()
        return _comment!!
    }

private var _comment: ImageVector? = null
