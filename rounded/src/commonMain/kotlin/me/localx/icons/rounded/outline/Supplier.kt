package me.localx.icons.rounded.outline

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

public val Icons.Outline.Supplier: ImageVector
    get() {
        if (_supplier != null) {
            return _supplier!!
        }
        _supplier = Builder(name = "Supplier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 2.0f)
                curveToRelative(2.206f, 0.0f, 4.0f, 1.794f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.794f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.794f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.794f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.552f, 0.449f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.551f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(20.0f, 18.0f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.447f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                close()
                moveTo(10.649f, 16.928f)
                curveToRelative(0.42f, 0.358f, 0.47f, 0.989f, 0.112f, 1.41f)
                lineToRelative(-0.5f, 0.586f)
                curveToRelative(-0.06f, 0.07f, -0.129f, 0.132f, -0.207f, 0.183f)
                curveToRelative(-0.79f, 0.527f, -1.859f, 0.386f, -2.487f, -0.331f)
                lineToRelative(-2.331f, -2.767f)
                curveToRelative(-2.03f, 1.294f, -3.237f, 3.495f, -3.237f, 5.886f)
                verticalLineToRelative(1.105f)
                curveToRelative(0.0f, 0.553f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.447f, -1.0f, -1.0f)
                verticalLineToRelative(-1.105f)
                curveToRelative(0.0f, -3.075f, 1.551f, -5.906f, 4.148f, -7.571f)
                curveToRelative(0.846f, -0.542f, 1.973f, -0.371f, 2.618f, 0.397f)
                lineToRelative(2.211f, 2.625f)
                lineToRelative(0.261f, -0.307f)
                curveToRelative(0.358f, -0.42f, 0.99f, -0.472f, 1.41f, -0.111f)
                close()
            }
        }
        .build()
        return _supplier!!
    }

private var _supplier: ImageVector? = null
