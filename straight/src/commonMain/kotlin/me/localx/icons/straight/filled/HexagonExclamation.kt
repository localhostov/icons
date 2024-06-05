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

public val Icons.Filled.HexagonExclamation: ImageVector
    get() {
        if (_hexagonExclamation != null) {
            return _hexagonExclamation!!
        }
        _hexagonExclamation = Builder(name = "HexagonExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.637f, 10.55f)
                lineToRelative(-4.252f, -7.963f)
                curveToRelative(-0.522f, -0.979f, -1.537f, -1.587f, -2.646f, -1.587f)
                lineTo(7.282f, 1.0f)
                curveToRelative(-1.107f, 0.0f, -2.12f, 0.606f, -2.644f, 1.582f)
                lineTo(0.365f, 10.549f)
                curveToRelative(-0.489f, 0.912f, -0.488f, 2.0f, 0.0f, 2.911f)
                lineToRelative(4.272f, 7.959f)
                curveToRelative(0.523f, 0.976f, 1.536f, 1.581f, 2.643f, 1.581f)
                horizontalLineToRelative(9.458f)
                curveToRelative(1.11f, 0.0f, 2.124f, -0.608f, 2.646f, -1.587f)
                lineToRelative(4.252f, -7.963f)
                curveToRelative(0.484f, -0.908f, 0.484f, -1.992f, 0.0f, -2.9f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _hexagonExclamation!!
    }

private var _hexagonExclamation: ImageVector? = null
