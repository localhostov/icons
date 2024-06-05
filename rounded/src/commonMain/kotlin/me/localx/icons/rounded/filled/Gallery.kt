package me.localx.icons.rounded.filled

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

public val Icons.Filled.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(name = "Gallery", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.0f, 10.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, true, -2.0f, 3.974f)
                verticalLineToRelative(-2.974f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, false, -7.0f, -7.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.2f, 0.0f, -0.4f, 0.013f, -0.592f, 0.03f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 4.592f, -3.03f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, 5.0f)
                close()
                moveTo(11.594f, 18.577f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineToRelative(-0.476f, -0.48f)
                lineToRelative(-5.909f, 5.128f)
                arcToRelative(4.956f, 4.956f, 0.0f, false, false, 2.647f, 0.775f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, 5.0f, -5.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(4.983f, 4.983f, 0.0f, false, false, -0.081f, -0.8f)
                close()
                moveTo(15.145f, 12.177f)
                lineTo(10.183f, 17.171f)
                lineTo(9.708f, 16.692f)
                arcToRelative(1.993f, 1.993f, 0.0f, false, false, -2.708f, -0.114f)
                lineToRelative(-6.078f, 5.265f)
                arcToRelative(4.962f, 4.962f, 0.0f, false, true, -0.896f, -2.843f)
                verticalLineToRelative(-4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.119f, 2.175f)
                close()
                moveTo(5.0f, 14.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(19.0f, 0.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, false, -4.579f, 3.029f)
                curveToRelative(0.191f, -0.015f, 0.384f, -0.029f, 0.579f, -0.029f)
                horizontalLineToRelative(6.0f)
                arcToRelative(7.009f, 7.009f, 0.0f, false, true, 7.0f, 7.0f)
                verticalLineToRelative(2.974f)
                arcToRelative(4.977f, 4.977f, 0.0f, false, false, 2.0f, -3.974f)
                verticalLineToRelative(-4.0f)
                arcToRelative(5.006f, 5.006f, 0.0f, false, false, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null
