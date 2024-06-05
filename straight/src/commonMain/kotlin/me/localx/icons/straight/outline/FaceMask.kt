package me.localx.icons.straight.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.localx.icons.straight.Icons

public val Icons.Outline.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.804f, 6.02f)
                lineToRelative(0.393f, 1.961f)
                curveToRelative(-1.161f, 0.232f, -2.356f, 0.859f, -3.553f, 1.865f)
                lineToRelative(-1.287f, -1.531f)
                curveToRelative(1.457f, -1.225f, 2.953f, -1.996f, 4.447f, -2.295f)
                close()
                moveTo(13.804f, 7.981f)
                curveToRelative(1.161f, 0.232f, 2.356f, 0.859f, 3.553f, 1.865f)
                lineToRelative(1.287f, -1.531f)
                curveToRelative(-1.457f, -1.225f, -2.953f, -1.996f, -4.447f, -2.295f)
                lineToRelative(-0.393f, 1.961f)
                close()
                moveTo(22.0f, 18.619f)
                verticalLineToRelative(-6.619f)
                curveToRelative(0.0f, -0.434f, -0.028f, -0.862f, -0.082f, -1.282f)
                lineToRelative(-1.918f, 2.61f)
                verticalLineToRelative(5.753f)
                curveToRelative(0.0f, 0.937f, -0.423f, 1.801f, -1.16f, 2.371f)
                curveToRelative(-1.227f, 0.951f, -3.749f, 2.549f, -6.84f, 2.549f)
                reflectiveCurveToRelative(-5.613f, -1.598f, -6.841f, -2.55f)
                curveToRelative(-0.736f, -0.569f, -1.159f, -1.434f, -1.159f, -2.37f)
                verticalLineToRelative(-5.754f)
                lineToRelative(-1.915f, -2.626f)
                curveToRelative(-0.056f, 0.426f, -0.085f, 0.86f, -0.085f, 1.3f)
                verticalLineToRelative(6.619f)
                curveToRelative(-1.261f, -1.899f, -2.0f, -4.173f, -2.0f, -6.619f)
                curveTo(0.0f, 5.383f, 5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                curveToRelative(0.0f, 2.446f, -0.739f, 4.72f, -2.0f, 6.619f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(5.08f)
                curveToRelative(0.0f, 0.312f, 0.14f, 0.601f, 0.384f, 0.789f)
                curveToRelative(1.027f, 0.796f, 3.121f, 2.131f, 5.616f, 2.131f)
                reflectiveCurveToRelative(4.589f, -1.335f, 5.615f, -2.13f)
                curveToRelative(0.245f, -0.189f, 0.385f, -0.478f, 0.385f, -0.79f)
                verticalLineToRelative(-5.08f)
                close()
                moveTo(21.263f, 8.233f)
                curveToRelative(-1.491f, -3.652f, -5.081f, -6.233f, -9.263f, -6.233f)
                reflectiveCurveTo(4.242f, 4.571f, 2.746f, 8.212f)
                lineToRelative(2.763f, 3.788f)
                horizontalLineToRelative(12.986f)
                lineToRelative(2.768f, -3.767f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
