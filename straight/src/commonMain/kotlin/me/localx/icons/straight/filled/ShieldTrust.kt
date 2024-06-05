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

public val Icons.Filled.ShieldTrust: ImageVector
    get() {
        if (_shieldTrust != null) {
            return _shieldTrust!!
        }
        _shieldTrust = Builder(name = "ShieldTrust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.5f, 9.479f)
                lineTo(21.5f, 3.5f)
                horizontalLineToRelative(-5.979f)
                lineTo(12.0f, -0.021f)
                lineToRelative(-3.521f, 3.521f)
                lineTo(3.5f, 3.5f)
                verticalLineToRelative(4.979f)
                lineTo(-0.021f, 12.0f)
                lineToRelative(3.521f, 3.521f)
                verticalLineToRelative(4.979f)
                horizontalLineToRelative(4.979f)
                lineToRelative(3.521f, 3.521f)
                lineToRelative(3.521f, -3.521f)
                horizontalLineToRelative(4.979f)
                verticalLineToRelative(-4.979f)
                lineToRelative(3.521f, -3.521f)
                lineToRelative(-2.521f, -2.521f)
                close()
                moveTo(12.099f, 15.442f)
                curveToRelative(-0.356f, 0.357f, -0.836f, 0.557f, -1.347f, 0.558f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.511f, 0.0f, -0.99f, -0.199f, -1.352f, -0.562f)
                lineToRelative(-3.602f, -3.543f)
                lineToRelative(1.402f, -1.425f)
                lineToRelative(3.551f, 3.491f)
                lineToRelative(7.148f, -7.073f)
                lineToRelative(1.41f, 1.419f)
                lineToRelative(-7.209f, 7.135f)
                close()
            }
        }
        .build()
        return _shieldTrust!!
    }

private var _shieldTrust: ImageVector? = null
