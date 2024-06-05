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
                moveTo(23.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(5.347f)
                curveToRelative(0.0f, 0.623f, 0.791f, 0.89f, 1.169f, 0.395f)
                lineToRelative(1.331f, -1.743f)
                lineToRelative(1.331f, 1.743f)
                curveToRelative(0.378f, 0.495f, 1.169f, 0.228f, 1.169f, -0.395f)
                lineTo(23.0f, 2.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(1.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.447f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.448f, 1.0f, 1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.447f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.448f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(10.543f, 14.185f)
                lineToRelative(0.956f, 3.815f)
                horizontalLineToRelative(5.431f)
                curveToRelative(0.53f, 0.0f, 0.926f, -0.502f, 0.793f, -1.015f)
                curveToRelative(-0.691f, -2.657f, -2.705f, -4.783f, -5.306f, -5.61f)
                lineToRelative(-1.873f, 2.81f)
                close()
                moveTo(3.069f, 18.0f)
                horizontalLineToRelative(5.431f)
                lineToRelative(0.956f, -3.815f)
                lineToRelative(-1.873f, -2.81f)
                curveToRelative(-2.601f, 0.826f, -4.616f, 2.952f, -5.306f, 5.61f)
                curveToRelative(-0.133f, 0.513f, 0.263f, 1.015f, 0.793f, 1.015f)
                close()
            }
        }
        .build()
        return _governmentUser!!
    }

private var _governmentUser: ImageVector? = null
