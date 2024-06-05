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

public val Icons.Bold.SecondMedal: ImageVector
    get() {
        if (_secondMedal != null) {
            return _secondMedal!!
        }
        _secondMedal = Builder(name = "SecondMedal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.021f, 0.0f)
                horizontalLineToRelative(-9.284f)
                lineToRelative(-2.741f, 5.541f)
                lineTo(9.261f, 0.0f)
                lineTo(-0.021f, 0.0f)
                lineToRelative(4.768f, 9.662f)
                curveToRelative(-1.104f, 1.494f, -1.758f, 3.341f, -1.758f, 5.338f)
                curveToRelative(0.0f, 4.963f, 4.037f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.037f, 9.0f, -9.0f)
                curveToRelative(0.0f, -1.994f, -0.652f, -3.838f, -1.753f, -5.331f)
                lineTo(24.021f, 0.0f)
                close()
                moveTo(19.189f, 3.0f)
                lineToRelative(-2.228f, 4.501f)
                curveToRelative(-0.641f, -0.426f, -1.339f, -0.773f, -2.081f, -1.025f)
                lineToRelative(1.72f, -3.476f)
                horizontalLineToRelative(2.589f)
                close()
                moveTo(7.396f, 3.0f)
                lineToRelative(1.714f, 3.472f)
                curveToRelative(-0.743f, 0.252f, -1.443f, 0.598f, -2.085f, 1.025f)
                lineToRelative(-2.219f, -4.497f)
                horizontalLineToRelative(2.59f)
                close()
                moveTo(11.99f, 21.0f)
                curveToRelative(-3.309f, 0.0f, -6.0f, -2.691f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.691f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.691f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.691f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.595f, 17.0f)
                horizontalLineToRelative(2.405f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.283f, 1.221f, -1.965f, 2.298f, -2.565f)
                curveToRelative(0.758f, -0.423f, 1.702f, -0.95f, 1.702f, -1.435f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                curveToRelative(0.0f, 1.515f, -1.261f, 2.35f, -2.405f, 3.0f)
                close()
            }
        }
        .build()
        return _secondMedal!!
    }

private var _secondMedal: ImageVector? = null
