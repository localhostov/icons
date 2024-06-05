package me.localx.icons.straight.bold

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

public val Icons.Bold.Rent: ImageVector
    get() {
        if (_rent != null) {
            return _rent!!
        }
        _rent = Builder(name = "Rent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.396f, 6.775f)
                curveToRelative(-0.593f, -3.83f, -3.903f, -6.775f, -7.896f, -6.775f)
                curveToRelative(-3.781f, 0.0f, -6.951f, 2.64f, -7.781f, 6.172f)
                curveToRelative(-2.137f, 0.568f, -3.719f, 2.498f, -3.719f, 4.814f)
                curveToRelative(0.0f, 2.05f, 1.234f, 3.812f, 3.0f, 4.584f)
                verticalLineToRelative(0.431f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(2.001f, 2.0f)
                lineToRelative(1.999f, -2.0f)
                verticalLineToRelative(-6.431f)
                curveToRelative(1.766f, -0.772f, 3.0f, -2.533f, 3.0f, -4.584f)
                curveToRelative(0.0f, -2.122f, -1.328f, -3.925f, -3.193f, -4.65f)
                curveToRelative(0.69f, -1.937f, 2.523f, -3.335f, 4.693f, -3.335f)
                curveToRelative(2.409f, 0.0f, 4.424f, 1.713f, 4.895f, 3.984f)
                lineToRelative(-4.395f, 4.395f)
                verticalLineToRelative(12.621f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-12.621f)
                lineToRelative(-4.604f, -4.604f)
                close()
                moveTo(5.0f, 10.986f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                curveToRelative(0.0f, -0.779f, 0.597f, -1.413f, 1.357f, -1.486f)
                horizontalLineToRelative(0.286f)
                curveToRelative(0.76f, 0.073f, 1.357f, 0.706f, 1.357f, 1.486f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.0f, 21.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-8.379f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(3.0f, 3.0f)
                verticalLineToRelative(8.379f)
                close()
            }
        }
        .build()
        return _rent!!
    }

private var _rent: ImageVector? = null
