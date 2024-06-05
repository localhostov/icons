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

public val Icons.Filled.GovernmentUser: ImageVector
    get() {
        if (_governmentUser != null) {
            return _governmentUser!!
        }
        _governmentUser = Builder(name = "GovernmentUser", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.0f, 5.0f)
                curveTo(5.0f, 2.243f, 7.243f, 0.0f, 10.0f, 0.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                reflectiveCurveToRelative(-5.0f, -2.243f, -5.0f, -5.0f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                lineTo(23.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(0.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                lineTo(0.0f, 20.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.333f, 11.0f)
                lineToRelative(-1.571f, 2.356f)
                lineToRelative(1.055f, 4.644f)
                horizontalLineToRelative(6.182f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                horizontalLineToRelative(-0.667f)
                close()
                moveTo(9.237f, 13.356f)
                lineToRelative(-1.571f, -2.356f)
                horizontalLineToRelative(-0.667f)
                curveToRelative(-2.757f, 0.0f, -5.0f, 2.243f, -5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.182f)
                lineToRelative(1.055f, -4.644f)
                close()
            }
        }
        .build()
        return _governmentUser!!
    }

private var _governmentUser: ImageVector? = null
