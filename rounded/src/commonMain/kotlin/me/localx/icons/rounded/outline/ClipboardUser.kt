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

public val Icons.Outline.ClipboardUser: ImageVector
    get() {
        if (_clipboardUser != null) {
            return _clipboardUser!!
        }
        _clipboardUser = Builder(name = "ClipboardUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                lineTo(3.0f, 7.0f)
                curveToRelative(0.0f, -2.757f, 2.243f, -5.0f, 5.0f, -5.0f)
                horizontalLineToRelative(0.171f)
                curveTo(8.584f, 0.836f, 9.696f, 0.0f, 11.0f, 0.0f)
                horizontalLineToRelative(2.0f)
                curveTo(14.304f, 0.0f, 15.416f, 0.836f, 15.829f, 2.0f)
                horizontalLineToRelative(0.171f)
                curveToRelative(2.757f, 0.0f, 5.0f, 2.243f, 5.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 2.757f, -2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(8.0f, 4.0f)
                curveToRelative(-1.654f, 0.0f, -3.0f, 1.346f, -3.0f, 3.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                lineTo(19.0f, 7.0f)
                curveToRelative(0.0f, -1.654f, -1.346f, -3.0f, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-0.449f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.551f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, -1.119f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.119f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.119f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.119f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(16.249f, 18.968f)
                curveToRelative(0.535f, -0.137f, 0.857f, -0.683f, 0.719f, -1.217f)
                curveToRelative(-0.559f, -2.173f, -2.648f, -3.751f, -4.968f, -3.751f)
                reflectiveCurveToRelative(-4.409f, 1.578f, -4.968f, 3.751f)
                curveToRelative(-0.138f, 0.535f, 0.184f, 1.08f, 0.719f, 1.217f)
                curveToRelative(0.537f, 0.138f, 1.08f, -0.184f, 1.217f, -0.719f)
                curveToRelative(0.33f, -1.282f, 1.633f, -2.249f, 3.032f, -2.249f)
                reflectiveCurveToRelative(2.702f, 0.967f, 3.032f, 2.249f)
                curveToRelative(0.116f, 0.452f, 0.522f, 0.751f, 0.968f, 0.751f)
                curveToRelative(0.082f, 0.0f, 0.166f, -0.01f, 0.25f, -0.032f)
                close()
            }
        }
        .build()
        return _clipboardUser!!
    }

private var _clipboardUser: ImageVector? = null
