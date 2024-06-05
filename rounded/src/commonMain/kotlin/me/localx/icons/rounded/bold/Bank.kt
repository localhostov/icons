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

public val Icons.Bold.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(21.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                close()
                moveTo(0.37f, 9.341f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, true, 0.13f, -3.113f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, true, 1.785f, -1.669f)
                lineToRelative(7.159f, -3.907f)
                arcToRelative(5.314f, 5.314f, 0.0f, false, true, 5.112f, 0.0f)
                lineToRelative(7.16f, 3.907f)
                arcToRelative(5.106f, 5.106f, 0.0f, false, true, 1.784f, 1.667f)
                arcToRelative(3.032f, 3.032f, 0.0f, false, true, 0.134f, 3.115f)
                arcToRelative(3.126f, 3.126f, 0.0f, false, true, -2.634f, 1.65f)
                verticalLineToRelative(5.009f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-5.009f)
                arcToRelative(3.126f, 3.126f, 0.0f, false, true, -2.63f, -1.65f)
                close()
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(18.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(3.0f, 7.887f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, false, 0.131f, 0.113f)
                horizontalLineToRelative(17.738f)
                arcToRelative(0.145f, 0.145f, 0.0f, false, false, 0.131f, -0.115f)
                arcToRelative(2.145f, 2.145f, 0.0f, false, false, -0.721f, -0.693f)
                lineToRelative(-7.16f, -3.906f)
                arcToRelative(2.325f, 2.325f, 0.0f, false, false, -2.236f, 0.0f)
                lineToRelative(-7.161f, 3.906f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.722f, 0.695f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
