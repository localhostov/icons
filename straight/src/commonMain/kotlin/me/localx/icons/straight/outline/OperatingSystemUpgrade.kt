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

public val Icons.Outline.OperatingSystemUpgrade: ImageVector
    get() {
        if (_operatingSystemUpgrade != null) {
            return _operatingSystemUpgrade!!
        }
        _operatingSystemUpgrade = Builder(name = "OperatingSystemUpgrade", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.5f, 7.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                close()
                moveTo(5.436f, 9.627f)
                lineToRelative(1.384f, -0.797f)
                curveToRelative(-0.203f, -0.574f, -0.32f, -1.188f, -0.32f, -1.83f)
                reflectiveCurveToRelative(0.116f, -1.257f, 0.32f, -1.83f)
                lineToRelative(-1.384f, -0.797f)
                lineToRelative(0.998f, -1.733f)
                lineToRelative(1.385f, 0.798f)
                curveToRelative(0.803f, -0.941f, 1.917f, -1.608f, 3.182f, -1.841f)
                lineTo(11.001f, 0.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.596f)
                curveToRelative(1.265f, 0.234f, 2.378f, 0.9f, 3.182f, 1.841f)
                lineToRelative(1.385f, -0.798f)
                lineToRelative(0.998f, 1.733f)
                lineToRelative(-1.384f, 0.797f)
                curveToRelative(0.203f, 0.574f, 0.32f, 1.188f, 0.32f, 1.83f)
                reflectiveCurveToRelative(-0.116f, 1.257f, -0.32f, 1.83f)
                lineToRelative(1.384f, 0.797f)
                lineToRelative(-0.998f, 1.733f)
                lineToRelative(-1.385f, -0.798f)
                curveToRelative(-0.803f, 0.941f, -1.917f, 1.608f, -3.182f, 1.841f)
                verticalLineToRelative(1.596f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.596f)
                curveToRelative(-1.265f, -0.234f, -2.378f, -0.9f, -3.182f, -1.841f)
                lineToRelative(-1.385f, 0.798f)
                lineToRelative(-0.998f, -1.733f)
                close()
                moveTo(8.5f, 7.0f)
                curveToRelative(0.0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(24.0f, 19.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                lineTo(3.0f, 24.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(3.0f, 22.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-4.0f)
                lineTo(3.0f, 18.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, 0.449f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(22.0f, 19.0f)
                curveToRelative(0.0f, -0.551f, -0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, -0.449f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _operatingSystemUpgrade!!
    }

private var _operatingSystemUpgrade: ImageVector? = null
