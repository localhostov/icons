package me.localx.icons.straight.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Filled.Fail: ImageVector
    get() {
        if (_fail != null) {
            return _fail!!
        }
        _fail = Builder(name = "Fail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.595f, 9.956f)
                lineToRelative(0.641f, 3.044f)
                horizontalLineToRelative(-1.688f)
                lineToRelative(0.686f, -3.104f)
                curveToRelative(0.03f, -0.149f, 0.105f, -0.253f, 0.176f, -0.296f)
                lineToRelative(0.017f, 0.006f)
                curveToRelative(0.024f, 0.016f, 0.121f, 0.118f, 0.168f, 0.349f)
                close()
                moveTo(24.0f, 6.0f)
                verticalLineToRelative(15.0f)
                lineTo(0.0f, 21.0f)
                lineTo(0.0f, 6.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-1.801f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(13.5f, 15.999f)
                lineToRelative(-1.339f, -6.373f)
                curveToRelative(-0.135f, -0.668f, -0.523f, -1.213f, -1.035f, -1.459f)
                curveToRelative(-0.232f, -0.112f, -0.476f, -0.168f, -0.718f, -0.168f)
                curveToRelative(-0.282f, 0.0f, -0.561f, 0.075f, -0.816f, 0.225f)
                curveToRelative(-0.471f, 0.277f, -0.809f, 0.776f, -0.926f, 1.356f)
                lineToRelative(-1.365f, 6.418f)
                horizontalLineToRelative(1.584f)
                lineToRelative(0.309f, -1.4f)
                horizontalLineToRelative(2.379f)
                lineToRelative(0.295f, 1.4f)
                horizontalLineToRelative(1.632f)
                close()
                moveTo(15.6f, 8.0f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(20.0f, 14.4f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.6f)
                close()
            }
        }
        .build()
        return _fail!!
    }

private var _fail: ImageVector? = null
