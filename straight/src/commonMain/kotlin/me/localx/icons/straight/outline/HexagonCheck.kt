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

public val Icons.Outline.HexagonCheck: ImageVector
    get() {
        if (_hexagonCheck != null) {
            return _hexagonCheck!!
        }
        _hexagonCheck = Builder(name = "HexagonCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.298f, 8.288f)
                lineToRelative(1.404f, 1.425f)
                lineToRelative(-5.793f, 5.707f)
                curveToRelative(-0.386f, 0.387f, -0.896f, 0.58f, -1.407f, 0.58f)
                reflectiveCurveToRelative(-1.025f, -0.195f, -1.416f, -0.585f)
                lineToRelative(-2.782f, -2.696f)
                lineToRelative(1.392f, -1.437f)
                lineToRelative(2.793f, 2.707f)
                lineToRelative(5.809f, -5.701f)
                close()
                moveTo(23.637f, 13.451f)
                lineToRelative(-4.252f, 7.962f)
                curveToRelative(-0.522f, 0.979f, -1.536f, 1.587f, -2.646f, 1.587f)
                lineTo(7.281f, 23.0f)
                curveToRelative(-1.107f, 0.0f, -2.121f, -0.606f, -2.644f, -1.582f)
                lineTo(0.366f, 13.46f)
                curveToRelative(-0.489f, -0.912f, -0.489f, -2.0f, 0.0f, -2.911f)
                lineTo(4.638f, 2.582f)
                curveToRelative(0.523f, -0.976f, 1.536f, -1.582f, 2.644f, -1.582f)
                horizontalLineToRelative(9.457f)
                curveToRelative(1.11f, 0.0f, 2.124f, 0.608f, 2.646f, 1.587f)
                lineToRelative(4.252f, 7.962f)
                curveToRelative(0.485f, 0.908f, 0.485f, 1.993f, 0.0f, 2.901f)
                close()
                moveTo(21.873f, 11.493f)
                lineToRelative(-4.252f, -7.963f)
                curveToRelative(-0.175f, -0.327f, -0.513f, -0.529f, -0.883f, -0.529f)
                lineTo(7.282f, 3.001f)
                curveToRelative(-0.369f, 0.0f, -0.707f, 0.202f, -0.881f, 0.527f)
                lineToRelative(-4.273f, 7.967f)
                curveToRelative(-0.171f, 0.319f, -0.171f, 0.7f, 0.0f, 1.02f)
                lineToRelative(4.271f, 7.958f)
                curveToRelative(0.175f, 0.326f, 0.512f, 0.527f, 0.881f, 0.527f)
                horizontalLineToRelative(9.457f)
                curveToRelative(0.37f, 0.0f, 0.708f, -0.203f, 0.883f, -0.529f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(4.252f, -7.963f, 4.252f, -7.963f)
                curveToRelative(0.17f, -0.318f, 0.17f, -0.698f, 0.0f, -1.015f)
                close()
            }
        }
        .build()
        return _hexagonCheck!!
    }

private var _hexagonCheck: ImageVector? = null
