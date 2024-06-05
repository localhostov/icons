package me.localx.icons.rounded.bold

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

public val Icons.Bold.Mortgage: ImageVector
    get() {
        if (_mortgage != null) {
            return _mortgage!!
        }
        _mortgage = Builder(name = "Mortgage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 6.904f)
                lineTo(22.0f, 2.5f)
                curveToRelative(0.0f, -0.829f, -0.671f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.671f, -1.5f, 1.5f)
                verticalLineToRelative(2.046f)
                lineToRelative(-3.61f, -2.825f)
                curveToRelative(-1.996f, -1.562f, -4.784f, -1.562f, -6.779f, 0.0f)
                lineTo(2.11f, 6.807f)
                curveToRelative(-1.341f, 1.05f, -2.11f, 2.628f, -2.11f, 4.331f)
                verticalLineToRelative(7.35f)
                curveToRelative(0.0f, 3.033f, 2.467f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(3.033f, 0.0f, 5.5f, -2.467f, 5.5f, -5.5f)
                verticalLineToRelative(-7.35f)
                curveToRelative(0.0f, -1.653f, -0.73f, -3.185f, -2.0f, -4.234f)
                close()
                moveTo(21.0f, 18.488f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 20.988f)
                curveToRelative(-1.378f, 0.0f, -2.5f, -1.122f, -2.5f, -2.5f)
                verticalLineToRelative(-7.35f)
                curveToRelative(0.0f, -0.774f, 0.35f, -1.492f, 0.959f, -1.969f)
                lineToRelative(6.5f, -5.086f)
                curveToRelative(0.454f, -0.355f, 0.998f, -0.532f, 1.541f, -0.532f)
                reflectiveCurveToRelative(1.087f, 0.177f, 1.541f, 0.532f)
                lineToRelative(6.5f, 5.086f)
                curveToRelative(0.61f, 0.477f, 0.959f, 1.195f, 0.959f, 1.969f)
                verticalLineToRelative(7.35f)
                close()
                moveTo(8.505f, 13.004f)
                curveToRelative(-0.828f, 0.0f, -1.499f, -0.671f, -1.499f, -1.499f)
                reflectiveCurveToRelative(0.671f, -1.499f, 1.499f, -1.499f)
                reflectiveCurveToRelative(1.499f, 0.671f, 1.499f, 1.499f)
                reflectiveCurveToRelative(-0.671f, 1.499f, -1.499f, 1.499f)
                close()
                moveTo(16.999f, 16.501f)
                curveToRelative(0.0f, 0.828f, -0.671f, 1.499f, -1.499f, 1.499f)
                reflectiveCurveToRelative(-1.499f, -0.671f, -1.499f, -1.499f)
                reflectiveCurveToRelative(0.671f, -1.499f, 1.499f, -1.499f)
                reflectiveCurveToRelative(1.499f, 0.671f, 1.499f, 1.499f)
                close()
                moveTo(15.248f, 11.832f)
                lineToRelative(-4.0f, 6.0f)
                curveToRelative(-0.289f, 0.434f, -0.765f, 0.668f, -1.25f, 0.668f)
                curveToRelative(-0.286f, 0.0f, -0.575f, -0.082f, -0.831f, -0.252f)
                curveToRelative(-0.689f, -0.459f, -0.875f, -1.391f, -0.416f, -2.08f)
                lineToRelative(4.0f, -6.0f)
                curveToRelative(0.459f, -0.689f, 1.39f, -0.876f, 2.08f, -0.416f)
                curveToRelative(0.689f, 0.459f, 0.875f, 1.391f, 0.416f, 2.08f)
                close()
            }
        }
        .build()
        return _mortgage!!
    }

private var _mortgage: ImageVector? = null
