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

public val Icons.Filled.PeopleArrowsLeftRight: ImageVector
    get() {
        if (_peopleArrowsLeftRight != null) {
            return _peopleArrowsLeftRight!!
        }
        _peopleArrowsLeftRight = Builder(name = "PeopleArrowsLeftRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 13.41f)
                lineToRelative(-2.91f, 2.91f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.9f, -1.9f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.91f, 1.9f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.91f, -2.91f)
                curveToRelative(-0.77f, -0.78f, -0.77f, -2.04f, 0.0f, -2.81f)
                lineToRelative(2.92f, -2.92f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.91f, 1.91f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-1.92f, -1.91f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.92f, 2.92f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0.0f, 2.81f)
                close()
                moveTo(5.0f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(6.38f, 0.0f, 5.0f, 0.0f)
                reflectiveCurveTo(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(5.17f, 9.17f)
                lineToRelative(2.95f, -2.95f)
                curveToRelative(-0.35f, -0.14f, -0.73f, -0.22f, -1.13f, -0.22f)
                lineTo(3.0f, 6.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.35f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-1.56f, -1.56f, -1.56f, -4.09f, 0.0f, -5.65f)
                close()
                moveTo(19.0f, 5.0f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21.0f, 6.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.4f, 0.0f, -0.78f, 0.08f, -1.13f, 0.22f)
                lineToRelative(2.95f, 2.95f)
                curveToRelative(1.56f, 1.56f, 1.56f, 4.09f, 0.0f, 5.65f)
                lineToRelative(-2.83f, 2.83f)
                verticalLineToRelative(6.35f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.99f, 9.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _peopleArrowsLeftRight!!
    }

private var _peopleArrowsLeftRight: ImageVector? = null
