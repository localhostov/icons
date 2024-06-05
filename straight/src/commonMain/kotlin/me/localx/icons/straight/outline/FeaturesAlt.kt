package me.localx.icons.straight.outline

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

public val Icons.Outline.FeaturesAlt: ImageVector
    get() {
        if (_featuresAlt != null) {
            return _featuresAlt!!
        }
        _featuresAlt = Builder(name = "FeaturesAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(24.0f, 7.586f)
                verticalLineToRelative(16.414f)
                lineTo(4.0f, 24.0f)
                verticalLineToRelative(-4.682f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(0.682f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(2.189f)
                curveToRelative(-0.479f, -0.123f, -0.982f, -0.189f, -1.5f, -0.189f)
                curveToRelative(-0.168f, 0.0f, -0.335f, 0.007f, -0.5f, 0.021f)
                verticalLineToRelative(-2.021f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                horizontalLineToRelative(9.414f)
                lineToRelative(7.586f, 7.586f)
                close()
                moveTo(17.0f, 7.0f)
                horizontalLineToRelative(3.586f)
                lineToRelative(-3.586f, -3.586f)
                verticalLineToRelative(3.586f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(-8.583f)
                curveToRelative(-0.12f, 0.718f, -0.368f, 1.393f, -0.719f, 2.0f)
                horizontalLineToRelative(9.303f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 19.49f)
                verticalLineToRelative(-5.37f)
                curveToRelative(-0.914f, -0.734f, -1.5f, -1.859f, -1.5f, -3.12f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.261f, -0.586f, 2.386f, -1.5f, 3.12f)
                verticalLineToRelative(5.37f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(2.5f, 11.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.897f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.897f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.897f, -2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _featuresAlt!!
    }

private var _featuresAlt: ImageVector? = null
