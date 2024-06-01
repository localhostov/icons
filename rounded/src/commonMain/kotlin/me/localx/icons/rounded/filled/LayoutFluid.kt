package me.localx.icons.rounded.filled

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
import me.localx.icons.rounded.Icons

public val Icons.Filled.LayoutFluid: ImageVector
    get() {
        if (_layoutFluid != null) {
            return _layoutFluid!!
        }
        _layoutFluid = Builder(name = "LayoutFluid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 11.0f)
                    horizontalLineTo(13.0f)
                    curveTo(14.1045f, 11.0f, 15.0f, 10.1046f, 15.0f, 9.0f)
                    verticalLineTo(2.0f)
                    curveTo(15.0f, 0.8955f, 14.1045f, 0.0f, 13.0f, 0.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8955f, 0.0f, 0.0f, 0.8955f, 0.0f, 2.0f)
                    verticalLineTo(9.0f)
                    curveTo(0.0f, 10.1046f, 0.8955f, 11.0f, 2.0f, 11.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.6579f, 0.882f)
                    curveTo(23.2863f, 0.3307f, 22.6649f, 1.0E-4f, 21.9999f, 0.0f)
                    horizontalLineTo(18.9999f)
                    curveTo(17.8954f, 0.0f, 16.9999f, 0.8955f, 16.9999f, 2.0f)
                    verticalLineTo(9.0f)
                    curveTo(16.9999f, 10.1046f, 17.8953f, 11.0f, 18.9999f, 11.0f)
                    horizontalLineTo(21.9999f)
                    curveTo(23.1045f, 11.0f, 23.9999f, 10.1046f, 23.9999f, 9.0f)
                    verticalLineTo(2.0f)
                    curveTo(24.0006f, 1.6015f, 23.8814f, 1.2119f, 23.6579f, 0.882f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(6.118f, 13.3419f)
                    curveTo(5.788f, 13.1184f, 5.3985f, 12.9992f, 5.0f, 12.9999f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8955f, 12.9999f, 0.0f, 13.8953f, 0.0f, 14.9999f)
                    verticalLineTo(21.9999f)
                    curveTo(0.0f, 23.1045f, 0.8955f, 23.9999f, 2.0f, 23.9999f)
                    horizontalLineTo(5.0f)
                    curveTo(6.1046f, 23.9999f, 7.0f, 23.1044f, 7.0f, 21.9999f)
                    verticalLineTo(14.9999f)
                    curveTo(6.9999f, 14.335f, 6.6693f, 13.7136f, 6.118f, 13.3419f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.118f, 13.3419f)
                    curveTo(22.788f, 13.1184f, 22.3985f, 12.9992f, 22.0f, 12.9999f)
                    horizontalLineTo(11.0f)
                    curveTo(9.8954f, 12.9999f, 9.0f, 13.8953f, 9.0f, 14.9999f)
                    verticalLineTo(21.9999f)
                    curveTo(9.0f, 23.1045f, 9.8954f, 23.9999f, 11.0f, 23.9999f)
                    horizontalLineTo(22.0f)
                    curveTo(23.1046f, 23.9999f, 24.0f, 23.1045f, 24.0f, 21.9999f)
                    verticalLineTo(14.9999f)
                    curveTo(23.9999f, 14.335f, 23.6693f, 13.7136f, 23.118f, 13.3419f)
                    close()
                }
            }
        }
        .build()
        return _layoutFluid!!
    }

private var _layoutFluid: ImageVector? = null
