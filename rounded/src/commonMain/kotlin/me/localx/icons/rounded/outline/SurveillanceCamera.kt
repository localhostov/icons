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

public val Icons.Outline.SurveillanceCamera: ImageVector
    get() {
        if (_surveillanceCamera != null) {
            return _surveillanceCamera!!
        }
        _surveillanceCamera = Builder(name = "SurveillanceCamera", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                curveToRelative(1.302f, 0.0f, 2.402f, -0.839f, 2.816f, -2.0f)
                horizontalLineToRelative(1.184f)
                curveToRelative(0.552f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.552f, -0.448f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-0.382f)
                lineToRelative(0.776f, -1.553f)
                curveToRelative(0.155f, -0.31f, 0.138f, -0.678f, -0.044f, -0.973f)
                reflectiveCurveToRelative(-0.504f, -0.475f, -0.851f, -0.475f)
                lineTo(6.0f, -0.001f)
                curveTo(3.794f, 0.0f, 2.0f, 1.794f, 2.0f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(4.057f)
                lineToRelative(-1.52f, 4.054f)
                curveToRelative(-0.437f, 1.164f, -1.565f, 1.946f, -2.809f, 1.946f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.553f, -0.448f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.447f, -1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.553f, 0.448f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.447f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.728f)
                curveToRelative(2.073f, 0.0f, 3.954f, -1.304f, 4.682f, -3.244f)
                lineToRelative(1.784f, -4.756f)
                horizontalLineToRelative(5.807f)
                close()
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(13.882f)
                lineToRelative(-0.776f, 1.553f)
                curveToRelative(-0.069f, 0.139f, -0.105f, 0.292f, -0.105f, 0.447f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.552f, -0.449f, 1.0f, -1.0f, 1.0f)
                lineTo(6.0f, 8.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                close()
                moveTo(23.662f, 18.389f)
                curveToRelative(-0.842f, -1.266f, -2.761f, -3.389f, -6.162f, -3.389f)
                reflectiveCurveToRelative(-5.32f, 2.123f, -6.161f, 3.388f)
                curveToRelative(-0.45f, 0.675f, -0.451f, 1.548f, 0.0f, 2.224f)
                curveToRelative(0.842f, 1.266f, 2.762f, 3.389f, 6.162f, 3.389f)
                reflectiveCurveToRelative(5.32f, -2.123f, 6.162f, -3.389f)
                curveToRelative(0.449f, -0.675f, 0.449f, -1.548f, 0.0f, -2.223f)
                close()
                moveTo(21.997f, 19.504f)
                curveToRelative(-0.757f, 1.139f, -2.152f, 2.496f, -4.497f, 2.496f)
                reflectiveCurveToRelative(-3.739f, -1.357f, -4.496f, -2.504f)
                curveToRelative(0.757f, -1.139f, 2.151f, -2.496f, 4.496f, -2.496f)
                reflectiveCurveToRelative(3.739f, 1.357f, 4.497f, 2.496f)
                verticalLineToRelative(0.008f)
                close()
                moveTo(18.975f, 19.5f)
                curveToRelative(0.0f, 0.829f, -0.671f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.671f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.671f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.671f, 1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _surveillanceCamera!!
    }

private var _surveillanceCamera: ImageVector? = null
