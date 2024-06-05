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

public val Icons.Bold.UserGear: ImageVector
    get() {
        if (_userGear != null) {
            return _userGear!!
        }
        _userGear = Builder(name = "UserGear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.691f, 6.0f, -6.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(22.0f, 18.0f)
                curveToRelative(0.0f, -0.281f, -0.026f, -0.556f, -0.076f, -0.823f)
                lineToRelative(1.522f, -0.879f)
                lineToRelative(-1.5f, -2.598f)
                lineToRelative(-1.524f, 0.88f)
                curveToRelative(-0.416f, -0.356f, -0.897f, -0.637f, -1.422f, -0.824f)
                verticalLineToRelative(-1.757f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.757f)
                curveToRelative(-0.526f, 0.186f, -1.007f, 0.468f, -1.422f, 0.824f)
                lineToRelative(-1.524f, -0.88f)
                lineToRelative(-1.5f, 2.598f)
                lineToRelative(1.522f, 0.879f)
                curveToRelative(-0.049f, 0.267f, -0.076f, 0.542f, -0.076f, 0.823f)
                reflectiveCurveToRelative(0.026f, 0.556f, 0.076f, 0.823f)
                lineToRelative(-1.522f, 0.879f)
                lineToRelative(1.5f, 2.598f)
                lineToRelative(1.524f, -0.88f)
                curveToRelative(0.416f, 0.356f, 0.897f, 0.637f, 1.422f, 0.824f)
                verticalLineToRelative(1.757f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.757f)
                curveToRelative(0.526f, -0.186f, 1.007f, -0.468f, 1.422f, -0.824f)
                lineToRelative(1.524f, 0.88f)
                lineToRelative(1.5f, -2.598f)
                lineToRelative(-1.522f, -0.879f)
                curveToRelative(0.049f, -0.267f, 0.076f, -0.542f, 0.076f, -0.823f)
                close()
                moveTo(17.5f, 19.5f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.673f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.673f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.673f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.673f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(5.5f, 14.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.122f, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -3.033f, 2.467f, -5.5f, 5.5f, -5.5f)
                close()
            }
        }
        .build()
        return _userGear!!
    }

private var _userGear: ImageVector? = null
