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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Filled.Exchange: ImageVector
    get() {
        if (_exchange != null) {
            return _exchange!!
        }
        _exchange = Builder(name = "Exchange", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 16.0f)
                horizontalLineTo(2.681f)
                lineToRelative(0.014f, -0.015f)
                lineTo(4.939f, 13.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.426f, -1.4f)
                lineTo(1.274f, 14.577f)
                curveToRelative(-0.163f, 0.163f, -0.391f, 0.413f, -0.624f, 0.676f)
                arcToRelative(2.588f, 2.588f, 0.0f, false, false, 0.0f, 3.429f)
                curveToRelative(0.233f, 0.262f, 0.461f, 0.512f, 0.618f, 0.67f)
                lineToRelative(2.245f, 2.284f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.426f, -1.4f)
                lineTo(2.744f, 18.0f)
                horizontalLineTo(23.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 8.0f)
                horizontalLineTo(21.255f)
                lineToRelative(-2.194f, 2.233f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.426f, 1.4f)
                lineToRelative(2.239f, -2.279f)
                curveToRelative(0.163f, -0.163f, 0.391f, -0.413f, 0.624f, -0.675f)
                arcToRelative(2.588f, 2.588f, 0.0f, false, false, 0.0f, -3.429f)
                curveToRelative(-0.233f, -0.263f, -0.461f, -0.513f, -0.618f, -0.67f)
                lineTo(20.487f, 2.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.426f, 1.4f)
                lineToRelative(2.251f, 2.29f)
                lineTo(21.32f, 6.0f)
                horizontalLineTo(1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 8.0f)
                close()
            }
        }
        .build()
        return _exchange!!
    }

private var _exchange: ImageVector? = null
