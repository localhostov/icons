package me.localx.icons.rounded.filled

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

public val Icons.Filled.Seller: ImageVector
    get() {
        if (_seller != null) {
            return _seller!!
        }
        _seller = Builder(name = "Seller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.68f, 15.667f)
                verticalLineToRelative(0.333f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                verticalLineToRelative(-0.333f)
                reflectiveCurveToRelative(0.0f, 0.333f, 0.0f, 0.333f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.105f, -0.831f, 2.0f, -1.857f, 2.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.929f, 0.0f, -1.699f, -0.735f, -1.836f, -1.694f)
                curveToRelative(-0.028f, -0.199f, 0.018f, -0.403f, 0.095f, -0.589f)
                lineToRelative(0.355f, -0.861f)
                curveToRelative(0.463f, -1.123f, 1.558f, -1.856f, 2.773f, -1.856f)
                horizontalLineToRelative(6.509f)
                curveToRelative(1.215f, 0.0f, 2.31f, 0.733f, 2.773f, 1.856f)
                lineToRelative(0.355f, 0.861f)
                curveToRelative(0.077f, 0.186f, 0.124f, 0.39f, 0.095f, 0.589f)
                curveToRelative(-0.137f, 0.959f, -0.906f, 1.694f, -1.836f, 1.694f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-1.026f, 0.0f, -1.857f, -0.895f, -1.857f, -2.0f)
                horizontalLineToRelative(0.0f)
                moveToRelative(-5.68f, -10.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(2.0f, 2.691f, 2.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(22.154f, 20.0f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.673f, 0.0f, -1.306f, -0.18f, -1.856f, -0.495f)
                curveToRelative(-0.552f, 0.315f, -1.185f, 0.495f, -1.857f, 0.495f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.673f, 0.0f, -1.306f, -0.18f, -1.857f, -0.495f)
                curveToRelative(-0.551f, 0.315f, -1.184f, 0.495f, -1.856f, 0.495f)
                horizontalLineToRelative(-0.619f)
                curveToRelative(-0.295f, 0.0f, -0.579f, -0.047f, -0.857f, -0.113f)
                verticalLineToRelative(1.113f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-1.113f)
                curveToRelative(-0.278f, 0.067f, -0.563f, 0.113f, -0.857f, 0.113f)
                close()
                moveTo(10.012f, 21.0f)
                verticalLineToRelative(-2.339f)
                curveToRelative(-0.495f, -0.568f, -0.845f, -1.276f, -0.959f, -2.073f)
                curveToRelative(-0.075f, -0.534f, 0.0f, -1.082f, 0.225f, -1.629f)
                lineToRelative(0.328f, -0.797f)
                curveToRelative(-0.52f, -0.106f, -1.057f, -0.162f, -1.608f, -0.162f)
                curveTo(3.589f, 14.0f, 0.0f, 17.589f, 0.0f, 22.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(10.039f)
                curveToRelative(-0.635f, -0.838f, -1.026f, -1.87f, -1.026f, -3.0f)
                close()
            }
        }
        .build()
        return _seller!!
    }

private var _seller: ImageVector? = null
