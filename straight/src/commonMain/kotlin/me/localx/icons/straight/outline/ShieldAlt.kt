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

public val Icons.Outline.ShieldAlt: ImageVector
    get() {
        if (_shieldAlt != null) {
            return _shieldAlt!!
        }
        _shieldAlt = Builder(name = "ShieldAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.945f, 2.635f)
                lineTo(12.0f, 0.0f)
                lineToRelative(-7.945f, 2.635f)
                curveToRelative(-1.229f, 0.407f, -2.055f, 1.549f, -2.055f, 2.842f)
                verticalLineToRelative(6.471f)
                curveToRelative(0.0f, 6.563f, 7.005f, 10.577f, 9.152f, 11.65f)
                lineToRelative(0.805f, 0.402f)
                lineToRelative(0.836f, -0.336f)
                curveToRelative(2.16f, -0.869f, 9.207f, -4.281f, 9.207f, -11.717f)
                verticalLineToRelative(-6.471f)
                curveToRelative(0.0f, -1.292f, -0.825f, -2.435f, -2.055f, -2.842f)
                close()
                moveTo(4.0f, 11.947f)
                verticalLineToRelative(-6.471f)
                curveToRelative(0.0f, -0.429f, 0.274f, -0.808f, 0.684f, -0.943f)
                lineToRelative(6.316f, -2.094f)
                verticalLineToRelative(18.804f)
                curveToRelative(-2.482f, -1.424f, -7.0f, -4.653f, -7.0f, -9.296f)
                close()
                moveTo(20.0f, 11.947f)
                curveToRelative(0.0f, 5.356f, -4.566f, 8.267f, -7.0f, 9.438f)
                lineTo(13.0f, 2.439f)
                lineToRelative(6.316f, 2.094f)
                curveToRelative(0.409f, 0.136f, 0.684f, 0.515f, 0.684f, 0.943f)
                verticalLineToRelative(6.471f)
                close()
            }
        }
        .build()
        return _shieldAlt!!
    }

private var _shieldAlt: ImageVector? = null
