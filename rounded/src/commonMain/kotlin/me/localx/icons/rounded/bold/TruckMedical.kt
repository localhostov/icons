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

public val Icons.Bold.TruckMedical: ImageVector
    get() {
        if (_truckMedical != null) {
            return _truckMedical!!
        }
        _truckMedical = Builder(name = "TruckMedical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.0f, 10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                close()
                moveTo(24.0f, 10.272f)
                verticalLineToRelative(5.364f)
                curveToRelative(0.0f, 1.935f, -1.273f, 3.56f, -3.02f, 4.13f)
                curveToRelative(0.006f, 0.078f, 0.02f, 0.154f, 0.02f, 0.233f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(0.0f, 1.657f, -1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                curveToRelative(0.0f, -0.08f, 0.014f, -0.155f, 0.02f, -0.233f)
                curveToRelative(-1.746f, -0.57f, -3.02f, -2.195f, -3.02f, -4.13f)
                lineTo(0.0f, 6.5f)
                curveTo(0.0f, 3.468f, 2.468f, 1.0f, 5.5f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.512f, 0.0f, 4.631f, 1.695f, 5.287f, 4.0f)
                horizontalLineToRelative(1.895f)
                curveToRelative(2.933f, 0.0f, 5.318f, 2.365f, 5.318f, 5.272f)
                close()
                moveTo(14.0f, 6.5f)
                curveToRelative(0.0f, -1.379f, -1.121f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.379f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(9.137f)
                curveToRelative(0.0f, 0.752f, 0.611f, 1.363f, 1.363f, 1.363f)
                horizontalLineToRelative(9.637f)
                lineTo(14.0f, 6.5f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.637f)
                curveToRelative(0.752f, 0.0f, 1.363f, -0.611f, 1.363f, -1.363f)
                verticalLineToRelative(-1.637f)
                close()
                moveTo(21.0f, 10.272f)
                curveToRelative(0.0f, -1.274f, -1.019f, -2.272f, -2.318f, -2.272f)
                horizontalLineToRelative(-1.682f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-0.728f)
                close()
            }
        }
        .build()
        return _truckMedical!!
    }

private var _truckMedical: ImageVector? = null
