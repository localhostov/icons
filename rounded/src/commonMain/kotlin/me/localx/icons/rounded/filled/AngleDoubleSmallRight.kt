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

public val Icons.Filled.AngleDoubleSmallRight: ImageVector
    get() {
        if (_angleDoubleSmallRight != null) {
            return _angleDoubleSmallRight!!
        }
        _angleDoubleSmallRight = Builder(name = "AngleDoubleSmallRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.061f, -2.561f)
                lineToRelative(4.586f, -4.585f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.708f)
                lineTo(12.043f, 7.061f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, -2.122f)
                lineTo(18.75f, 9.525f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, 0.0f, 4.95f)
                lineToRelative(-4.586f, 4.586f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.1f, 19.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1f, 19.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.061f, -2.561f)
                lineTo(9.982f, 12.0f)
                lineTo(5.043f, 7.061f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.164f, 4.939f)
                lineToRelative(6.0f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.122f)
                lineToRelative(-6.0f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.1f, 19.5f)
                close()
            }
        }
        .build()
        return _angleDoubleSmallRight!!
    }

private var _angleDoubleSmallRight: ImageVector? = null
