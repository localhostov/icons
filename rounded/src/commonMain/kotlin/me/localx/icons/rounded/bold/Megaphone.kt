package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                curveToRelative(0.0f, 1.317f, -0.344f, 2.5f, -4.5f, 2.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(4.505f, 4.505f, 0.0f, false, false, -4.5f, 4.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(4.484f, 4.484f, 0.0f, false, false, 2.377f, 3.943f)
                lineToRelative(3.178f, 7.093f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, false, 2.253f, 1.464f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, 2.0f, -3.079f)
                lineToRelative(-2.257f, -4.921f)
                horizontalLineToRelative(2.949f)
                curveToRelative(4.156f, 0.0f, 4.5f, 1.183f, 4.5f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineToRelative(-17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(15.0f, 13.711f)
                arcToRelative(11.623f, 11.623f, 0.0f, false, false, -4.5f, -0.711f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(11.623f, 11.623f, 0.0f, false, false, 4.5f, -0.711f)
                close()
                moveTo(23.842f, 15.671f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.013f, 0.671f)
                lineToRelative(-1.0f, -0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.342f, -2.684f)
                lineToRelative(1.0f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.671f, 2.013f)
                close()
                moveTo(20.158f, 6.171f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.671f, -2.013f)
                lineToRelative(1.0f, -0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.342f, 2.684f)
                lineToRelative(-1.0f, 0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.013f, -0.671f)
                close()
                moveTo(20.0f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
