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

public val Icons.Bold.FaceSleeping: ImageVector
    get() {
        if (_faceSleeping != null) {
            return _faceSleeping!!
        }
        _faceSleeping = Builder(name = "FaceSleeping", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, 0.895f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.895f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.895f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.895f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(5.0f, 11.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                curveToRelative(0.0f, 0.0f, -2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                close()
                moveTo(13.0f, 11.0f)
                curveToRelative(0.0f, 1.631f, 1.0f, 4.0f, 3.0f, 4.0f)
                reflectiveCurveToRelative(3.0f, -2.369f, 3.0f, -4.0f)
                curveToRelative(0.0f, 0.0f, -2.0f, 1.0f, -3.0f, 1.0f)
                reflectiveCurveToRelative(-3.0f, -1.0f, -3.0f, -1.0f)
                close()
                moveTo(20.05f, 8.0f)
                curveToRelative(0.602f, 1.207f, 0.95f, 2.562f, 0.95f, 4.0f)
                curveToRelative(0.0f, 4.962f, -4.037f, 9.0f, -9.0f, 9.0f)
                reflectiveCurveTo(3.0f, 16.962f, 3.0f, 12.0f)
                curveToRelative(0.0f, -4.274f, 2.998f, -7.855f, 7.0f, -8.768f)
                lineTo(10.0f, 0.181f)
                curveTo(4.334f, 1.137f, 0.0f, 6.066f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.617f, 5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.404f, -0.255f, -2.747f, -0.7f, -4.0f)
                horizontalLineToRelative(-3.25f)
                close()
                moveTo(24.0f, 0.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineToRelative(2.086f)
                lineToRelative(-2.086f, 2.086f)
                verticalLineToRelative(1.914f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(2.086f, -2.086f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(17.0f, 6.0f)
                horizontalLineToRelative(-2.086f)
                lineToRelative(2.086f, -2.086f)
                verticalLineToRelative(-1.914f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.086f)
                lineToRelative(-2.086f, 2.086f)
                verticalLineToRelative(1.914f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _faceSleeping!!
    }

private var _faceSleeping: ImageVector? = null
