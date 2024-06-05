package me.localx.icons.straight.outline

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

public val Icons.Outline.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.855f, 18.441f)
                curveToRelative(1.424f, -1.934f, 2.145f, -4.109f, 2.145f, -6.477f)
                verticalLineToRelative(-5.755f)
                curveToRelative(0.0f, -1.727f, -1.102f, -3.253f, -2.741f, -3.797f)
                lineTo(12.0f, 0.005f)
                lineToRelative(-7.259f, 2.407f)
                curveToRelative(-0.222f, 0.074f, -0.435f, 0.166f, -0.638f, 0.276f)
                lineTo(1.457f, 0.043f)
                lineTo(0.043f, 1.457f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-4.102f, -4.102f)
                close()
                moveTo(12.0f, 2.112f)
                lineToRelative(6.629f, 2.198f)
                curveToRelative(0.82f, 0.271f, 1.371f, 1.035f, 1.371f, 1.898f)
                verticalLineToRelative(5.755f)
                curveToRelative(0.0f, 1.828f, -0.531f, 3.52f, -1.579f, 5.043f)
                lineTo(5.636f, 4.222f)
                lineToRelative(6.364f, -2.11f)
                close()
                moveTo(15.602f, 19.844f)
                lineToRelative(1.427f, 1.427f)
                curveToRelative(-1.709f, 1.303f, -3.408f, 2.075f, -4.236f, 2.409f)
                lineToRelative(-0.836f, 0.336f)
                lineToRelative(-0.806f, -0.404f)
                curveToRelative(-2.146f, -1.071f, -9.151f, -5.082f, -9.151f, -11.648f)
                verticalLineToRelative(-5.721f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(3.721f)
                curveToRelative(0.0f, 5.419f, 6.159f, 8.917f, 8.046f, 9.86f)
                horizontalLineToRelative(0.001f)
                curveToRelative(0.704f, -0.283f, 2.115f, -0.922f, 3.554f, -1.98f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
