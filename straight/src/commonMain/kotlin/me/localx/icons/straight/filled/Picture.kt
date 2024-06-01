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

public val Icons.Filled.Picture: ImageVector
    get() {
        if (_picture != null) {
            return _picture!!
        }
        _picture = Builder(name = "Picture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(8.293f, 11.1209f)
                    lineTo(0.0f, 19.4139f)
                    verticalLineTo(23.9999f)
                    horizontalLineTo(22.586f)
                    lineTo(9.707f, 11.1209f)
                    curveTo(9.5195f, 10.9334f, 9.2652f, 10.8281f, 9.0f, 10.8281f)
                    curveTo(8.7348f, 10.8281f, 8.4805f, 10.9334f, 8.293f, 11.1209f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.121f, 9.707f)
                    lineTo(24.0f, 22.586f)
                    verticalLineTo(3.0f)
                    curveTo(24.0f, 2.2043f, 23.6839f, 1.4413f, 23.1213f, 0.8787f)
                    curveTo(22.5587f, 0.3161f, 21.7956f, 0.0f, 21.0f, 0.0f)
                    lineTo(3.0f, 0.0f)
                    curveTo(2.2043f, 0.0f, 1.4413f, 0.3161f, 0.8787f, 0.8787f)
                    curveTo(0.3161f, 1.4413f, 0.0f, 2.2043f, 0.0f, 3.0f)
                    lineTo(0.0f, 16.586f)
                    lineTo(6.879f, 9.707f)
                    curveTo(7.4416f, 9.1446f, 8.2045f, 8.8286f, 9.0f, 8.8286f)
                    curveTo(9.7955f, 8.8286f, 10.5584f, 9.1446f, 11.121f, 9.707f)
                    close()
                    moveTo(18.0f, 2.0f)
                    curveTo(18.7911f, 2.0f, 19.5645f, 2.2346f, 20.2223f, 2.6741f)
                    curveTo(20.8801f, 3.1137f, 21.3928f, 3.7384f, 21.6955f, 4.4693f)
                    curveTo(21.9983f, 5.2002f, 22.0775f, 6.0044f, 21.9231f, 6.7804f)
                    curveTo(21.7688f, 7.5563f, 21.3878f, 8.269f, 20.8284f, 8.8284f)
                    curveTo(20.269f, 9.3878f, 19.5563f, 9.7688f, 18.7804f, 9.9231f)
                    curveTo(18.0044f, 10.0775f, 17.2002f, 9.9983f, 16.4693f, 9.6955f)
                    curveTo(15.7384f, 9.3928f, 15.1136f, 8.8801f, 14.6741f, 8.2223f)
                    curveTo(14.2346f, 7.5645f, 14.0f, 6.7911f, 14.0f, 6.0f)
                    curveTo(14.0f, 4.9391f, 14.4214f, 3.9217f, 15.1716f, 3.1716f)
                    curveTo(15.9217f, 2.4214f, 16.9391f, 2.0f, 18.0f, 2.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(17.9998f, 7.9994f)
                    curveTo(19.1044f, 7.9994f, 19.9998f, 7.104f, 19.9998f, 5.9994f)
                    curveTo(19.9998f, 4.8948f, 19.1044f, 3.9994f, 17.9998f, 3.9994f)
                    curveTo(16.8953f, 3.9994f, 15.9998f, 4.8948f, 15.9998f, 5.9994f)
                    curveTo(15.9998f, 7.104f, 16.8953f, 7.9994f, 17.9998f, 7.9994f)
                    close()
                }
            }
        }
        .build()
        return _picture!!
    }

private var _picture: ImageVector? = null
