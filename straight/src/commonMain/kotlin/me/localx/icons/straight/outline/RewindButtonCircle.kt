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

public val Icons.Outline.RewindButtonCircle: ImageVector
    get() {
        if (_rewindButtonCircle != null) {
            return _rewindButtonCircle!!
        }
        _rewindButtonCircle = Builder(name = "RewindButtonCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.211f)
                lineTo(3.177f, 12.0f)
                lineToRelative(8.823f, 5.789f)
                verticalLineToRelative(-3.937f)
                lineToRelative(6.0f, 3.937f)
                lineTo(18.0f, 6.211f)
                lineToRelative(-6.0f, 3.937f)
                verticalLineToRelative(-3.937f)
                close()
                moveTo(16.0f, 9.915f)
                verticalLineToRelative(4.17f)
                lineToRelative(-3.177f, -2.085f)
                lineToRelative(3.177f, -2.085f)
                close()
                moveTo(10.0f, 14.085f)
                lineToRelative(-3.177f, -2.085f)
                lineToRelative(3.177f, -2.085f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveToRelative(-5.514f, 0.0f, -10.0f, -4.486f, -10.0f, -10.0f)
                reflectiveCurveTo(6.486f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.486f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.486f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _rewindButtonCircle!!
    }

private var _rewindButtonCircle: ImageVector? = null
