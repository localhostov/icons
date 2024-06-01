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

public val Icons.Filled.UserAdd: ImageVector
    get() {
        if (_userAdd != null) {
            return _userAdd!!
        }
        _userAdd = Builder(name = "UserAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(23.0f, 10.9991f)
                    horizontalLineTo(21.0f)
                    verticalLineTo(8.9991f)
                    curveTo(21.0f, 8.4468f, 20.5523f, 7.9991f, 20.0f, 7.9991f)
                    curveTo(19.4478f, 7.9991f, 19.0001f, 8.4468f, 19.0001f, 8.9991f)
                    verticalLineTo(10.9991f)
                    horizontalLineTo(17.0f)
                    curveTo(16.4478f, 10.9991f, 16.0001f, 11.4468f, 16.0001f, 11.9991f)
                    curveTo(16.0001f, 12.5513f, 16.4478f, 12.999f, 17.0f, 12.999f)
                    horizontalLineTo(19.0001f)
                    verticalLineTo(14.9991f)
                    curveTo(19.0001f, 15.5513f, 19.4478f, 15.999f, 20.0f, 15.999f)
                    curveTo(20.5523f, 15.999f, 21.0f, 15.5513f, 21.0f, 14.9991f)
                    verticalLineTo(12.999f)
                    horizontalLineTo(23.0f)
                    curveTo(23.5523f, 12.999f, 24.0f, 12.5513f, 24.0f, 11.9991f)
                    curveTo(24.0f, 11.4468f, 23.5523f, 10.9991f, 23.0f, 10.9991f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 12.0f)
                    curveTo(12.3137f, 12.0f, 15.0f, 9.3137f, 15.0f, 6.0f)
                    curveTo(15.0f, 2.6863f, 12.3137f, 0.0f, 9.0f, 0.0f)
                    curveTo(5.6863f, 0.0f, 3.0f, 2.6863f, 3.0f, 6.0f)
                    curveTo(3.0f, 9.3137f, 5.6863f, 12.0f, 9.0f, 12.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(9.0f, 13.9991f)
                    curveTo(4.0317f, 14.0046f, 0.0055f, 18.0308f, 0.0f, 22.9991f)
                    curveTo(0.0f, 23.5514f, 0.4477f, 23.9991f, 1.0f, 23.9991f)
                    horizontalLineTo(17.0f)
                    curveTo(17.5522f, 23.9991f, 18.0f, 23.5514f, 18.0f, 22.9991f)
                    curveTo(17.9945f, 18.0308f, 13.9683f, 14.0046f, 9.0f, 13.9991f)
                    close()
                }
            }
        }
        .build()
        return _userAdd!!
    }

private var _userAdd: ImageVector? = null
