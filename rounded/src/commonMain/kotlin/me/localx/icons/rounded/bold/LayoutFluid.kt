package me.localx.icons.rounded.bold

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

public val Icons.Bold.LayoutFluid: ImageVector
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
                    moveTo(2.0f, 0.0f)
                    horizontalLineTo(13.0f)
                    curveTo(14.1045f, 0.0f, 15.0f, 0.8955f, 15.0f, 2.0f)
                    verticalLineTo(9.0f)
                    curveTo(15.0f, 10.1046f, 14.1045f, 11.0f, 13.0f, 11.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8955f, 11.0f, 0.0f, 10.1046f, 0.0f, 9.0f)
                    verticalLineTo(2.0f)
                    curveTo(0.0f, 0.8955f, 0.8955f, 0.0f, 2.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(19.0f, 0.0f)
                    horizontalLineTo(22.0f)
                    curveTo(23.1046f, 0.0f, 24.0f, 0.8955f, 24.0f, 2.0f)
                    verticalLineTo(9.0f)
                    curveTo(24.0f, 10.1046f, 23.1046f, 11.0f, 22.0f, 11.0f)
                    horizontalLineTo(19.0f)
                    curveTo(17.8954f, 11.0f, 16.9999f, 10.1046f, 16.9999f, 9.0f)
                    verticalLineTo(2.0f)
                    curveTo(17.0f, 0.8955f, 17.8954f, 0.0f, 19.0f, 0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(2.0f, 13.0f)
                    horizontalLineTo(5.0f)
                    curveTo(6.1046f, 13.0f, 7.0f, 13.8955f, 7.0f, 15.0f)
                    verticalLineTo(22.0f)
                    curveTo(7.0f, 23.1046f, 6.1046f, 24.0f, 5.0f, 24.0f)
                    horizontalLineTo(2.0f)
                    curveTo(0.8955f, 24.0f, 0.0f, 23.1046f, 0.0f, 22.0f)
                    verticalLineTo(15.0f)
                    curveTo(0.0f, 13.8955f, 0.8955f, 13.0f, 2.0f, 13.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(11.0f, 13.0f)
                    horizontalLineTo(22.0f)
                    curveTo(23.1046f, 13.0f, 24.0f, 13.8955f, 24.0f, 15.0f)
                    verticalLineTo(22.0f)
                    curveTo(24.0f, 23.1046f, 23.1046f, 24.0f, 22.0f, 24.0f)
                    horizontalLineTo(11.0f)
                    curveTo(9.8954f, 24.0f, 9.0f, 23.1046f, 9.0f, 22.0f)
                    verticalLineTo(15.0f)
                    curveTo(9.0f, 13.8955f, 9.8954f, 13.0f, 11.0f, 13.0f)
                    close()
                }
            }
        }
        .build()
        return _layoutFluid!!
    }

private var _layoutFluid: ImageVector? = null
