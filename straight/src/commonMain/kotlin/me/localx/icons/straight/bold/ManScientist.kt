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

public val Icons.Bold.ManScientist: ImageVector
    get() {
        if (_manScientist != null) {
            return _manScientist!!
        }
        _manScientist = Builder(name = "ManScientist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.45f, 20.144f)
                lineToRelative(-3.45f, -4.134f)
                verticalLineToRelative(-3.01f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.01f)
                lineToRelative(-3.45f, 4.133f)
                curveToRelative(-0.589f, 0.705f, -0.715f, 1.703f, -0.323f, 2.542f)
                curveToRelative(0.38f, 0.812f, 1.159f, 1.315f, 2.033f, 1.315f)
                horizontalLineToRelative(7.48f)
                curveToRelative(0.874f, 0.0f, 1.653f, -0.504f, 2.033f, -1.315f)
                curveToRelative(0.392f, -0.839f, 0.266f, -1.837f, -0.323f, -2.541f)
                close()
                moveTo(15.742f, 21.0f)
                lineToRelative(2.258f, -2.704f)
                lineToRelative(2.258f, 2.704f)
                horizontalLineToRelative(-4.516f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(3.309f, 0.0f, 6.0f, -2.691f, 6.0f, -6.0f)
                reflectiveCurveTo(12.309f, 0.0f, 9.0f, 0.0f)
                reflectiveCurveTo(3.0f, 2.691f, 3.0f, 6.0f)
                reflectiveCurveToRelative(2.691f, 6.0f, 6.0f, 6.0f)
                close()
                moveTo(9.0f, 3.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(14.0f, 15.285f)
                lineToRelative(-5.0f, 5.715f)
                lineToRelative(-3.5f, -4.0f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(1.644f)
                lineToRelative(2.356f, 2.692f)
                lineToRelative(2.356f, -2.692f)
                horizontalLineToRelative(2.644f)
                verticalLineToRelative(1.285f)
                close()
            }
        }
        .build()
        return _manScientist!!
    }

private var _manScientist: ImageVector? = null
