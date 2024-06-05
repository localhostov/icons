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

public val Icons.Bold.Blood: ImageVector
    get() {
        if (_blood != null) {
            return _blood!!
        }
        _blood = Builder(name = "Blood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.579f, 12.035f)
                curveToRelative(-1.391f, -1.335f, -3.77f, -1.334f, -5.159f, 0.0f)
                lineToRelative(-1.653f, 1.852f)
                curveToRelative(-1.14f, 1.119f, -1.767f, 2.608f, -1.767f, 4.195f)
                reflectiveCurveToRelative(0.627f, 3.075f, 1.767f, 4.194f)
                curveToRelative(1.132f, 1.111f, 2.635f, 1.724f, 4.233f, 1.724f)
                reflectiveCurveToRelative(3.101f, -0.612f, 4.232f, -1.724f)
                curveToRelative(1.14f, -1.119f, 1.767f, -2.608f, 1.767f, -4.194f)
                reflectiveCurveToRelative(-0.627f, -3.076f, -1.698f, -4.123f)
                lineToRelative(-1.722f, -1.924f)
                close()
                moveTo(8.131f, 20.136f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.134f, 1.115f, -3.126f, 1.114f, -4.262f, 0.0f)
                curveToRelative(-0.56f, -0.55f, -0.869f, -1.28f, -0.869f, -2.054f)
                reflectiveCurveToRelative(0.309f, -1.504f, 0.937f, -2.126f)
                lineToRelative(1.593f, -1.786f)
                curveToRelative(0.172f, -0.147f, 0.366f, -0.17f, 0.47f, -0.17f)
                reflectiveCurveToRelative(0.297f, 0.023f, 0.47f, 0.171f)
                lineToRelative(1.661f, 1.857f)
                curveToRelative(0.56f, 0.55f, 0.869f, 1.28f, 0.869f, 2.054f)
                reflectiveCurveToRelative(-0.309f, 1.503f, -0.869f, 2.054f)
                close()
                moveTo(22.439f, 7.665f)
                lineToRelative(-1.513f, -1.664f)
                curveToRelative(-1.302f, -1.292f, -3.496f, -1.347f, -4.905f, 0.057f)
                lineToRelative(-1.417f, 1.562f)
                curveToRelative(-2.132f, 2.162f, -2.132f, 5.679f, 0.0f, 7.841f)
                curveToRelative(1.04f, 1.054f, 2.423f, 1.634f, 3.896f, 1.634f)
                reflectiveCurveToRelative(2.856f, -0.581f, 3.896f, -1.634f)
                curveToRelative(2.132f, -2.162f, 2.132f, -5.679f, 0.042f, -7.796f)
                close()
                moveTo(20.261f, 13.354f)
                curveToRelative(-0.942f, 0.955f, -2.578f, 0.955f, -3.521f, 0.0f)
                curveToRelative(-0.986f, -1.0f, -0.986f, -2.627f, 0.042f, -3.673f)
                lineToRelative(1.406f, -1.55f)
                curveToRelative(0.109f, -0.108f, 0.23f, -0.131f, 0.312f, -0.131f)
                reflectiveCurveToRelative(0.203f, 0.022f, 0.258f, 0.074f)
                lineToRelative(1.502f, 1.652f)
                curveToRelative(0.986f, 1.0f, 0.986f, 2.627f, 0.0f, 3.628f)
                close()
                moveTo(11.975f, 2.025f)
                curveToRelative(1.367f, 1.367f, 1.367f, 3.583f, 0.0f, 4.95f)
                curveToRelative(-0.683f, 0.683f, -1.579f, 1.025f, -2.475f, 1.025f)
                curveToRelative(-0.896f, 0.0f, -1.791f, -0.342f, -2.475f, -1.025f)
                curveToRelative(-1.367f, -1.367f, -1.367f, -3.583f, 0.0f, -4.95f)
                lineToRelative(1.345f, -1.315f)
                curveToRelative(0.628f, -0.614f, 1.632f, -0.614f, 2.26f, 0.0f)
                lineToRelative(1.345f, 1.315f)
                close()
            }
        }
        .build()
        return _blood!!
    }

private var _blood: ImageVector? = null
