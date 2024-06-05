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

public val Icons.Outline.PeopleArrowsLeftRight: ImageVector
    get() {
        if (_peopleArrowsLeftRight != null) {
            return _peopleArrowsLeftRight!!
        }
        _peopleArrowsLeftRight = Builder(name = "PeopleArrowsLeftRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.63f, 2.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24.13f, 9.0f)
                curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.4f, 0.0f, -0.78f, 0.08f, -1.13f, 0.22f)
                lineToRelative(1.78f, 1.78f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.35f)
                lineToRelative(-2.65f, 2.65f)
                verticalLineToRelative(6.35f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(24.13f, 9.0f)
                close()
                moveTo(5.0f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.38f, 0.0f, 5.0f, 0.0f)
                reflectiveCurveTo(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(17.42f, 10.59f)
                lineToRelative(-2.92f, -2.92f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.92f, 1.91f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.91f, -1.91f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.92f, 2.92f)
                curveToRelative(-0.77f, 0.77f, -0.77f, 2.04f, 0.0f, 2.81f)
                lineToRelative(2.91f, 2.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.91f, -1.9f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-1.9f, 1.9f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.91f, -2.91f)
                curveToRelative(0.77f, -0.78f, 0.77f, -2.04f, 0.0f, -2.81f)
                close()
                moveTo(2.0f, 15.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.35f)
                lineToRelative(1.78f, -1.78f)
                curveToRelative(-0.35f, -0.14f, -0.73f, -0.22f, -1.13f, -0.22f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.35f)
                lineToRelative(-2.65f, -2.65f)
                lineTo(2.0f, 15.0f)
                close()
            }
        }
        .build()
        return _peopleArrowsLeftRight!!
    }

private var _peopleArrowsLeftRight: ImageVector? = null
