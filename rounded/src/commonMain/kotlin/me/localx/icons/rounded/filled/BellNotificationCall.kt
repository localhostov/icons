package me.localx.icons.rounded.filled

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

public val Icons.Filled.BellNotificationCall: ImageVector
    get() {
        if (_bellNotificationCall != null) {
            return _bellNotificationCall!!
        }
        _bellNotificationCall = Builder(name = "BellNotificationCall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.432f, 8.293f)
                curveToRelative(-0.364f, 0.449f, -0.905f, 0.707f, -1.484f, 0.707f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-0.123f, 0.844f, -0.843f, 1.494f, -1.722f, 1.494f)
                reflectiveCurveToRelative(-1.598f, -0.65f, -1.722f, -1.494f)
                horizontalLineToRelative(-1.223f)
                curveToRelative(-0.578f, 0.0f, -1.118f, -0.257f, -1.482f, -0.705f)
                curveToRelative(-0.364f, -0.448f, -0.505f, -1.029f, -0.388f, -1.594f)
                curveToRelative(0.178f, -0.853f, 0.43f, -2.054f, 0.645f, -3.062f)
                curveToRelative(0.497f, -2.313f, 2.018f, -3.64f, 4.175f, -3.64f)
                curveToRelative(2.137f, 0.0f, 3.698f, 1.362f, 4.176f, 3.645f)
                lineToRelative(0.641f, 3.054f)
                curveToRelative(0.119f, 0.565f, -0.021f, 1.146f, -0.385f, 1.595f)
                close()
                moveTo(23.095f, 16.739f)
                curveToRelative(1.205f, 1.207f, 1.205f, 3.171f, 0.0f, 4.378f)
                lineToRelative(-0.912f, 1.05f)
                curveToRelative(-1.194f, 1.199f, -2.748f, 1.833f, -4.421f, 1.833f)
                curveTo(10.126f, 24.0f, 0.0f, 13.874f, 0.0f, 6.238f)
                curveToRelative(0.0f, -1.673f, 0.633f, -3.227f, 1.784f, -4.375f)
                lineToRelative(1.15f, -1.004f)
                curveToRelative(1.157f, -1.159f, 3.12f, -1.16f, 4.327f, 0.047f)
                curveToRelative(0.031f, 0.03f, 1.883f, 2.438f, 1.883f, 2.438f)
                curveToRelative(0.553f, 0.579f, 0.857f, 1.335f, 0.857f, 2.138f)
                reflectiveCurveToRelative(-0.306f, 1.565f, -0.863f, 2.145f)
                lineToRelative(-1.6f, 1.897f)
                curveToRelative(1.458f, 3.309f, 3.733f, 5.588f, 6.932f, 6.945f)
                lineToRelative(1.906f, -1.606f)
                curveToRelative(1.19f, -1.144f, 3.087f, -1.147f, 4.28f, -0.006f)
                curveToRelative(0.0f, 0.0f, 2.408f, 1.853f, 2.439f, 1.883f)
                close()
            }
        }
        .build()
        return _bellNotificationCall!!
    }

private var _bellNotificationCall: ImageVector? = null
