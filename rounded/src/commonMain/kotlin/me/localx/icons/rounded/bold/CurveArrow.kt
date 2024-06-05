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

public val Icons.Bold.CurveArrow: ImageVector
    get() {
        if (_curveArrow != null) {
            return _curveArrow!!
        }
        _curveArrow = Builder(name = "CurveArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.694f, 19.761f)
                lineToRelative(-2.396f, -2.396f)
                curveToRelative(-0.479f, -0.479f, -1.298f, -0.14f, -1.298f, 0.537f)
                verticalLineToRelative(1.098f)
                curveToRelative(-0.576f, 0.0f, -1.685f, -2.169f, -2.157f, -3.096f)
                curveToRelative(-1.026f, -2.008f, -1.995f, -3.904f, -3.843f, -3.904f)
                reflectiveCurveToRelative(-2.816f, 1.896f, -3.843f, 3.904f)
                curveToRelative(-0.473f, 0.926f, -1.581f, 3.096f, -2.157f, 3.096f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(0.536f, -1.357f, 0.977f, -3.167f, 1.494f, -5.301f)
                curveToRelative(0.465f, -1.917f, 1.285f, -5.297f, 2.005f, -6.442f)
                curveToRelative(0.175f, 0.283f, 0.432f, 0.8f, 0.747f, 1.726f)
                curveToRelative(0.267f, 0.785f, 1.117f, 1.206f, 1.903f, 0.937f)
                curveToRelative(0.784f, -0.267f, 1.203f, -1.119f, 0.937f, -1.903f)
                curveToRelative(-0.409f, -1.202f, -1.366f, -4.017f, -3.578f, -4.017f)
                curveToRelative(-2.748f, 0.0f, -3.711f, 3.968f, -4.929f, 8.992f)
                curveToRelative(-0.397f, 1.634f, -0.95f, 3.898f, -1.449f, 5.099f)
                curveToRelative(-0.078f, -0.182f, -0.122f, -0.381f, -0.122f, -0.591f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(1.098f)
                curveToRelative(0.677f, 0.0f, 1.016f, -0.819f, 0.537f, -1.298f)
                lineTo(4.239f, 0.306f)
                curveToRelative(-0.408f, -0.408f, -1.07f, -0.408f, -1.478f, 0.0f)
                lineTo(0.365f, 2.702f)
                curveToRelative(-0.479f, 0.479f, -0.14f, 1.298f, 0.537f, 1.298f)
                horizontalLineToRelative(1.098f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.679f, 0.935f, 3.129f, 2.302f, 3.902f)
                curveToRelative(0.102f, 0.073f, 0.213f, 0.134f, 0.331f, 0.18f)
                curveToRelative(0.57f, 0.262f, 1.199f, 0.417f, 1.866f, 0.417f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(1.098f)
                curveToRelative(0.0f, 0.677f, 0.819f, 1.016f, 1.298f, 0.537f)
                lineToRelative(2.396f, -2.396f)
                curveToRelative(0.408f, -0.408f, 0.408f, -1.07f, 0.0f, -1.478f)
                close()
                moveTo(12.829f, 17.269f)
                curveToRelative(0.318f, -0.624f, 0.808f, -1.582f, 1.171f, -2.063f)
                curveToRelative(0.363f, 0.481f, 0.853f, 1.439f, 1.171f, 2.063f)
                curveToRelative(0.293f, 0.574f, 0.597f, 1.166f, 0.927f, 1.731f)
                horizontalLineToRelative(-4.196f)
                curveToRelative(0.33f, -0.565f, 0.634f, -1.157f, 0.927f, -1.731f)
                close()
            }
        }
        .build()
        return _curveArrow!!
    }

private var _curveArrow: ImageVector? = null
