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

public val Icons.Bold.Referral: ImageVector
    get() {
        if (_referral != null) {
            return _referral!!
        }
        _referral = Builder(name = "Referral", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(1.5f, 3.0f)
                curveTo(1.5f, 1.343f, 2.843f, 0.0f, 4.5f, 0.0f)
                reflectiveCurveToRelative(3.0f, 1.343f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.343f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.343f, -3.0f, -3.0f)
                close()
                moveTo(19.5f, 6.0f)
                curveToRelative(1.657f, 0.0f, 3.0f, -1.343f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.343f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveToRelative(-3.0f, 1.343f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.343f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 8.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(20.129f, 14.808f)
                curveToRelative(-0.347f, -0.347f, -0.91f, -0.347f, -1.257f, 0.0f)
                lineToRelative(-3.372f, 3.295f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.945f)
                lineTo(6.0f, 21.048f)
                verticalLineToRelative(-6.048f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 1.405f, 1.143f, 2.548f, 2.548f, 2.548f)
                horizontalLineToRelative(12.904f)
                curveToRelative(1.405f, 0.0f, 2.548f, -1.143f, 2.548f, -2.548f)
                verticalLineToRelative(-3.397f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.371f, -3.295f)
                close()
                moveTo(21.5f, 8.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.378f, 0.0f, -2.5f, 1.121f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -1.379f, -1.122f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _referral!!
    }

private var _referral: ImageVector? = null
