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

public val Icons.Filled.Disk: ImageVector
    get() {
        if (_disk != null) {
            return _disk!!
        }
        _disk = Builder(name = "Disk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(12.0f, 16.0f)
                    curveTo(13.1046f, 16.0f, 14.0f, 15.1046f, 14.0f, 14.0f)
                    curveTo(14.0f, 12.8954f, 13.1046f, 12.0f, 12.0f, 12.0f)
                    curveTo(10.8954f, 12.0f, 10.0f, 12.8954f, 10.0f, 14.0f)
                    curveTo(10.0f, 15.1046f, 10.8954f, 16.0f, 12.0f, 16.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(22.536f, 4.122f)
                    lineTo(19.878f, 1.464f)
                    curveTo(19.612f, 1.2022f, 19.3175f, 0.9711f, 19.0f, 0.775f)
                    verticalLineTo(3.0f)
                    curveTo(18.9967f, 5.76f, 16.76f, 7.9967f, 14.0f, 8.0f)
                    horizontalLineTo(10.0f)
                    curveTo(7.2399f, 7.9967f, 5.0033f, 5.76f, 5.0f, 3.0f)
                    verticalLineTo(0.0f)
                    curveTo(2.24f, 0.0033f, 0.0033f, 2.24f, 0.0f, 5.0f)
                    verticalLineTo(19.0f)
                    curveTo(0.0033f, 21.7601f, 2.24f, 23.9967f, 5.0f, 24.0f)
                    horizontalLineTo(19.0f)
                    curveTo(21.76f, 23.9967f, 23.9967f, 21.7601f, 24.0f, 19.0f)
                    verticalLineTo(7.657f)
                    curveTo(24.0037f, 6.3304f, 23.4765f, 5.0575f, 22.536f, 4.122f)
                    close()
                    moveTo(12.0f, 18.0f)
                    curveTo(9.7909f, 18.0f, 8.0f, 16.2091f, 8.0f, 14.0f)
                    curveTo(8.0f, 11.7909f, 9.7909f, 10.0f, 12.0f, 10.0f)
                    curveTo(14.2091f, 10.0f, 16.0f, 11.7909f, 16.0f, 14.0f)
                    curveTo(16.0f, 16.2091f, 14.2091f, 18.0f, 12.0f, 18.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF374957)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = NonZero) {
                    moveTo(10.0f, 6.0001f)
                    horizontalLineTo(14.0f)
                    curveTo(15.6568f, 6.0001f, 17.0f, 4.6569f, 17.0f, 3.0001f)
                    verticalLineTo(0.0641f)
                    curveTo(16.7826f, 0.0287f, 16.5631f, 0.0073f, 16.343f, 1.0E-4f)
                    horizontalLineTo(7.0f)
                    verticalLineTo(3.0001f)
                    curveTo(7.0f, 4.6569f, 8.3432f, 6.0001f, 10.0f, 6.0001f)
                    close()
                }
            }
        }
        .build()
        return _disk!!
    }

private var _disk: ImageVector? = null
