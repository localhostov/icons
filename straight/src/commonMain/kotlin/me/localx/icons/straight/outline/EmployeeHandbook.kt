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

public val Icons.Outline.EmployeeHandbook: ImageVector
    get() {
        if (_employeeHandbook != null) {
            return _employeeHandbook!!
        }
        _employeeHandbook = Builder(name = "EmployeeHandbook", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.922f, 1.685f)
                curveToRelative(-0.684f, -0.571f, -1.58f, -0.806f, -2.459f, -0.648f)
                lineToRelative(-6.179f, 1.124f)
                curveToRelative(-0.914f, 0.166f, -1.707f, 0.634f, -2.285f, 1.289f)
                curveToRelative(-0.578f, -0.655f, -1.371f, -1.123f, -2.285f, -1.289f)
                lineTo(3.537f, 1.037f)
                curveToRelative(-0.876f, -0.161f, -1.774f, 0.077f, -2.459f, 0.648f)
                reflectiveCurveTo(0.0f, 3.096f, 0.0f, 3.988f)
                verticalLineToRelative(16.834f)
                lineToRelative(12.0f, 2.182f)
                lineToRelative(12.0f, -2.182f)
                lineTo(24.0f, 3.988f)
                curveToRelative(0.0f, -0.892f, -0.393f, -1.731f, -1.078f, -2.303f)
                close()
                moveTo(11.0f, 20.789f)
                lineToRelative(-9.0f, -1.636f)
                lineTo(2.0f, 3.988f)
                curveToRelative(0.0f, -0.407f, 0.225f, -0.656f, 0.359f, -0.768f)
                curveToRelative(0.135f, -0.112f, 0.415f, -0.289f, 0.82f, -0.216f)
                lineToRelative(6.179f, 1.124f)
                curveToRelative(0.952f, 0.173f, 1.642f, 1.0f, 1.642f, 1.968f)
                verticalLineToRelative(14.694f)
                close()
                moveTo(22.0f, 19.153f)
                lineToRelative(-9.0f, 1.636f)
                lineTo(13.0f, 6.096f)
                curveToRelative(0.0f, -0.967f, 0.69f, -1.795f, 1.642f, -1.968f)
                lineToRelative(6.179f, -1.124f)
                curveToRelative(0.403f, -0.07f, 0.686f, 0.104f, 0.82f, 0.216f)
                curveToRelative(0.134f, 0.112f, 0.359f, 0.36f, 0.359f, 0.768f)
                verticalLineToRelative(15.165f)
                close()
                moveTo(5.5f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(5.5f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _employeeHandbook!!
    }

private var _employeeHandbook: ImageVector? = null
