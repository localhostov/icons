package me.localx.icons.rounded.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.rounded.Icons

public val Icons.Bold.PeopleArrowsLeftRight: ImageVector
    get() {
        if (_peopleArrowsLeftRight != null) {
            return _peopleArrowsLeftRight!!
        }
        _peopleArrowsLeftRight = Builder(name = "PeopleArrowsLeftRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.5f, 6.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.26f)
                curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(18.09f, 12.09f)
                curveToRelative(0.33f, -0.33f, 0.33f, -0.86f, 0.0f, -1.19f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.53f, -0.53f, -1.43f, -0.15f, -1.43f, 0.59f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.16f)
                curveToRelative(0.0f, -0.75f, -0.91f, -1.12f, -1.43f, -0.59f)
                lineToRelative(-2.66f, 2.66f)
                curveToRelative(-0.33f, 0.33f, -0.33f, 0.86f, 0.0f, 1.19f)
                lineToRelative(2.66f, 2.66f)
                curveToRelative(0.53f, 0.53f, 1.43f, 0.15f, 1.43f, -0.59f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.16f)
                curveToRelative(0.0f, 0.75f, 0.91f, 1.12f, 1.43f, 0.59f)
                lineToRelative(2.66f, -2.66f)
                close()
                moveTo(5.5f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.88f, 0.0f, 5.5f, 0.0f)
                reflectiveCurveTo(3.0f, 1.12f, 3.0f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(5.5f, 15.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                curveTo(2.02f, 6.0f, 0.0f, 8.02f, 0.0f, 10.5f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.56f, 0.79f, 2.93f, 2.0f, 3.74f)
                verticalLineToRelative(5.26f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
            }
        }
        .build()
        return _peopleArrowsLeftRight!!
    }

private var _peopleArrowsLeftRight: ImageVector? = null
