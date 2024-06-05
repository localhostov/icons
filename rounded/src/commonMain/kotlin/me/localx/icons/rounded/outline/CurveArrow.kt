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

public val Icons.Outline.CurveArrow: ImageVector
    get() {
        if (_curveArrow != null) {
            return _curveArrow!!
        }
        _curveArrow = Builder(name = "CurveArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.694f, 19.261f)
                lineToRelative(-2.396f, -2.396f)
                curveToRelative(-0.479f, -0.479f, -1.298f, -0.14f, -1.298f, 0.537f)
                verticalLineToRelative(1.424f)
                curveToRelative(-0.796f, -0.482f, -1.593f, -1.964f, -2.256f, -3.209f)
                curveToRelative(-0.99f, -1.86f, -1.925f, -3.617f, -3.494f, -3.617f)
                reflectiveCurveToRelative(-2.504f, 1.757f, -3.494f, 3.617f)
                curveToRelative(-0.802f, 1.507f, -1.8f, 3.383f, -2.756f, 3.383f)
                horizontalLineToRelative(-0.76f)
                curveToRelative(0.667f, -1.393f, 1.245f, -3.435f, 1.89f, -5.717f)
                curveToRelative(0.692f, -2.449f, 1.98f, -7.008f, 2.849f, -7.286f)
                curveToRelative(0.066f, 0.02f, 0.679f, 0.285f, 1.704f, 3.322f)
                curveToRelative(0.176f, 0.522f, 0.743f, 0.804f, 1.267f, 0.628f)
                curveToRelative(0.523f, -0.177f, 0.805f, -0.744f, 0.628f, -1.268f)
                curveToRelative(-0.82f, -2.431f, -1.821f, -4.68f, -3.577f, -4.68f)
                curveToRelative(-2.213f, 0.0f, -3.264f, 3.321f, -4.795f, 8.739f)
                curveToRelative(-0.566f, 2.003f, -1.193f, 4.209f, -1.801f, 5.454f)
                curveToRelative(-0.25f, -0.334f, -0.404f, -0.744f, -0.404f, -1.193f)
                lineTo(5.001f, 4.0f)
                horizontalLineToRelative(1.559f)
                curveToRelative(0.677f, 0.0f, 1.016f, -0.819f, 0.537f, -1.298f)
                lineTo(4.7f, 0.306f)
                curveToRelative(-0.408f, -0.408f, -1.07f, -0.408f, -1.478f, 0.0f)
                lineTo(0.826f, 2.702f)
                curveToRelative(-0.479f, 0.479f, -0.14f, 1.298f, 0.537f, 1.298f)
                horizontalLineToRelative(1.636f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 2.206f, 1.794f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(1.598f)
                curveToRelative(0.0f, 0.677f, 0.819f, 1.016f, 1.298f, 0.537f)
                lineToRelative(2.396f, -2.396f)
                curveToRelative(0.408f, -0.408f, 0.408f, -1.07f, 0.0f, -1.478f)
                close()
                moveTo(12.522f, 16.556f)
                curveToRelative(0.46f, -0.864f, 1.315f, -2.471f, 1.721f, -2.557f)
                curveToRelative(0.421f, 0.086f, 1.276f, 1.693f, 1.736f, 2.557f)
                curveToRelative(0.44f, 0.828f, 0.908f, 1.693f, 1.442f, 2.443f)
                horizontalLineToRelative(-6.341f)
                curveToRelative(0.534f, -0.75f, 1.001f, -1.616f, 1.442f, -2.443f)
                close()
            }
        }
        .build()
        return _curveArrow!!
    }

private var _curveArrow: ImageVector? = null
