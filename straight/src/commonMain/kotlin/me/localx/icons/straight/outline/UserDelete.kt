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

public val Icons.Outline.UserDelete: ImageVector
    get() {
        if (_userDelete != null) {
            return _userDelete!!
        }
        _userDelete = Builder(name = "UserDelete", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(24.0f, 12.0f)
                    horizontalLineTo(16.0f)
                    verticalLineTo(10.0f)
                    horizontalLineTo(24.0f)
                    verticalLineTo(12.0f)
                    close()
                    moveTo(14.974f, 6.0f)
                    curveTo(14.974f, 4.8133f, 14.6221f, 3.6533f, 13.9628f, 2.6666f)
                    curveTo(13.3035f, 1.6799f, 12.3665f, 0.9109f, 11.2701f, 0.4567f)
                    curveTo(10.1737f, 0.0026f, 8.9673f, -0.1162f, 7.8035f, 0.1153f)
                    curveTo(6.6396f, 0.3468f, 5.5705f, 0.9182f, 4.7314f, 1.7574f)
                    curveTo(3.8922f, 2.5965f, 3.3208f, 3.6656f, 3.0893f, 4.8295f)
                    curveTo(2.8578f, 5.9934f, 2.9766f, 7.1997f, 3.4307f, 8.2961f)
                    curveTo(3.8849f, 9.3925f, 4.6539f, 10.3295f, 5.6406f, 10.9888f)
                    curveTo(6.6273f, 11.6481f, 7.7873f, 12.0f, 8.974f, 12.0f)
                    curveTo(10.5648f, 11.9984f, 12.09f, 11.3658f, 13.2149f, 10.2409f)
                    curveTo(14.3398f, 9.116f, 14.9724f, 7.5908f, 14.974f, 6.0f)
                    close()
                    moveTo(12.974f, 6.0f)
                    curveTo(12.974f, 6.7911f, 12.7394f, 7.5645f, 12.2999f, 8.2223f)
                    curveTo(11.8604f, 8.8801f, 11.2356f, 9.3928f, 10.5047f, 9.6955f)
                    curveTo(9.7738f, 9.9983f, 8.9696f, 10.0775f, 8.1936f, 9.9232f)
                    curveTo(7.4177f, 9.7688f, 6.705f, 9.3878f, 6.1456f, 8.8284f)
                    curveTo(5.5862f, 8.269f, 5.2052f, 7.5563f, 5.0509f, 6.7804f)
                    curveTo(4.8965f, 6.0044f, 4.9757f, 5.2002f, 5.2785f, 4.4693f)
                    curveTo(5.5812f, 3.7384f, 6.0939f, 3.1137f, 6.7517f, 2.6741f)
                    curveTo(7.4095f, 2.2346f, 8.1829f, 2.0f, 8.974f, 2.0f)
                    curveTo(10.0349f, 2.0f, 11.0523f, 2.4214f, 11.8024f, 3.1716f)
                    curveTo(12.5526f, 3.9217f, 12.974f, 4.9391f, 12.974f, 6.0f)
                    close()
                    moveTo(18.0f, 19.0f)
                    curveTo(17.9984f, 17.6744f, 17.4711f, 16.4036f, 16.5338f, 15.4662f)
                    curveTo(15.5964f, 14.5289f, 14.3256f, 14.0016f, 13.0f, 14.0f)
                    horizontalLineTo(5.0f)
                    curveTo(3.6744f, 14.0016f, 2.4036f, 14.5289f, 1.4662f, 15.4662f)
                    curveTo(0.5289f, 16.4036f, 0.0016f, 17.6744f, 0.0f, 19.0f)
                    lineTo(0.0f, 24.0f)
                    horizontalLineTo(2.0f)
                    verticalLineTo(19.0f)
                    curveTo(2.0f, 18.2044f, 2.3161f, 17.4413f, 2.8787f, 16.8787f)
                    curveTo(3.4413f, 16.3161f, 4.2043f, 16.0f, 5.0f, 16.0f)
                    horizontalLineTo(13.0f)
                    curveTo(13.7956f, 16.0f, 14.5587f, 16.3161f, 15.1213f, 16.8787f)
                    curveTo(15.6839f, 17.4413f, 16.0f, 18.2044f, 16.0f, 19.0f)
                    verticalLineTo(24.0f)
                    horizontalLineTo(18.0f)
                    verticalLineTo(19.0f)
                    close()
                }
            }
        }
        .build()
        return _userDelete!!
    }

private var _userDelete: ImageVector? = null
