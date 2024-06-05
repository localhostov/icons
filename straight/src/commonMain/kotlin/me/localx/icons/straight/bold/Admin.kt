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

public val Icons.Bold.Admin: ImageVector
    get() {
        if (_admin != null) {
            return _admin!!
        }
        _admin = Builder(name = "Admin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 11.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.794f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.794f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.794f, 4.0f, -4.0f)
                close()
                moveTo(19.0f, 22.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                close()
                moveTo(20.253f, 14.581f)
                lineToRelative(1.785f, 1.162f)
                lineToRelative(-1.637f, 2.515f)
                reflectiveCurveToRelative(-2.932f, -2.493f, -4.266f, -2.921f)
                curveToRelative(1.146f, -1.093f, 1.864f, -2.631f, 1.864f, -4.336f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.705f, 0.718f, 3.243f, 1.864f, 4.336f)
                lineToRelative(-4.266f, 2.921f)
                lineToRelative(-1.637f, -2.515f)
                lineToRelative(1.786f, -1.162f)
                curveToRelative(-0.478f, -1.098f, -0.747f, -2.308f, -0.747f, -3.581f)
                reflectiveCurveToRelative(0.269f, -2.482f, 0.747f, -3.581f)
                lineToRelative(-1.786f, -1.162f)
                lineToRelative(1.637f, -2.515f)
                lineToRelative(1.794f, 1.167f)
                curveToRelative(1.323f, -1.434f, 3.102f, -2.436f, 5.107f, -2.775f)
                lineTo(10.498f, 0.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.135f)
                curveToRelative(2.006f, 0.339f, 3.784f, 1.34f, 5.107f, 2.775f)
                lineToRelative(1.794f, -1.167f)
                lineToRelative(1.637f, 2.515f)
                lineToRelative(-1.785f, 1.162f)
                curveToRelative(0.478f, 1.098f, 0.747f, 2.308f, 0.747f, 3.581f)
                reflectiveCurveToRelative(-0.269f, 2.482f, -0.747f, 3.581f)
                close()
            }
        }
        .build()
        return _admin!!
    }

private var _admin: ImageVector? = null
