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

public val Icons.Outline.Aperture: ImageVector
    get() {
        if (_aperture != null) {
            return _aperture!!
        }
        _aperture = Builder(name = "Aperture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(13.409f, 2.1f)
                curveToRelative(2.683f, 0.38f, 5.027f, 1.828f, 6.586f, 3.9f)
                horizontalLineToRelative(-8.962f)
                reflectiveCurveToRelative(2.377f, -3.9f, 2.377f, -3.9f)
                close()
                moveTo(14.192f, 7.999f)
                lineToRelative(2.433f, 4.005f)
                lineToRelative(-2.436f, 3.996f)
                horizontalLineToRelative(-4.445f)
                lineToRelative(-2.308f, -4.101f)
                lineToRelative(2.378f, -3.901f)
                horizontalLineToRelative(4.378f)
                close()
                moveTo(11.104f, 2.042f)
                lineToRelative(-4.792f, 7.861f)
                lineToRelative(-2.242f, -3.984f)
                curveToRelative(1.658f, -2.157f, 4.175f, -3.621f, 7.034f, -3.876f)
                close()
                moveTo(2.836f, 16.0f)
                curveToRelative(-0.537f, -1.226f, -0.836f, -2.578f, -0.836f, -4.0f)
                curveToRelative(0.0f, -1.464f, 0.316f, -2.856f, 0.885f, -4.111f)
                lineToRelative(4.565f, 8.111f)
                lineTo(2.836f, 16.0f)
                close()
                moveTo(10.591f, 21.9f)
                curveToRelative(-2.683f, -0.38f, -5.027f, -1.829f, -6.586f, -3.9f)
                horizontalLineToRelative(8.964f)
                lineToRelative(-2.378f, 3.9f)
                close()
                moveTo(12.897f, 21.959f)
                lineToRelative(4.896f, -8.031f)
                lineToRelative(2.35f, 3.87f)
                curveToRelative(-1.651f, 2.313f, -4.262f, 3.895f, -7.246f, 4.162f)
                close()
                moveTo(16.531f, 7.999f)
                horizontalLineToRelative(4.633f)
                curveToRelative(0.537f, 1.226f, 0.836f, 2.579f, 0.836f, 4.001f)
                curveToRelative(0.0f, 1.337f, -0.264f, 2.613f, -0.743f, 3.78f)
                lineToRelative(-4.726f, -7.78f)
                close()
            }
        }
        .build()
        return _aperture!!
    }

private var _aperture: ImageVector? = null
