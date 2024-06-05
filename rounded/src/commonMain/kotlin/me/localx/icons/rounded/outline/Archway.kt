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

public val Icons.Outline.Archway: ImageVector
    get() {
        if (_archway != null) {
            return _archway!!
        }
        _archway = Builder(name = "Archway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(22.0f, 6.414f)
                lineToRelative(1.299f, -1.298f)
                curveToRelative(0.692f, -0.692f, 0.896f, -1.724f, 0.522f, -2.627f)
                curveToRelative(-0.375f, -0.904f, -1.249f, -1.488f, -2.228f, -1.488f)
                lineTo(2.406f, 1.001f)
                curveTo(1.428f, 1.0f, 0.554f, 1.584f, 0.179f, 2.488f)
                curveTo(-0.195f, 3.392f, 0.009f, 4.423f, 0.701f, 5.116f)
                lineToRelative(1.299f, 1.298f)
                verticalLineToRelative(14.586f)
                lineTo(1.0f, 21.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, 0.448f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.447f, 1.0f, 1.0f, 1.0f)
                lineTo(5.0f, 23.0f)
                curveToRelative(1.654f, 0.0f, 3.0f, -1.346f, 3.0f, -3.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -2.206f, 1.794f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.794f, 4.0f, 4.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.654f, 1.346f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, -0.448f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.447f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(2.026f, 3.254f)
                curveToRelative(0.039f, -0.095f, 0.141f, -0.254f, 0.38f, -0.254f)
                lineTo(21.594f, 3.0f)
                curveToRelative(0.239f, 0.0f, 0.341f, 0.159f, 0.38f, 0.254f)
                reflectiveCurveToRelative(0.08f, 0.279f, -0.089f, 0.448f)
                lineToRelative(-1.299f, 1.298f)
                lineTo(3.414f, 5.0f)
                lineToRelative(-1.299f, -1.298f)
                curveToRelative(-0.169f, -0.169f, -0.128f, -0.353f, -0.089f, -0.448f)
                close()
                moveTo(18.0f, 20.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -3.309f, -2.691f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.691f, -6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.551f, -0.448f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(4.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.449f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _archway!!
    }

private var _archway: ImageVector? = null
