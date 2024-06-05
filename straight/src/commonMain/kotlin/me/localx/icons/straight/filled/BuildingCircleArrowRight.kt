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

public val Icons.Filled.BuildingCircleArrowRight: ImageVector
    get() {
        if (_buildingCircleArrowRight != null) {
            return _buildingCircleArrowRight!!
        }
        _buildingCircleArrowRight = Builder(name = "BuildingCircleArrowRight", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                reflectiveCurveToRelative(2.686f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.686f, 6.0f, -6.0f)
                reflectiveCurveToRelative(-2.686f, -6.0f, -6.0f, -6.0f)
                close()
                moveTo(20.687f, 18.744f)
                lineToRelative(-2.687f, 2.688f)
                verticalLineToRelative(-2.431f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.454f)
                lineToRelative(2.687f, 2.687f)
                curveToRelative(0.417f, 0.417f, 0.417f, 1.093f, 0.0f, 1.51f)
                close()
                moveTo(10.069f, 19.0f)
                horizontalLineToRelative(-1.069f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.069f)
                curveToRelative(0.087f, -0.699f, 0.262f, -1.369f, 0.518f, -2.0f)
                horizontalLineToRelative(-1.587f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.76f)
                curveToRelative(1.064f, -1.327f, 2.543f, -2.3f, 4.24f, -2.738f)
                lineTo(16.0f, 3.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                lineTo(3.0f, 0.0f)
                curveTo(1.346f, 0.0f, 0.0f, 1.346f, 0.0f, 3.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(12.721f)
                curveToRelative(-1.429f, -1.258f, -2.403f, -3.014f, -2.652f, -5.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _buildingCircleArrowRight!!
    }

private var _buildingCircleArrowRight: ImageVector? = null
