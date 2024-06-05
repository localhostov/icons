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

public val Icons.Outline.Speakers: ImageVector
    get() {
        if (_speakers != null) {
            return _speakers!!
        }
        _speakers = Builder(name = "Speakers", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.5f, 0.0f)
                horizontalLineToRelative(6.262f)
                curveToRelative(-0.391f, 0.583f, -0.629f, 1.268f, -0.711f, 2.0f)
                lineTo(2.5f, 2.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 2.5f)
                curveTo(0.0f, 1.122f, 1.121f, 0.0f, 2.5f, 0.0f)
                close()
                moveTo(5.0f, 7.0f)
                curveToRelative(0.0f, 1.105f, 0.895f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.366f, 0.0f, 0.705f, -0.106f, 1.0f, -0.277f)
                verticalLineToRelative(-3.445f)
                curveToRelative(-0.295f, -0.172f, -0.634f, -0.277f, -1.0f, -0.277f)
                curveToRelative(-1.105f, 0.0f, -2.0f, 0.895f, -2.0f, 2.0f)
                close()
                moveTo(4.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                curveToRelative(0.352f, 0.0f, 0.686f, -0.072f, 1.0f, -0.184f)
                verticalLineToRelative(-5.631f)
                curveToRelative(-0.314f, -0.112f, -0.648f, -0.184f, -1.0f, -0.184f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                close()
                moveTo(24.0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(-14.0f)
                lineTo(10.0f, 2.5f)
                curveToRelative(0.0f, -1.378f, 1.121f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.122f, 2.5f, 2.5f)
                close()
                moveTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.276f, -0.225f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-9.0f)
                curveToRelative(-0.275f, 0.0f, -0.5f, 0.224f, -0.5f, 0.5f)
                verticalLineToRelative(19.5f)
                horizontalLineToRelative(10.0f)
                lineTo(22.0f, 2.5f)
                close()
                moveTo(20.0f, 16.0f)
                curveToRelative(0.0f, 1.654f, -1.346f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.346f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.346f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.346f, 3.0f, 3.0f)
                close()
                moveTo(17.0f, 9.0f)
                curveToRelative(1.105f, 0.0f, 2.0f, -0.895f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.895f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.895f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.895f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _speakers!!
    }

private var _speakers: ImageVector? = null
