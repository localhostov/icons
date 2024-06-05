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

public val Icons.Outline.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                curveToRelative(-3.859f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.141f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveToRelative(7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.141f, -7.0f, -7.0f, -7.0f)
                close()
                moveTo(17.0f, 22.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(9.0f, 18.922f)
                verticalLineToRelative(4.078f)
                curveToRelative(0.0f, 0.552f, -0.447f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.448f, -1.0f, -1.0f)
                verticalLineToRelative(-4.078f)
                curveToRelative(-3.417f, -0.478f, -6.0f, -3.458f, -6.0f, -6.922f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-0.553f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.447f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(6.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineTo(11.0f, 1.0f)
                curveToRelative(0.0f, -0.552f, 0.447f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.448f, 1.0f, 1.0f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.447f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 2.475f, 1.844f, 4.603f, 4.289f, 4.95f)
                curveToRelative(0.976f, 0.14f, 1.711f, 0.987f, 1.711f, 1.972f)
                close()
                moveTo(19.309f, 16.848f)
                curveToRelative(0.28f, 0.522f, 0.25f, 1.151f, -0.077f, 1.645f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(-1.44f, 2.145f, -1.44f, 2.145f)
                curveToRelative(-0.311f, 0.45f, -0.926f, 0.566f, -1.379f, 0.261f)
                curveToRelative(-0.462f, -0.311f, -0.58f, -0.941f, -0.262f, -1.398f)
                lineToRelative(1.0f, -1.498f)
                horizontalLineToRelative(-1.007f)
                curveToRelative(-0.509f, 0.0f, -0.994f, -0.244f, -1.297f, -0.652f)
                curveToRelative(-0.303f, -0.409f, -0.462f, -0.969f, -0.249f, -1.431f)
                curveToRelative(0.314f, -0.68f, 0.922f, -1.636f, 1.551f, -2.55f)
                curveToRelative(0.315f, -0.457f, 0.937f, -0.576f, 1.399f, -0.268f)
                curveToRelative(0.463f, 0.309f, 0.591f, 0.933f, 0.287f, 1.4f)
                lineToRelative(-0.94f, 1.502f)
                horizontalLineToRelative(1.001f)
                curveToRelative(0.592f, 0.0f, 1.133f, 0.324f, 1.413f, 0.846f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
