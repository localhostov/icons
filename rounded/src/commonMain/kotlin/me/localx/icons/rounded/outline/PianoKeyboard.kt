package me.localx.icons.rounded.outline

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

public val Icons.Outline.PianoKeyboard: ImageVector
    get() {
        if (_pianoKeyboard != null) {
            return _pianoKeyboard!!
        }
        _pianoKeyboard = Builder(name = "PianoKeyboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveTo(2.243f, 2.0f, 0.0f, 4.243f, 0.0f, 7.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.757f, 2.243f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(2.757f, 0.0f, 5.0f, -2.243f, 5.0f, -5.0f)
                lineTo(24.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, -2.243f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, 1.346f, 3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.654f, 1.346f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, -1.346f, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _pianoKeyboard!!
    }

private var _pianoKeyboard: ImageVector? = null
