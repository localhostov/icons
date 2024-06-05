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

public val Icons.Filled.Otp: ImageVector
    get() {
        if (_otp != null) {
            return _otp!!
        }
        _otp = Builder(name = "Otp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.207f, 18.707f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(23.207f, 18.707f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.793f, -1.793f)
                close()
                moveTo(5.793f, 17.293f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(-1.793f, 1.793f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(1.793f, 1.793f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(-1.793f, -1.793f)
                lineToRelative(1.793f, -1.793f)
                lineToRelative(-1.414f, -1.414f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _otp!!
    }

private var _otp: ImageVector? = null
