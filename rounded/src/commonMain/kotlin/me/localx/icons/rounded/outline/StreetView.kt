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

public val Icons.Outline.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(1.381f, 0.0f, 2.5f, 1.119f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.119f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.119f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.119f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(15.0f, 19.0f)
                verticalLineToRelative(-4.171f)
                curveToRelative(1.164f, -0.413f, 2.0f, -1.525f, 2.0f, -2.829f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.206f, -1.794f, -4.0f, -4.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-2.206f, 0.0f, -4.0f, 1.794f, -4.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.304f, 0.836f, 2.416f, 2.0f, 2.829f)
                verticalLineToRelative(4.171f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.552f, -0.447f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, -0.449f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, 0.448f, -1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.552f, 0.447f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.448f, 1.0f, -1.0f)
                close()
                moveTo(24.0f, 19.5f)
                curveToRelative(0.0f, -1.748f, -2.059f, -3.138f, -5.797f, -3.913f)
                curveToRelative(-0.539f, -0.113f, -1.07f, 0.235f, -1.183f, 0.776f)
                curveToRelative(-0.112f, 0.541f, 0.235f, 1.07f, 0.776f, 1.182f)
                curveToRelative(3.145f, 0.653f, 4.203f, 1.616f, 4.203f, 1.955f)
                curveToRelative(0.0f, 0.748f, -3.402f, 2.5f, -10.0f, 2.5f)
                reflectiveCurveToRelative(-10.0f, -1.752f, -10.0f, -2.5f)
                curveToRelative(0.0f, -0.339f, 1.059f, -1.302f, 4.203f, -1.955f)
                curveToRelative(0.541f, -0.112f, 0.889f, -0.642f, 0.776f, -1.182f)
                curveToRelative(-0.113f, -0.541f, -0.646f, -0.889f, -1.183f, -0.776f)
                curveToRelative(-3.738f, 0.775f, -5.797f, 2.165f, -5.797f, 3.913f)
                curveToRelative(0.0f, 3.092f, 6.221f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveToRelative(12.0f, -1.408f, 12.0f, -4.5f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
