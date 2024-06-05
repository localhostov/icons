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

public val Icons.Filled.UserNurse: ImageVector
    get() {
        if (_userNurse != null) {
            return _userNurse!!
        }
        _userNurse = Builder(name = "UserNurse", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.0f, 24.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(0.451f)
                lineToRelative(3.547f, 4.023f)
                lineToRelative(3.527f, -4.023f)
                horizontalLineToRelative(0.453f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 24.0f)
                close()
                moveTo(6.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 0.0f)
                lineTo(6.0f, 0.0f)
                close()
                moveTo(15.0f, 5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(6.09f, 10.0f)
                curveToRelative(0.478f, 2.833f, 2.942f, 5.0f, 5.91f, 5.0f)
                reflectiveCurveToRelative(5.431f, -2.167f, 5.91f, -5.0f)
                lineTo(6.09f, 10.0f)
                close()
            }
        }
        .build()
        return _userNurse!!
    }

private var _userNurse: ImageVector? = null
