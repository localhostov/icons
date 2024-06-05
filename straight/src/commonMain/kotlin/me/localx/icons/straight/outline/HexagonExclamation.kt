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

public val Icons.Outline.HexagonExclamation: ImageVector
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
                moveTo(21.872f, 12.509f)
                lineToRelative(-4.252f, 7.963f)
                curveToRelative(-0.174f, 0.326f, -0.512f, 0.528f, -0.882f, 0.528f)
                lineTo(7.281f, 21.0f)
                curveToRelative(-0.369f, 0.0f, -0.707f, -0.202f, -0.881f, -0.526f)
                lineToRelative(-4.271f, -7.959f)
                curveToRelative(-0.171f, -0.319f, -0.172f, -0.701f, 0.0f, -1.021f)
                lineTo(6.401f, 3.527f)
                curveToRelative(0.174f, -0.325f, 0.512f, -0.527f, 0.881f, -0.527f)
                horizontalLineToRelative(9.457f)
                curveToRelative(0.37f, 0.0f, 0.708f, 0.202f, 0.882f, 0.528f)
                lineToRelative(4.252f, 7.963f)
                curveToRelative(0.17f, 0.318f, 0.17f, 0.699f, 0.0f, 1.018f)
                close()
                moveTo(10.999f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(10.999f, 6.0f)
                close()
                moveTo(10.999f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _hexagonExclamation!!
    }

private var _hexagonExclamation: ImageVector? = null
