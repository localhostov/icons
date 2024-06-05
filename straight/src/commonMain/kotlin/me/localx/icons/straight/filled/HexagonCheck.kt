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

public val Icons.Filled.HexagonCheck: ImageVector
    get() {
        if (_hexagonCheck != null) {
            return _hexagonCheck!!
        }
        _hexagonCheck = Builder(name = "HexagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.637f, 10.55f)
                lineToRelative(-4.252f, -7.962f)
                curveToRelative(-0.522f, -0.979f, -1.536f, -1.587f, -2.646f, -1.587f)
                lineTo(7.282f, 1.001f)
                curveToRelative(-1.107f, 0.0f, -2.12f, 0.606f, -2.644f, 1.582f)
                lineTo(0.365f, 10.549f)
                curveToRelative(-0.488f, 0.911f, -0.488f, 1.999f, 0.0f, 2.911f)
                lineToRelative(4.271f, 7.958f)
                curveToRelative(0.523f, 0.976f, 1.536f, 1.582f, 2.644f, 1.582f)
                horizontalLineToRelative(9.457f)
                curveToRelative(1.11f, 0.0f, 2.124f, -0.608f, 2.646f, -1.587f)
                lineToRelative(4.252f, -7.962f)
                curveToRelative(0.485f, -0.908f, 0.485f, -1.993f, 0.0f, -2.901f)
                close()
                moveTo(11.909f, 15.42f)
                curveToRelative(-0.386f, 0.387f, -0.896f, 0.58f, -1.407f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-2.782f, -2.696f)
                lineToRelative(1.392f, -1.437f)
                lineToRelative(2.793f, 2.707f)
                lineToRelative(5.809f, -5.701f)
                lineToRelative(1.404f, 1.425f)
                lineToRelative(-5.793f, 5.707f)
                close()
            }
        }
        .build()
        return _hexagonCheck!!
    }

private var _hexagonCheck: ImageVector? = null
