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

public val Icons.Bold.OperatingSystemUpgrade: ImageVector
    get() {
        if (_operatingSystemUpgrade != null) {
            return _operatingSystemUpgrade!!
        }
        _operatingSystemUpgrade = Builder(name = "OperatingSystemUpgrade", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.688f, 11.799f)
                lineToRelative(1.485f, -0.857f)
                curveToRelative(0.644f, 0.626f, 1.44f, 1.093f, 2.327f, 1.345f)
                verticalLineToRelative(1.713f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.713f)
                curveToRelative(0.887f, -0.252f, 1.683f, -0.719f, 2.327f, -1.345f)
                lineToRelative(1.485f, 0.857f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.485f, -0.857f)
                curveToRelative(0.109f, -0.431f, 0.173f, -0.88f, 0.173f, -1.344f)
                reflectiveCurveToRelative(-0.064f, -0.913f, -0.173f, -1.344f)
                lineToRelative(1.485f, -0.857f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(-1.485f, 0.857f)
                curveToRelative(-0.644f, -0.626f, -1.44f, -1.093f, -2.327f, -1.345f)
                lineTo(13.5f, 0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.713f)
                curveToRelative(-0.887f, 0.252f, -1.683f, 0.719f, -2.327f, 1.345f)
                lineToRelative(-1.485f, -0.857f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(1.485f, 0.857f)
                curveToRelative(-0.109f, 0.431f, -0.173f, 0.879f, -0.173f, 1.344f)
                reflectiveCurveToRelative(0.064f, 0.913f, 0.173f, 1.344f)
                lineToRelative(-1.485f, 0.857f)
                lineToRelative(1.5f, 2.598f)
                close()
                moveTo(12.0f, 4.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.122f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.122f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.122f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(21.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.002f, 2.0f)
                horizontalLineToRelative(-5.002f)
                close()
            }
        }
        .build()
        return _operatingSystemUpgrade!!
    }

private var _operatingSystemUpgrade: ImageVector? = null
